package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "AbstractUserDataWriter")
@js.native
abstract class AbstractUserDataWriter () extends StObject {
  
  /* private */ var convertArray: Any = js.native
  
  /* protected */ def convertBytes(bytes: ByteString): Any = js.native
  
  /* protected */ def convertDocumentKey(name: String, expectedDatabaseId: DatabaseId): DocumentKey = js.native
  
  /* private */ var convertGeoPoint: Any = js.native
  
  /* private */ var convertObject: Any = js.native
  
  /* protected */ def convertReference(name: String): Any = js.native
  
  /* private */ var convertServerTimestamp: Any = js.native
  
  /* private */ var convertTimestamp: Any = js.native
  
  def convertValue(value: Value): Any = js.native
  def convertValue(value: Value, serverTimestampBehavior: ServerTimestampBehavior): Any = js.native
}
