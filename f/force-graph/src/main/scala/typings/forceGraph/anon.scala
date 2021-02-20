package typings.forceGraph

import typings.forceGraph.forceGraphStrings.center
import typings.forceGraph.forceGraphStrings.charge
import typings.forceGraph.forceGraphStrings.link
import typings.forceGraph.mod.ForceGraph.DagMode
import typings.forceGraph.mod.ForceGraph.ForceFn
import typings.forceGraph.mod.ForceGraph.ForceGraphInstance
import typings.forceGraph.mod.ForceGraph.GraphData
import typings.forceGraph.mod.ForceGraph.GraphLinkObject
import typings.forceGraph.mod.ForceGraph.GraphNodeObject
import typings.forceGraph.mod.ForceGraph.LinkAccessorFn
import typings.forceGraph.mod.ForceGraph.LinkCanvasCallbackFn
import typings.forceGraph.mod.ForceGraph.LinkEventCallback
import typings.forceGraph.mod.ForceGraph.NodeAccessorFn
import typings.forceGraph.mod.ForceGraph.NodeCanvasCallbackFn
import typings.forceGraph.mod.ForceGraph.NodeEventCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined force-graph.force-graph.ForceGraph.ForceGraphInstance & {  x :number,   y :number} */
  @js.native
  trait ForceGraphInstancexnumber extends StObject {
    
    // Init / de-init
    def apply(element: HTMLElement): ForceGraphInstance = js.native
    
    def _destructor(): Unit = js.native
    
    def backgroundColor(): ForceGraphInstance with String = js.native
    def backgroundColor(color: String): ForceGraphInstance with String = js.native
    
    def centerAt(): ForceGraphInstance with X = js.native
    def centerAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], milliseconds: Double): ForceGraphInstance with X = js.native
    def centerAt(x: js.UndefOr[scala.Nothing], y: Double): ForceGraphInstance with X = js.native
    def centerAt(x: js.UndefOr[scala.Nothing], y: Double, milliseconds: Double): ForceGraphInstance with X = js.native
    def centerAt(x: Double): ForceGraphInstance with X = js.native
    def centerAt(x: Double, y: js.UndefOr[scala.Nothing], milliseconds: Double): ForceGraphInstance with X = js.native
    def centerAt(x: Double, y: Double): ForceGraphInstance with X = js.native
    def centerAt(x: Double, y: Double, milliseconds: Double): ForceGraphInstance with X = js.native
    
    def cooldownTicks(): ForceGraphInstance with Double = js.native
    def cooldownTicks(ticks: Double): ForceGraphInstance with Double = js.native
    
    def cooldownTime(): ForceGraphInstance with Double = js.native
    def cooldownTime(milliseconds: Double): ForceGraphInstance with Double = js.native
    
    def d3AlphaDecay(): ForceGraphInstance with Double = js.native
    def d3AlphaDecay(decay: Double): ForceGraphInstance with Double = js.native
    
    def d3Force(force: String): ForceGraphInstance with ForceFn = js.native
    def d3Force(force: String, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_center(force: center): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_center(force: center, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_charge(force: charge): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_charge(force: charge, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_link(force: link): ForceGraphInstance with ForceFn = js.native
    @JSName("d3Force")
    def d3Force_link(force: link, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
    
    def d3ReheatSimulation(): ForceGraphInstance = js.native
    
    def d3VelocityDecay(): ForceGraphInstance with Double = js.native
    def d3VelocityDecay(decay: Double): ForceGraphInstance with Double = js.native
    
    def dagLevelDistance(): ForceGraphInstance with Double = js.native
    def dagLevelDistance(distance: Double): ForceGraphInstance with Double = js.native
    
    // Force engine configuration
    def dagMode(): ForceGraphInstance with DagMode = js.native
    def dagMode(mode: DagMode): ForceGraphInstance with DagMode = js.native
    
    def emitParticle(link: GraphLinkObject): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    
    def enableNodeDrag(): ForceGraphInstance with Boolean = js.native
    def enableNodeDrag(enable: Boolean): ForceGraphInstance with Boolean = js.native
    
    def enablePointerInteraction(): ForceGraphInstance with Boolean = js.native
    def enablePointerInteraction(enable: Boolean): ForceGraphInstance with Boolean = js.native
    
    def enableZoomPanInteraction(): ForceGraphInstance with Boolean = js.native
    def enableZoomPanInteraction(enable: Boolean): ForceGraphInstance with Boolean = js.native
    
    // Data input
    def graphData(): ForceGraphInstance with GraphData = js.native
    def graphData(data: GraphData): ForceGraphInstance with GraphData = js.native
    
    def height(): ForceGraphInstance with Double = js.native
    def height(height: Double): ForceGraphInstance with Double = js.native
    
    def linkAutoColorBy(): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkAutoColorBy(attribute: String): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkAutoColorBy(attribute: LinkAccessorFn[String]): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    
    def linkCanvasObject(): ForceGraphInstance with LinkCanvasCallbackFn = js.native
    def linkCanvasObject(callback: LinkCanvasCallbackFn): ForceGraphInstance with LinkCanvasCallbackFn = js.native
    
    def linkColor(): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkColor(color: String): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkColor(color: LinkAccessorFn[String]): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    
    def linkCurvature(): ForceGraphInstance = js.native
    def linkCurvature(curvature: String): ForceGraphInstance = js.native
    def linkCurvature(curvature: Double): ForceGraphInstance = js.native
    def linkCurvature(curvature: LinkAccessorFn[Double]): ForceGraphInstance = js.native
    
    def linkDirectionalArrowColor(): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkDirectionalArrowColor(color: String): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkDirectionalArrowColor(color: LinkAccessorFn[String]): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    
    def linkDirectionalArrowLength(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowLength(length: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowLength(length: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowLength(length: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def linkDirectionalArrowRelPos(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowRelPos(ratio: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowRelPos(ratio: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalArrowRelPos(ratio: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def linkDirectionalParticleColor(): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkDirectionalParticleColor(color: String): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    def linkDirectionalParticleColor(color: LinkAccessorFn[String]): ForceGraphInstance with (String | LinkAccessorFn[String]) = js.native
    
    def linkDirectionalParticleSpeed(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleSpeed(speed: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleSpeed(speed: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleSpeed(speed: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def linkDirectionalParticleWidth(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleWidth(width: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleWidth(width: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticleWidth(width: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def linkDirectionalParticles(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticles(particleCount: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticles(particleCount: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkDirectionalParticles(particleCount: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def linkHoverPrecision(): ForceGraphInstance with Double = js.native
    def linkHoverPrecision(precision: Double): ForceGraphInstance with Double = js.native
    
    // Link styling
    def linkLabel(): ForceGraphInstance with (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
    def linkLabel(label: String): ForceGraphInstance with (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
    def linkLabel(label: LinkAccessorFn[js.UndefOr[String]]): ForceGraphInstance with (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
    
    def linkSource(): ForceGraphInstance with String = js.native
    def linkSource(source: String): ForceGraphInstance with String = js.native
    
    def linkTarget(): ForceGraphInstance with String = js.native
    def linkTarget(target: String): ForceGraphInstance with String = js.native
    
    def linkVisibility(): ForceGraphInstance with (Boolean | String | LinkAccessorFn[Boolean]) = js.native
    def linkVisibility(visible: String): ForceGraphInstance with (Boolean | String | LinkAccessorFn[Boolean]) = js.native
    def linkVisibility(visible: Boolean): ForceGraphInstance with (Boolean | String | LinkAccessorFn[Boolean]) = js.native
    def linkVisibility(visible: LinkAccessorFn[Boolean]): ForceGraphInstance with (Boolean | String | LinkAccessorFn[Boolean]) = js.native
    
    def linkWidth(): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkWidth(width: String): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkWidth(width: Double): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    def linkWidth(width: LinkAccessorFn[Double]): ForceGraphInstance with (Double | String | LinkAccessorFn[Double]) = js.native
    
    def nodeAutoColorBy(): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    def nodeAutoColorBy(attribute: String): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    def nodeAutoColorBy(attribute: NodeAccessorFn[String]): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    
    def nodeCanvasObject(): ForceGraphInstance with NodeCanvasCallbackFn = js.native
    def nodeCanvasObject(callback: NodeCanvasCallbackFn): ForceGraphInstance with NodeCanvasCallbackFn = js.native
    
    def nodeColor(): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    def nodeColor(color: String): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    def nodeColor(color: NodeAccessorFn[String]): ForceGraphInstance with (String | NodeAccessorFn[String]) = js.native
    
    def nodeId(): ForceGraphInstance with String = js.native
    def nodeId(id: String): ForceGraphInstance with String = js.native
    
    def nodeLabel(): ForceGraphInstance with (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
    def nodeLabel(label: String): ForceGraphInstance with (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
    def nodeLabel(label: NodeAccessorFn[js.UndefOr[String]]): ForceGraphInstance with (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
    
    // Node styling
    def nodeRelSize(): ForceGraphInstance with Double = js.native
    def nodeRelSize(size: Double): ForceGraphInstance with Double = js.native
    
    def nodeVal(): ForceGraphInstance with (Double | String | NodeAccessorFn[Double]) = js.native
    def nodeVal(`val`: String): ForceGraphInstance with (Double | String | NodeAccessorFn[Double]) = js.native
    def nodeVal(`val`: Double): ForceGraphInstance with (Double | String | NodeAccessorFn[Double]) = js.native
    def nodeVal(`val`: NodeAccessorFn[Double]): ForceGraphInstance with (Double | String | NodeAccessorFn[Double]) = js.native
    
    def onEngineStop(callback: js.Function0[Unit]): ForceGraphInstance = js.native
    
    def onEngineTick(callback: js.Function0[Unit]): ForceGraphInstance = js.native
    
    def onLinkClick(callback: LinkEventCallback): ForceGraphInstance = js.native
    
    def onLinkHover(
      callback: js.Function2[
          /* link */ js.UndefOr[GraphLinkObject], 
          /* previousLink */ js.UndefOr[GraphLinkObject], 
          Unit
        ]
    ): ForceGraphInstance = js.native
    
    def onLinkRightClick(callback: LinkEventCallback): ForceGraphInstance = js.native
    
    // Interaction
    def onNodeClick(callback: NodeEventCallback): ForceGraphInstance = js.native
    
    def onNodeDrag(callback: NodeEventCallback): ForceGraphInstance = js.native
    
    def onNodeDragEnd(callback: NodeEventCallback): ForceGraphInstance = js.native
    
    def onNodeHover(
      callback: js.Function2[
          /* node */ js.UndefOr[GraphNodeObject], 
          /* previousNode */ js.UndefOr[GraphNodeObject], 
          Unit
        ]
    ): ForceGraphInstance = js.native
    
    def onNodeRightClick(callback: NodeEventCallback): ForceGraphInstance = js.native
    
    // Render control
    def pauseAnimation(): ForceGraphInstance = js.native
    
    def refresh(): ForceGraphInstance = js.native
    
    // Alias for pauseAnimation()
    def resumeAnimation(): ForceGraphInstance = js.native
    
    def stopAnimation(): ForceGraphInstance = js.native
    
    def warmupTicks(): ForceGraphInstance with Double = js.native
    def warmupTicks(ticks: Double): ForceGraphInstance with Double = js.native
    
    // Container layout
    def width(): ForceGraphInstance with Double = js.native
    def width(width: Double): ForceGraphInstance with Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    def zoom(): ForceGraphInstance with Double = js.native
    def zoom(zoomLevel: js.UndefOr[scala.Nothing], duration: Double): ForceGraphInstance with Double = js.native
    def zoom(zoomLevel: Double): ForceGraphInstance with Double = js.native
    def zoom(zoomLevel: Double, duration: Double): ForceGraphInstance with Double = js.native
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
