package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2ApiTarget extends StObject {
  
  /**
    * Optional. List of one or more methods that can be called. If empty, all methods for the service are allowed. A wildcard (*) can be used as the last symbol. Valid examples: `google.cloud.translate.v2.TranslateService.GetSupportedLanguage` `TranslateText` `Get*` `translate.googleapis.com.Get*`
    */
  var methods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The service for this restriction. It should be the canonical service name, for example: `translate.googleapis.com`. You can use [`gcloud services list`](/sdk/gcloud/reference/services/list) to get a list of services that are enabled in the project.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2ApiTarget {
  
  inline def apply(): SchemaV2ApiTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2ApiTarget]
  }
  
  extension [Self <: SchemaV2ApiTarget](x: Self) {
    
    inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsNull: Self = StObject.set(x, "methods", null)
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
