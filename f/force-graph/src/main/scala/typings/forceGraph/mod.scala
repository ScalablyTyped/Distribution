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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @scala.inline
    def apply(): ForceGraphInstance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ForceGraphInstance]
    
    @JSImport("force-graph", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
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
      
      def backgroundColor(): ForceGraphInstance & String = js.native
      def backgroundColor(color: String): ForceGraphInstance & String = js.native
      
      def centerAt(): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: Double, milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Double, y: Unit, milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Unit, y: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Unit, y: Double, milliseconds: Double): ForceGraphInstancexnumber = js.native
      def centerAt(x: Unit, y: Unit, milliseconds: Double): ForceGraphInstancexnumber = js.native
      
      def cooldownTicks(): ForceGraphInstance & Double = js.native
      def cooldownTicks(ticks: Double): ForceGraphInstance & Double = js.native
      
      def cooldownTime(): ForceGraphInstance & Double = js.native
      def cooldownTime(milliseconds: Double): ForceGraphInstance & Double = js.native
      
      def d3AlphaDecay(): ForceGraphInstance & Double = js.native
      def d3AlphaDecay(decay: Double): ForceGraphInstance & Double = js.native
      
      def d3Force(force: String): ForceGraphInstance & ForceFn = js.native
      def d3Force(force: String, forceFn: ForceFn): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_center(force: center): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_center(force: center, forceFn: ForceFn): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_charge(force: charge): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_charge(force: charge, forceFn: ForceFn): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_link(force: link): ForceGraphInstance & ForceFn = js.native
      @JSName("d3Force")
      def d3Force_link(force: link, forceFn: ForceFn): ForceGraphInstance & ForceFn = js.native
      
      def d3ReheatSimulation(): ForceGraphInstance = js.native
      
      def d3VelocityDecay(): ForceGraphInstance & Double = js.native
      def d3VelocityDecay(decay: Double): ForceGraphInstance & Double = js.native
      
      def dagLevelDistance(): ForceGraphInstance & Double = js.native
      def dagLevelDistance(distance: Double): ForceGraphInstance & Double = js.native
      
      // Force engine configuration
      def dagMode(): ForceGraphInstance & DagMode = js.native
      def dagMode(mode: DagMode): ForceGraphInstance & DagMode = js.native
      
      def emitParticle(link: GraphLinkObject): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      
      def enableNodeDrag(): ForceGraphInstance & Boolean = js.native
      def enableNodeDrag(enable: Boolean): ForceGraphInstance & Boolean = js.native
      
      def enablePointerInteraction(): ForceGraphInstance & Boolean = js.native
      def enablePointerInteraction(enable: Boolean): ForceGraphInstance & Boolean = js.native
      
      def enableZoomPanInteraction(): ForceGraphInstance & Boolean = js.native
      def enableZoomPanInteraction(enable: Boolean): ForceGraphInstance & Boolean = js.native
      
      // Data input
      def graphData(): ForceGraphInstance & GraphData = js.native
      def graphData(data: GraphData): ForceGraphInstance & GraphData = js.native
      
      def height(): ForceGraphInstance & Double = js.native
      def height(height: Double): ForceGraphInstance & Double = js.native
      
      def linkAutoColorBy(): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkAutoColorBy(attribute: String): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkAutoColorBy(attribute: LinkAccessorFn[String]): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      
      def linkCanvasObject(): ForceGraphInstance & LinkCanvasCallbackFn = js.native
      def linkCanvasObject(callback: LinkCanvasCallbackFn): ForceGraphInstance & LinkCanvasCallbackFn = js.native
      
      def linkColor(): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkColor(color: String): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkColor(color: LinkAccessorFn[String]): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      
      def linkCurvature(): ForceGraphInstance = js.native
      def linkCurvature(curvature: String): ForceGraphInstance = js.native
      def linkCurvature(curvature: Double): ForceGraphInstance = js.native
      def linkCurvature(curvature: LinkAccessorFn[Double]): ForceGraphInstance = js.native
      
      def linkDirectionalArrowColor(): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkDirectionalArrowColor(color: String): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkDirectionalArrowColor(color: LinkAccessorFn[String]): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      
      def linkDirectionalArrowLength(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowLength(length: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowLength(length: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowLength(length: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def linkDirectionalArrowRelPos(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowRelPos(ratio: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowRelPos(ratio: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalArrowRelPos(ratio: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def linkDirectionalParticleColor(): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkDirectionalParticleColor(color: String): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      def linkDirectionalParticleColor(color: LinkAccessorFn[String]): ForceGraphInstance & (String | LinkAccessorFn[String]) = js.native
      
      def linkDirectionalParticleSpeed(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleSpeed(speed: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleSpeed(speed: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleSpeed(speed: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def linkDirectionalParticleWidth(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleWidth(width: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleWidth(width: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticleWidth(width: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def linkDirectionalParticles(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticles(particleCount: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticles(particleCount: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkDirectionalParticles(particleCount: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def linkHoverPrecision(): ForceGraphInstance & Double = js.native
      def linkHoverPrecision(precision: Double): ForceGraphInstance & Double = js.native
      
      // Link styling
      def linkLabel(): ForceGraphInstance & (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
      def linkLabel(label: String): ForceGraphInstance & (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
      def linkLabel(label: LinkAccessorFn[js.UndefOr[String]]): ForceGraphInstance & (String | LinkAccessorFn[js.UndefOr[String]]) = js.native
      
      def linkSource(): ForceGraphInstance & String = js.native
      def linkSource(source: String): ForceGraphInstance & String = js.native
      
      def linkTarget(): ForceGraphInstance & String = js.native
      def linkTarget(target: String): ForceGraphInstance & String = js.native
      
      def linkVisibility(): ForceGraphInstance & (Boolean | String | LinkAccessorFn[Boolean]) = js.native
      def linkVisibility(visible: String): ForceGraphInstance & (Boolean | String | LinkAccessorFn[Boolean]) = js.native
      def linkVisibility(visible: Boolean): ForceGraphInstance & (Boolean | String | LinkAccessorFn[Boolean]) = js.native
      def linkVisibility(visible: LinkAccessorFn[Boolean]): ForceGraphInstance & (Boolean | String | LinkAccessorFn[Boolean]) = js.native
      
      def linkWidth(): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkWidth(width: String): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkWidth(width: Double): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      def linkWidth(width: LinkAccessorFn[Double]): ForceGraphInstance & (Double | String | LinkAccessorFn[Double]) = js.native
      
      def nodeAutoColorBy(): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      def nodeAutoColorBy(attribute: String): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      def nodeAutoColorBy(attribute: NodeAccessorFn[String]): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      
      def nodeCanvasObject(): ForceGraphInstance & NodeCanvasCallbackFn = js.native
      def nodeCanvasObject(callback: NodeCanvasCallbackFn): ForceGraphInstance & NodeCanvasCallbackFn = js.native
      
      def nodeColor(): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      def nodeColor(color: String): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      def nodeColor(color: NodeAccessorFn[String]): ForceGraphInstance & (String | NodeAccessorFn[String]) = js.native
      
      def nodeId(): ForceGraphInstance & String = js.native
      def nodeId(id: String): ForceGraphInstance & String = js.native
      
      def nodeLabel(): ForceGraphInstance & (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
      def nodeLabel(label: String): ForceGraphInstance & (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
      def nodeLabel(label: NodeAccessorFn[js.UndefOr[String]]): ForceGraphInstance & (String | NodeAccessorFn[js.UndefOr[String]]) = js.native
      
      // Node styling
      def nodeRelSize(): ForceGraphInstance & Double = js.native
      def nodeRelSize(size: Double): ForceGraphInstance & Double = js.native
      
      def nodeVal(): ForceGraphInstance & (Double | String | NodeAccessorFn[Double]) = js.native
      def nodeVal(`val`: String): ForceGraphInstance & (Double | String | NodeAccessorFn[Double]) = js.native
      def nodeVal(`val`: Double): ForceGraphInstance & (Double | String | NodeAccessorFn[Double]) = js.native
      def nodeVal(`val`: NodeAccessorFn[Double]): ForceGraphInstance & (Double | String | NodeAccessorFn[Double]) = js.native
      
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
      
      def warmupTicks(): ForceGraphInstance & Double = js.native
      def warmupTicks(ticks: Double): ForceGraphInstance & Double = js.native
      
      // Container layout
      def width(): ForceGraphInstance & Double = js.native
      def width(width: Double): ForceGraphInstance & Double = js.native
      
      def zoom(): ForceGraphInstance & Double = js.native
      def zoom(zoomLevel: Double): ForceGraphInstance & Double = js.native
      def zoom(zoomLevel: Double, duration: Double): ForceGraphInstance & Double = js.native
      def zoom(zoomLevel: Unit, duration: Double): ForceGraphInstance & Double = js.native
    }
    
    /**
      * Interfaces
      */
    trait GraphData extends StObject {
      
      var links: js.Array[GraphLink]
      
      var nodes: js.Array[GraphNode]
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
    
    trait GraphEntity extends StObject {
      
      var id: String
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
    
    trait GraphLink
      extends StObject
         with GraphEntity {
      
      var source: String | GraphNode
      
      var target: String | GraphNode
      
      var `type`: String
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
    
    trait GraphLinkObject
      extends StObject
         with GraphLink {
      
      @JSName("source")
      var source_GraphLinkObject: GraphNode
      
      @JSName("target")
      var target_GraphLinkObject: GraphNode
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
    
    trait GraphNode
      extends StObject
         with GraphEntity {
      
      var name: js.UndefOr[String] = js.undefined
      
      var `val`: js.UndefOr[js.Any] = js.undefined
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
    
    trait GraphNodeObject
      extends StObject
         with GraphNode {
      
      var index: Double
      
      var x: Double
      
      var y: Double
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
