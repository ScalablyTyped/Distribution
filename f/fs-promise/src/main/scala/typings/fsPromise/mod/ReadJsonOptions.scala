package typings.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadJsonOptions extends js.Object {
  
  var encoding: String = js.native
  
  var flag: js.UndefOr[String] = js.native
  
  def reviver(key: js.Any, value: js.Any): js.Any = js.native
}
object ReadJsonOptions {
  
  @scala.inline
  def apply(encoding: String, reviver: (js.Any, js.Any) => js.Any): ReadJsonOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], reviver = js.Any.fromFunction2(reviver))
    __obj.asInstanceOf[ReadJsonOptions]
  }
  
  @scala.inline
  implicit class ReadJsonOptionsOps[Self <: ReadJsonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviver(value: (js.Any, js.Any) => js.Any): Self = this.set("reviver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFlag(value: String): Self = this.set("flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
  }
}
