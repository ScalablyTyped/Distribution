package typings.firebaseFirestoreCompat

import typings.firebaseAppTypes.mod.FirebaseNamespace
import typings.firebaseFirestore.mod.AggregateQuerySnapshot
import typings.firebaseFirestore.mod.DocumentData
import typings.firebaseFirestore.mod.DocumentReference
import typings.firebaseFirestore.mod.DocumentSnapshot
import typings.firebaseFirestore.mod.FieldPath
import typings.firebaseFirestore.mod.Firestore
import typings.firebaseFirestore.mod.FirestoreError
import typings.firebaseFirestore.mod.FirestoreSettings
import typings.firebaseFirestore.mod.IndexConfiguration
import typings.firebaseFirestore.mod.LoadBundleTask
import typings.firebaseFirestore.mod.PartialWithFieldValue
import typings.firebaseFirestore.mod.PersistenceSettings
import typings.firebaseFirestore.mod.QueryConstraint
import typings.firebaseFirestore.mod.QuerySnapshot
import typings.firebaseFirestore.mod.Query_
import typings.firebaseFirestore.mod.SetOptions
import typings.firebaseFirestore.mod.SnapshotListenOptions
import typings.firebaseFirestore.mod.Transaction
import typings.firebaseFirestore.mod.TransactionOptions
import typings.firebaseFirestore.mod.Unsubscribe
import typings.firebaseFirestore.mod.UpdateData
import typings.firebaseFirestore.mod.WithFieldValue
import typings.firebaseFirestore.mod.WriteBatch_
import typings.firebaseFirestoreCompat.anon.Call
import typings.firebaseFirestoreCompat.anon.Complete
import typings.firebaseFirestoreCompat.anon.CountAggregateField
import typings.firebaseFirestoreCompat.anon.Error
import typings.firebaseFirestoreCompat.anon.MockUserToken
import typings.firebaseFirestoreCompat.anon.Next
import typings.firebaseFirestoreCompat.appCompatMod.FirebaseApp
import typings.firebaseFirestoreTypes.mod.CollectionReference
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.Query
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/firestore-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseFirestoreAugmentingMod {
    
    @JSImport("@firebase/firestore", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addDoc[T](reference: CollectionReference[T], data: WithFieldValue[T]): js.Promise[DocumentReference[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("addDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DocumentReference[T]]]
    
    inline def clearIndexedDbPersistence(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def collection(firestore: FirebaseFirestore, path: String, pathSegments: String*): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
    inline def collection(reference: CollectionReference[Any], path: String, pathSegments: String*): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
    inline def collection(
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[typings.firebaseFirestoreTypes.mod.DocumentData],
      path: String,
      pathSegments: String*
    ): typings.firebaseFirestore.mod.CollectionReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.firebaseFirestore.mod.CollectionReference[DocumentData]]
    
    inline def collectionGroup(firestore: FirebaseFirestore, collectionId: String): Query_[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectionGroup")(firestore.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[Query_[DocumentData]]
    
    inline def connectFirestoreEmulator(firestore: FirebaseFirestore, host: String, port: Double, options: js.UndefOr[MockUserToken]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectFirestoreEmulator")(firestore.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def deleteDoc(reference: typings.firebaseFirestoreTypes.mod.DocumentReference[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def disableNetwork(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def doc(firestore: FirebaseFirestore, path: String, pathSegments: String*): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(firestore.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
    inline def doc(
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[Any],
      path: String,
      pathSegments: String*
    ): DocumentReference[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[DocumentData]]
    inline def doc[T](reference: CollectionReference[T], path: js.UndefOr[String], pathSegments: String*): DocumentReference[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("doc")((scala.List(reference.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(pathSegments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DocumentReference[T]]
    
    inline def enableIndexedDbPersistence(firestore: FirebaseFirestore, persistenceSettings: js.UndefOr[PersistenceSettings]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("enableIndexedDbPersistence")(firestore.asInstanceOf[js.Any], persistenceSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def enableMultiTabIndexedDbPersistence(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMultiTabIndexedDbPersistence")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def enableNetwork(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableNetwork")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def getCountFromServer(query: Query[Any]): js.Promise[AggregateQuerySnapshot[CountAggregateField]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[CountAggregateField]]]
    
    inline def getDoc[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDoc")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]
    
    inline def getDocFromCache[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromCache")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]
    
    inline def getDocFromServer[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T]): js.Promise[DocumentSnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocFromServer")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DocumentSnapshot[T]]]
    
    inline def getDocs[T](query: Query[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocs")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]
    
    inline def getDocsFromCache[T](query: Query[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromCache")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]
    
    inline def getDocsFromServer[T](query: Query[T]): js.Promise[QuerySnapshot[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocsFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[QuerySnapshot[T]]]
    
    inline def getFirestore(app: FirebaseApp): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirestore")(app.asInstanceOf[js.Any]).asInstanceOf[Firestore]
    
    inline def initializeFirestore(app: FirebaseApp, settings: FirestoreSettings, databaseId: js.UndefOr[String]): Firestore = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeFirestore")(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], databaseId.asInstanceOf[js.Any])).asInstanceOf[Firestore]
    
    inline def loadBundle(
      firestore: FirebaseFirestore,
      bundleData: ReadableStream[js.typedarray.Uint8Array] | js.typedarray.ArrayBuffer | String
    ): LoadBundleTask = (^.asInstanceOf[js.Dynamic].applyDynamic("loadBundle")(firestore.asInstanceOf[js.Any], bundleData.asInstanceOf[js.Any])).asInstanceOf[LoadBundleTask]
    
    inline def namedQuery(firestore: FirebaseFirestore, name: String): js.Promise[Query_[DocumentData] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("namedQuery")(firestore.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Query_[DocumentData] | Null]]
    
    inline def onSnapshot[T](query: Query[T], observer: Error[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](
      query: Query[T],
      onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
      onError: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]],
      onCompletion: js.UndefOr[js.Function0[Unit]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](query: Query[T], options: SnapshotListenOptions, observer: Error[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](
      query: Query[T],
      options: SnapshotListenOptions,
      onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
      onError: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]],
      onCompletion: js.UndefOr[js.Function0[Unit]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T], observer: Complete[T]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T],
      onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
      onError: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]],
      onCompletion: js.UndefOr[js.Function0[Unit]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T],
      options: SnapshotListenOptions,
      observer: Complete[T]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshot[T](
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T],
      options: SnapshotListenOptions,
      onNext: js.Function1[/* snapshot */ DocumentSnapshot[T], Unit],
      onError: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]],
      onCompletion: js.UndefOr[js.Function0[Unit]]
    ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshot")(reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onCompletion.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def onSnapshotsInSync(firestore: FirebaseFirestore, observer: Next): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    inline def onSnapshotsInSync(firestore: FirebaseFirestore, onSync: js.Function0[Unit]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onSnapshotsInSync")(firestore.asInstanceOf[js.Any], onSync.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
    
    inline def query[T](query: Query[T], queryConstraints: QueryConstraint*): Query_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_[T]]
    
    inline def queryEqual[T](left: Query[T], right: Query[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("queryEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def runTransaction[T](
      firestore: FirebaseFirestore,
      updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
      options: js.UndefOr[TransactionOptions]
    ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(firestore.asInstanceOf[js.Any], updateFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
    
    inline def setDoc[T](
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T],
      data: PartialWithFieldValue[T],
      options: SetOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setDoc[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T], data: WithFieldValue[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setIndexConfiguration(firestore: FirebaseFirestore, configuration: IndexConfiguration): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def setIndexConfiguration(firestore: FirebaseFirestore, json: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIndexConfiguration")(firestore.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def terminate(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def updateDoc(
      reference: typings.firebaseFirestoreTypes.mod.DocumentReference[Any],
      field: String | FieldPath,
      value: Any,
      moreFieldsAndValues: Any*
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")((scala.List(reference.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).`++`(moreFieldsAndValues.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Unit]]
    inline def updateDoc[T](reference: typings.firebaseFirestoreTypes.mod.DocumentReference[T], data: UpdateData[T]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDoc")(reference.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def waitForPendingWrites(firestore: FirebaseFirestore): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForPendingWrites")(firestore.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def writeBatch(firestore: FirebaseFirestore): WriteBatch_ = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBatch")(firestore.asInstanceOf[js.Any]).asInstanceOf[WriteBatch_]
  }
  
  inline def registerFirestore(instance: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.undefined
    }
    object FirebaseApp {
      
      inline def apply(): typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp]
      }
      
      extension [Self <: typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp](x: Self) {
        
        inline def setFirestore(value: () => FirebaseFirestore): Self = StObject.set(x, "firestore", js.Any.fromFunction0(value))
        
        inline def setFirestoreUndefined: Self = StObject.set(x, "firestore", js.undefined)
      }
    }
    
    trait FirebaseNamespace extends StObject {
      
      def firestore(): FirebaseFirestore
      def firestore(app: typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp): FirebaseFirestore
      @JSName("firestore")
      var firestore_Original: Call
    }
    object FirebaseNamespace {
      
      inline def apply(firestore: Call): typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace = {
        val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace]
      }
      
      extension [Self <: typings.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseNamespace](x: Self) {
        
        inline def setFirestore(value: Call): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
      }
    }
  }
}
