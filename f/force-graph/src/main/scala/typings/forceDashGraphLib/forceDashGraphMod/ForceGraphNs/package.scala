package typings
package forceDashGraphLib.forceDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ForceGraphNs {
  type DagMode = forceDashGraphLib.forceDashGraphLibStrings.td | forceDashGraphLib.forceDashGraphLibStrings.bu | forceDashGraphLib.forceDashGraphLibStrings.lr | forceDashGraphLib.forceDashGraphLibStrings.rl | forceDashGraphLib.forceDashGraphLibStrings.radialout | forceDashGraphLib.forceDashGraphLibStrings.radialin
  type ForceFn = js.Function1[/* node */ forceDashGraphLib.Anon_X, scala.Double]
  type LinkAccessorFn[T] = js.Function1[/* link */ GraphLinkObject, T]
  type LinkCanvasCallbackFn = js.Function3[
    /* link */ GraphLinkObject, 
    /* canvasContext */ stdLib.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  type LinkEventCallback = js.Function1[/* link */ GraphLinkObject, scala.Unit]
  /**
    * Types
    */
  type NodeAccessorFn[T] = js.Function1[/* node */ GraphNodeObject, T]
  type NodeCanvasCallbackFn = js.Function3[
    /* node */ GraphNodeObject, 
    /* canvasContext */ stdLib.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  type NodeEventCallback = js.Function1[/* node */ GraphNodeObject, scala.Unit]
}
