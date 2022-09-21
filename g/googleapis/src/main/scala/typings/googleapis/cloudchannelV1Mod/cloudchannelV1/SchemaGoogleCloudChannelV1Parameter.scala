package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Parameter extends StObject {
  
  /**
    * Output only. Specifies whether this parameter is allowed to be changed. For example, for a Google Workspace Business Starter entitlement in commitment plan, num_units is editable when entitlement is active.
    */
  var editable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the parameter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value of the parameter.
    */
  var value: js.UndefOr[SchemaGoogleCloudChannelV1Value] = js.undefined
}
object SchemaGoogleCloudChannelV1Parameter {
  
  inline def apply(): SchemaGoogleCloudChannelV1Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Parameter]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Parameter](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableNull: Self = StObject.set(x, "editable", null)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: SchemaGoogleCloudChannelV1Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
