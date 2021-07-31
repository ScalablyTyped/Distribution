package typings.forgeViewer.Autodesk.Viewing

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedView extends StObject {
  
  def areAllNodes2D(): Boolean = js.native
  
  def getFloorSelector(): js.Any = js.native
  
  def getModel(node: BubbleNode): Model = js.native
  
  def getModelAndWait(node: BubbleNode): js.Promise[Model] = js.native
  
  def getVisibleNodes(): js.Array[Model] = js.native
  
  def hide(node: BubbleNode): Unit = js.native
  
  def hideAll(): Unit = js.native
  
  def init(parentDiv: HTMLElement): js.Promise[js.Array[Extension]] = js.native
  def init(parentDiv: HTMLElement, options: AggregatedViewInitOptions): js.Promise[js.Array[Extension]] = js.native
  
  def isBimWalkActive(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isLoadDone(): Boolean = js.native
  
  def isVisible(node: BubbleNode): Boolean = js.native
  
  def load(node: BubbleNode): js.Promise[Model] = js.native
  def load(node: BubbleNode, customLoadOptions: js.Any): js.Promise[Model] = js.native
  
  def reset(): Unit = js.native
  
  def setAlignmentService(alignmentService: js.Any): Unit = js.native
  
  def setBookmarks(bookmarks: js.Array[BubbleNode]): Unit = js.native
  
  def setCamera(camera: js.Any): Unit = js.native
  
  def setCameraGlobal(camera: js.Any): Unit = js.native
  
  def setNodes(bubbleNodes: js.Array[BubbleNode], diffConfig: js.Any): Unit = js.native
  
  def show(node: BubbleNode): js.Promise[Model] = js.native
  def show(node: BubbleNode, customLoadOptions: js.Any): js.Promise[Model] = js.native
  
  def startBimWalk(): Unit = js.native
  
  def stopBimWalk(): Unit = js.native
  
  def switchView(bubbleNodes: js.Array[BubbleNode], diffConfig: js.Any): Unit = js.native
  
  def unload(bubbleNode: BubbleNode): Unit = js.native
  
  def unloadAll(): Unit = js.native
  def unloadAll(filter: js.Function1[/* item */ js.Any, Boolean]): Unit = js.native
  
  def unloadUnderlayRaster(bubbleNode: BubbleNode): Unit = js.native
  
  var viewer: Viewer3D | GuiViewer3D = js.native
  
  def waitForLoadDone(): js.Promise[Unit] = js.native
}
