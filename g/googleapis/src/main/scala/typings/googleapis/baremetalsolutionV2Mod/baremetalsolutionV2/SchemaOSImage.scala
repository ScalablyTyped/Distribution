package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSImage extends StObject {
  
  /**
    * Instance types this image is applicable to. [Available types](https://cloud.google.com/bare-metal/docs/bms-planning#server_configurations)
    */
  var applicableInstanceTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * OS Image code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * OS Image description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. OS Image's unique name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network templates that can be used with this OS Image.
    */
  var supportedNetworkTemplates: js.UndefOr[js.Array[SchemaServerNetworkTemplate]] = js.undefined
}
object SchemaOSImage {
  
  inline def apply(): SchemaOSImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSImage]
  }
  
  extension [Self <: SchemaOSImage](x: Self) {
    
    inline def setApplicableInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "applicableInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setApplicableInstanceTypesNull: Self = StObject.set(x, "applicableInstanceTypes", null)
    
    inline def setApplicableInstanceTypesUndefined: Self = StObject.set(x, "applicableInstanceTypes", js.undefined)
    
    inline def setApplicableInstanceTypesVarargs(value: String*): Self = StObject.set(x, "applicableInstanceTypes", js.Array(value*))
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedNetworkTemplates(value: js.Array[SchemaServerNetworkTemplate]): Self = StObject.set(x, "supportedNetworkTemplates", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworkTemplatesUndefined: Self = StObject.set(x, "supportedNetworkTemplates", js.undefined)
    
    inline def setSupportedNetworkTemplatesVarargs(value: SchemaServerNetworkTemplate*): Self = StObject.set(x, "supportedNetworkTemplates", js.Array(value*))
  }
}
