package typings.dojo.dojox.grid.cells

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.html
  *
  * Represents a grid cell and contains information about column options and methods
  * for retrieving cell related information.
  * Each column in a grid layout has a cell object and most events and many methods
  * provide access to these objects.
  *
  * @param inProps
  */
@JSGlobal("dojox.grid.cells._base")
@js.native
class base protected () extends js.Object {
  def this(inProps: js.Any) = this()
  /**
    *
    */
  var alwaysEditing: Boolean = js.native
  /**
    *
    */
  var classes: String = js.native
  /**
    *
    */
  var defaultValue: String = js.native
  /**
    *
    */
  var draggable: Boolean = js.native
  /**
    *
    */
  var editable: Boolean = js.native
  /**
    *
    */
  var formatter: js.Object = js.native
  /**
    *
    */
  var hidden: Boolean = js.native
  /**
    *
    */
  var noresize: Boolean = js.native
  /**
    *
    */
  var styles: String = js.native
  /**
    *
    */
  var value: js.Object = js.native
  /**
    *
    */
  def AlwaysEdit(): Unit = js.native
  /**
    *
    */
  def Bool(): Unit = js.native
  /**
    *
    */
  def Cell(): Unit = js.native
  /**
    *
    */
  def RowIndex(): Unit = js.native
  /**
    *
    */
  def Select(): Unit = js.native
  /**
    * apply edit from cell editor
    *
    * @param inRowIndex grid row index
    */
  @JSName("apply")
  def apply(inRowIndex: Double): Unit = js.native
  /**
    *
    * @param inValue
    * @param inRowIndex
    */
  def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
  /**
    *
    */
  def canResize(): js.Any = js.native
  /**
    * cancel cell edit
    *
    * @param inRowIndex grid row index
    */
  def cancel(inRowIndex: Double): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def cancelEdit(inRowIndex: js.Any): Unit = js.native
  /**
    *
    */
  def cancelFormatNode(): Unit = js.native
  /**
    *
    * @param m
    * @param e
    */
  def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
  /**
    * focus the grid editor
    *
    * @param inRowIndex grid row index
    * @param inNode editor node
    */
  def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
  /**
    * provides the html for a given grid cell.
    *
    * @param inRowIndex grid row index
    * @param inItem
    */
  def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
  /**
    * formats the cell for editing
    *
    * @param inDatum cell data to edit
    * @param inRowIndex grid row index
    */
  def formatEditing(inDatum: js.Any, inRowIndex: Double): js.Any = js.native
  /**
    * format the editing dom node. Use when editor is a widget.
    *
    * @param inNode dom node for the editor
    * @param inDatum cell data to edit
    * @param inRowIndex grid row index
    */
  def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: Double): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def getEditNode(inRowIndex: js.Any): Double = js.native
  /**
    *
    */
  def getHeaderNode(): js.Any = js.native
  /**
    * gets the dom node for a given grid cell.
    *
    * @param inRowIndex grid row index
    */
  def getNode(inRowIndex: Double): js.Any = js.native
  /**
    * returns value entered into editor
    *
    * @param inRowIndex grid row index
    */
  def getValue(inRowIndex: Double): js.Any = js.native
  /**
    *
    */
  def isFlex(): js.Any = js.native
  /**
    *
    * @param node
    * @param cellDef
    */
  def markupFactory(node: js.Any, cellDef: js.Any): Unit = js.native
  /**
    *
    * @param inDatum
    * @param inRowIndex
    */
  def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inNode
    * @param inRowIndex
    */
  def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
  /**
    * restore editor state
    *
    * @param inRowIndex grid row index
    */
  def restore(inRowIndex: Double): Unit = js.native
  /**
    * save editor state
    *
    * @param inRowIndex grid row index
    */
  def save(inRowIndex: Double): Unit = js.native
  /**
    * set the value of the grid editor
    *
    * @param inRowIndex grid row index
    * @param inValue value of editor
    */
  def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
}

@JSGlobal("dojox.grid.cells._base")
@js.native
object base extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.AlwaysEdit.html
    *
    * grid cell that is always in an editable state, regardless of grid editing state
    *
    */
  @js.native
  class AlwaysEdit () extends js.Object {
    /**
      *
      */
    var alwaysEditing: Boolean = js.native
    /**
      *
      */
    var classes: String = js.native
    /**
      *
      */
    var defaultValue: String = js.native
    /**
      *
      */
    var draggable: Boolean = js.native
    /**
      *
      */
    var editable: Boolean = js.native
    /**
      *
      */
    var formatter: js.Object = js.native
    /**
      *
      */
    var hidden: Boolean = js.native
    /**
      * optional regex for disallowing keypresses
      *
      */
    var keyFilter: RegExp = js.native
    /**
      *
      */
    var noresize: Boolean = js.native
    /**
      *
      */
    var styles: String = js.native
    /**
      *
      */
    var value: js.Object = js.native
    /**
      * apply edit from cell editor
      *
      * @param inRowIndex grid row index
      */
    @JSName("apply")
    def apply(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inValue
      * @param inRowIndex
      */
    def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def applyStaticValue(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def canResize(): js.Any = js.native
    /**
      * cancel cell edit
      *
      * @param inRowIndex grid row index
      */
    def cancel(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def cancelEdit(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def cancelFormatNode(): Unit = js.native
    /**
      *
      * @param m
      * @param e
      */
    def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
    /**
      *
      * @param e
      */
    def doKey(e: js.Any): Unit = js.native
    /**
      * focus the grid editor
      *
      * @param inRowIndex grid row index
      * @param inNode editor node
      */
    def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
    /**
      * provides the html for a given grid cell.
      *
      * @param inRowIndex grid row index
      * @param inItem
      */
    def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def formatEditing(inDatum: js.Any, inRowIndex: js.Any): String = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def getEditNode(inRowIndex: js.Any): Double = js.native
    /**
      *
      */
    def getHeaderNode(): js.Any = js.native
    /**
      * gets the dom node for a given grid cell.
      *
      * @param inRowIndex grid row index
      */
    def getNode(inRowIndex: Double): js.Any = js.native
    /**
      * returns value entered into editor
      *
      * @param inRowIndex grid row index
      */
    def getValue(inRowIndex: Double): js.Any = js.native
    /**
      *
      */
    def isFlex(): js.Any = js.native
    /**
      *
      * @param node
      * @param cell
      */
    def markupFactory(node: js.Any, cell: js.Any): Unit = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inRowIndex
      */
    def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      * restore editor state
      *
      * @param inRowIndex grid row index
      */
    def restore(inRowIndex: Double): Unit = js.native
    /**
      * save editor state
      *
      * @param inRowIndex grid row index
      */
    def save(inRowIndex: Double): Unit = js.native
    /**
      * set the value of the grid editor
      *
      * @param inRowIndex grid row index
      * @param inValue value of editor
      */
    def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.Bool.html
    *
    * grid cell that provides a standard checkbox that is always on for editing
    *
    */
  @js.native
  class Bool () extends js.Object {
    /**
      *
      */
    var alwaysEditing: Boolean = js.native
    /**
      *
      */
    var classes: String = js.native
    /**
      *
      */
    var defaultValue: String = js.native
    /**
      *
      */
    var draggable: Boolean = js.native
    /**
      *
      */
    var editable: Boolean = js.native
    /**
      *
      */
    var formatter: js.Object = js.native
    /**
      *
      */
    var hidden: Boolean = js.native
    /**
      * optional regex for disallowing keypresses
      *
      */
    var keyFilter: RegExp = js.native
    /**
      *
      */
    var noresize: Boolean = js.native
    /**
      *
      */
    var styles: String = js.native
    /**
      *
      */
    var value: js.Object = js.native
    /**
      * apply edit from cell editor
      *
      * @param inRowIndex grid row index
      */
    @JSName("apply")
    def apply(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inValue
      * @param inRowIndex
      */
    def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def applyStaticValue(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def canResize(): js.Any = js.native
    /**
      * cancel cell edit
      *
      * @param inRowIndex grid row index
      */
    def cancel(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def cancelEdit(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def cancelFormatNode(): Unit = js.native
    /**
      *
      * @param m
      * @param e
      */
    def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
    /**
      *
      * @param e
      */
    def doKey(e: js.Any): Unit = js.native
    /**
      *
      * @param e
      */
    def doclick(e: js.Any): Unit = js.native
    /**
      * focus the grid editor
      *
      * @param inRowIndex grid row index
      * @param inNode editor node
      */
    def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
    /**
      * provides the html for a given grid cell.
      *
      * @param inRowIndex grid row index
      * @param inItem
      */
    def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def formatEditing(inDatum: js.Any, inRowIndex: js.Any): String = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def getEditNode(inRowIndex: js.Any): Double = js.native
    /**
      *
      */
    def getHeaderNode(): js.Any = js.native
    /**
      * gets the dom node for a given grid cell.
      *
      * @param inRowIndex grid row index
      */
    def getNode(inRowIndex: Double): js.Any = js.native
    /**
      * returns value entered into editor
      *
      * @param inRowIndex grid row index
      */
    def getValue(inRowIndex: Double): js.Any = js.native
    /**
      *
      */
    def isFlex(): js.Any = js.native
    /**
      *
      * @param node
      * @param cell
      */
    def markupFactory(node: js.Any, cell: js.Any): Unit = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inRowIndex
      */
    def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      * restore editor state
      *
      * @param inRowIndex grid row index
      */
    def restore(inRowIndex: Double): Unit = js.native
    /**
      * save editor state
      *
      * @param inRowIndex grid row index
      */
    def save(inRowIndex: Double): Unit = js.native
    /**
      * set the value of the grid editor
      *
      * @param inRowIndex grid row index
      * @param inValue value of editor
      */
    def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.Cell.html
    *
    * grid cell that provides a standard text input box upon editing
    *
    */
  @js.native
  class Cell () extends js.Object {
    /**
      *
      */
    var KEY_HANDLER: String = js.native
    /**
      *
      */
    var LRE: String = js.native
    /**
      *
      */
    var PDF: String = js.native
    /**
      *
      */
    var RLE: String = js.native
    /**
      *
      */
    var alwaysEditing: Boolean = js.native
    /**
      *
      */
    var classes: String = js.native
    /**
      *
      */
    var defaultValue: String = js.native
    /**
      *
      */
    var draggable: Boolean = js.native
    /**
      *
      */
    var editable: Boolean = js.native
    /**
      *
      */
    var formatter: js.Object = js.native
    /**
      *
      */
    var hidden: Boolean = js.native
    /**
      * optional regex for disallowing keypresses
      *
      */
    var keyFilter: RegExp = js.native
    /**
      *
      */
    var noresize: Boolean = js.native
    /**
      *
      */
    var styles: String = js.native
    /**
      *
      */
    var value: js.Object = js.native
    /**
      * apply edit from cell editor
      *
      * @param inRowIndex grid row index
      */
    @JSName("apply")
    def apply(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inValue
      * @param inRowIndex
      */
    def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def canResize(): js.Any = js.native
    /**
      * cancel cell edit
      *
      * @param inRowIndex grid row index
      */
    def cancel(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def cancelEdit(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def cancelFormatNode(): Unit = js.native
    /**
      *
      * @param m
      * @param e
      */
    def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
    /**
      *
      * @param e
      */
    def doKey(e: js.Any): Unit = js.native
    /**
      * focus the grid editor
      *
      * @param inRowIndex grid row index
      * @param inNode editor node
      */
    def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
    /**
      * provides the html for a given grid cell.
      *
      * @param inRowIndex grid row index
      * @param inItem
      */
    def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def formatEditing(inDatum: js.Any, inRowIndex: js.Any): String = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def getEditNode(inRowIndex: js.Any): Double = js.native
    /**
      *
      */
    def getHeaderNode(): js.Any = js.native
    /**
      * gets the dom node for a given grid cell.
      *
      * @param inRowIndex grid row index
      */
    def getNode(inRowIndex: Double): js.Any = js.native
    /**
      * returns value entered into editor
      *
      * @param inRowIndex grid row index
      */
    def getValue(inRowIndex: Double): js.Any = js.native
    /**
      *
      */
    def isFlex(): js.Any = js.native
    /**
      *
      * @param node
      * @param cellDef
      */
    def markupFactory(node: js.Any, cellDef: js.Any): Unit = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inRowIndex
      */
    def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      * restore editor state
      *
      * @param inRowIndex grid row index
      */
    def restore(inRowIndex: Double): Unit = js.native
    /**
      * save editor state
      *
      * @param inRowIndex grid row index
      */
    def save(inRowIndex: Double): Unit = js.native
    /**
      * set the value of the grid editor
      *
      * @param inRowIndex grid row index
      * @param inValue value of editor
      */
    def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.RowIndex.html
    *
    *
    */
  @js.native
  class RowIndex () extends js.Object {
    /**
      *
      */
    var alwaysEditing: Boolean = js.native
    /**
      *
      */
    var classes: String = js.native
    /**
      *
      */
    var defaultValue: String = js.native
    /**
      *
      */
    var draggable: Boolean = js.native
    /**
      *
      */
    var editable: Boolean = js.native
    /**
      *
      */
    var formatter: js.Object = js.native
    /**
      *
      */
    var hidden: Boolean = js.native
    /**
      * optional regex for disallowing keypresses
      *
      */
    var keyFilter: RegExp = js.native
    /**
      *
      */
    var name: String = js.native
    /**
      *
      */
    var noresize: Boolean = js.native
    /**
      *
      */
    var styles: String = js.native
    /**
      *
      */
    var value: js.Object = js.native
    /**
      * apply edit from cell editor
      *
      * @param inRowIndex grid row index
      */
    @JSName("apply")
    def apply(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inValue
      * @param inRowIndex
      */
    def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def canResize(): js.Any = js.native
    /**
      * cancel cell edit
      *
      * @param inRowIndex grid row index
      */
    def cancel(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def cancelEdit(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def cancelFormatNode(): Unit = js.native
    /**
      *
      * @param m
      * @param e
      */
    def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
    /**
      *
      * @param e
      */
    def doKey(e: js.Any): Unit = js.native
    /**
      * focus the grid editor
      *
      * @param inRowIndex grid row index
      * @param inNode editor node
      */
    def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
    /**
      * provides the html for a given grid cell.
      *
      * @param inRowIndex grid row index
      * @param inItem
      */
    def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def formatEditing(inDatum: js.Any, inRowIndex: js.Any): String = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def get(inRowIndex: js.Any): Double = js.native
    /**
      *
      * @param inRowIndex
      */
    def getEditNode(inRowIndex: js.Any): Double = js.native
    /**
      *
      */
    def getHeaderNode(): js.Any = js.native
    /**
      * gets the dom node for a given grid cell.
      *
      * @param inRowIndex grid row index
      */
    def getNode(inRowIndex: Double): js.Any = js.native
    /**
      * returns value entered into editor
      *
      * @param inRowIndex grid row index
      */
    def getValue(inRowIndex: Double): js.Any = js.native
    /**
      *
      */
    def isFlex(): js.Any = js.native
    /**
      *
      * @param node
      * @param cellDef
      */
    def markupFactory(node: js.Any, cellDef: js.Any): Unit = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def postscript(): Unit = js.native
    /**
      *
      * @param inNode
      * @param inRowIndex
      */
    def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      * restore editor state
      *
      * @param inRowIndex grid row index
      */
    def restore(inRowIndex: Double): Unit = js.native
    /**
      * save editor state
      *
      * @param inRowIndex grid row index
      */
    def save(inRowIndex: Double): Unit = js.native
    /**
      * set the value of the grid editor
      *
      * @param inRowIndex grid row index
      * @param inValue value of editor
      */
    def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/_base.Select.html
    *
    * grid cell that provides a standard select for editing
    *
    * @param inCell
    */
  @js.native
  class Select protected () extends js.Object {
    def this(inCell: js.Any) = this()
    /**
      *
      */
    var alwaysEditing: Boolean = js.native
    /**
      *
      */
    var classes: String = js.native
    /**
      *
      */
    var defaultValue: String = js.native
    /**
      *
      */
    var draggable: Boolean = js.native
    /**
      *
      */
    var editable: Boolean = js.native
    /**
      *
      */
    var formatter: js.Object = js.native
    /**
      *
      */
    var hidden: Boolean = js.native
    /**
      * optional regex for disallowing keypresses
      *
      */
    var keyFilter: RegExp = js.native
    /**
      *
      */
    var noresize: Boolean = js.native
    /**
      * text of each item
      *
      */
    var options: js.Array[_] = js.native
    /**
      * editor returns only the index of the selected option and not the value
      *
      */
    var returnIndex: Double = js.native
    /**
      *
      */
    var styles: String = js.native
    /**
      *
      */
    var value: js.Object = js.native
    /**
      * value for each item
      *
      */
    var values: js.Array[_] = js.native
    /**
      * apply edit from cell editor
      *
      * @param inRowIndex grid row index
      */
    @JSName("apply")
    def apply(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inValue
      * @param inRowIndex
      */
    def applyEdit(inValue: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def canResize(): js.Any = js.native
    /**
      * cancel cell edit
      *
      * @param inRowIndex grid row index
      */
    def cancel(inRowIndex: Double): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def cancelEdit(inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def cancelFormatNode(): Unit = js.native
    /**
      *
      * @param m
      * @param e
      */
    def dispatchEvent(m: js.Any, e: js.Any): js.Any = js.native
    /**
      *
      * @param e
      */
    def doKey(e: js.Any): Unit = js.native
    /**
      * focus the grid editor
      *
      * @param inRowIndex grid row index
      * @param inNode editor node
      */
    def focus(inRowIndex: Double, inNode: js.Any): Unit = js.native
    /**
      * provides the html for a given grid cell.
      *
      * @param inRowIndex grid row index
      * @param inItem
      */
    def format(inRowIndex: Double, inItem: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def formatEditing(inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inRowIndex
      */
    def getEditNode(inRowIndex: js.Any): Double = js.native
    /**
      *
      */
    def getHeaderNode(): js.Any = js.native
    /**
      * gets the dom node for a given grid cell.
      *
      * @param inRowIndex grid row index
      */
    def getNode(inRowIndex: Double): js.Any = js.native
    /**
      *
      * @param inRowIndex
      */
    def getValue(inRowIndex: js.Any): js.Any = js.native
    /**
      *
      */
    def isFlex(): js.Any = js.native
    /**
      *
      * @param node
      * @param cell
      */
    def markupFactory(node: js.Any, cell: js.Any): Unit = js.native
    /**
      *
      * @param inDatum
      * @param inRowIndex
      */
    def needFormatNode(inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inRowIndex
      */
    def registerOnBlur(inNode: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      * restore editor state
      *
      * @param inRowIndex grid row index
      */
    def restore(inRowIndex: Double): Unit = js.native
    /**
      * save editor state
      *
      * @param inRowIndex grid row index
      */
    def save(inRowIndex: Double): Unit = js.native
    /**
      * set the value of the grid editor
      *
      * @param inRowIndex grid row index
      * @param inValue value of editor
      */
    def setValue(inRowIndex: Double, inValue: js.Any): Unit = js.native
  }
  
}

