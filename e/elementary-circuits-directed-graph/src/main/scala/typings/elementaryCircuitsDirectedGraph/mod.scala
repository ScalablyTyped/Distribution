package typings.elementaryCircuitsDirectedGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elementary-circuits-directed-graph", JSImport.Namespace)
  @js.native
  def apply(adjacencyList: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = js.native
  /**
    * Takes an adjacencyList and a function which will be called for each circuit found therein. Doesn't return anything.
    */
  @JSImport("elementary-circuits-directed-graph", JSImport.Namespace)
  @js.native
  def apply(adjacencyList: js.Array[js.Array[Double]], cb: js.Function1[/* circuit */ js.Array[Double], Unit]): Unit = js.native
}
