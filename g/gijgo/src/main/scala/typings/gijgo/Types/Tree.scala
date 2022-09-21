package typings.gijgo.Types

import typings.gijgo.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree
  extends StObject
     with JQuery {
  
  def addNode(data: Any, parentNode: Any, position: Double): Tree = js.native
  
  def check(node: Any): Tree = js.native
  
  def checkAll(): Tree = js.native
  
  def collapse(node: Any, cascade: Boolean): Tree = js.native
  
  def collapseAll(): Tree = js.native
  
  def destroy(): Unit = js.native
  
  def disable(node: Any): Tree = js.native
  def disable(node: Any, cascade: Boolean): Tree = js.native
  
  def disableAll(): Tree = js.native
  
  def enable(node: Any): Tree = js.native
  def enable(node: Any, cascade: Boolean): Tree = js.native
  
  def enableAll(): Tree = js.native
  
  def expand(node: Any, cascade: Boolean): Tree = js.native
  
  def expandAll(): Tree = js.native
  
  def getAll(): js.Array[Any] = js.native
  
  //parents(id: string): Array<string>;
  def getCheckedNodes(): js.Array[String] = js.native
  
  def getChildren(node: Any): js.Array[Any] = js.native
  def getChildren(node: Any, cascade: Boolean): js.Array[Any] = js.native
  
  def getDataById(id: String): Any = js.native
  
  def getDataByText(text: String): Any = js.native
  
  def getNodeById(id: String): Any = js.native
  
  def getNodeByText(id: String): Any = js.native
  
  def getSelections(): js.Array[String] = js.native
  
  def reload(params: Any): Any = js.native
  
  def removeNode(node: Any): Tree = js.native
  
  def render(response: Any): Any = js.native
  
  def selectAll(): Tree = js.native
  
  def uncheck(node: Any): Tree = js.native
  
  def uncheckAll(): Tree = js.native
  
  //select(node: any) : Tree;
  def unselect(node: Any): Tree = js.native
  
  def unselectAll(): Tree = js.native
  
  def updateNode(id: String, record: Any): Tree = js.native
}
