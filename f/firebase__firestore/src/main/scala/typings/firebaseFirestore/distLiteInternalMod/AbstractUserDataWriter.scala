package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Converts Firestore's internal types to the JavaScript types that we expose
  * to the user.
  *
  * @internal
  */
@js.native
trait AbstractUserDataWriter extends StObject {
  
  /* private */ var convertArray: Any = js.native
  
  /* protected */ def convertBytes(bytes: ByteString): Any = js.native
  
  /* protected */ def convertDocumentKey(name: String, expectedDatabaseId: DatabaseId): DocumentKey = js.native
  
  /* private */ var convertGeoPoint: Any = js.native
  
  /* private */ var convertObject: Any = js.native
  
  /**
    * @internal
    */
  def convertObjectMap(): typings.firebaseFirestoreTypes.mod.DocumentData = js.native
  def convertObjectMap(fields: Unit, serverTimestampBehavior: ServerTimestampBehavior): typings.firebaseFirestoreTypes.mod.DocumentData = js.native
  def convertObjectMap(fields: ApiClientObjectMap[Value]): typings.firebaseFirestoreTypes.mod.DocumentData = js.native
  def convertObjectMap(fields: ApiClientObjectMap[Value], serverTimestampBehavior: ServerTimestampBehavior): typings.firebaseFirestoreTypes.mod.DocumentData = js.native
  
  /* protected */ def convertReference(name: String): Any = js.native
  
  /* private */ var convertServerTimestamp: Any = js.native
  
  /* private */ var convertTimestamp: Any = js.native
  
  def convertValue(value: Value): Any = js.native
  def convertValue(value: Value, serverTimestampBehavior: ServerTimestampBehavior): Any = js.native
}
