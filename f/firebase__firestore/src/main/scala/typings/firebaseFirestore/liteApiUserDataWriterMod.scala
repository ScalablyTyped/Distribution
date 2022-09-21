package typings.firebaseFirestore

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.protosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.utilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liteApiUserDataWriterMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_writer", "AbstractUserDataWriter")
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseFirestore.firebaseFirestoreStrings.estimate
    - typings.firebaseFirestore.firebaseFirestoreStrings.previous
    - typings.firebaseFirestore.firebaseFirestoreStrings.none
  */
  trait ServerTimestampBehavior extends StObject
  object ServerTimestampBehavior {
    
    inline def estimate: typings.firebaseFirestore.firebaseFirestoreStrings.estimate = "estimate".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.estimate]
    
    inline def none: typings.firebaseFirestore.firebaseFirestoreStrings.none = "none".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.none]
    
    inline def previous: typings.firebaseFirestore.firebaseFirestoreStrings.previous = "previous".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.previous]
  }
}
