package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsMetadata extends js.Object {
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * An array of option strings supported by this setting.
    */
  var options: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the property is editable. Valid values are:
    *
    * - `editable`
    * - `read_only`
    */
  var rights: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var uiHint: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var uiOrder: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var uiType: js.UndefOr[String] = js.native
}
object SettingsMetadata {
  
  @scala.inline
  def apply(): SettingsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsMetadata]
  }
  
  @scala.inline
  implicit class SettingsMetadataOps[Self <: SettingsMetadata] (val x: Self) extends AnyVal {
    
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
    def setIs21CFRPart11(value: String): Self = this.set("is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs21CFRPart11: Self = this.set("is21CFRPart11", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRights(value: String): Self = this.set("rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRights: Self = this.set("rights", js.undefined)
    
    @scala.inline
    def setUiHint(value: String): Self = this.set("uiHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiHint: Self = this.set("uiHint", js.undefined)
    
    @scala.inline
    def setUiOrder(value: String): Self = this.set("uiOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiOrder: Self = this.set("uiOrder", js.undefined)
    
    @scala.inline
    def setUiType(value: String): Self = this.set("uiType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiType: Self = this.set("uiType", js.undefined)
  }
}
