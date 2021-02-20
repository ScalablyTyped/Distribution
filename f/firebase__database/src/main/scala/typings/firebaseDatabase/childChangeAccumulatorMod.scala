package typings.firebaseDatabase

import typings.firebaseDatabase.changeMod.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childChangeAccumulatorMod {
  
  @JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", "ChildChangeAccumulator")
  @js.native
  class ChildChangeAccumulator () extends StObject {
    
    val changeMap: js.Any = js.native
    
    def getChanges(): js.Array[Change] = js.native
    
    def trackChildChange(change: Change): Unit = js.native
  }
}
