package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selector associated with the SecuritySettings. If the labels and port in
  * this selector match the Envoy&#39;s label and port, the server side
  * authentication and authorization settings are applied to the Envoy.
  */
@js.native
trait SchemaServerSecuritySettingsSelector extends StObject {
  
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
  implicit class SchemaServerSecuritySettingsSelectorMutableBuilder[Self <: SchemaServerSecuritySettingsSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelMatches(value: js.Array[SchemaMetadataFilterLabelMatch]): Self = StObject.set(x, "labelMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelMatchesUndefined: Self = StObject.set(x, "labelMatches", js.undefined)
    
    @scala.inline
    def setLabelMatchesVarargs(value: SchemaMetadataFilterLabelMatch*): Self = StObject.set(x, "labelMatches", js.Array(value :_*))
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
