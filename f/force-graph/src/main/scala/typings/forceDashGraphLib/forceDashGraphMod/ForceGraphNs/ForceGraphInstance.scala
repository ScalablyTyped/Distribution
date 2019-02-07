package typings
package forceDashGraphLib.forceDashGraphMod.ForceGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents ForceGraph runtime object
  * @example:
  *  let forceGraph = ForceGraph();
  *  forceGraph(myHtmlElement);
  *  forceGraph.graphData([])
  */
@js.native
trait ForceGraphInstance extends js.Object {
  def apply(element: stdLib.HTMLElement): ForceGraphInstance = js.native
  def backgroundColor(): ForceGraphInstance with java.lang.String = js.native
  def backgroundColor(color: java.lang.String): ForceGraphInstance with java.lang.String = js.native
  def centerAt(): ForceGraphInstance with forceDashGraphLib.Anon_X = js.native
  def centerAt(x: scala.Double): ForceGraphInstance with forceDashGraphLib.Anon_X = js.native
  def centerAt(x: scala.Double, y: scala.Double): ForceGraphInstance with forceDashGraphLib.Anon_X = js.native
  def centerAt(x: scala.Double, y: scala.Double, milliseconds: scala.Double): ForceGraphInstance with forceDashGraphLib.Anon_X = js.native
  def cooldownTicks(): ForceGraphInstance with scala.Double = js.native
  def cooldownTicks(ticks: scala.Double): ForceGraphInstance with scala.Double = js.native
  def cooldownTime(): ForceGraphInstance with scala.Double = js.native
  def cooldownTime(milliseconds: scala.Double): ForceGraphInstance with scala.Double = js.native
  def d3AlphaDecay(): ForceGraphInstance with scala.Double = js.native
  def d3AlphaDecay(decay: scala.Double): ForceGraphInstance with scala.Double = js.native
  def d3Force(force: java.lang.String): ForceGraphInstance with ForceFn = js.native
  def d3Force(force: java.lang.String, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_center(force: forceDashGraphLib.forceDashGraphLibStrings.center): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_center(force: forceDashGraphLib.forceDashGraphLibStrings.center, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_charge(force: forceDashGraphLib.forceDashGraphLibStrings.charge): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_charge(force: forceDashGraphLib.forceDashGraphLibStrings.charge, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_link(force: forceDashGraphLib.forceDashGraphLibStrings.link): ForceGraphInstance with ForceFn = js.native
  @JSName("d3Force")
  def d3Force_link(force: forceDashGraphLib.forceDashGraphLibStrings.link, forceFn: ForceFn): ForceGraphInstance with ForceFn = js.native
  def d3VelocityDecay(): ForceGraphInstance with scala.Double = js.native
  def d3VelocityDecay(decay: scala.Double): ForceGraphInstance with scala.Double = js.native
  def dagLevelDistance(): ForceGraphInstance with scala.Double = js.native
  def dagLevelDistance(distance: scala.Double): ForceGraphInstance with scala.Double = js.native
  // Force engine configuration
  def dagMode(): ForceGraphInstance with DagMode = js.native
  def dagMode(mode: DagMode): ForceGraphInstance with DagMode = js.native
  def enableNodeDrag(): ForceGraphInstance with scala.Boolean = js.native
  def enableNodeDrag(enable: scala.Boolean): ForceGraphInstance with scala.Boolean = js.native
  def enablePointerInteraction(): ForceGraphInstance with scala.Boolean = js.native
  def enablePointerInteraction(enable: scala.Boolean): ForceGraphInstance with scala.Boolean = js.native
  def enableZoomPanInteraction(): ForceGraphInstance with scala.Boolean = js.native
  def enableZoomPanInteraction(enable: scala.Boolean): ForceGraphInstance with scala.Boolean = js.native
  // Data input
  def graphData(): ForceGraphInstance with GraphData = js.native
  def graphData(data: GraphData): ForceGraphInstance with GraphData = js.native
  def height(): ForceGraphInstance with scala.Double = js.native
  def height(height: scala.Double): ForceGraphInstance with scala.Double = js.native
  def linkAutoColorBy(): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkAutoColorBy(attribute: LinkAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkAutoColorBy(attribute: java.lang.String): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkCanvasObject(): ForceGraphInstance with LinkCanvasCallbackFn = js.native
  def linkCanvasObject(callback: LinkCanvasCallbackFn): ForceGraphInstance with LinkCanvasCallbackFn = js.native
  def linkColor(): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkColor(color: LinkAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkColor(color: java.lang.String): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkCurvature(): ForceGraphInstance = js.native
  def linkCurvature(curvature: LinkAccessorFn[LinkCurvatureType]): ForceGraphInstance = js.native
  def linkCurvature(curvature: LinkCurvatureType): ForceGraphInstance = js.native
  def linkCurvature(curvature: java.lang.String): ForceGraphInstance = js.native
  def linkDirectionalArrowColor(): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalArrowColor(color: LinkAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalArrowColor(color: java.lang.String): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalArrowLength(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowLength(length: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowLength(length: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowLength(length: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowRelPos(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowRelPos(ratio: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowRelPos(ratio: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalArrowRelPos(ratio: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleColor(): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalParticleColor(color: LinkAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalParticleColor(color: java.lang.String): ForceGraphInstance with (java.lang.String | LinkAccessorFn[java.lang.String]) = js.native
  def linkDirectionalParticleSpeed(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleSpeed(speed: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleSpeed(speed: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleSpeed(speed: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleWidth(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleWidth(width: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleWidth(width: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticleWidth(width: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticles(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticles(particleCount: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticles(particleCount: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkDirectionalParticles(particleCount: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkHoverPrecision(): ForceGraphInstance with scala.Double = js.native
  def linkHoverPrecision(precision: scala.Double): ForceGraphInstance with scala.Double = js.native
  // Link styling
  def linkLabel(): ForceGraphInstance with (java.lang.String | LinkAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  def linkLabel(label: LinkAccessorFn[js.UndefOr[java.lang.String]]): ForceGraphInstance with (java.lang.String | LinkAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  def linkLabel(label: java.lang.String): ForceGraphInstance with (java.lang.String | LinkAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  def linkSource(): ForceGraphInstance with java.lang.String = js.native
  def linkSource(source: java.lang.String): ForceGraphInstance with java.lang.String = js.native
  def linkTarget(): ForceGraphInstance with java.lang.String = js.native
  def linkTarget(target: java.lang.String): ForceGraphInstance with java.lang.String = js.native
  def linkVisibility(): ForceGraphInstance with (scala.Boolean | java.lang.String | LinkAccessorFn[scala.Boolean]) = js.native
  def linkVisibility(visible: LinkAccessorFn[scala.Boolean]): ForceGraphInstance with (scala.Boolean | java.lang.String | LinkAccessorFn[scala.Boolean]) = js.native
  def linkVisibility(visible: java.lang.String): ForceGraphInstance with (scala.Boolean | java.lang.String | LinkAccessorFn[scala.Boolean]) = js.native
  def linkVisibility(visible: scala.Boolean): ForceGraphInstance with (scala.Boolean | java.lang.String | LinkAccessorFn[scala.Boolean]) = js.native
  def linkWidth(): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkWidth(width: LinkAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkWidth(width: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def linkWidth(width: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | LinkAccessorFn[scala.Double]) = js.native
  def nodeAutoColorBy(): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeAutoColorBy(attribute: NodeAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeAutoColorBy(attribute: java.lang.String): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeCanvasObject(): ForceGraphInstance with NodeCanvasCallbackFn = js.native
  def nodeCanvasObject(callback: NodeCanvasCallbackFn): ForceGraphInstance with NodeCanvasCallbackFn = js.native
  def nodeColor(): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeColor(color: NodeAccessorFn[java.lang.String]): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeColor(color: java.lang.String): ForceGraphInstance with (java.lang.String | NodeAccessorFn[java.lang.String]) = js.native
  def nodeId(): ForceGraphInstance with java.lang.String = js.native
  def nodeId(id: java.lang.String): ForceGraphInstance with java.lang.String = js.native
  def nodeLabel(): ForceGraphInstance with (java.lang.String | NodeAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  def nodeLabel(label: NodeAccessorFn[js.UndefOr[java.lang.String]]): ForceGraphInstance with (java.lang.String | NodeAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  def nodeLabel(label: java.lang.String): ForceGraphInstance with (java.lang.String | NodeAccessorFn[js.UndefOr[java.lang.String]]) = js.native
  // Node styling
  def nodeRelSize(): ForceGraphInstance with scala.Double = js.native
  def nodeRelSize(size: scala.Double): ForceGraphInstance with scala.Double = js.native
  def nodeVal(): ForceGraphInstance with (scala.Double | java.lang.String | NodeAccessorFn[scala.Double]) = js.native
  def nodeVal(`val`: NodeAccessorFn[scala.Double]): ForceGraphInstance with (scala.Double | java.lang.String | NodeAccessorFn[scala.Double]) = js.native
  def nodeVal(`val`: java.lang.String): ForceGraphInstance with (scala.Double | java.lang.String | NodeAccessorFn[scala.Double]) = js.native
  def nodeVal(`val`: scala.Double): ForceGraphInstance with (scala.Double | java.lang.String | NodeAccessorFn[scala.Double]) = js.native
  def onEngineStop(callback: js.Function0[scala.Unit]): ForceGraphInstance = js.native
  def onEngineTick(callback: js.Function0[scala.Unit]): ForceGraphInstance = js.native
  def onLinkClick(callback: LinkEventCallback): ForceGraphInstance = js.native
  def onLinkHover(
    callback: js.Function2[
      /* link */ js.UndefOr[GraphLinkObject], 
      /* previousLink */ js.UndefOr[GraphLinkObject], 
      scala.Unit
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
      scala.Unit
    ]
  ): ForceGraphInstance = js.native
  def onNodeRightClick(callback: NodeEventCallback): ForceGraphInstance = js.native
  // Render control
  def pauseAnimation(): ForceGraphInstance = js.native
   // Alias for pauseAnimation()
  def resumeAnimation(): ForceGraphInstance = js.native
  def stopAnimation(): ForceGraphInstance = js.native
  def warmupTicks(): ForceGraphInstance with scala.Double = js.native
  def warmupTicks(ticks: scala.Double): ForceGraphInstance with scala.Double = js.native
  // Container layout
  def width(): ForceGraphInstance with scala.Double = js.native
  def width(width: scala.Double): ForceGraphInstance with scala.Double = js.native
  def zoom(): ForceGraphInstance with scala.Double = js.native
  def zoom(zoomLevel: scala.Double): ForceGraphInstance with scala.Double = js.native
  def zoom(zoomLevel: scala.Double, duration: scala.Double): ForceGraphInstance with scala.Double = js.native
}

