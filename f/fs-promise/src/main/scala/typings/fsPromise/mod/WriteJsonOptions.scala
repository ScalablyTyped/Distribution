package typings.fsPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteJsonOptions extends WriteOptions {
  
  var replacer: js.UndefOr[JsonReplacer] = js.native
  
  var spaces: js.UndefOr[Double] = js.native
}
object WriteJsonOptions {
  
  @scala.inline
  def apply(): WriteJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteJsonOptions]
  }
  
  @scala.inline
  implicit class WriteJsonOptionsOps[Self <: WriteJsonOptions] (val x: Self) extends AnyVal {
    
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
    def setReplacerFunction2(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplacerVarargs(value: (Double | String)*): Self = this.set("replacer", js.Array(value :_*))
    
    @scala.inline
    def setReplacer(value: JsonReplacer): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSpaces(value: Double): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
