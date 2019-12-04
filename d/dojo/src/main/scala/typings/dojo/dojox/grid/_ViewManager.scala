package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_ViewManager.html
  *
  * A collection of grid views. Owned by grid and used internally for managing grid views.
  * Grid creates views automatically based on grid's layout structure.
  * Users should typically not need to access individual views or the views collection directly.
  *
  * @param inGrid
  */
@JSGlobal("dojox.grid._ViewManager")
@js.native
class _ViewManager protected () extends js.Object {
  def this(inGrid: js.Any) = this()
  /**
    *
    */
  var defaultWidth: Double = js.native
  /**
    *
    */
  var views: js.Array[_] = js.native
  /**
    *
    * @param inView
    */
  def addView(inView: js.Any): Unit = js.native
  /**
    *
    * @param l
    * @param w
    */
  def arrange(l: Double, w: Double): Double = js.native
  /**
    *
    */
  def destroyViews(): Unit = js.native
  /**
    *
    * @param inAutoWidth
    */
  def findClient(inAutoWidth: js.Any): js.Any = js.native
  /**
    *
    * @param inCallback
    */
  def forEach(inCallback: js.Any): Unit = js.native
  /**
    *
    */
  def getContentNodes(): js.Array[_] = js.native
  /**
    * Returns the first grid view with a scroll bar
    *
    */
  def getFirstScrollingView(): js.Any = js.native
  /**
    *
    * @param inIndex
    */
  def getViewWidth(inIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def measureContent(): Double = js.native
  /**
    *
    */
  def measureHeader(): Double = js.native
  /**
    *
    */
  def normalizeHeaderNodeHeight(): Unit = js.native
  /**
    *
    * @param inRowNodes
    */
  def normalizeRowNodeHeights(inRowNodes: js.Any): Unit = js.native
  /**
    *
    * @param inMethod
    * @param inArgs
    */
  def onEach(inMethod: js.Any, inArgs: js.Any): Unit = js.native
  /**
    *
    */
  def render(): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inNodes
    * @param skipRenorm
    */
  def renderRow(inRowIndex: js.Any, inNodes: js.Any, skipRenorm: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def renormalizeRow(inRowIndex: js.Any): Unit = js.native
  /**
    *
    */
  def resetHeaderNodeHeight(): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def rowRemoved(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inTop
    */
  def setScrollTop(inTop: js.Any): js.Any = js.native
  /**
    *
    * @param inRowIndex
    * @param skipRenorm
    */
  def updateRow(inRowIndex: js.Any, skipRenorm: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def updateRowStyles(inRowIndex: js.Any): Unit = js.native
}

