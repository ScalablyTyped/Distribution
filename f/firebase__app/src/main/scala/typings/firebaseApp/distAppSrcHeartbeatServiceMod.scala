package typings.firebaseApp

import typings.firebaseApp.anon.HeartbeatsToSend
import typings.firebaseApp.distAppSrcPublicTypesMod.FirebaseApp
import typings.firebaseApp.distAppSrcTypesMod.HeartbeatService
import typings.firebaseApp.distAppSrcTypesMod.HeartbeatStorage
import typings.firebaseApp.distAppSrcTypesMod.HeartbeatsByUserAgent
import typings.firebaseApp.distAppSrcTypesMod.HeartbeatsInIndexedDB
import typings.firebaseApp.distAppSrcTypesMod.SingleDateHeartbeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppSrcHeartbeatServiceMod {
  
  @JSImport("@firebase/app/dist/app/src/heartbeatService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/app/dist/app/src/heartbeatService", "HeartbeatServiceImpl")
  @js.native
  open class HeartbeatServiceImpl protected ()
    extends StObject
       with HeartbeatService {
    def this(container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ Any) = this()
    
    /**
      * In-memory cache for heartbeats, used by getHeartbeatsHeader() to generate
      * the header string.
      * Stores one record per date. This will be consolidated into the standard
      * format of one record per user agent string before being sent as a header.
      * Populated from indexedDB when the controller is instantiated and should
      * be kept in sync with indexedDB.
      * Leave public for easier testing.
      */
    var _heartbeatsCache: HeartbeatsInIndexedDB | Null = js.native
    
    /**
      * the initialization promise for populating heartbeatCache.
      * If getHeartbeatsHeader() is called before the promise resolves
      * (hearbeatsCache == null), it should wait for this promise
      * Leave public for easier testing.
      */
    var _heartbeatsCachePromise: js.Promise[HeartbeatsInIndexedDB] = js.native
    
    /**
      * The persistence layer for heartbeats
      * Leave public for easier testing.
      */
    var _storage: HeartbeatStorageImpl = js.native
    
    /* private */ val container: Any = js.native
    
    /**
      * Returns a base64 encoded string which can be attached to the heartbeat-specific header directly.
      * It also clears all heartbeats from memory as well as in IndexedDB.
      */
    /* CompleteClass */
    override def getHeartbeatsHeader(): js.Promise[String] = js.native
    
    /**
      * Called to report a heartbeat. The function will generate
      * a HeartbeatsByUserAgent object, update heartbeatsCache, and persist it
      * to IndexedDB.
      * Note that we only store one heartbeat per day. So if a heartbeat for today is
      * already logged, subsequent calls to this function in the same day will be ignored.
      */
    /* CompleteClass */
    override def triggerHeartbeat(): js.Promise[Unit] = js.native
  }
  
  @JSImport("@firebase/app/dist/app/src/heartbeatService", "HeartbeatStorageImpl")
  @js.native
  open class HeartbeatStorageImpl protected ()
    extends StObject
       with HeartbeatStorage {
    def this(app: FirebaseApp) = this()
    
    /* private */ var _canUseIndexedDBPromise: Any = js.native
    
    /* CompleteClass */
    override def add(heartbeats: HeartbeatsInIndexedDB): js.Promise[Unit] = js.native
    
    var app: FirebaseApp = js.native
    
    /* CompleteClass */
    override def overwrite(heartbeats: HeartbeatsInIndexedDB): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def read(): js.Promise[HeartbeatsInIndexedDB] = js.native
    
    def runIndexedDBEnvironmentCheck(): js.Promise[Boolean] = js.native
  }
  
  inline def countBytes(heartbeatsCache: js.Array[HeartbeatsByUserAgent]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countBytes")(heartbeatsCache.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def extractHeartbeatsForHeader(heartbeatsCache: js.Array[SingleDateHeartbeat]): HeartbeatsToSend = ^.asInstanceOf[js.Dynamic].applyDynamic("extractHeartbeatsForHeader")(heartbeatsCache.asInstanceOf[js.Any]).asInstanceOf[HeartbeatsToSend]
  inline def extractHeartbeatsForHeader(heartbeatsCache: js.Array[SingleDateHeartbeat], maxSize: Double): HeartbeatsToSend = (^.asInstanceOf[js.Dynamic].applyDynamic("extractHeartbeatsForHeader")(heartbeatsCache.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[HeartbeatsToSend]
}
