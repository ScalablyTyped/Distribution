package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.distNodeEsmSrcCoreStatsStatsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreStatsStatsListenerMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/stats/StatsListener", "StatsListener")
  @js.native
  open class StatsListener protected () extends StObject {
    def this(collection_ : StatsCollection) = this()
    
    /* private */ var collection_ : Any = js.native
    
    def get(): StringDictionary[Double] = js.native
    
    /* private */ var last_ : Any = js.native
  }
}
