package typings.firebaseDatabase

import typings.firebaseDatabase.changeMod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", JSImport.Namespace)
@js.native
object childChangeAccumulatorMod extends js.Object {
  
  @js.native
  class ChildChangeAccumulator () extends js.Object {
    
    val changeMap: js.Any = js.native
    
    def getChanges(): js.Array[Change] = js.native
    
    def trackChildChange(change: Change): Unit = js.native
  }
}
