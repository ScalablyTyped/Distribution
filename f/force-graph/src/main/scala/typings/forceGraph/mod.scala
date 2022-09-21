package typings.forceGraph

import org.scalablytyped.runtime.StringDictionary
import typings.forceGraph.anon.K
import typings.forceGraph.anon.X
import typings.forceGraph.anon.Y
import typings.forceGraph.forceGraphStrings.center
import typings.forceGraph.forceGraphStrings.charge
import typings.forceGraph.forceGraphStrings.link
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("force-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ForceGraphInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ForceGraphInstance]
  
  type Accessor[In, Out] = Out | String | (js.Function1[/* obj */ In, Out])
  
  type CanvasCustomRenderFn[T] = js.Function3[
    /* obj */ T, 
    /* canvasContext */ CanvasRenderingContext2D, 
    /* globalScale */ Double, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forceGraph.forceGraphStrings.replace
    - typings.forceGraph.forceGraphStrings.before
    - typings.forceGraph.forceGraphStrings.after
  */
  trait CanvasCustomRenderMode extends StObject
  object CanvasCustomRenderMode {
    
    inline def after: typings.forceGraph.forceGraphStrings.after = "after".asInstanceOf[typings.forceGraph.forceGraphStrings.after]
    
    inline def before: typings.forceGraph.forceGraphStrings.before = "before".asInstanceOf[typings.forceGraph.forceGraphStrings.before]
    
    inline def replace: typings.forceGraph.forceGraphStrings.replace = "replace".asInstanceOf[typings.forceGraph.forceGraphStrings.replace]
  }
  
  type CanvasCustomRenderModeFn[T] = js.Function1[/* obj */ T, CanvasCustomRenderMode | Any]
  
  type CanvasPointerAreaPaintFn[T] = js.Function4[
    /* obj */ T, 
    /* paintColor */ String, 
    /* canvasContext */ CanvasRenderingContext2D, 
    /* globalScale */ Double, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.forceGraph.forceGraphStrings.td
    - typings.forceGraph.forceGraphStrings.bu
    - typings.forceGraph.forceGraphStrings.lr
    - typings.forceGraph.forceGraphStrings.rl
    - typings.forceGraph.forceGraphStrings.radialout
    - typings.forceGraph.forceGraphStrings.radialin
  */
  trait DagMode extends StObject
  object DagMode {
    
    inline def bu: typings.forceGraph.forceGraphStrings.bu = "bu".asInstanceOf[typings.forceGraph.forceGraphStrings.bu]
    
    inline def lr: typings.forceGraph.forceGraphStrings.lr = "lr".asInstanceOf[typings.forceGraph.forceGraphStrings.lr]
    
    inline def radialin: typings.forceGraph.forceGraphStrings.radialin = "radialin".asInstanceOf[typings.forceGraph.forceGraphStrings.radialin]
    
    inline def radialout: typings.forceGraph.forceGraphStrings.radialout = "radialout".asInstanceOf[typings.forceGraph.forceGraphStrings.radialout]
    
    inline def rl: typings.forceGraph.forceGraphStrings.rl = "rl".asInstanceOf[typings.forceGraph.forceGraphStrings.rl]
    
    inline def td: typings.forceGraph.forceGraphStrings.td = "td".asInstanceOf[typings.forceGraph.forceGraphStrings.td]
  }
  
  @js.native
  trait ForceFn
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def apply(alpha: Double): Unit = js.native
    
    var initialize: js.UndefOr[js.Function2[/* nodes */ js.Array[NodeObject], /* repeated */ Any, Unit]] = js.native
  }
  
  @js.native
  trait ForceGraphGenericInstance[ChainableInstance] extends StObject {
    
    def apply(element: HTMLElement): ChainableInstance = js.native
    
    def _destructor(): Unit = js.native
    
    def autoPauseRedraw(): ChainableInstance = js.native
    def autoPauseRedraw(enable: Boolean): ChainableInstance = js.native
    // Render control
    @JSName("autoPauseRedraw")
    def autoPauseRedraw_Boolean(): Boolean = js.native
    
    def backgroundColor(): ChainableInstance = js.native
    def backgroundColor(color: String): ChainableInstance = js.native
    @JSName("backgroundColor")
    def backgroundColor_String(): String = js.native
    
    def centerAt(): ChainableInstance = js.native
    def centerAt(x: Double): ChainableInstance = js.native
    def centerAt(x: Double, y: Double): ChainableInstance = js.native
    def centerAt(x: Double, y: Double, durationMs: Double): ChainableInstance = js.native
    def centerAt(x: Double, y: Unit, durationMs: Double): ChainableInstance = js.native
    def centerAt(x: Unit, y: Double): ChainableInstance = js.native
    def centerAt(x: Unit, y: Double, durationMs: Double): ChainableInstance = js.native
    def centerAt(x: Unit, y: Unit, durationMs: Double): ChainableInstance = js.native
    @JSName("centerAt")
    def centerAt_X(): X = js.native
    
    def cooldownTicks(): Double = js.native
    def cooldownTicks(ticks: Double): ChainableInstance = js.native
    
    def cooldownTime(): Double = js.native
    def cooldownTime(milliseconds: Double): ChainableInstance = js.native
    
    def d3AlphaDecay(): Double = js.native
    def d3AlphaDecay(alphaDecay: Double): ChainableInstance = js.native
    
    def d3AlphaMin(): Double = js.native
    def d3AlphaMin(alphaMin: Double): ChainableInstance = js.native
    
    def d3Force(forceName: link | charge | center): js.UndefOr[ForceFn] = js.native
    def d3Force(forceName: link | charge | center, forceFn: ForceFn): ChainableInstance = js.native
    def d3Force(forceName: String): js.UndefOr[ForceFn] = js.native
    def d3Force(forceName: String, forceFn: ForceFn): ChainableInstance = js.native
    
    def d3ReheatSimulation(): ChainableInstance = js.native
    
    def d3VelocityDecay(): Double = js.native
    def d3VelocityDecay(velocityDecay: Double): ChainableInstance = js.native
    
    def dagLevelDistance(): Double | Null = js.native
    def dagLevelDistance(distance: Double): ChainableInstance = js.native
    
    // Force engine (d3-force) configuration
    def dagMode(): DagMode = js.native
    def dagMode(mode: DagMode): ChainableInstance = js.native
    
    def dagNodeFilter(): js.Function1[/* node */ NodeObject, Boolean] = js.native
    def dagNodeFilter(filterFn: js.Function1[/* node */ NodeObject, Boolean]): ChainableInstance = js.native
    
    def emitParticle(link: LinkObject): ChainableInstance = js.native
    
    def enableNodeDrag(): Boolean = js.native
    def enableNodeDrag(enable: Boolean): ChainableInstance = js.native
    
    def enablePanInteraction(): Boolean = js.native
    def enablePanInteraction(enable: Boolean): ChainableInstance = js.native
    
    def enablePointerInteraction(): ChainableInstance = js.native
    def enablePointerInteraction(enable: Boolean): ChainableInstance = js.native
    @JSName("enablePointerInteraction")
    def enablePointerInteraction_Boolean(): Boolean = js.native
    
    def enableZoomInteraction(): Boolean = js.native
    def enableZoomInteraction(enable: Boolean): ChainableInstance = js.native
    
    // Utility
    def getGraphBbox(): Y = js.native
    def getGraphBbox(nodeFilter: js.Function1[/* node */ NodeObject, Boolean]): Y = js.native
    
    def graph2ScreenCoords(x: Double, y: Double): X = js.native
    
    // Data input
    def graphData(): GraphData = js.native
    def graphData(data: GraphData): ChainableInstance = js.native
    
    def height(): Double = js.native
    def height(height: Double): ChainableInstance = js.native
    
    def linkAutoColorBy(): LinkAccessor[String | Null] = js.native
    def linkAutoColorBy(colorByAccessor: LinkAccessor[String | Null]): ChainableInstance = js.native
    
    def linkCanvasObject(): CanvasCustomRenderFn[LinkObject] = js.native
    def linkCanvasObject(renderFn: CanvasCustomRenderFn[LinkObject]): ChainableInstance = js.native
    
    def linkCanvasObjectMode(): String | CanvasCustomRenderModeFn[LinkObject] = js.native
    def linkCanvasObjectMode(modeAccessor: String): ChainableInstance = js.native
    def linkCanvasObjectMode(modeAccessor: CanvasCustomRenderModeFn[LinkObject]): ChainableInstance = js.native
    
    def linkColor(): LinkAccessor[String] = js.native
    def linkColor(colorAccessor: LinkAccessor[String]): ChainableInstance = js.native
    
    def linkCurvature(): LinkAccessor[Double] = js.native
    def linkCurvature(curvatureAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkDirectionalArrowColor(): LinkAccessor[String] = js.native
    def linkDirectionalArrowColor(colorAccessor: LinkAccessor[String]): ChainableInstance = js.native
    
    def linkDirectionalArrowLength(): LinkAccessor[Double] = js.native
    def linkDirectionalArrowLength(lengthAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkDirectionalArrowRelPos(): LinkAccessor[Double] = js.native
    def linkDirectionalArrowRelPos(fractionAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkDirectionalParticleColor(): LinkAccessor[String] = js.native
    def linkDirectionalParticleColor(colorAccessor: LinkAccessor[String]): ChainableInstance = js.native
    
    def linkDirectionalParticleSpeed(): LinkAccessor[Double] = js.native
    def linkDirectionalParticleSpeed(relDistancePerFrameAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkDirectionalParticleWidth(): LinkAccessor[Double] = js.native
    def linkDirectionalParticleWidth(widthAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkDirectionalParticles(): LinkAccessor[Double] = js.native
    def linkDirectionalParticles(numParticlesAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def linkHoverPrecision(): Double = js.native
    def linkHoverPrecision(precision: Double): ChainableInstance = js.native
    
    // Link styling
    def linkLabel(): LinkAccessor[String] = js.native
    def linkLabel(labelAccessor: LinkAccessor[String]): ChainableInstance = js.native
    
    def linkLineDash(): LinkAccessor[js.Array[Double] | Null] = js.native
    def linkLineDash(linkLineDashAccessor: LinkAccessor[js.Array[Double] | Null]): ChainableInstance = js.native
    
    def linkPointerAreaPaint(): CanvasPointerAreaPaintFn[LinkObject] = js.native
    def linkPointerAreaPaint(renderFn: CanvasPointerAreaPaintFn[LinkObject]): ChainableInstance = js.native
    
    def linkSource(): String = js.native
    def linkSource(source: String): ChainableInstance = js.native
    
    def linkTarget(): String = js.native
    def linkTarget(target: String): ChainableInstance = js.native
    
    def linkVisibility(): LinkAccessor[Boolean] = js.native
    def linkVisibility(visibilityAccessor: LinkAccessor[Boolean]): ChainableInstance = js.native
    
    def linkWidth(): LinkAccessor[Double] = js.native
    def linkWidth(widthAccessor: LinkAccessor[Double]): ChainableInstance = js.native
    
    def maxZoom(): Double = js.native
    def maxZoom(scale: Double): ChainableInstance = js.native
    
    def minZoom(): Double = js.native
    def minZoom(scale: Double): ChainableInstance = js.native
    
    def nodeAutoColorBy(): NodeAccessor[String | Null] = js.native
    def nodeAutoColorBy(colorByAccessor: NodeAccessor[String | Null]): ChainableInstance = js.native
    
    def nodeCanvasObject(): CanvasCustomRenderFn[NodeObject] = js.native
    def nodeCanvasObject(renderFn: CanvasCustomRenderFn[NodeObject]): ChainableInstance = js.native
    
    def nodeCanvasObjectMode(): String | CanvasCustomRenderModeFn[NodeObject] = js.native
    def nodeCanvasObjectMode(modeAccessor: String): ChainableInstance = js.native
    def nodeCanvasObjectMode(modeAccessor: CanvasCustomRenderModeFn[NodeObject]): ChainableInstance = js.native
    
    def nodeColor(): NodeAccessor[String] = js.native
    def nodeColor(colorAccessor: NodeAccessor[String]): ChainableInstance = js.native
    
    def nodeId(): String = js.native
    def nodeId(id: String): ChainableInstance = js.native
    
    def nodeLabel(): NodeAccessor[String] = js.native
    def nodeLabel(labelAccessor: NodeAccessor[String]): ChainableInstance = js.native
    
    def nodePointerAreaPaint(): CanvasPointerAreaPaintFn[NodeObject] = js.native
    def nodePointerAreaPaint(renderFn: CanvasPointerAreaPaintFn[NodeObject]): ChainableInstance = js.native
    
    // Node styling
    def nodeRelSize(): Double = js.native
    def nodeRelSize(size: Double): ChainableInstance = js.native
    
    def nodeVal(): NodeAccessor[Double] = js.native
    def nodeVal(valAccessor: NodeAccessor[Double]): ChainableInstance = js.native
    
    def nodeVisibility(): NodeAccessor[Boolean] = js.native
    def nodeVisibility(visibilityAccessor: NodeAccessor[Boolean]): ChainableInstance = js.native
    
    def onBackgroundClick(callback: js.Function1[/* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    def onBackgroundRightClick(callback: js.Function1[/* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    def onDagError(): js.Function1[/* loopNodeIds */ js.Array[String | Double], Unit] = js.native
    def onDagError(errorHandleFn: js.Function1[/* loopNodeIds */ js.Array[String | Double], Unit]): ChainableInstance = js.native
    
    def onEngineStop(callback: js.Function0[Unit]): ChainableInstance = js.native
    
    def onEngineTick(callback: js.Function0[Unit]): ChainableInstance = js.native
    
    def onLinkClick(callback: js.Function2[/* link */ LinkObject, /* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    def onLinkHover(callback: js.Function2[/* link */ LinkObject | Null, /* previousLink */ LinkObject | Null, Unit]): ChainableInstance = js.native
    
    def onLinkRightClick(callback: js.Function2[/* link */ LinkObject, /* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    // Interaction
    def onNodeClick(callback: js.Function2[/* node */ NodeObject, /* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    def onNodeDrag(callback: js.Function2[/* node */ NodeObject, /* translate */ X, Unit]): ChainableInstance = js.native
    
    def onNodeDragEnd(callback: js.Function2[/* node */ NodeObject, /* translate */ X, Unit]): ChainableInstance = js.native
    
    def onNodeHover(callback: js.Function2[/* node */ NodeObject | Null, /* previousNode */ NodeObject | Null, Unit]): ChainableInstance = js.native
    
    def onNodeRightClick(callback: js.Function2[/* node */ NodeObject, /* event */ MouseEvent, Unit]): ChainableInstance = js.native
    
    def onRenderFramePost(
      callback: js.Function2[/* canvasContext */ CanvasRenderingContext2D, /* globalScale */ Double, Unit]
    ): ChainableInstance = js.native
    
    def onRenderFramePre(
      callback: js.Function2[/* canvasContext */ CanvasRenderingContext2D, /* globalScale */ Double, Unit]
    ): ChainableInstance = js.native
    
    def onZoom(callback: js.Function1[/* transform */ K, Unit]): ChainableInstance = js.native
    
    def onZoomEnd(callback: js.Function1[/* transform */ K, Unit]): ChainableInstance = js.native
    
    def pauseAnimation(): ChainableInstance = js.native
    
    def resetProps(): ChainableInstance = js.native
    
    def resumeAnimation(): ChainableInstance = js.native
    
    def screen2GraphCoords(x: Double, y: Double): X = js.native
    
    def warmupTicks(): Double = js.native
    def warmupTicks(ticks: Double): ChainableInstance = js.native
    
    // Container layout
    def width(): Double = js.native
    def width(width: Double): ChainableInstance = js.native
    
    def zoom(): Double = js.native
    def zoom(scale: Double): ChainableInstance = js.native
    def zoom(scale: Double, durationMs: Double): ChainableInstance = js.native
    
    def zoomToFit(): ChainableInstance = js.native
    def zoomToFit(durationMs: Double): ChainableInstance = js.native
    def zoomToFit(durationMs: Double, padding: Double): ChainableInstance = js.native
    def zoomToFit(durationMs: Double, padding: Double, nodeFilter: js.Function1[/* node */ NodeObject, Boolean]): ChainableInstance = js.native
    def zoomToFit(durationMs: Double, padding: Unit, nodeFilter: js.Function1[/* node */ NodeObject, Boolean]): ChainableInstance = js.native
    def zoomToFit(durationMs: Unit, padding: Double): ChainableInstance = js.native
    def zoomToFit(durationMs: Unit, padding: Double, nodeFilter: js.Function1[/* node */ NodeObject, Boolean]): ChainableInstance = js.native
    def zoomToFit(durationMs: Unit, padding: Unit, nodeFilter: js.Function1[/* node */ NodeObject, Boolean]): ChainableInstance = js.native
  }
  
  @js.native
  trait ForceGraphInstance
    extends StObject
       with ForceGraphGenericInstance[ForceGraphInstance]
  
  trait GraphData extends StObject {
    
    var links: js.Array[LinkObject]
    
    var nodes: js.Array[NodeObject]
  }
  object GraphData {
    
    inline def apply(links: js.Array[LinkObject], nodes: js.Array[NodeObject]): GraphData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphData]
    }
    
    extension [Self <: GraphData](x: Self) {
      
      inline def setLinks(value: js.Array[LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: LinkObject*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[NodeObject]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: NodeObject*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  type LinkAccessor[T] = Accessor[LinkObject, T]
  
  trait LinkObject extends StObject {
    
    var source: js.UndefOr[String | Double | NodeObject] = js.undefined
    
    var target: js.UndefOr[String | Double | NodeObject] = js.undefined
  }
  object LinkObject {
    
    inline def apply(): LinkObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkObject]
    }
    
    extension [Self <: LinkObject](x: Self) {
      
      inline def setSource(value: String | Double | NodeObject): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String | Double | NodeObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type NodeAccessor[T] = Accessor[NodeObject, T]
  
  trait NodeObject extends StObject {
    
    var fx: js.UndefOr[Double] = js.undefined
    
    var fy: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var vx: js.UndefOr[Double] = js.undefined
    
    var vy: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object NodeObject {
    
    inline def apply(): NodeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeObject]
    }
    
    extension [Self <: NodeObject](x: Self) {
      
      inline def setFx(value: Double): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setFy(value: Double): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setVx(value: Double): Self = StObject.set(x, "vx", value.asInstanceOf[js.Any])
      
      inline def setVxUndefined: Self = StObject.set(x, "vx", js.undefined)
      
      inline def setVy(value: Double): Self = StObject.set(x, "vy", value.asInstanceOf[js.Any])
      
      inline def setVyUndefined: Self = StObject.set(x, "vy", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
