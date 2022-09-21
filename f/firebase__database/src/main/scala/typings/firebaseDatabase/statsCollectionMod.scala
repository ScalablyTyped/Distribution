package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsCollectionMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/stats/StatsCollection", "StatsCollection")
  @js.native
  open class StatsCollection () extends StObject {
    
    /* private */ var counters_ : Any = js.native
    
    def get(): StringDictionary[Double] = js.native
    
    def incrementCounter(name: String): Unit = js.native
    def incrementCounter(name: String, amount: Double): Unit = js.native
  }
}
