package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreViewChangeMod.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewChildChangeAccumulatorMod {
  
  @JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", "ChildChangeAccumulator")
  @js.native
  open class ChildChangeAccumulator () extends StObject {
    
    /* private */ val changeMap: Any = js.native
    
    def getChanges(): js.Array[Change] = js.native
    
    def trackChildChange(change: Change): Unit = js.native
  }
}
