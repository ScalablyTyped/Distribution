package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface extends StObject {
  
  /**
    * Interface name. This is not a globally unique identifier. Name is unique only inside the ServerNetworkTemplate. This is of syntax or and forms part of the network template name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, interface must have network connected.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Interface type.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface {
  
  inline def apply(): SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface]
  }
  
  extension [Self <: SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
