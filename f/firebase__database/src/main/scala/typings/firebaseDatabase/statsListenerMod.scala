package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.statsCollectionMod.StatsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/stats/StatsListener", JSImport.Namespace)
@js.native
object statsListenerMod extends js.Object {
  
  @js.native
  class StatsListener protected () extends js.Object {
    def this(collection_ : StatsCollection) = this()
    
    var collection_ : js.Any = js.native
    
    def get(): StringDictionary[Double] = js.native
    
    var last_ : js.Any = js.native
  }
}
