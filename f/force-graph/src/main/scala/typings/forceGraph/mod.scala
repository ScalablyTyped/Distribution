package typings.forceGraph

import typings.forceGraph.anon.ForceGraphInstancexnumber
import typings.forceGraph.anon.X
import typings.forceGraph.forceGraphStrings.center
import typings.forceGraph.forceGraphStrings.charge
import typings.forceGraph.forceGraphStrings.link
import typings.forceGraph.mod.ForceGraph.ForceGraphInstance
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("force-graph", JSImport.Default)
    @js.native
    def apply(): ForceGraphInstance = js.native
  }
  
  object ForceGraph {
    
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
      
      @scala.inline
      def bu: typings.forceGraph.forceGraphStrings.bu = "bu".asInstanceOf[typings.forceGraph.forceGraphStrings.bu]
      
      @scala.inline
      def lr: typings.forceGraph.forceGraphStrings.lr = "lr".asInstanceOf[typings.forceGraph.forceGraphStrings.lr]
      
      @scala.inline
      def radialin: typings.forceGraph.forceGraphStrings.radialin = "radialin".asInstanceOf[typings.forceGraph.forceGraphStrings.radialin]
      
      @scala.inline
      def radialout: typings.forceGraph.forceGraphStrings.radialout = "radialout".asInstanceOf[typings.forceGraph.forceGraphStrings.radialout]
      
      @scala.inline
      def rl: typings.forceGraph.forceGraphStrings.rl = "rl".asInstanceOf[typings.forceGraph.forceGraphStrings.rl]
      
      @scala.inline
      def td: typings.forceGraph.forceGraphStrings.td = "td".asInstanceOf[typings.forceGraph.forceGraphStrings.td]
    }
    
    type ForceFn = js.Function1[/* node */ X, Double]
    
    /**
      * Represents ForceGraph runtime object
      * @example:
      *  // Create an empty ForceGraph instance on an existing DOM element
      *  let forceGraph = ForceGraph();
      *  forceGraph(myHtmlElement);
      *  forceGraph.graphData([]);
      *
      *  // Destroy the ForceGraph instance
      *  forceGraph._destructor();
      */
    @js.native
    trait ForceGraphInstance extends StObject {
      
      // Init / de-init
      def apply(element: HTMLElement): ForceGraphInstance = js.native
      
      def _destructor(): Unit = js.native
      
      def backgroundColor(): ForceGraphInstance with String = js.native
      def backgroundColor(color: String): ForceGraphInstance with String = js.native
      
      def centerAt(): ForceGraphInstancexnumber = js.native
      def centerAt(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: js.UndefOr[scala.Nothing], y: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: js.UndefOr[scala.Nothing], y: Double, milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: js.UndefOr[scala.Nothing], milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: Double, milliseconds: Double): ForceGraphInstancexnumber = js.native
      
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
      
      def zoom(): ForceGraphInstance with Double = js.native
      def zoom(zoomLevel: js.UndefOr[scala.Nothing], duration: Double): ForceGraphInstance with Double = js.native
      def zoom(zoomLevel: Double): ForceGraphInstance with Double = js.native
      def zoom(zoomLevel: Double, duration: Double): ForceGraphInstance with Double = js.native
    }
    
    /**
      * Interfaces
      */
    @js.native
    trait GraphData extends StObject {
      
      var links: js.Array[GraphLink] = js.native
      
      var nodes: js.Array[GraphNode] = js.native
    }
    object GraphData {
      
      @scala.inline
      def apply(links: js.Array[GraphLink], nodes: js.Array[GraphNode]): GraphData = {
        val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphData]
      }
      
      @scala.inline
      implicit class GraphDataMutableBuilder[Self <: GraphData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLinks(value: js.Array[GraphLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinksVarargs(value: GraphLink*): Self = StObject.set(x, "links", js.Array(value :_*))
        
        @scala.inline
        def setNodes(value: js.Array[GraphNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNodesVarargs(value: GraphNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      }
    }
    
    @js.native
    trait GraphEntity extends StObject {
      
      var id: String = js.native
    }
    object GraphEntity {
      
      @scala.inline
      def apply(id: String): GraphEntity = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphEntity]
      }
      
      @scala.inline
      implicit class GraphEntityMutableBuilder[Self <: GraphEntity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait GraphLink extends GraphEntity {
      
      var source: String | GraphNode = js.native
      
      var target: String | GraphNode = js.native
      
      var `type`: String = js.native
    }
    object GraphLink {
      
      @scala.inline
      def apply(id: String, source: String | GraphNode, target: String | GraphNode, `type`: String): GraphLink = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphLink]
      }
      
      @scala.inline
      implicit class GraphLinkMutableBuilder[Self <: GraphLink] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSource(value: String | GraphNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: String | GraphNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait GraphLinkObject extends GraphLink {
      
      @JSName("source")
      var source_GraphLinkObject: GraphNode = js.native
      
      @JSName("target")
      var target_GraphLinkObject: GraphNode = js.native
    }
    object GraphLinkObject {
      
      @scala.inline
      def apply(id: String, source: GraphNode, target: GraphNode, `type`: String): GraphLinkObject = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphLinkObject]
      }
      
      @scala.inline
      implicit class GraphLinkObjectMutableBuilder[Self <: GraphLinkObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSource(value: GraphNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTarget(value: GraphNode): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait GraphNode extends GraphEntity {
      
      var name: js.UndefOr[String] = js.native
      
      var `val`: js.UndefOr[js.Any] = js.native
    }
    object GraphNode {
      
      @scala.inline
      def apply(id: String): GraphNode = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphNode]
      }
      
      @scala.inline
      implicit class GraphNodeMutableBuilder[Self <: GraphNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValUndefined: Self = StObject.set(x, "val", js.undefined)
      }
    }
    
    @js.native
    trait GraphNodeObject extends GraphNode {
      
      var index: Double = js.native
      
      var x: Double = js.native
      
      var y: Double = js.native
    }
    object GraphNodeObject {
      
      @scala.inline
      def apply(id: String, index: Double, x: Double, y: Double): GraphNodeObject = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[GraphNodeObject]
      }
      
      @scala.inline
      implicit class GraphNodeObjectMutableBuilder[Self <: GraphNodeObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
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
}
