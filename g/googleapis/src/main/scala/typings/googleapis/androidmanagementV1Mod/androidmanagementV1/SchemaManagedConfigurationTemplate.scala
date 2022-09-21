package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedConfigurationTemplate extends StObject {
  
  /**
    * Optional, a map containing configuration variables defined for the configuration.
    */
  var configurationVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The ID of the managed configurations template.
    */
  var templateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedConfigurationTemplate {
  
  inline def apply(): SchemaManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationTemplate]
  }
  
  extension [Self <: SchemaManagedConfigurationTemplate](x: Self) {
    
    inline def setConfigurationVariables(value: StringDictionary[String]): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVariablesNull: Self = StObject.set(x, "configurationVariables", null)
    
    inline def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdNull: Self = StObject.set(x, "templateId", null)
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
