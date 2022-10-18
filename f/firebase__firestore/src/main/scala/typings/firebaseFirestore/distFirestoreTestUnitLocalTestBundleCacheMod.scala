package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreBundleMod.BundleMetadata
import typings.firebaseFirestore.distFirestoreSrcCoreBundleMod.NamedQuery
import typings.firebaseFirestore.distFirestoreSrcLocalPersistenceMod.Persistence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUnitLocalTestBundleCacheMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/local/test_bundle_cache", "TestBundleCache")
  @js.native
  open class TestBundleCache protected () extends StObject {
    def this(persistence: Persistence) = this()
    
    /* private */ val cache: Any = js.native
    
    def getBundleMetadata(bundleId: String): js.Promise[js.UndefOr[BundleMetadata]] = js.native
    
    def getNamedQuery(name: String): js.Promise[js.UndefOr[NamedQuery]] = js.native
    
    /* private */ val persistence: Any = js.native
    
    def saveBundleMetadata(metadata: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata): js.Promise[Unit] = js.native
    
    def setNamedQuery(query: typings.firebaseFirestore.distFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery): js.Promise[Unit] = js.native
  }
}
