package typings.dojo.dojox.grid.cells

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.html
  *
  *
  */
trait dijit extends js.Object {
  /**
    *
    */
  def CheckBox(): Unit
  /**
    *
    */
  def ComboBox(): Unit
  /**
    *
    */
  def DateTextBox(): Unit
  /**
    *
    */
  def Editor(): Unit
}

@JSGlobal("dojox.grid.cells.dijit")
@js.native
object dijit extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.CheckBox.html
    *
    *
    * @param inCell
    */
  @js.native
  class CheckBox protected () extends _base {
    def this(inCell: js.Any) = this()
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def attachWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def createWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inNode
      */
    def focus(inRowIndex: js.Any, inNode: js.Any): Unit = js.native
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
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      */
    def getValue(): js.Any = js.native
    /**
      *
      * @param inDatum
      */
    def getWidgetProps(inDatum: js.Any): js.Object = js.native
    /**
      *
      * @param inRowIndex
      * @param inValue
      */
    def setValue(inRowIndex: js.Any, inValue: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def sizeWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def widgetClass(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.ComboBox.html
    *
    *
    * @param inCell
    */
  @js.native
  class ComboBox protected () extends _base {
    def this(inCell: js.Any) = this()
    /**
      *
      */
    var getWidgetPropsCallOrig: js.Object = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def attachWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def createWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inNode
      */
    def focus(inRowIndex: js.Any, inNode: js.Any): Unit = js.native
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
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      */
    def getValue(): js.Any = js.native
    /**
      *
      * @param inDatum
      */
    def getWidgetProps(inDatum: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inValue
      */
    def setValue(inRowIndex: js.Any, inValue: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def sizeWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def widgetClass(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.DateTextBox.html
    *
    *
    * @param inCell
    */
  @js.native
  class DateTextBox protected () extends _base {
    def this(inCell: js.Any) = this()
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def attachWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def createWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inNode
      */
    def focus(inRowIndex: js.Any, inNode: js.Any): Unit = js.native
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
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      */
    def getValue(inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      */
    def getWidgetProps(inDatum: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inValue
      */
    def setValue(inRowIndex: js.Any, inValue: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def sizeWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def widgetClass(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit.Editor.html
    *
    *
    * @param inCell
    */
  @js.native
  class Editor protected () extends _base {
    def this(inCell: js.Any) = this()
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def attachWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def createWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inNode
      */
    def focus(inRowIndex: js.Any, inNode: js.Any): Unit = js.native
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
    def getValue(inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      */
    def getWidgetProps(inDatum: js.Any): js.Object = js.native
    /**
      *
      */
    def populateEditor(): Unit = js.native
    /**
      *
      * @param inRowIndex
      * @param inValue
      */
    def setValue(inRowIndex: js.Any, inValue: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def sizeWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def widgetClass(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit._Widget.html
    *
    *
    * @param inCell
    */
  @js.native
  class _Widget protected () extends _base {
    def this(inCell: js.Any) = this()
    /**
      *
      */
    var getWidgetPropsCallOrig: js.Object = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def attachWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def createWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inNode
      */
    def focus(inRowIndex: js.Any, inNode: js.Any): Unit = js.native
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
    def formatNode(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      */
    def getValue(inRowIndex: js.Any): js.Any = js.native
    /**
      *
      * @param inDatum
      */
    def getWidgetProps(inDatum: js.Any): js.Any = js.native
    /**
      *
      * @param inRowIndex
      * @param inValue
      */
    def setValue(inRowIndex: js.Any, inValue: js.Any): Unit = js.native
    /**
      *
      * @param inNode
      * @param inDatum
      * @param inRowIndex
      */
    def sizeWidget(inNode: js.Any, inDatum: js.Any, inRowIndex: js.Any): Unit = js.native
    /**
      *
      */
    def widgetClass(): Unit = js.native
  }
  
}

