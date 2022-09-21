package typings.firebaseFirestore

import typings.firebaseFirestore.localPersistenceMod.Persistence
import typings.firebaseFirestore.srcCoreBundleMod.BundleMetadata
import typings.firebaseFirestore.srcCoreBundleMod.NamedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localTestBundleCacheMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/local/test_bundle_cache", "TestBundleCache")
  @js.native
  open class TestBundleCache protected () extends StObject {
    def this(persistence: Persistence) = this()
    
    /* private */ val cache: Any = js.native
    
    def getBundleMetadata(bundleId: String): js.Promise[js.UndefOr[BundleMetadata]] = js.native
    
    def getNamedQuery(name: String): js.Promise[js.UndefOr[NamedQuery]] = js.native
    
    /* private */ val persistence: Any = js.native
    
    def saveBundleMetadata(metadata: typings.firebaseFirestore.protosFirestoreBundleProtoMod.BundleMetadata): js.Promise[Unit] = js.native
    
    def setNamedQuery(query: typings.firebaseFirestore.protosFirestoreBundleProtoMod.NamedQuery): js.Promise[Unit] = js.native
  }
}
