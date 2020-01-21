package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.JQuery
import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import typings.ejWebAll.ej.datavisualization.Diagram.ExportImageSettings
import typings.ejWebAll.ej.datavisualization.Diagram.FitMode
import typings.ejWebAll.ej.datavisualization.Diagram.Options
import typings.ejWebAll.ej.datavisualization.Diagram.PrintImageSettings
import typings.ejWebAll.ej.datavisualization.Diagram.PrintSettings
import typings.ejWebAll.ej.datavisualization.Diagram.Region
import typings.ejWebAll.ej.datavisualization.Diagram.Zoom
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.datavisualization.Diagram")
@js.native
class Diagram_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: Model) = this()
  def this(element: Element, options: Model) = this()
  var defaults: Model = js.native
  @JSName("model")
  var model_Diagram_ : Model = js.native
  /** Add nodes and connectors to diagram at runtime
    * @param {any} a JSON to define a node/connector or an array of nodes and connector
    * @returns {boolean}
    */
  def add(node: js.Any): Boolean = js.native
  /** Add a label to a node at runtime
    * @param {string} name of the node to which label will be added
    * @param {any} JSON for the new label to be added
    * @returns {void}
    */
  def addLabel(nodeName: String, newLabel: js.Any): Unit = js.native
  /** Add dynamic Lanes to swimlane at runtime
    * @param {any} JSON for the new lane to be added
    * @param {number} Index value to add the lane in swimlane
    * @returns {void}
    */
  def addLane(lane: js.Any, index: Double): Unit = js.native
  /** Add a collection of layers can be added to the existing diagram layer at runtime.
    * @param {any[]} a collection of layers to be added to the existing diagram layers.
    * @returns {void}
    */
  def addLayers(layers: js.Array[_]): Unit = js.native
  /** Add a collection of diagram elements can be added to the specific diagram layer.
    * @param {string} specifies the name of the layer to the nodes will be added.
    * @param {any[]} collection of diagram elements to be added to the specific layer.
    * @returns {void}
    */
  def addNodeToLayer(layerName: String, nodes: js.Array[_]): Unit = js.native
  /** Add a phase to a swimlane at runtime
    * @param {string} name of the swimlane to which the phase will be added
    * @param {any} JSON object to define the phase to be added
    * @returns {void}
    */
  def addPhase(name: String, options: js.Any): Unit = js.native
  /** Add a collection of ports to the node specified by name
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of ports to be added to the specified node
    * @returns {void}
    */
  def addPorts(name: String, ports: js.Array[_]): Unit = js.native
  /** Add the specified node to selection list
    * @param {any} the node to be selected
    * @param {boolean} to define whether to clear the existing selection or not
    * @returns {void}
    */
  def addSelection(node: js.Any): Unit = js.native
  def addSelection(node: js.Any, clearSelection: Boolean): Unit = js.native
  /** Align the selected objects based on the reference object and direction
    * @param {string} to specify the direction towards which the selected objects are to be aligned("left","right",top","bottom")
    * @returns {void}
    */
  def align(direction: String): Unit = js.native
  /** Bring the specified portion of the diagram content to the diagram viewport
    * @param {any} the rectangular region that is to be brought into diagram viewport
    * @returns {void}
    */
  def bringIntoView(rect: js.Any): Unit = js.native
  /** Bring the specified portion of the diagram content to the center of the diagram viewport
    * @param {any} the rectangular region that is to be brought to the center of diagram viewport
    * @returns {void}
    */
  def bringToCenter(rect: js.Any): Unit = js.native
  /** Visually move the selected object over all other intersected objects
    * @returns {void}
    */
  def bringToFront(): Unit = js.native
  /** Remove all the elements from diagram
    * @returns {void}
    */
  def clear(): Unit = js.native
  /** Clears the actions which is recorded to perform undo/redo operation in the diagram.
    * @returns {void}
    */
  def clearHistory(): Unit = js.native
  /** Remove the current selection in diagram
    * @returns {void}
    */
  def clearSelection(): Unit = js.native
  /** Copy the selected object to internal clipboard and get the copied object
    * @returns {any}
    */
  def copy(): js.Any = js.native
  /** Cut the selected object from diagram to diagram internal clipboard
    * @returns {void}
    */
  def cut(): Unit = js.native
  /** Export the diagram as downloadable files or as data
    * @param {Diagram.Options} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def exportDiagram(): String = js.native
  def exportDiagram(options: Options): String = js.native
  /** The exportImage method is used to export the image passed through argument with different image format and exporting options as like exportDiagram method.
    * @param {string} pass the base64String image to be exported.
    * @param {Diagram.ExportImageSettings} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def exportImage(image: String): String = js.native
  def exportImage(image: String, exportImageSettings: ExportImageSettings): String = js.native
  /** Read a node/connector object by its name
    * @param {string} name of the node/connector that is to be identified
    * @returns {any}
    */
  def findNode(name: String): js.Any = js.native
  /** Fit the diagram content into diagram viewport
    * @param {ej.datavisualization.Diagram.FitMode} to set the mode of fit to command.
    * @param {ej.datavisualization.Diagram.Region} to set whether the region to be fit will be based on diagram elements or page settings.
    * @param {any} to set the required margin
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  def fitToPage(mode: FitMode): Unit = js.native
  def fitToPage(mode: FitMode, region: Region): Unit = js.native
  def fitToPage(mode: FitMode, region: Region, margin: js.Any): Unit = js.native
  /** Get the bounds of the diagram.
    * @returns {void}
    */
  def getDiagramBounds(): Unit = js.native
  /** Get the diagram DOM element as a string along with dependent stylesheets.
    * @param {any[]} If its specified, will get the diagram DOM element along with specified stylesheet references. Please note that you have to define absolute path for local CSS file.
    * If not specified, will get the diagram content along with all stylesheets loaded in the document.
    * @returns {void}
    */
  def getDiagramContent(): Unit = js.native
  def getDiagramContent(styleSheets: js.Array[_]): Unit = js.native
  /** Group the selected nodes and connectors
    * @returns {void}
    */
  def group(): Unit = js.native
  /** Insert a label into a node's label collection at runtime
    * @param {string} name of the node to which the label has to be inserted
    * @param {any} JSON to define the new label
    * @param {number} index to insert the label into the node
    * @returns {void}
    */
  def insertLabel(name: String, label: js.Any): Unit = js.native
  def insertLabel(name: String, label: js.Any, index: Double): Unit = js.native
  /** Refresh the diagram with the specified layout
    * @returns {void}
    */
  def layout(): Unit = js.native
  /** Load the diagram
    * @param {any} JSON data to load the diagram
    * @returns {void}
    */
  def load(data: js.Any): Unit = js.native
  /** Visually move the selected object over its closest intersected object
    * @returns {void}
    */
  def moveForward(): Unit = js.native
  /** Move the selected objects by either one pixel or by the pixels specified through argument
    * @param {string} specifies the direction to move the selected objects ("left","right",top","bottom")
    * @param {number} specifies the number of pixels by which the selected objects have to be moved
    * @returns {void}
    */
  def nudge(direction: String): Unit = js.native
  def nudge(direction: String, delta: Double): Unit = js.native
  /** Paste the selected object from internal clipboard to diagram
    * @param {any} object to be added to diagram
    * @param {boolean} to define whether the specified object is to be renamed or not
    * @returns {void}
    */
  def paste(): Unit = js.native
  def paste(`object`: js.Any): Unit = js.native
  def paste(`object`: js.Any, rename: Boolean): Unit = js.native
  /** Print the diagram as image
    * @param {Diagram.PrintSettings} options to print the desired region of diagram and print the diagram in multiple pages.
    * @returns {void}
    */
  def print(): Unit = js.native
  def print(printSettings: PrintSettings): Unit = js.native
  /** The printImage method is used to print the image passed through argument with desired region and multiple pages as like print method.
    * @param {string} pass the base64String image to be printed.
    * @param {Diagram.PrintImageSettings} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def printImage(image: String): String = js.native
  def printImage(image: String, printImageSettings: PrintImageSettings): String = js.native
  /** Restore the last action that was reverted
    * @returns {void}
    */
  def redo(): Unit = js.native
  /** Refresh the diagram at runtime
    * @returns {void}
    */
  def refresh(): Unit = js.native
  /** Remove either the given node/connector or the selected element from diagram
    * @param {any} the node/connector to be removed from diagram
    * @returns {void}
    */
  def remove(): Unit = js.native
  def remove(node: js.Any): Unit = js.native
  /** Add a collection of ports to the node specified by name
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of labels to be deleted from the specified node
    * @returns {void}
    */
  def removeLabels(name: String, labels: js.Array[_]): Unit = js.native
  /** Remove the collection of layers from the diagram layers.
    * @param {any[]} collection of layers to be removed from diagram layer.
    * @returns {void}
    */
  def removeLayers(layers: js.Array[_]): Unit = js.native
  /** Remove the collection of nodes from the specific layer.
    * @param {string} Specifies the layer name to the node will be removed.
    * @param {any[]} collection of diagram elements name to be removed from specific layer.
    * @returns {void}
    */
  def removeNodeToLayer(layerName: String, nodes: js.Array[_]): Unit = js.native
  /** Remove the collection of ports from the specified node.
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of ports to be deleted from the specified node
    * @returns {void}
    */
  def removePorts(name: String, ports: js.Array[_]): Unit = js.native
  /** Remove a particular object from selection list
    * @param {any} the node/connector to be removed from selection list
    * @returns {void}
    */
  def removeSelection(node: js.Any): Unit = js.native
  /** Scale the selected objects to the height of the first selected object
    * @returns {void}
    */
  def sameHeight(): Unit = js.native
  /** Scale the selected objects to the size of the first selected object
    * @returns {void}
    */
  def sameSize(): Unit = js.native
  /** Scale the selected objects to the width of the first selected object
    * @returns {void}
    */
  def sameWidth(): Unit = js.native
  /** Returns the diagram as serialized JSON
    * @returns {any}
    */
  def save(): js.Any = js.native
  /** Bring the node into view
    * @param {any} the node/connector to be brought into view
    * @returns {void}
    */
  def scrollToNode(node: js.Any): Unit = js.native
  /** Select all nodes and connector in diagram
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  /** Visually move the selected object behind its closest intersected object
    * @returns {void}
    */
  def sendBackward(): Unit = js.native
  /** Visually move the selected object behind all other intersected objects
    * @returns {void}
    */
  def sendToBack(): Unit = js.native
  /** Update the horizontal space between the selected objects as equal and within the selection boundary
    * @returns {void}
    */
  def spaceAcross(): Unit = js.native
  /** Update the vertical space between the selected objects as equal and within the selection boundary
    * @returns {void}
    */
  def spaceDown(): Unit = js.native
  /** Move the specified label to edit mode
    * @param {any} node/connector that contains the label to be edited
    * @param {any} to be edited
    * @returns {void}
    */
  def startLabelEdit(node: js.Any, label: js.Any): Unit = js.native
  /** Reverse the last action that was performed
    * @returns {void}
    */
  def undo(): Unit = js.native
  /** Ungroup the selected group
    * @returns {void}
    */
  def ungroup(): Unit = js.native
  /** Update diagram at runtime
    * @param {any} JSON to specify the diagram properties that have to be modified
    * @returns {void}
    */
  def update(options: js.Any): Unit = js.native
  /** Update Connectors at runtime
    * @param {string} name of the connector to be updated
    * @param {any} JSON to specify the connector properties that have to be updated
    * @returns {void}
    */
  def updateConnector(name: String, options: js.Any): Unit = js.native
  /** Update the given label at runtime
    * @param {string} the name of node/connector which contains the label to be updated
    * @param {any} the label to be modified
    * @param {any} JSON to specify the label properties that have to be updated
    * @returns {any}
    */
  def updateLabel(nodeName: String, label: js.Any, options: js.Any): js.Any = js.native
  /** Update the given layer at run time.
    * @param {string} the name of layer to be updated
    * @param {any} the layer object to be modified
    * @returns {void}
    */
  def updateLayer(layerName: String, options: js.Any): Unit = js.native
  /** Update nodes at runtime
    * @param {string} name of the node that is to be updated
    * @param {any} JSON to specify the properties of node that have to be updated
    * @returns {void}
    */
  def updateNode(name: String, options: js.Any): Unit = js.native
  /** Update a port with its modified properties at runtime
    * @param {string} the name of node which contains the port to be updated
    * @param {any} the port to be updated
    * @param {any} JSON to specify the properties of the port that have to be updated
    * @returns {void}
    */
  def updatePort(nodeName: String, port: js.Any, options: js.Any): Unit = js.native
  /** Update the specified node as selected object
    * @param {string} name of the node to be updated as selected object
    * @returns {void}
    */
  def updateSelectedObject(name: String): Unit = js.native
  /** Update the selection at runtime
    * @param {boolean} to specify whether to show the user handles or not
    * @returns {void}
    */
  def updateSelection(): Unit = js.native
  def updateSelection(showUserHandles: Boolean): Unit = js.native
  /** Update user handles with respect to the given node
    * @param {any} node/connector with respect to which, the user handles have to be updated
    * @returns {void}
    */
  def updateUserHandles(node: js.Any): Unit = js.native
  /** Update the diagram viewport at runtime
    * @returns {void}
    */
  def updateViewPort(): Unit = js.native
  /** Upgrade the diagram from old version
    * @param {any} to be upgraded
    * @returns {void}
    */
  def upgrade(data: js.Any): Unit = js.native
  /** Used to zoomIn/zoomOut diagram
    * @param {Diagram.Zoom} options to zoom the diagram(zoom factor, zoomIn/zoomOut)
    * @returns {void}
    */
  def zoomTo(): Unit = js.native
  def zoomTo(Zoom: Zoom): Unit = js.native
}

