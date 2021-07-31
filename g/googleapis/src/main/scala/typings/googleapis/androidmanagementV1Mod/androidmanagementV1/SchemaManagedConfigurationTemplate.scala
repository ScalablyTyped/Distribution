package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configurations template for the app, saved from the managed
  * configurations iframe.
  */
trait SchemaManagedConfigurationTemplate extends StObject {
  
  /**
    * Optional, a map containing &lt;key, value&gt; configuration variables
    * defined for the configuration.
    */
  var configurationVariables: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The ID of the managed configurations template.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object SchemaManagedConfigurationTemplate {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationTemplate]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationTemplateMutableBuilder[Self <: SchemaManagedConfigurationTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationVariables(value: StringDictionary[String]): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
