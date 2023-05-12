package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class generates JsonObject values for the Datastore API suitable for
  * sending to either GRPC stub methods or via the JSON/HTTP REST API.
  *
  * The serializer supports both Protobuf.js and Proto3 JSON formats. By
  * setting `useProto3Json` to true, the serializer will use the Proto3 JSON
  * format.
  *
  * For a description of the Proto3 JSON format check
  * https://developers.google.com/protocol-buffers/docs/proto3#json
  *
  * TODO(klimt): We can remove the databaseId argument if we keep the full
  * resource name in documents.
  */
trait JsonProtoSerializer
  extends StObject
     with Serializer {
  
  val databaseId: DatabaseId
}
object JsonProtoSerializer {
  
  inline def apply(databaseId: DatabaseId, useProto3Json: Boolean): JsonProtoSerializer = {
    val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], useProto3Json = useProto3Json.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonProtoSerializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonProtoSerializer] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
  }
}
