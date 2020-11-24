package typings.firebaseInstallations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueName extends js.Object {
  
  var valueName: String = js.native
}
object ValueName {
  
  @scala.inline
  def apply(valueName: String): ValueName = {
    val __obj = js.Dynamic.literal(valueName = valueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueName]
  }
  
  @scala.inline
  implicit class ValueNameOps[Self <: ValueName] (val x: Self) extends AnyVal {
    
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
    def setValueName(value: String): Self = this.set("valueName", value.asInstanceOf[js.Any])
  }
}
