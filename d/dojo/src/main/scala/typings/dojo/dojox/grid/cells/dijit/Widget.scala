package typings.dojo.dojox.grid.cells.dijit

import typings.dojo.dojox.grid.cells.base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/cells/dijit._Widget.html
  *
  *
  * @param inCell
  */
@JSGlobal("dojox.grid.cells.dijit._Widget")
@js.native
class Widget protected () extends base {
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

