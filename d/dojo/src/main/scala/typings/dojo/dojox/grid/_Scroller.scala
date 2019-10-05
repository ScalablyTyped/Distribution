package typings.dojo.dojox.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_Scroller.html
  *
  *
  * @param inContentNodes
  */
@JSGlobal("dojox.grid._Scroller")
@js.native
class _Scroller protected () extends js.Object {
  def this(inContentNodes: js.Any) = this()
  /**
    *
    */
  var averageRowHeight: Double = js.native
  /**
    *
    */
  var contentNode: js.Object = js.native
  /**
    *
    */
  var defaultPageHeight: Double = js.native
  /**
    *
    */
  var defaultRowHeight: Double = js.native
  /**
    *
    */
  var dummy: Double = js.native
  /**
    *
    */
  var firstVisibleRow: Double = js.native
  /**
    *
    */
  var keepPages: Double = js.native
  /**
    *
    */
  var keepRows: Double = js.native
  /**
    *
    */
  var lastVisibleRow: Double = js.native
  /**
    *
    */
  var pacifyTicks: Double = js.native
  /**
    *
    */
  var pacifying: Boolean = js.native
  /**
    *
    */
  var page: Double = js.native
  /**
    *
    */
  var pageCount: Double = js.native
  /**
    *
    */
  var pageTop: Double = js.native
  /**
    *
    */
  var rowCount: Double = js.native
  /**
    *
    */
  var scrollboxNode: js.Object = js.native
  /**
    *
    */
  var windowHeight: Double = js.native
  /**
    *
    * @param inPageIndex
    * @param inReuseNode
    * @param inPos
    */
  def buildPage(inPageIndex: js.Any, inReuseNode: js.Any, inPos: js.Any): Unit = js.native
  /**
    *
    */
  def calcLastPageHeight(): Double = js.native
  /**
    *
    */
  def createPageNode(): js.Any = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    *
    * @param inPageIndex
    */
  def destroyPage(inPageIndex: js.Any): Unit = js.native
  /**
    *
    */
  def doPacify(): Boolean = js.native
  /**
    *
    */
  def endPacify(): Unit = js.native
  /**
    *
    * @param inTop
    */
  def findPage(inTop: js.Any): Unit = js.native
  /**
    *
    * @param inRow
    */
  def findScrollTop(inRow: js.Any): Double = js.native
  /**
    *
    * @param inScrollTop
    */
  def findTopRow(inScrollTop: js.Any): Double = js.native
  /**
    *
    */
  def getDefaultNodes(): js.Object = js.native
  /**
    *
    * @param inPageIndex
    */
  def getDefaultPageNode(inPageIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inPage
    * @param inPageTop
    * @param inScrollTop
    */
  def getFirstVisibleRow(inPage: js.Any, inPageTop: Double, inScrollTop: js.Any): js.Any = js.native
  /**
    *
    * @param inPage
    */
  def getLastPageRow(inPage: js.Any): Double = js.native
  /**
    *
    * @param inPage
    * @param inBottom
    * @param inScrollBottom
    */
  def getLastVisibleRow(inPage: js.Any, inBottom: Double, inScrollBottom: js.Any): Double = js.native
  /**
    *
    * @param inPageIndex
    */
  def getPageHeight(inPageIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inNode
    */
  def getPageNodePosition(inNode: js.Any): js.Any = js.native
  /**
    *
    * @param inPage
    */
  def getPageRow(inPage: js.Any): Double = js.native
  /**
    *
    * @param inTop
    */
  def getScrollBottom(inTop: js.Any): Double = js.native
  /**
    *
    * @param inRowCount
    * @param inKeepRows
    * @param inRowsPerPage
    */
  def init(inRowCount: js.Any, inKeepRows: js.Any, inRowsPerPage: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    */
  def installPage(inPageIndex: js.Any): Unit = js.native
  /**
    *
    */
  def invalidate(): Unit = js.native
  /**
    *
    */
  def invalidateNodes(): Unit = js.native
  /**
    *
    * @param inPageIndex
    * @param inNodes
    */
  def invalidatePageNode(inPageIndex: js.Any, inNodes: js.Any): js.Any = js.native
  /**
    *
    * @param inPageIndex
    */
  def measurePage(inPageIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inPageIndex
    * @param inPos
    */
  def needPage(inPageIndex: js.Any, inPos: js.Any): js.Any = js.native
  /**
    *
    */
  def onscroll(): Unit = js.native
  /**
    *
    * @param inShouldPacify
    */
  def pacify(inShouldPacify: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    */
  def pageExists(inPageIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def popPage(): js.Any = js.native
  /**
    *
    * @param inPageIndex
    * @param inPos
    */
  def positionPage(inPageIndex: js.Any, inPos: js.Any): Unit = js.native
  /**
    *
    * @param inNode
    * @param inPos
    */
  def positionPageNode(inNode: js.Any, inPos: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    * @param inReuseNode
    */
  def preparePage(inPageIndex: js.Any, inReuseNode: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def processEvent(e: js.Any): js.Any = js.native
  /**
    *
    * @param e
    * @param inNode
    */
  def processNodeEvent(e: js.Any, inNode: js.Any): Boolean = js.native
  /**
    *
    * @param inPageIndex
    */
  def pushPage(inPageIndex: js.Any): js.Any = js.native
  /**
    *
    * @param inPageIndex
    */
  def removePage(inPageIndex: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def removeRow(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    */
  def renderPage(inPageIndex: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inPageNode
    */
  def renderRow(inRowIndex: js.Any, inPageNode: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    */
  def repositionPages(inPageIndex: js.Any): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param fromAsynRendering
    */
  def rowHeightChanged(inRowIndex: js.Any, fromAsynRendering: js.Any): Unit = js.native
  /**
    *
    * @param inTop
    */
  def scroll(inTop: js.Any): Unit = js.native
  /**
    *
    * @param inNodes
    */
  def setContentNodes(inNodes: js.Any): Unit = js.native
  /**
    *
    * @param inKeepRows
    */
  def setKeepInfo(inKeepRows: js.Any): Unit = js.native
  /**
    *
    * @param inPacifying
    */
  def setPacifying(inPacifying: js.Any): Unit = js.native
  /**
    *
    */
  def startPacify(): Unit = js.native
  /**
    *
    * @param inDh
    */
  def updateContentHeight(inDh: js.Any): Unit = js.native
  /**
    *
    * @param inPageIndex
    * @param fromBuild
    * @param fromAsynRendering
    */
  def updatePageHeight(inPageIndex: js.Any, fromBuild: js.Any, fromAsynRendering: js.Any): js.Any = js.native
  /**
    *
    * @param inRowCount
    */
  def updateRowCount(inRowCount: js.Any): Unit = js.native
}

