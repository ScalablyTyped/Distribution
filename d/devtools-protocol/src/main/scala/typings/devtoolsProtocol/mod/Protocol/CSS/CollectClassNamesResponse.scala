package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectClassNamesResponse extends js.Object {
  
  /**
    * Class name list.
    */
  var classNames: js.Array[String] = js.native
}
object CollectClassNamesResponse {
  
  @scala.inline
  def apply(classNames: js.Array[String]): CollectClassNamesResponse = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectClassNamesResponse]
  }
  
  @scala.inline
  implicit class CollectClassNamesResponseOps[Self <: CollectClassNamesResponse] (val x: Self) extends AnyVal {
    
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
    def setClassNamesVarargs(value: String*): Self = this.set("classNames", js.Array(value :_*))
    
    @scala.inline
    def setClassNames(value: js.Array[String]): Self = this.set("classNames", value.asInstanceOf[js.Any])
  }
}
