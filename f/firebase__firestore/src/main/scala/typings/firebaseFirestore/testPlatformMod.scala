package typings.firebaseFirestore

import typings.firebaseFirestore.connectionMod.Connection
import typings.firebaseFirestore.connectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.platformMod.Platform
import typings.firebaseFirestore.serializerMod.JsonProtoSerializer
import typings.std.Document_
import typings.std.EventListener
import typings.std.IDBFactory
import typings.std.Storage
import typings.std.VisibilityState
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/util/test_platform", JSImport.Namespace)
@js.native
object testPlatformMod extends js.Object {
  @js.native
  class FakeDocument () extends js.Object {
    var _visibilityState: js.Any = js.native
    var visibilityListener: js.Any = js.native
    def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    def raiseVisibilityEvent(visibility: VisibilityState): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
    def visibilityState(): VisibilityState = js.native
  }
  
  @js.native
  class FakeWindow protected () extends js.Object {
    def this(sharedFakeStorage: SharedFakeWebStorage) = this()
    def this(sharedFakeStorage: SharedFakeWebStorage, fakeIndexedDb: IDBFactory) = this()
    val fakeIndexedDb: js.Any = js.native
    val fakeStorageArea: js.Any = js.native
    var storageListeners: js.Any = js.native
    def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    def indexedDB(): IDBFactory | Null = js.native
    def localStorage(): Storage = js.native
    def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
  }
  
  @js.native
  class SharedFakeWebStorage () extends js.Object {
    val activeClients: js.Any = js.native
    var clear: js.Any = js.native
    val data: js.Any = js.native
    var getItem: js.Any = js.native
    var key: js.Any = js.native
    var raiseStorageEvent: js.Any = js.native
    var removeItem: js.Any = js.native
    var setItem: js.Any = js.native
    def getStorageArea(storageListener: EventListener): Storage = js.native
    /* private */ def length(): js.Any = js.native
  }
  
  @js.native
  class TestPlatform protected () extends Platform {
    def this(basePlatform: Platform, mockStorage: SharedFakeWebStorage) = this()
    /** True if and only if the Base64 conversion functions are available. */
    /* CompleteClass */
    override val base64Available: Boolean = js.native
    val basePlatform: js.Any = js.native
    /** The Platform's 'document' implementation or null if not available. */
    /* CompleteClass */
    override val document: Document_ | Null = js.native
    val mockDocument: FakeDocument | Null = js.native
    val mockStorage: js.Any = js.native
    val mockWindow: FakeWindow | Null = js.native
    /** The Platform's 'window' implementation or null if not available. */
    /* CompleteClass */
    override val window: Window_ | Null = js.native
    /** Converts a Base64 encoded string to a binary string. */
    /* CompleteClass */
    override def atob(encoded: String): String = js.native
    @JSName("base64Available")
    def base64Available_MTestPlatform(): Boolean = js.native
    /** Converts a binary string to a Base64 encoded string. */
    /* CompleteClass */
    override def btoa(raw: String): String = js.native
    @JSName("document")
    def document_MTestPlatform(): Document_ | Null = js.native
    /** Formats an object as a JSON string, suitable for logging. */
    /* CompleteClass */
    override def formatJSON(value: js.Any): String = js.native
    /* CompleteClass */
    override def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
    /* CompleteClass */
    override def newConnectivityMonitor(): ConnectivityMonitor = js.native
    /* CompleteClass */
    override def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
    def raiseVisibilityEvent(visibility: VisibilityState): Unit = js.native
    @JSName("window")
    def window_MTestPlatform(): Window_ | Null = js.native
  }
  
}

