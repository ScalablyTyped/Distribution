package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyMetadata extends js.Object {
  
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
}
object PropertyMetadata {
  
  @scala.inline
  def apply(): PropertyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyMetadata]
  }
  
  @scala.inline
  implicit class PropertyMetadataOps[Self <: PropertyMetadata] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRights(value: String): Self = this.set("rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRights: Self = this.set("rights", js.undefined)
  }
}
