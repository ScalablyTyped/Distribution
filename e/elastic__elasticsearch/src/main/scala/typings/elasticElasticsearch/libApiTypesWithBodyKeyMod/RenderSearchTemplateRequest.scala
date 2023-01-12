package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSearchTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[File] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
}
object RenderSearchTemplateRequest {
  
  inline def apply(): RenderSearchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderSearchTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderSearchTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setBody(value: File): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
