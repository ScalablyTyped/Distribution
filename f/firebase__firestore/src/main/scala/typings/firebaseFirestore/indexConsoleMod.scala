package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.apiDatabaseMod.FirestoreDatabase
import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.componentProviderMod.ComponentProvider
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/index.console", JSImport.Namespace)
@js.native
object indexConsoleMod extends js.Object {
  @js.native
  class Blob protected ()
    extends typings.firebaseFirestore.blobMod.Blob {
    def this(byteString: ByteString) = this()
  }
  
  @js.native
  class DocumentReference[T] protected ()
    extends typings.firebaseFirestore.apiDatabaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typings.firebaseFirestore.apiDatabaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typings.firebaseFirestore.apiDatabaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typings.firebaseFirestore.apiFieldPathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue ()
    extends typings.firebaseFirestore.apiFieldValueMod.FieldValue
  
  @js.native
  class Firestore protected ()
    extends typings.firebaseFirestore.apiDatabaseMod.Firestore {
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(
      databaseIdOrApp: FirestoreDatabase,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
    def this(
      databaseIdOrApp: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typings.firebaseFirestore.geoPointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typings.firebaseFirestore.timestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    typings.firebaseFirestore.apiDatabaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    typings.firebaseFirestore.apiDatabaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    typings.firebaseFirestore.apiDatabaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable1[/* byteString */ ByteString, typings.firebaseFirestore.blobMod.Blob] {
    def fromBase64String(base64: String): typings.firebaseFirestore.blobMod.Blob = js.native
    def fromUint8Array(array: Uint8Array): typings.firebaseFirestore.blobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
          typings.firebaseFirestore.apiDatabaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typings.firebaseFirestore.apiDatabaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typings.firebaseFirestore.apiDatabaseMod.Firestore): typings.firebaseFirestore.apiDatabaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typings.firebaseFirestore.apiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typings.firebaseFirestore.apiDatabaseMod.DocumentReference[U] = js.native
  }
  
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Internal Note: The backend doesn't technically support querying by
      * document ID. Instead it queries by the entire document name (full path
      * included), but in the cases we currently support documentId(), the net
      * effect is the same.
      */
    val _DOCUMENT_ID: js.Any = js.native
    def documentId(): typings.firebaseFirestore.apiFieldPathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue
    extends Instantiable0[typings.firebaseFirestore.apiFieldValueMod.FieldValue] {
    def arrayRemove(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def arrayUnion(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def delete(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def increment(n: Double): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def serverTimestamp(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
  }
  
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
    def logLevel: LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: Date): typings.firebaseFirestore.timestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typings.firebaseFirestore.timestampMod.Timestamp = js.native
    def now(): typings.firebaseFirestore.timestampMod.Timestamp = js.native
  }
  
}

