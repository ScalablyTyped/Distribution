package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Indexpatterns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Indexpatterns] = js.undefined
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IndicesPutTemplateRequest {
  
  inline def apply(name: Name): IndicesPutTemplateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutTemplateRequest]
  }
  
  extension [Self <: IndicesPutTemplateRequest](x: Self) {
    
    inline def setBody(value: Indexpatterns): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setFlat_settings(value: Boolean): Self = StObject.set(x, "flat_settings", value.asInstanceOf[js.Any])
    
    inline def setFlat_settingsUndefined: Self = StObject.set(x, "flat_settings", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
