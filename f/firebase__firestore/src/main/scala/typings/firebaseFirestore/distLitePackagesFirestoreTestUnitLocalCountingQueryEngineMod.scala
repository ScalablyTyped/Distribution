package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalQueryEngineMod.QueryEngine
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelMutationMod.MutationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreTestUnitLocalCountingQueryEngineMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/counting_query_engine", "CountingQueryEngine")
  @js.native
  open class CountingQueryEngine () extends QueryEngine {
    
    /**
      * The number of documents returned by the RemoteDocumentCache's
      * `getAll()` API (since the last call to `resetCounts()`).
      */
    var documentsReadByCollection: Double = js.native
    
    /**
      * The number of documents returned by the RemoteDocumentCache's `getEntry()`
      * and `getEntries()` APIs (since the last call to `resetCounts()`)
      */
    var documentsReadByKey: Double = js.native
    
    var overlayTypes: StringDictionary[MutationType] = js.native
    
    /**
      * The number of overlays returned by the DocumentOverlayCache's
      * `getOverlaysByCollection(Group)` API (since the last call to
      * `resetCounts()`)
      */
    var overlaysReadByCollection: Double = js.native
    
    /**
      * The number of overlays returned by the DocumentOverlayCache's
      * `getOverlay(s)` APIs (since the last call to `resetCounts()`)
      */
    var overlaysReadByKey: Double = js.native
    
    def resetCounts(): Unit = js.native
    
    /* private */ var wrapOverlayCache: Any = js.native
    
    /* private */ var wrapRemoteDocumentCache: Any = js.native
  }
}
