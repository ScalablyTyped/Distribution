package typings.atFirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseFirestore.atFirebaseFirestoreStrings.`test-db2`
import typings.atFirebaseFirestore.distSrcApiCredentialsMod.EmptyCredentialsProvider
import typings.atFirebaseFirestore.distSrcAuthUserMod.User
import typings.atFirebaseFirestore.distTestIntegrationUtilHelpersMod.ApiDescribe
import typings.atFirebaseFirestore.distTestIntegrationUtilHelpersMod.ApiSuiteFunction
import typings.atFirebaseFirestore.distTestIntegrationUtilHelpersMod.MockCredentialsProvider
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Settings
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.SnapshotListenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/util/helpers", JSImport.Namespace)
@js.native
object distTestIntegrationUtilHelpersMod extends js.Object {
  @js.native
  trait ApiDescribe extends js.Object {
    @JSName("only")
    var only_Original: ApiSuiteFunction = js.native
    @JSName("skip")
    var skip_Original: ApiSuiteFunction = js.native
    def apply(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    def only(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    def skip(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
  }
  
  @js.native
  class MockCredentialsProvider () extends EmptyCredentialsProvider {
    var listener: js.Any = js.native
    def triggerUserChange(newUser: User): Unit = js.native
  }
  
  val ALT_PROJECT_ID: `test-db2` = js.native
  val DEFAULT_PROJECT_ID: js.Any = js.native
  val DEFAULT_SETTINGS: Settings = js.native
  val USE_EMULATOR: Boolean = js.native
  val apiDescribe: ApiDescribe = js.native
  def isPersistenceAvailable(): Boolean = js.native
  def isRunningAgainstEmulator(): Boolean = js.native
  def toChangesArray(docSet: QuerySnapshot): js.Array[DocumentData] = js.native
  def toChangesArray(docSet: QuerySnapshot, options: SnapshotListenOptions): js.Array[DocumentData] = js.native
  def toDataArray(docSet: QuerySnapshot): js.Array[DocumentData] = js.native
  def toDataMap(docSet: QuerySnapshot): StringDictionary[DocumentData] = js.native
  def toIds(docSet: QuerySnapshot): js.Array[String] = js.native
  def withAlternateTestDb(persistence: Boolean, fn: js.Function1[/* db */ FirebaseFirestore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withMockCredentialProviderTestDb(
    persistence: Boolean,
    fn: js.Function2[
      /* db */ FirebaseFirestore, 
      /* mockCredential */ MockCredentialsProvider, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestCollection(
    persistence: Boolean,
    docs: StringDictionary[DocumentData],
    fn: js.Function1[/* collection */ CollectionReference, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestCollectionSettings(
    persistence: Boolean,
    settings: Settings,
    docs: StringDictionary[DocumentData],
    fn: js.Function1[/* collection */ CollectionReference, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDb(persistence: Boolean, fn: js.Function1[/* db */ FirebaseFirestore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestDbs(
    persistence: Boolean,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[FirebaseFirestore], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDbsSettings(
    persistence: Boolean,
    projectId: String,
    settings: Settings,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[FirebaseFirestore], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDoc(persistence: Boolean, fn: js.Function1[/* doc */ DocumentReference, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: Null,
    fn: js.Function1[/* doc */ DocumentReference, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: DocumentData,
    fn: js.Function1[/* doc */ DocumentReference, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  type ApiSuiteFunction = js.Function2[
    /* message */ String, 
    /* testSuite */ js.Function1[/* persistence */ Boolean, Unit], 
    Unit
  ]
}

