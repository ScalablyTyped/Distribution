package typings.fastAstar

import typings.fastAstar.anon.Col
import typings.fastAstar.anon.OptimalResult
import typings.fastAstar.fastAstarInts.`0`
import typings.fastAstar.fastAstarInts.`1`
import typings.fastAstar.fastAstarStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-astar", "Astar")
  @js.native
  open class Astar protected () extends StObject {
    def this(grid: Grid) = this()
    
    def search(
      originCoords: js.Tuple2[/* x */ Double, /* y */ Double],
      destinationCoords: js.Tuple2[/* x */ Double, /* y */ Double]
    ): js.UndefOr[js.Array[js.Tuple2[/* x */ Double, /* y */ Double]]] = js.native
    def search(
      originCoords: js.Tuple2[/* x */ Double, /* y */ Double],
      destinationCoords: js.Tuple2[/* x */ Double, /* y */ Double],
      options: OptimalResult
    ): js.UndefOr[js.Array[js.Tuple2[/* x */ Double, /* y */ Double]]] = js.native
  }
  
  @JSImport("fast-astar", "Grid")
  @js.native
  open class Grid protected () extends StObject {
    def this(grid: Col) = this()
    
    def set(coords: js.Tuple2[/* x */ Double, /* y */ Double], value: value, passable: `0` | `1`): Unit = js.native
  }
}
