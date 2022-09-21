package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The different modes supported by `Persistence.runTransaction()`. */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.readonly
  - typings.firebaseFirestore.firebaseFirestoreStrings.readwrite
  - typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
*/
trait PersistenceTransactionMode extends StObject
object PersistenceTransactionMode {
  
  inline def readonly: typings.firebaseFirestore.firebaseFirestoreStrings.readonly = "readonly".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readonly]
  
  inline def readwrite: typings.firebaseFirestore.firebaseFirestoreStrings.readwrite = "readwrite".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.readwrite]
  
  inline def `readwrite-primary`: typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = "readwrite-primary".asInstanceOf[typings.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`]
}
