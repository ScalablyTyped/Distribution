package typings.forceGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ForceGraph {
  
  type ForceFn = js.Function1[/* node */ typings.forceGraph.anon.X, scala.Double]
  
  type LinkAccessorFn[T] = js.Function1[/* link */ typings.forceGraph.mod.ForceGraph.GraphLinkObject, T]
  
  type LinkCanvasCallbackFn = js.Function3[
    /* link */ typings.forceGraph.mod.ForceGraph.GraphLinkObject, 
    /* canvasContext */ typings.std.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  
  type LinkEventCallback = js.Function1[/* link */ typings.forceGraph.mod.ForceGraph.GraphLinkObject, scala.Unit]
  
  /**
    * Types
    */
  type NodeAccessorFn[T] = js.Function1[/* node */ typings.forceGraph.mod.ForceGraph.GraphNodeObject, T]
  
  type NodeCanvasCallbackFn = js.Function3[
    /* node */ typings.forceGraph.mod.ForceGraph.GraphNodeObject, 
    /* canvasContext */ typings.std.CanvasRenderingContext2D, 
    /* globalScale */ scala.Double, 
    scala.Unit
  ]
  
  type NodeEventCallback = js.Function1[/* node */ typings.forceGraph.mod.ForceGraph.GraphNodeObject, scala.Unit]
}
