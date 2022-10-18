package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSimulateTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var template: js.UndefOr[IndicesIndexTemplate] = js.undefined
}
object IndicesSimulateTemplateRequest {
  
  inline def apply(): IndicesSimulateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSimulateTemplateRequest]
  }
  
  extension [Self <: IndicesSimulateTemplateRequest](x: Self) {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: IndicesIndexTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
