package typings.elementaryCircuitsDirectedGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(adjacencyList: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].apply(adjacencyList.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  /**
    * Takes an adjacencyList and a function which will be called for each circuit found therein. Doesn't return anything.
    */
  inline def apply(adjacencyList: js.Array[js.Array[Double]], cb: js.Function1[/* circuit */ js.Array[Double], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(adjacencyList.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("elementary-circuits-directed-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
