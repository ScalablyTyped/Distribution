package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.apiDatabaseMod.FirestoreDatabase
import typings.firebaseFirestore.apiFieldValueMod.FieldValueImpl
import typings.firebaseFirestore.coreQueryMod.Query
import typings.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typings.firebaseFirestore.localPersistenceMod.PersistenceProvider
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.Document
import typings.firebaseFirestore.modelPathMod.ResourcePath
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/index.console", JSImport.Namespace)
@js.native
object indexConsoleMod extends js.Object {
  @js.native
  class Blob protected ()
    extends typings.firebaseFirestore.apiBlobMod.Blob {
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
  class FieldValue protected () extends FieldValueImpl {
    def this(_methodName: String) = this()
  }
  
  @js.native
  class Firestore protected ()
    extends typings.firebaseFirestore.apiDatabaseMod.Firestore {
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(
      databaseIdOrApp: FirestoreDatabase,
      authProvider: Provider[FirebaseAuthInternalName],
      persistenceProvider: PersistenceProvider
    ) = this()
    def this(
      databaseIdOrApp: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      persistenceProvider: PersistenceProvider
    ) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typings.firebaseFirestore.apiGeoPointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typings.firebaseFirestore.apiTimestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.firebaseFirestore.apiDatabaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.firebaseFirestore.apiDatabaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typings.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typings.firebaseFirestore.apiDatabaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable1[/* byteString */ ByteString, typings.firebaseFirestore.apiBlobMod.Blob] {
    def fromBase64String(base64: String): typings.firebaseFirestore.apiBlobMod.Blob = js.native
    def fromUint8Array(array: Uint8Array): typings.firebaseFirestore.apiBlobMod.Blob = js.native
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
  object FieldValue extends Instantiable1[/* _methodName */ String, FieldValueImpl] {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
    def logLevel(): LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: Date): typings.firebaseFirestore.apiTimestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typings.firebaseFirestore.apiTimestampMod.Timestamp = js.native
    def now(): typings.firebaseFirestore.apiTimestampMod.Timestamp = js.native
  }
  
}

