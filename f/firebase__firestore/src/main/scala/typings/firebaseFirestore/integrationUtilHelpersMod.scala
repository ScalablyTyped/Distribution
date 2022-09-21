package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.apiReferenceImplMod.SnapshotListenOptions
import typings.firebaseFirestore.srcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.srcLiteApiSettingsMod.PrivateSettings
import typings.firebaseFirestore.utilFirebaseExportMod.CollectionReference
import typings.firebaseFirestore.utilFirebaseExportMod.DocumentReference
import typings.firebaseFirestore.utilFirebaseExportMod.Firestore
import typings.firebaseFirestore.utilFirebaseExportMod.QuerySnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationUtilHelpersMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/helpers", "apiDescribe")
  @js.native
  val apiDescribe: ApiDescribe_ = js.native
  
  inline def isPersistenceAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPersistenceAvailable")().asInstanceOf[Boolean]
  
  inline def toChangesArray(docSet: QuerySnapshot[DocumentData]): js.Array[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toChangesArray")(docSet.asInstanceOf[js.Any]).asInstanceOf[js.Array[DocumentData]]
  inline def toChangesArray(docSet: QuerySnapshot[DocumentData], options: SnapshotListenOptions): js.Array[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("toChangesArray")(docSet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[DocumentData]]
  
  inline def toDataArray(docSet: QuerySnapshot[DocumentData]): js.Array[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataArray")(docSet.asInstanceOf[js.Any]).asInstanceOf[js.Array[DocumentData]]
  
  inline def toDataMap(docSet: QuerySnapshot[DocumentData]): StringDictionary[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("toDataMap")(docSet.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[DocumentData]]
  
  inline def toIds(docSet: QuerySnapshot[DocumentData]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toIds")(docSet.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def withAlternateTestDb(persistence: Boolean, fn: js.Function1[/* db */ Firestore, js.Promise[Unit]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withAlternateTestDb")(persistence.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withNamedTestDbsOrSkipUnlessUsingEmulator(
    persistence: Boolean,
    dbNames: js.Array[String],
    fn: js.Function1[/* db */ js.Array[Firestore], js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withNamedTestDbsOrSkipUnlessUsingEmulator")(persistence.asInstanceOf[js.Any], dbNames.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestCollection(
    persistence: Boolean,
    docs: StringDictionary[DocumentData],
    fn: js.Function2[
      /* collection */ CollectionReference[DocumentData], 
      /* db */ Firestore, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestCollection")(persistence.asInstanceOf[js.Any], docs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestCollectionSettings(
    persistence: Boolean,
    settings: PrivateSettings,
    docs: StringDictionary[DocumentData],
    fn: js.Function2[
      /* collection */ CollectionReference[DocumentData], 
      /* db */ Firestore, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestCollectionSettings")(persistence.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], docs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDb(persistence: Boolean, fn: js.Function1[/* db */ Firestore, js.Promise[Unit]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDb")(persistence.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDbs(
    persistence: Boolean,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[Firestore], js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDbs")(persistence.asInstanceOf[js.Any], numDbs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDbsSettings(
    persistence: Boolean,
    projectId: String,
    settings: PrivateSettings,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[Firestore], js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDbsSettings")(persistence.asInstanceOf[js.Any], projectId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], numDbs.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDoc(
    persistence: Boolean,
    fn: js.Function2[/* doc */ DocumentReference[DocumentData], /* db */ Firestore, js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDoc")(persistence.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: Null,
    fn: js.Function2[/* doc */ DocumentReference[DocumentData], /* db */ Firestore, js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDocAndInitialData")(persistence.asInstanceOf[js.Any], initialData.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: DocumentData,
    fn: js.Function2[/* doc */ DocumentReference[DocumentData], /* db */ Firestore, js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDocAndInitialData")(persistence.asInstanceOf[js.Any], initialData.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDocAndSettings(
    persistence: Boolean,
    settings: PrivateSettings,
    fn: js.Function1[/* doc */ DocumentReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDocAndSettings")(persistence.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @js.native
  trait ApiDescribe_ extends StObject {
    
    def apply(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    
    def only(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    @JSName("only")
    var only_Original: ApiSuiteFunction = js.native
    
    def skip(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    @JSName("skip")
    var skip_Original: ApiSuiteFunction = js.native
  }
  
  type ApiSuiteFunction = js.Function2[
    /* message */ String, 
    /* testSuite */ js.Function1[/* persistence */ Boolean, Unit], 
    Unit
  ]
}
