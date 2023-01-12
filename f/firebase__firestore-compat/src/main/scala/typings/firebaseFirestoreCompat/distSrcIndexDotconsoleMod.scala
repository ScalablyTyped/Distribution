package typings.firebaseFirestoreCompat

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.mod.Bytes
import typings.firebaseFirestore.mod.FirestoreDataConverter
import typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.PersistenceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIndexDotconsoleMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Blob")
  @js.native
  open class Blob protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob {
    def this(_delegate: Bytes) = this()
  }
  /* static members */
  object Blob {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "Blob")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64String(base64: String): typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob]
    
    inline def fromUint8Array(array: js.typedarray.Uint8Array): typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.CollectionReference[T] {
    def this(
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typings.firebaseFirestore.mod.CollectionReference[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[T] {
    def this(
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typings.firebaseFirestore.mod.DocumentReference[T]
    ) = this()
  }
  /* static members */
  object DocumentReference {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentReference")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore
    ): typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore
    ): typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentReference[U]]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.DocumentSnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typings.firebaseFirestore.mod.DocumentSnapshot[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames - A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  /* static members */
  object FieldPath {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldPath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def documentId(): typings.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldPathMod.FieldPath]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldValue")
  @js.native
  open class FieldValue protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue {
    def this(_delegate: typings.firebaseFirestore.mod.FieldValue) = this()
  }
  /* static members */
  object FieldValue {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "FieldValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def arrayRemove(elements: Any*): typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def arrayUnion(elements: Any*): typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def delete(): typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def increment(n: Double): typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
    
    inline def serverTimestamp(): typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.firebaseFirestoreCompat.distSrcApiFieldValueMod.FieldValue]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Firestore")
  @js.native
  open class Firestore protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore {
    def this(firestoreDatabase: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiGeoPointMod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "MemoryPersistenceProvider")
  @js.native
  open class MemoryPersistenceProvider ()
    extends StObject
       with PersistenceProvider {
    
    /* CompleteClass */
    override def clearIndexedDbPersistence(firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore): js.Promise[Unit] = js.native
    def clearIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableIndexedDbPersistence(
      firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      forceOwnership: Boolean
    ): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableMultiTabIndexedDbPersistence(firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore): js.Promise[Unit] = js.native
    def enableMultiTabIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.QuerySnapshot[T] {
    def this(
      _firestore: typings.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore,
      _delegate: typings.firebaseFirestore.mod.QuerySnapshot[T]
    ) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/index.console", "Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.firebaseFirestoreCompat.distSrcApiTimestampMod.Timestamp {
    /**
      * Creates a new timestamp.
      *
      * @param seconds - The number of seconds of UTC time since Unix epoch
      *     1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
      *     9999-12-31T23:59:59Z inclusive.
      * @param nanoseconds - The non-negative fractions of a second at nanosecond
      *     resolution. Negative second values with fractions must still have
      *     non-negative nanoseconds values that count forward in time. Must be
      *     from 0 to 999,999,999 inclusive.
      */
    def this(
      /**
      * The number of seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z.
      */
    seconds: Double,
      /**
      * The fractions of a second at nanosecond resolution.*
      */
    nanoseconds: Double
    ) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("@firebase/firestore-compat/dist/src/index.console", "Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new timestamp from the given date.
      *
      * @param date - The date to initialize the `Timestamp` from.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     date.
      */
    inline def fromDate(date: js.Date): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp from the given number of milliseconds.
      *
      * @param milliseconds - Number of milliseconds since Unix epoch
      *     1970-01-01T00:00:00Z.
      * @returns A new `Timestamp` representing the same point in time as the given
      *     number of milliseconds.
      */
    inline def fromMillis(milliseconds: Double): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
    
    /**
      * Creates a new timestamp with the current date, with millisecond precision.
      *
      * @returns a new timestamp representing the current date.
      */
    inline def now(): typings.firebaseFirestore.mod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.firebaseFirestore.mod.Timestamp]
  }
  
  trait FirestoreDatabase extends StObject {
    
    var database: js.UndefOr[String] = js.undefined
    
    var projectId: String
  }
  object FirestoreDatabase {
    
    inline def apply(projectId: String): FirestoreDatabase = {
      val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirestoreDatabase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirestoreDatabase] (val x: Self) extends AnyVal {
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
}
