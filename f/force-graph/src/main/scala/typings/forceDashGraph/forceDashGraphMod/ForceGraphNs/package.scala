package typings.forceDashGraph.forceDashGraphMod

import typings.forceDashGraph.Anon_X
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ForceGraphNs {
  type ForceFn = js.Function1[/* node */ Anon_X, Double]
  type LinkAccessorFn[T] = js.Function1[/* link */ GraphLinkObject, T]
  type LinkCanvasCallbackFn = js.Function3[
    /* link */ GraphLinkObject, 
    /* canvasContext */ CanvasRenderingContext2D, 
    /* globalScale */ Double, 
    Unit
  ]
  type LinkEventCallback = js.Function1[/* link */ GraphLinkObject, Unit]
  /**
    * Types
    */
  type NodeAccessorFn[T] = js.Function1[/* node */ GraphNodeObject, T]
  type NodeCanvasCallbackFn = js.Function3[
    /* node */ GraphNodeObject, 
    /* canvasContext */ CanvasRenderingContext2D, 
    /* globalScale */ Double, 
    Unit
  ]
  type NodeEventCallback = js.Function1[/* node */ GraphNodeObject, Unit]
}
