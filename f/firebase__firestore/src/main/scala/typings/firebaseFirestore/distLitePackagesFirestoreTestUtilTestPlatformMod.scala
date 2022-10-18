package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilTypesMod.DocumentLike
import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilTypesMod.WindowLike
import typings.std.EventListener
import typings.std.IDBFactory
import typings.std.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreTestUtilTestPlatformMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/util/test_platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/util/test_platform", "FakeDocument")
  @js.native
  open class FakeDocument ()
    extends StObject
       with DocumentLike {
    
    /* private */ var _visibilityState: Any = js.native
    
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    def raiseVisibilityEvent(
      visibility: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    /* private */ var visibilityListener: Any = js.native
    
    /* CompleteClass */
    override val visibilityState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any = js.native
    @JSName("visibilityState")
    def visibilityState_MFakeDocument: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/util/test_platform", "FakeWindow")
  @js.native
  open class FakeWindow protected ()
    extends StObject
       with WindowLike {
    def this(sharedFakeStorage: SharedFakeWebStorage) = this()
    def this(sharedFakeStorage: SharedFakeWebStorage, fakeIndexedDb: IDBFactory) = this()
    
    /* CompleteClass */
    override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    /* private */ val fakeIndexedDb: Any = js.native
    
    /* private */ val fakeStorageArea: Any = js.native
    
    /* CompleteClass */
    override val indexedDB: IDBFactory | Null = js.native
    @JSName("indexedDB")
    def indexedDB_MFakeWindow: IDBFactory | Null = js.native
    
    /* CompleteClass */
    override val localStorage: Storage = js.native
    @JSName("localStorage")
    def localStorage_MFakeWindow: Storage = js.native
    
    /* CompleteClass */
    override def removeEventListener(`type`: String, listener: EventListener): Unit = js.native
    
    /* private */ var storageListeners: Any = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/util/test_platform", "SharedFakeWebStorage")
  @js.native
  open class SharedFakeWebStorage () extends StObject {
    
    /* private */ val activeClients: Any = js.native
    
    /* private */ var clear: Any = js.native
    
    /* private */ val data: Any = js.native
    
    /* private */ var getItem: Any = js.native
    
    def getStorageArea(storageListener: EventListener): Storage = js.native
    
    /* private */ var key: Any = js.native
    
    /* private */ def length: Any = js.native
    
    /* private */ var raiseStorageEvent: Any = js.native
    
    /* private */ var removeItem: Any = js.native
    
    /* private */ var setItem: Any = js.native
  }
  
  inline def testDocument(): FakeDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("testDocument")().asInstanceOf[FakeDocument]
  
  inline def testWindow(): FakeWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("testWindow")().asInstanceOf[FakeWindow]
  inline def testWindow(sharedWebStorage: SharedFakeWebStorage): FakeWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("testWindow")(sharedWebStorage.asInstanceOf[js.Any]).asInstanceOf[FakeWindow]
}
