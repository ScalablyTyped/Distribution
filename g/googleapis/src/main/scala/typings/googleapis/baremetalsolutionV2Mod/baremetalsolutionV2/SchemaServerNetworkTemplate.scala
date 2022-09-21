package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServerNetworkTemplate extends StObject {
  
  /**
    * Instance types this template is applicable to.
    */
  var applicableInstanceTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Logical interfaces.
    */
  var logicalInterfaces: js.UndefOr[
    js.Array[SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface]
  ] = js.undefined
  
  /**
    * Output only. Template's unique name. The full resource name follows the pattern: `projects/{project\}/locations/{location\}/serverNetworkTemplate/{server_network_template\}` Generally, the {server_network_template\} follows the syntax of "bond" or "nic".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaServerNetworkTemplate {
  
  inline def apply(): SchemaServerNetworkTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerNetworkTemplate]
  }
  
  extension [Self <: SchemaServerNetworkTemplate](x: Self) {
    
    inline def setApplicableInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "applicableInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setApplicableInstanceTypesNull: Self = StObject.set(x, "applicableInstanceTypes", null)
    
    inline def setApplicableInstanceTypesUndefined: Self = StObject.set(x, "applicableInstanceTypes", js.undefined)
    
    inline def setApplicableInstanceTypesVarargs(value: String*): Self = StObject.set(x, "applicableInstanceTypes", js.Array(value*))
    
    inline def setLogicalInterfaces(value: js.Array[SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface]): Self = StObject.set(x, "logicalInterfaces", value.asInstanceOf[js.Any])
    
    inline def setLogicalInterfacesUndefined: Self = StObject.set(x, "logicalInterfaces", js.undefined)
    
    inline def setLogicalInterfacesVarargs(value: SchemaGoogleCloudBaremetalsolutionV2ServerNetworkTemplateLogicalInterface*): Self = StObject.set(x, "logicalInterfaces", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
