package typings.firebaseFirestoreCompat

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseFirestore.mod.FirestoreDataConverter
import typings.firebaseFirestore.mod.Query_
import typings.firebaseFirestore.mod.Unsubscribe
import typings.firebaseFirestore.mod.WriteBatch_
import typings.firebaseFirestoreCompat.anon.Delete
import typings.firebaseFirestoreCompat.anon.MockUserToken
import typings.firebaseFirestoreCompat.distSrcApiBlobMod.Blob
import typings.firebaseFirestoreCompat.distSrcApiObserverMod.PartialObserver
import typings.firebaseFirestoreTypes.mod.DocumentChangeType
import typings.firebaseFirestoreTypes.mod.DocumentData
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.firebaseFirestoreTypes.mod.SetOptions
import typings.firebaseFirestoreTypes.mod.SnapshotListenOptions
import typings.firebaseFirestoreTypes.mod.WhereFilterOp
import typings.firebaseUtil.mod.Compat
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiDatabaseMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseFirestoreTypes.mod.Query because Already inherited
  - typings.firebaseFirestoreTypes.mod.CollectionReference because Inheritance from two classes. Inlined id, path, parent, add, doc, doc, isEqual */ @JSImport("@firebase/firestore-compat/dist/src/api/database", "CollectionReference")
  @js.native
  open class CollectionReference[T] protected () extends Query[T] {
    def this(firestore: Firestore, _delegate: typings.firebaseFirestore.mod.CollectionReference[T]) = this()
    
    @JSName("_delegate")
    val _delegate_CollectionReference: typings.firebaseFirestore.mod.CollectionReference[T] = js.native
    
    def add(data: T): js.Promise[DocumentReference[T]] = js.native
    
    def doc(): DocumentReference[T] = js.native
    def doc(documentPath: String): DocumentReference[T] = js.native
    @JSName("doc")
    def doc_DocumentReference(): typings.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
    @JSName("doc")
    def doc_DocumentReference(documentPath: String): typings.firebaseFirestoreTypes.mod.DocumentReference[T] = js.native
    
    def id: String = js.native
    @JSName("id")
    val id_FCollectionReference: String = js.native
    
    def isEqual(other: CollectionReference[T]): Boolean = js.native
    def isEqual(other: typings.firebaseFirestoreTypes.mod.CollectionReference[T]): Boolean = js.native
    
    def parent: DocumentReference[DocumentData] | Null = js.native
    @JSName("parent")
    val parent_FCollectionReference: typings.firebaseFirestoreTypes.mod.DocumentReference[DocumentData] | Null = js.native
    
    def path: String = js.native
    @JSName("path")
    val path_FCollectionReference: String = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "DocumentChange")
  @js.native
  open class DocumentChange[T] protected ()
    extends StObject
       with typings.firebaseFirestoreTypes.mod.DocumentChange[T]
       with Compat[typings.firebaseFirestore.mod.DocumentChange[T]] {
    def this(_firestore: Firestore, _delegate: typings.firebaseFirestore.mod.DocumentChange[T]) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.DocumentChange[T] = js.native
    
    /* private */ val _firestore: Any = js.native
    
    /* CompleteClass */
    override val doc: typings.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[T] = js.native
    
    /* CompleteClass */
    override val newIndex: Double = js.native
    
    /* CompleteClass */
    override val oldIndex: Double = js.native
    
    /* CompleteClass */
    override val `type`: DocumentChangeType = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "DocumentReference")
  @js.native
  open class DocumentReference[T] protected ()
    extends typings.firebaseFirestoreTypes.mod.DocumentReference[T]
       with Compat[typings.firebaseFirestore.mod.DocumentReference[T]] {
    def this(firestore: Firestore, _delegate: typings.firebaseFirestore.mod.DocumentReference[T]) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.DocumentReference[T] = js.native
    
    /* private */ var _userDataWriter: Any = js.native
    
    def onSnapshot(observer: PartialObserver[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]): Unsubscribe = js.native
    def onSnapshot(
      options: SnapshotListenOptions,
      observer: PartialObserver[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]
    ): Unsubscribe = js.native
  }
  /* static members */
  object DocumentReference {
    
    @JSImport("@firebase/firestore-compat/dist/src/api/database", "DocumentReference")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: Firestore
    ): DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[U]]
    inline def forKey[U](
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
      firestore: Firestore,
      converter: FirestoreDataConverter[U]
    ): DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forKey")(key.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[U]]
    
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: Firestore
    ): DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[U]]
    inline def forPath[U](
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ResourcePath */ Any,
      firestore: Firestore,
      converter: FirestoreDataConverter[U]
    ): DocumentReference[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forPath")(path.asInstanceOf[js.Any], firestore.asInstanceOf[js.Any], converter.asInstanceOf[js.Any])).asInstanceOf[DocumentReference[U]]
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "DocumentSnapshot")
  @js.native
  open class DocumentSnapshot[T] protected ()
    extends typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]
       with Compat[typings.firebaseFirestore.mod.DocumentSnapshot[T]] {
    def this(_firestore: Firestore, _delegate: typings.firebaseFirestore.mod.DocumentSnapshot[T]) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.DocumentSnapshot[T] = js.native
    
    /* private */ val _firestore: Any = js.native
    
    def isEqual(other: DocumentSnapshot[T]): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAppTypes.privateMod.FirebaseService because var conflicts: INTERNAL, app. Inlined  */ @JSImport("@firebase/firestore-compat/dist/src/api/database", "Firestore")
  @js.native
  open class Firestore protected ()
    extends FirebaseFirestore
       with Compat[typings.firebaseFirestore.mod.Firestore] {
    def this(
      databaseIdOrApp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DatabaseId */ Any,
      _delegate: typings.firebaseFirestore.mod.Firestore,
      _persistenceProvider: PersistenceProvider
    ) = this()
    def this(
      databaseIdOrApp: FirebaseApp,
      _delegate: typings.firebaseFirestore.mod.Firestore,
      _persistenceProvider: PersistenceProvider
    ) = this()
    
    @JSName("INTERNAL")
    var INTERNAL_Firestore: Delete = js.native
    
    var _appCompat: js.UndefOr[FirebaseApp] = js.native
    
    def _databaseId: Any = js.native
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.Firestore = js.native
    
    /* private */ var _persistenceProvider: Any = js.native
    
    @JSName("app")
    def app_MFirestore: FirebaseApp = js.native
    
    def onSnapshotsInSync(observer: PartialObserver[Unit]): Unsubscribe = js.native
    
    def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "IndexedDbPersistenceProvider")
  @js.native
  open class IndexedDbPersistenceProvider ()
    extends StObject
       with PersistenceProvider {
    
    /* CompleteClass */
    override def clearIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableIndexedDbPersistence(firestore: Firestore, forceOwnership: Boolean): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def enableMultiTabIndexedDbPersistence(firestore: Firestore): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "Query")
  @js.native
  open class Query[T] protected ()
    extends typings.firebaseFirestoreTypes.mod.Query[T]
       with Compat[Query_[T]] {
    def this(firestore: Firestore, _delegate: Query_[T]) = this()
    
    /* CompleteClass */
    var _delegate: Query_[T] = js.native
    
    /* private */ val _userDataWriter: Any = js.native
    
    def onSnapshot(observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]): Unsubscribe = js.native
    def onSnapshot(
      options: SnapshotListenOptions,
      observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]
    ): Unsubscribe = js.native
    
    def orderBy(
      fieldPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
    ): Query[T] = js.native
    def orderBy(
      fieldPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any,
      directionStr: OrderByDirection
    ): Query[T] = js.native
    
    def where(
      fieldPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any,
      opStr: WhereFilterOp,
      value: Any
    ): Query[T] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseFirestoreTypes.mod.DocumentSnapshot because Already inherited
  - typings.firebaseFirestoreTypes.mod.QueryDocumentSnapshot because Inheritance from two classes. Inlined  */ @JSImport("@firebase/firestore-compat/dist/src/api/database", "QueryDocumentSnapshot")
  @js.native
  open class QueryDocumentSnapshot[T] protected () extends DocumentSnapshot[T] {
    def this(_firestore: Firestore, _delegate: typings.firebaseFirestore.mod.DocumentSnapshot[T]) = this()
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "QuerySnapshot")
  @js.native
  open class QuerySnapshot[T] protected ()
    extends typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]
       with Compat[typings.firebaseFirestore.mod.QuerySnapshot[T]] {
    def this(_firestore: Firestore, _delegate: typings.firebaseFirestore.mod.QuerySnapshot[T]) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.QuerySnapshot[T] = js.native
    
    val _firestore: Firestore = js.native
    
    def isEqual(other: QuerySnapshot[T]): Boolean = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "Transaction")
  @js.native
  open class Transaction protected ()
    extends typings.firebaseFirestoreTypes.mod.Transaction
       with Compat[typings.firebaseFirestore.mod.Transaction] {
    def this(_firestore: Firestore, _delegate: typings.firebaseFirestore.mod.Transaction) = this()
    
    /* CompleteClass */
    var _delegate: typings.firebaseFirestore.mod.Transaction = js.native
    
    /* private */ val _firestore: Any = js.native
    
    /* private */ var _userDataWriter: Any = js.native
    
    def set[T](documentRef: DocumentReference[T], data: T): Transaction = js.native
    def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): Transaction = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractUserDataWriter * / any */ @JSImport("@firebase/firestore-compat/dist/src/api/database", "UserDataWriter")
  @js.native
  open class UserDataWriter protected () extends StObject {
    def this(firestore: Firestore) = this()
    
    /* protected */ def convertBytes(
      bytes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _ByteString */ Any
    ): Blob = js.native
    
    /* protected */ def convertReference(name: String): DocumentReference[DocumentData] = js.native
    
    /* protected */ var firestore: Firestore = js.native
  }
  
  @JSImport("@firebase/firestore-compat/dist/src/api/database", "WriteBatch")
  @js.native
  open class WriteBatch protected ()
    extends typings.firebaseFirestoreTypes.mod.WriteBatch
       with Compat[WriteBatch_] {
    def this(_delegate: WriteBatch_) = this()
    
    /* CompleteClass */
    var _delegate: WriteBatch_ = js.native
    
    def set[T](documentRef: DocumentReference[T], data: T): WriteBatch = js.native
    def set[T](documentRef: DocumentReference[T], data: Partial[T], options: SetOptions): WriteBatch = js.native
  }
  
  inline def extractSnapshotOptions(args: js.Array[Any]): SnapshotListenOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSnapshotOptions")(args.asInstanceOf[js.Any]).asInstanceOf[SnapshotListenOptions]
  
  inline def setLogLevel(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wrapObserver[CompatType, ExpType](args: js.Array[Any], wrapper: js.Function1[/* val */ ExpType, CompatType]): PartialObserver[ExpType] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapObserver")(args.asInstanceOf[js.Any], wrapper.asInstanceOf[js.Any])).asInstanceOf[PartialObserver[ExpType]]
  
  trait PersistenceProvider extends StObject {
    
    def clearIndexedDbPersistence(firestore: Firestore): js.Promise[Unit]
    
    def enableIndexedDbPersistence(firestore: Firestore, forceOwnership: Boolean): js.Promise[Unit]
    
    def enableMultiTabIndexedDbPersistence(firestore: Firestore): js.Promise[Unit]
  }
  object PersistenceProvider {
    
    inline def apply(
      clearIndexedDbPersistence: Firestore => js.Promise[Unit],
      enableIndexedDbPersistence: (Firestore, Boolean) => js.Promise[Unit],
      enableMultiTabIndexedDbPersistence: Firestore => js.Promise[Unit]
    ): PersistenceProvider = {
      val __obj = js.Dynamic.literal(clearIndexedDbPersistence = js.Any.fromFunction1(clearIndexedDbPersistence), enableIndexedDbPersistence = js.Any.fromFunction2(enableIndexedDbPersistence), enableMultiTabIndexedDbPersistence = js.Any.fromFunction1(enableMultiTabIndexedDbPersistence))
      __obj.asInstanceOf[PersistenceProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistenceProvider] (val x: Self) extends AnyVal {
      
      inline def setClearIndexedDbPersistence(value: Firestore => js.Promise[Unit]): Self = StObject.set(x, "clearIndexedDbPersistence", js.Any.fromFunction1(value))
      
      inline def setEnableIndexedDbPersistence(value: (Firestore, Boolean) => js.Promise[Unit]): Self = StObject.set(x, "enableIndexedDbPersistence", js.Any.fromFunction2(value))
      
      inline def setEnableMultiTabIndexedDbPersistence(value: Firestore => js.Promise[Unit]): Self = StObject.set(x, "enableMultiTabIndexedDbPersistence", js.Any.fromFunction1(value))
    }
  }
  
  type SnapshotOptions = typings.firebaseFirestoreTypes.mod.SnapshotOptions
}
