package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selector associated with the SecuritySettings. If the labels and port in
  * this selector match the Envoy&#39;s label and port, the server side
  * authentication and authorization settings are applied to the Envoy.
  */
@js.native
trait SchemaServerSecuritySettingsSelector extends js.Object {
  
  /**
    * The labels associated with the XDS client.
    */
  var labelMatches: js.UndefOr[js.Array[SchemaMetadataFilterLabelMatch]] = js.native
  
  /**
    * The listener port of the XDS client.
    */
  var port: js.UndefOr[Double] = js.native
}
object SchemaServerSecuritySettingsSelector {
  
  @scala.inline
  def apply(): SchemaServerSecuritySettingsSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerSecuritySettingsSelector]
  }
  
  @scala.inline
  implicit class SchemaServerSecuritySettingsSelectorOps[Self <: SchemaServerSecuritySettingsSelector] (val x: Self) extends AnyVal {
    
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
    def setLabelMatchesVarargs(value: SchemaMetadataFilterLabelMatch*): Self = this.set("labelMatches", js.Array(value :_*))
    
    @scala.inline
    def setLabelMatches(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = this.set("labelMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMatches: Self = this.set("labelMatches", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
