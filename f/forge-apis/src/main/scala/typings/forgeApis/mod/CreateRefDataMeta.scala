package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRefDataMeta extends js.Object {
  
  var extension: BaseAttributesExtensionObject = js.native
}
object CreateRefDataMeta {
  
  @scala.inline
  def apply(extension: BaseAttributesExtensionObject): CreateRefDataMeta = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefDataMeta]
  }
  
  @scala.inline
  implicit class CreateRefDataMetaOps[Self <: CreateRefDataMeta] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: BaseAttributesExtensionObject): Self = this.set("extension", value.asInstanceOf[js.Any])
  }
}
