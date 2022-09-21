package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.anon.AcknowledgedDocs
import typings.firebaseFirestore.fieldIndexMod.FieldIndex
import typings.firebaseFirestore.specBuilderMod.ActiveTargetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateExpectation extends StObject {
  
  /**
    * Current documents in limbo that have an active target.
    * Verified in each step until overwritten.
    */
  var activeLimboDocs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Current expected active targets. Verified in each step until overwritten.
    */
  var activeTargets: js.UndefOr[ActiveTargetMap] = js.undefined
  
  /**
    * Current documents in limbo that are enqueued and therefore do not have an
    * active target.
    * Verified in each step until overwritten.
    */
  var enqueuedLimboDocs: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indexes */
  var indexes: js.UndefOr[js.Array[FieldIndex]] = js.undefined
  
  /**
    * Whether the instance holds the primary lease. Used in multi-client tests.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the client is shutdown. */
  var isShutdown: js.UndefOr[Boolean] = js.undefined
  
  /** Number of clients currently marked active. Used in multi-client tests. */
  var numActiveClients: js.UndefOr[Double] = js.undefined
  
  /** Number of outstanding writes in the datastore queue. */
  var numOutstandingWrites: js.UndefOr[Double] = js.undefined
  
  /**
    * Expected set of callbacks for previously written docs.
    */
  var userCallbacks: js.UndefOr[AcknowledgedDocs] = js.undefined
  
  /** Number of requests sent to the watch stream. */
  var watchStreamRequestCount: js.UndefOr[Double] = js.undefined
  
  /** Number of requests sent to the write stream. */
  var writeStreamRequestCount: js.UndefOr[Double] = js.undefined
}
object StateExpectation {
  
  inline def apply(): StateExpectation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateExpectation]
  }
  
  extension [Self <: StateExpectation](x: Self) {
    
    inline def setActiveLimboDocs(value: js.Array[String]): Self = StObject.set(x, "activeLimboDocs", value.asInstanceOf[js.Any])
    
    inline def setActiveLimboDocsUndefined: Self = StObject.set(x, "activeLimboDocs", js.undefined)
    
    inline def setActiveLimboDocsVarargs(value: String*): Self = StObject.set(x, "activeLimboDocs", js.Array(value*))
    
    inline def setActiveTargets(value: ActiveTargetMap): Self = StObject.set(x, "activeTargets", value.asInstanceOf[js.Any])
    
    inline def setActiveTargetsUndefined: Self = StObject.set(x, "activeTargets", js.undefined)
    
    inline def setEnqueuedLimboDocs(value: js.Array[String]): Self = StObject.set(x, "enqueuedLimboDocs", value.asInstanceOf[js.Any])
    
    inline def setEnqueuedLimboDocsUndefined: Self = StObject.set(x, "enqueuedLimboDocs", js.undefined)
    
    inline def setEnqueuedLimboDocsVarargs(value: String*): Self = StObject.set(x, "enqueuedLimboDocs", js.Array(value*))
    
    inline def setIndexes(value: js.Array[FieldIndex]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: FieldIndex*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setIsShutdown(value: Boolean): Self = StObject.set(x, "isShutdown", value.asInstanceOf[js.Any])
    
    inline def setIsShutdownUndefined: Self = StObject.set(x, "isShutdown", js.undefined)
    
    inline def setNumActiveClients(value: Double): Self = StObject.set(x, "numActiveClients", value.asInstanceOf[js.Any])
    
    inline def setNumActiveClientsUndefined: Self = StObject.set(x, "numActiveClients", js.undefined)
    
    inline def setNumOutstandingWrites(value: Double): Self = StObject.set(x, "numOutstandingWrites", value.asInstanceOf[js.Any])
    
    inline def setNumOutstandingWritesUndefined: Self = StObject.set(x, "numOutstandingWrites", js.undefined)
    
    inline def setUserCallbacks(value: AcknowledgedDocs): Self = StObject.set(x, "userCallbacks", value.asInstanceOf[js.Any])
    
    inline def setUserCallbacksUndefined: Self = StObject.set(x, "userCallbacks", js.undefined)
    
    inline def setWatchStreamRequestCount(value: Double): Self = StObject.set(x, "watchStreamRequestCount", value.asInstanceOf[js.Any])
    
    inline def setWatchStreamRequestCountUndefined: Self = StObject.set(x, "watchStreamRequestCount", js.undefined)
    
    inline def setWriteStreamRequestCount(value: Double): Self = StObject.set(x, "writeStreamRequestCount", value.asInstanceOf[js.Any])
    
    inline def setWriteStreamRequestCountUndefined: Self = StObject.set(x, "writeStreamRequestCount", js.undefined)
  }
}
