package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ValidateMessageRequest. */
trait IValidateMessageRequest extends StObject {
  
  /** ValidateMessageRequest encoding */
  var encoding: js.UndefOr[
    Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String) | Null
  ] = js.undefined
  
  /** ValidateMessageRequest message */
  var message: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** ValidateMessageRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ValidateMessageRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /** ValidateMessageRequest schema */
  var schema: js.UndefOr[ISchema | Null] = js.undefined
}
object IValidateMessageRequest {
  
  inline def apply(): IValidateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValidateMessageRequest]
  }
  
  extension [Self <: IValidateMessageRequest](x: Self) {
    
    inline def setEncoding(
      value: Encoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String)
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMessage(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
