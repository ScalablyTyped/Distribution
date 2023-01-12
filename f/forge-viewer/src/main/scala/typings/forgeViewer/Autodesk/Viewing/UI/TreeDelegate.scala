package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeDelegate extends StObject {
  
  def createTreeNode(node: js.Object, parent: HTMLElement, options: js.Object): Unit
  
  def forEachChild(node: js.Object, callback: js.Function1[/* child */ js.Object, Unit]): Unit
  
  def getTreeNodeClass(node: js.Object): Unit
  
  def getTreeNodeId(node: js.Object): String
  
  def getTreeNodeLabel(node: js.Object): String
  
  def isTreeNodeGroup(node: js.Object): Boolean
  
  def onTreeNodeClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeDoubleClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeIconClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def onTreeNodeRightClick(tree: Tree, node: js.Object, event: Event): Unit
  
  def shouldCreateTreeNode(node: js.Object): Boolean
}
object TreeDelegate {
  
  inline def apply(
    createTreeNode: (js.Object, HTMLElement, js.Object) => Unit,
    forEachChild: (js.Object, js.Function1[/* child */ js.Object, Unit]) => Unit,
    getTreeNodeClass: js.Object => Unit,
    getTreeNodeId: js.Object => String,
    getTreeNodeLabel: js.Object => String,
    isTreeNodeGroup: js.Object => Boolean,
    onTreeNodeClick: (Tree, js.Object, Event) => Unit,
    onTreeNodeDoubleClick: (Tree, js.Object, Event) => Unit,
    onTreeNodeIconClick: (Tree, js.Object, Event) => Unit,
    onTreeNodeRightClick: (Tree, js.Object, Event) => Unit,
    shouldCreateTreeNode: js.Object => Boolean
  ): TreeDelegate = {
    val __obj = js.Dynamic.literal(createTreeNode = js.Any.fromFunction3(createTreeNode), forEachChild = js.Any.fromFunction2(forEachChild), getTreeNodeClass = js.Any.fromFunction1(getTreeNodeClass), getTreeNodeId = js.Any.fromFunction1(getTreeNodeId), getTreeNodeLabel = js.Any.fromFunction1(getTreeNodeLabel), isTreeNodeGroup = js.Any.fromFunction1(isTreeNodeGroup), onTreeNodeClick = js.Any.fromFunction3(onTreeNodeClick), onTreeNodeDoubleClick = js.Any.fromFunction3(onTreeNodeDoubleClick), onTreeNodeIconClick = js.Any.fromFunction3(onTreeNodeIconClick), onTreeNodeRightClick = js.Any.fromFunction3(onTreeNodeRightClick), shouldCreateTreeNode = js.Any.fromFunction1(shouldCreateTreeNode))
    __obj.asInstanceOf[TreeDelegate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeDelegate] (val x: Self) extends AnyVal {
    
    inline def setCreateTreeNode(value: (js.Object, HTMLElement, js.Object) => Unit): Self = StObject.set(x, "createTreeNode", js.Any.fromFunction3(value))
    
    inline def setForEachChild(value: (js.Object, js.Function1[/* child */ js.Object, Unit]) => Unit): Self = StObject.set(x, "forEachChild", js.Any.fromFunction2(value))
    
    inline def setGetTreeNodeClass(value: js.Object => Unit): Self = StObject.set(x, "getTreeNodeClass", js.Any.fromFunction1(value))
    
    inline def setGetTreeNodeId(value: js.Object => String): Self = StObject.set(x, "getTreeNodeId", js.Any.fromFunction1(value))
    
    inline def setGetTreeNodeLabel(value: js.Object => String): Self = StObject.set(x, "getTreeNodeLabel", js.Any.fromFunction1(value))
    
    inline def setIsTreeNodeGroup(value: js.Object => Boolean): Self = StObject.set(x, "isTreeNodeGroup", js.Any.fromFunction1(value))
    
    inline def setOnTreeNodeClick(value: (Tree, js.Object, Event) => Unit): Self = StObject.set(x, "onTreeNodeClick", js.Any.fromFunction3(value))
    
    inline def setOnTreeNodeDoubleClick(value: (Tree, js.Object, Event) => Unit): Self = StObject.set(x, "onTreeNodeDoubleClick", js.Any.fromFunction3(value))
    
    inline def setOnTreeNodeIconClick(value: (Tree, js.Object, Event) => Unit): Self = StObject.set(x, "onTreeNodeIconClick", js.Any.fromFunction3(value))
    
    inline def setOnTreeNodeRightClick(value: (Tree, js.Object, Event) => Unit): Self = StObject.set(x, "onTreeNodeRightClick", js.Any.fromFunction3(value))
    
    inline def setShouldCreateTreeNode(value: js.Object => Boolean): Self = StObject.set(x, "shouldCreateTreeNode", js.Any.fromFunction1(value))
  }
}
