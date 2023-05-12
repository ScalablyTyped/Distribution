package typings.drawflow

import org.scalablytyped.runtime.StringDictionary
import typings.drawflow.anon.DictcustomModuleName
import typings.drawflow.drawflowStrings.`export`
import typings.drawflow.drawflowStrings.`import`
import typings.drawflow.drawflowStrings.addReroute
import typings.drawflow.drawflowStrings.click
import typings.drawflow.drawflowStrings.clickEnd
import typings.drawflow.drawflowStrings.connectionCancel
import typings.drawflow.drawflowStrings.connectionCreated
import typings.drawflow.drawflowStrings.connectionRemoved
import typings.drawflow.drawflowStrings.connectionSelected
import typings.drawflow.drawflowStrings.connectionStart
import typings.drawflow.drawflowStrings.connectionUnselected
import typings.drawflow.drawflowStrings.contextmenu
import typings.drawflow.drawflowStrings.keydown
import typings.drawflow.drawflowStrings.moduleChanged
import typings.drawflow.drawflowStrings.moduleCreated
import typings.drawflow.drawflowStrings.moduleRemoved
import typings.drawflow.drawflowStrings.mouseMove
import typings.drawflow.drawflowStrings.nodeCreated
import typings.drawflow.drawflowStrings.nodeMoved
import typings.drawflow.drawflowStrings.nodeRemoved
import typings.drawflow.drawflowStrings.nodeSelected
import typings.drawflow.drawflowStrings.nodeUnselected
import typings.drawflow.drawflowStrings.removeReroute
import typings.drawflow.drawflowStrings.translate
import typings.drawflow.drawflowStrings.zoom
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("drawflow", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Drawflow {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, render: js.Object) = this()
    def this(element: HTMLElement, render: js.Object, parent: js.Object) = this()
    def this(element: HTMLElement, render: Unit, parent: js.Object) = this()
  }
  
  trait ConnectionEvent extends StObject {
    
    /**
      * name of the input
      */
    var input_class: String
    
    /**
      * inputNodeId
      */
    var input_id: String
    
    /**
      * name of the output
      */
    var output_class: String
    
    /**
      * outputNodeId
      */
    var output_id: String
  }
  object ConnectionEvent {
    
    inline def apply(input_class: String, input_id: String, output_class: String, output_id: String): ConnectionEvent = {
      val __obj = js.Dynamic.literal(input_class = input_class.asInstanceOf[js.Any], input_id = input_id.asInstanceOf[js.Any], output_class = output_class.asInstanceOf[js.Any], output_id = output_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionEvent] (val x: Self) extends AnyVal {
      
      inline def setInput_class(value: String): Self = StObject.set(x, "input_class", value.asInstanceOf[js.Any])
      
      inline def setInput_id(value: String): Self = StObject.set(x, "input_id", value.asInstanceOf[js.Any])
      
      inline def setOutput_class(value: String): Self = StObject.set(x, "output_class", value.asInstanceOf[js.Any])
      
      inline def setOutput_id(value: String): Self = StObject.set(x, "output_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionStartEvent extends StObject {
    
    /**
      * name of the output
      */
    var output_class: String
    
    /**
      * outputNodeId
      */
    var output_id: String
  }
  object ConnectionStartEvent {
    
    inline def apply(output_class: String, output_id: String): ConnectionStartEvent = {
      val __obj = js.Dynamic.literal(output_class = output_class.asInstanceOf[js.Any], output_id = output_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStartEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionStartEvent] (val x: Self) extends AnyVal {
      
      inline def setOutput_class(value: String): Self = StObject.set(x, "output_class", value.asInstanceOf[js.Any])
      
      inline def setOutput_id(value: String): Self = StObject.set(x, "output_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.drawflow.drawflowStrings.edit
    - typings.drawflow.drawflowStrings.fixed
    - typings.drawflow.drawflowStrings.view
  */
  trait DrawFlowEditorMode extends StObject
  object DrawFlowEditorMode {
    
    inline def edit: typings.drawflow.drawflowStrings.edit = "edit".asInstanceOf[typings.drawflow.drawflowStrings.edit]
    
    inline def fixed: typings.drawflow.drawflowStrings.fixed = "fixed".asInstanceOf[typings.drawflow.drawflowStrings.fixed]
    
    inline def view: typings.drawflow.drawflowStrings.view = "view".asInstanceOf[typings.drawflow.drawflowStrings.view]
  }
  
  @js.native
  trait Drawflow extends StObject {
    
    /**
      * Add connection. Ex: 15,16,'output_1','input_1'
      * @param outputNodeId
      * @param inputNodeId
      * @param outputName
      * @param inputName
      */
    def addConnection(outputNodeId: String, inputNodeId: String, outputName: String, inputName: String): Unit = js.native
    def addConnection(outputNodeId: String, inputNodeId: Double, outputName: String, inputName: String): Unit = js.native
    def addConnection(outputNodeId: Double, inputNodeId: String, outputName: String, inputName: String): Unit = js.native
    def addConnection(outputNodeId: Double, inputNodeId: Double, outputName: String, inputName: String): Unit = js.native
    
    def addModule(moduleName: String): Unit = js.native
    
    def addNode(
      name: String,
      inputs: Double,
      outputs: Double,
      posx: Double,
      posy: Double,
      className: String,
      data: Any,
      html: String,
      typenode: String
    ): Double = js.native
    /**
      *
      * @param name Name of module
      * @param inputs Number of inputs
      * @param outputs Number of outputs
      * @param posx Position on start node left
      * @param posy Position on start node top
      * @param className Added classname to de node
      * @param data Data passed to node
      * @param html HTML drawn on node or name of register node.
      * @param typenode Default false, true for Object HTML, vue for vue
      */
    def addNode(
      name: String,
      inputs: Double,
      outputs: Double,
      posx: Double,
      posy: Double,
      className: String,
      data: Any,
      html: String,
      typenode: Boolean
    ): Double = js.native
    
    /**
      * Add input to node. Ex id: 5
      * @param id
      */
    def addNodeInput(id: String): Unit = js.native
    def addNodeInput(id: Double): Unit = js.native
    
    /**
      * Add output to node. Ex id: 5
      * @param id
      */
    def addNodeOutput(id: String): Unit = js.native
    def addNodeOutput(id: Double): Unit = js.native
    
    /**
      * Canvas origin x coordinate
      */
    var canvas_x: Double = js.native
    
    /**
      * Canvas origin x coordinate
      */
    var canvas_y: Double = js.native
    
    def changeModule(moduleName: String): Unit = js.native
    
    /**
      * Clear all data of all modules and modules remove.
      */
    def clear(): Unit = js.native
    
    /**
      * Clear data of module selected
      */
    def clearModuleSelected(): Unit = js.native
    
    /**
      * Curvature
      * @default 0.5
      */
    var curvature: Double = js.native
    
    /**
      * Drag nodes on click inputs
      * @default true
      */
    var draggable_inputs: Boolean = js.native
    
    /**
      * Graph data object
      */
    var drawflow: DrawflowExport = js.native
    
    /**
      * edit or fixed mode
      * @default edit
      */
    var editor_mode: DrawFlowEditorMode = js.native
    
    def `export`(): DrawflowExport = js.native
    
    /**
      * Force the first input to drop the connection on top of the node
      * @default false
      */
    var force_first_input: Boolean = js.native
    
    /**
      * Get name of module where is the id. Ex id: 5
      * @param id
      */
    def getModuleFromNodeId(id: String): String = js.native
    def getModuleFromNodeId(id: Double): String = js.native
    
    /**
      * Get Info of node. Ex: id: 5
      * @param id
      */
    def getNodeFromId(id: String): DrawflowNode = js.native
    def getNodeFromId(id: Double): DrawflowNode = js.native
    
    /**
      *  Return Array of nodes id. Ex: name: telegram
      *  @param name
      */
    def getNodesFromName(name: String): js.Array[Double] = js.native
    
    def getUuid(): String = js.native
    
    def `import`(data: Any): Unit = js.native
    
    /**
      * Width of line
      * @default 5
      */
    var line_path: Double = js.native
    
    def load(): Any = js.native
    
    /**
      *
      * @param eventName
      * @param callback (event: id of Node output)
      */
    @JSName("on")
    def on_addReroute(eventName: addReroute, callback: js.Function1[/* event */ Double, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: mouse event)
      */
    @JSName("on")
    def on_click(eventName: click, callback: js.Function1[/* event */ MouseEvent, Unit]): Unit = js.native
    /**
      * Once the click changes have been made
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_clickEnd(eventName: clickEnd, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    /**
      * Called when the connection creation was canceled
      * @param eventName
      * @param callback (event: true)
      */
    @JSName("on")
    def on_connectionCancel(eventName: connectionCancel, callback: js.Function1[/* event */ Boolean, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id's of nodes and output/input selected)
      */
    @JSName("on")
    def on_connectionCreated(eventName: connectionCreated, callback: js.Function1[/* event */ ConnectionEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id's of nodes and output/input selected)
      */
    @JSName("on")
    def on_connectionRemoved(eventName: connectionRemoved, callback: js.Function1[/* event */ ConnectionEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id's of nodes and output/input selected)
      */
    @JSName("on")
    def on_connectionSelected(eventName: connectionSelected, callback: js.Function1[/* event */ ConnectionEvent, Unit]): Unit = js.native
    /**
      * Called when starting to create a connection
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_connectionStart(eventName: connectionStart, callback: js.Function1[/* event */ ConnectionStartEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: true)
      */
    @JSName("on")
    def on_connectionUnselected(eventName: connectionUnselected, callback: js.Function1[/* event */ Boolean, Unit]): Unit = js.native
    /**
      * Click second button mouse event
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_contextmenu(eventName: contextmenu, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    /**
      * Data export
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_export(eventName: `export`, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    /**
      * Finish import
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_import(eventName: `import`, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: keyboard event)
      */
    @JSName("on")
    def on_keydown(eventName: keydown, callback: js.Function1[/* event */ KeyboardEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: name of Module)
      */
    @JSName("on")
    def on_moduleChanged(eventName: moduleChanged, callback: js.Function1[/* event */ String, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: name of Module)
      */
    @JSName("on")
    def on_moduleCreated(eventName: moduleCreated, callback: js.Function1[/* event */ String, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: name of Module)
      */
    @JSName("on")
    def on_moduleRemoved(eventName: moduleRemoved, callback: js.Function1[/* event */ String, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: position)
      */
    @JSName("on")
    def on_mouseMove(eventName: mouseMove, callback: js.Function1[/* event */ MousePositionEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id of Node)
      */
    /* tslint:disable:unified-signatures */
    @JSName("on")
    def on_nodeCreated(eventName: nodeCreated, callback: js.Function1[/* event */ Double, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback
      */
    @JSName("on")
    def on_nodeMoved(eventName: nodeMoved, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id of Node)
      */
    @JSName("on")
    def on_nodeRemoved(eventName: nodeRemoved, callback: js.Function1[/* event */ Double, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id of Node)
      */
    @JSName("on")
    def on_nodeSelected(eventName: nodeSelected, callback: js.Function1[/* event */ Double, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: true)
      */
    @JSName("on")
    def on_nodeUnselected(eventName: nodeUnselected, callback: js.Function1[/* event */ Boolean, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: id of Node output)
      */
    @JSName("on")
    def on_removeReroute(eventName: removeReroute, callback: js.Function1[/* event */ Double, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: position)
      */
    @JSName("on")
    def on_translate(eventName: translate, callback: js.Function1[/* event */ MousePositionEvent, Unit]): Unit = js.native
    /**
      *
      * @param eventName
      * @param callback (event: Level of zoom)
      */
    @JSName("on")
    def on_zoom(eventName: zoom, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    /**
      * The drawflow "canvas" element
      */
    var precanvas: HTMLElement = js.native
    
    /**
      *
      * @param name Name of module registered.
      * @param component HTML to drawn or vue component.
      * @param props Only for vue. Props of component. Not Required
      * @param options Only for vue. Options of component. Not Required
      */
    def registerNode(name: String, component: Any, props: Any, options: Any): Unit = js.native
    
    /**
      * Remove node connections. Ex id: node-x
      * @param id
      */
    def removeConnectionNodeId(id: String): Unit = js.native
    def removeConnectionNodeId(id: Double): Unit = js.native
    
    def removeModule(moduleName: String): Unit = js.native
    
    /**
      * Remove node. Ex id: node-x
      * @param id
      */
    def removeNodeId(id: String): Unit = js.native
    def removeNodeId(id: Double): Unit = js.native
    
    /**
      * Remove input to node. Ex id: 5, input_2
      * @param id
      * @param input_class
      */
    def removeNodeInput(id: String, input_class: String): Unit = js.native
    def removeNodeInput(id: Double, input_class: String): Unit = js.native
    
    /**
      * Remove output to node. Ex id: 5, output_2
      * @param id
      * @param output_class
      */
    def removeNodeOutput(id: String, output_class: String): Unit = js.native
    def removeNodeOutput(id: Double, output_class: String): Unit = js.native
    
    /**
      * Remove connection. Ex: 15,16,'output_1','input_1'
      * @param id_output
      * @param id_input
      * @param output_class
      * @param input_class
      */
    def removeSingleConnection(id_output: String, id_input: String, output_class: String, input_class: String): Unit = js.native
    def removeSingleConnection(id_output: String, id_input: Double, output_class: String, input_class: String): Unit = js.native
    def removeSingleConnection(id_output: Double, id_input: String, output_class: String, input_class: String): Unit = js.native
    def removeSingleConnection(id_output: Double, id_input: Double, output_class: String, input_class: String): Unit = js.native
    
    /**
      * Active reroute
      * @default false
      */
    var reroute: Boolean = js.native
    
    /**
      * Curvature reroute
      * @default 0.5
      */
    var reroute_curvature: Double = js.native
    
    /**
      * Curvature reroute first point and last point
      * @default 0.5
      */
    var reroute_curvature_start_end: Double = js.native
    
    /**
      * Fix adding points
      * @default false
      */
    var reroute_fix_curvature: Boolean = js.native
    
    /**
      * Width of reroute
      * @default 6
      */
    var reroute_width: Double = js.native
    
    def start(): Unit = js.native
    
    /**
      * Update connections position from Node Ex id: node-x
      * @param id
      */
    def updateConnectionNodes(id: String): Unit = js.native
    def updateConnectionNodes(id: Double): Unit = js.native
    
    /**
      * Update data element. Ex: 5, { name: 'Drawflow' }
      * @param id
      * @param data
      */
    def updateNodeDataFromId(id: String, data: Any): Unit = js.native
    def updateNodeDataFromId(id: Double, data: Any): Unit = js.native
    
    /**
      * Nodes should use uuid instead of id
      * @default false
      */
    var useuuid: Boolean = js.native
    
    /**
      * Default zoom
      * @default 1
      */
    var zoom: Double = js.native
    
    /**
      *  Increment zoom +0.1
      */
    def zoom_in(): Unit = js.native
    
    /**
      * Default zoom last value
      * @default 1
      */
    var zoom_last_value: Double = js.native
    
    /**
      * Default zoom max
      * @default 1.6
      */
    var zoom_max: Double = js.native
    
    /**
      * Default zoom min
      * @default 0.5
      */
    var zoom_min: Double = js.native
    
    /**
      *  Decrement zoom -0.1
      */
    def zoom_out(): Unit = js.native
    
    /**
      * Redraws according to new zoom
      */
    def zoom_refresh(): Unit = js.native
    
    /**
      *  Restores zoom to 1
      */
    def zoom_reset(): Unit = js.native
    
    /**
      * Default zoom value update
      * @default 0.1
      */
    var zoom_value: Double = js.native
  }
  
  trait DrawflowConnection extends StObject {
    
    var connections: js.Array[DrawflowConnectionDetail]
  }
  object DrawflowConnection {
    
    inline def apply(connections: js.Array[DrawflowConnectionDetail]): DrawflowConnection = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawflowConnection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawflowConnection] (val x: Self) extends AnyVal {
      
      inline def setConnections(value: js.Array[DrawflowConnectionDetail]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsVarargs(value: DrawflowConnectionDetail*): Self = StObject.set(x, "connections", js.Array(value*))
    }
  }
  
  trait DrawflowConnectionDetail extends StObject {
    
    var input: String
    
    var node: String
  }
  object DrawflowConnectionDetail {
    
    inline def apply(input: String, node: String): DrawflowConnectionDetail = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawflowConnectionDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawflowConnectionDetail] (val x: Self) extends AnyVal {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setNode(value: String): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawflowExport extends StObject {
    
    var drawflow: DictcustomModuleName
  }
  object DrawflowExport {
    
    inline def apply(drawflow: DictcustomModuleName): DrawflowExport = {
      val __obj = js.Dynamic.literal(drawflow = drawflow.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawflowExport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawflowExport] (val x: Self) extends AnyVal {
      
      inline def setDrawflow(value: DictcustomModuleName): Self = StObject.set(x, "drawflow", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawflowModuleData extends StObject {
    
    var data: StringDictionary[DrawflowNode]
  }
  object DrawflowModuleData {
    
    inline def apply(data: StringDictionary[DrawflowNode]): DrawflowModuleData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawflowModuleData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawflowModuleData] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[DrawflowNode]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawflowNode extends StObject {
    
    var `class`: String
    
    var data: Any
    
    var html: String
    
    var id: Double
    
    var inputs: Record[String, DrawflowConnection]
    
    var name: String
    
    var outputs: Record[String, DrawflowConnection]
    
    var pos_x: Double
    
    var pos_y: Double
    
    var typenode: Boolean
  }
  object DrawflowNode {
    
    inline def apply(
      `class`: String,
      data: Any,
      html: String,
      id: Double,
      inputs: Record[String, DrawflowConnection],
      name: String,
      outputs: Record[String, DrawflowConnection],
      pos_x: Double,
      pos_y: Double,
      typenode: Boolean
    ): DrawflowNode = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], pos_x = pos_x.asInstanceOf[js.Any], pos_y = pos_y.asInstanceOf[js.Any], typenode = typenode.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawflowNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawflowNode] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: Record[String, DrawflowConnection]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOutputs(value: Record[String, DrawflowConnection]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setPos_x(value: Double): Self = StObject.set(x, "pos_x", value.asInstanceOf[js.Any])
      
      inline def setPos_y(value: Double): Self = StObject.set(x, "pos_y", value.asInstanceOf[js.Any])
      
      inline def setTypenode(value: Boolean): Self = StObject.set(x, "typenode", value.asInstanceOf[js.Any])
    }
  }
  
  trait MousePositionEvent extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object MousePositionEvent {
    
    inline def apply(x: Double, y: Double): MousePositionEvent = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MousePositionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MousePositionEvent] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
