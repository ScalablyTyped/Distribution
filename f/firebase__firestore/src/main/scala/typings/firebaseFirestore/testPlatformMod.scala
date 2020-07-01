package typings.firebaseFirestore

import typings.firebaseFirestore.utilTypesMod.DocumentLike
import typings.firebaseFirestore.utilTypesMod.WindowLike
import typings.std.EventListener
import typings.std.IDBFactory
import typings.std.Storage
import typings.std.VisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/util/test_platform", JSImport.Namespace)
@js.native
object testPlatformMod extends js.Object {
  @js.native
  class FakeDocument () extends DocumentLike {
    var _visibilityState: js.Any = js.native
    var visibilityListener: js.Any = js.native
    /* CompleteClass */
    override val visibilityState: VisibilityState = js.native
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    def raiseVisibilityEvent(visibility: VisibilityState): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
    @JSName("visibilityState")
    def visibilityState_MFakeDocument: VisibilityState = js.native
  }
  
  @js.native
  class FakeWindow protected () extends WindowLike {
    def this(sharedFakeStorage: SharedFakeWebStorage) = this()
    def this(sharedFakeStorage: SharedFakeWebStorage, fakeIndexedDb: IDBFactory) = this()
    val fakeIndexedDb: js.Any = js.native
    val fakeStorageArea: js.Any = js.native
    /* CompleteClass */
    override val indexedDB: IDBFactory | Null = js.native
    /* CompleteClass */
    override val localStorage: Storage = js.native
    var storageListeners: js.Any = js.native
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    @JSName("indexedDB")
    def indexedDB_MFakeWindow: IDBFactory | Null = js.native
    @JSName("localStorage")
    def localStorage_MFakeWindow: Storage = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
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
    /* private */ def length: js.Any = js.native
  }
  
  def testDocument(): FakeDocument = js.native
  def testWindow(): FakeWindow = js.native
  def testWindow(sharedWebStorage: SharedFakeWebStorage): FakeWindow = js.native
}

