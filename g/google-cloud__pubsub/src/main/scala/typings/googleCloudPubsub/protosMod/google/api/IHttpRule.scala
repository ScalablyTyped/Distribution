package typings.googleCloudPubsub.protosMod.google.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a HttpRule. */
trait IHttpRule extends StObject {
  
  /** HttpRule additionalBindings */
  var additionalBindings: js.UndefOr[js.Array[IHttpRule] | Null] = js.undefined
  
  /** HttpRule body */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule custom */
  var custom: js.UndefOr[ICustomHttpPattern | Null] = js.undefined
  
  /** HttpRule delete */
  var delete: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule get */
  var get: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule patch */
  var patch: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule post */
  var post: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule put */
  var put: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule responseBody */
  var responseBody: js.UndefOr[String | Null] = js.undefined
  
  /** HttpRule selector */
  var selector: js.UndefOr[String | Null] = js.undefined
}
object IHttpRule {
  
  inline def apply(): IHttpRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHttpRule]
  }
  
  extension [Self <: IHttpRule](x: Self) {
    
    inline def setAdditionalBindings(value: js.Array[IHttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBindingsNull: Self = StObject.set(x, "additionalBindings", null)
    
    inline def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
    
    inline def setAdditionalBindingsVarargs(value: IHttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCustom(value: ICustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetNull: Self = StObject.set(x, "get", null)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchNull: Self = StObject.set(x, "patch", null)
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostNull: Self = StObject.set(x, "post", null)
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutNull: Self = StObject.set(x, "put", null)
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    inline def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyNull: Self = StObject.set(x, "responseBody", null)
    
    inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
