package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

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
trait Vi extends StObject {
  
  var databaseId: Any
  
  var useProto3Json: Any
}
object Vi {
  
  inline def apply(databaseId: Any, useProto3Json: Any): Vi = {
    val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], useProto3Json = useProto3Json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vi] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(value: Any): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setUseProto3Json(value: Any): Self = StObject.set(x, "useProto3Json", value.asInstanceOf[js.Any])
  }
}
