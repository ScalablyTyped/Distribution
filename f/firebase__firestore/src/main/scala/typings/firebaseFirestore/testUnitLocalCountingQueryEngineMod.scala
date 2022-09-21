package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcLocalQueryEngineMod.QueryEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUnitLocalCountingQueryEngineMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/test/unit/local/counting_query_engine", "CountingQueryEngine")
  @js.native
  open class CountingQueryEngine () extends QueryEngine {
    
    /**
      * The number of documents returned by the RemoteDocumentCache's
      * `getAll()` API (since the last call to `resetCounts()`)
      */
    var documentsReadByCollection: Double = js.native
    
    /**
      * The number of documents returned by the RemoteDocumentCache's `getEntry()`
      * and `getEntries()` APIs (since the last call to `resetCounts()`)
      */
    var documentsReadByKey: Double = js.native
    
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingQuery()` API (since the last call to
      * `resetCounts()`)
      */
    var mutationsReadByCollection: Double = js.native
    
    /**
      * The number of mutations returned by the MutationQueue's
      * `getAllMutationBatchesAffectingDocumentKey()` and
      * `getAllMutationBatchesAffectingDocumentKeys()` APIs (since the last call
      * to `resetCounts()`)
      */
    var mutationsReadByKey: Double = js.native
    
    /**
      * The number of documents returned by the OverlayCache's `getOverlays()`
      * API (since the last call to `resetCounts()`)
      */
    var overlaysReadByCollection: Double = js.native
    
    /**
      * The number of documents returned by the OverlayCache's `getOverlay()`
      * APIs (since the last call to `resetCounts()`)
      */
    var overlaysReadByKey: Double = js.native
    
    def resetCounts(): Unit = js.native
    
    /* private */ var wrapDocumentOverlayCache: Any = js.native
    
    /* private */ var wrapMutationQueue: Any = js.native
    
    /* private */ var wrapRemoteDocumentCache: Any = js.native
  }
}
