package typings.gijgo.Types

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree extends JQuery {
  
  def addNode(data: js.Any, parentNode: js.Any, position: Double): Tree = js.native
  
  def check(node: js.Any): Tree = js.native
  
  def checkAll(): Tree = js.native
  
  def collapse(node: js.Any, cascade: Boolean): Tree = js.native
  
  def collapseAll(): Tree = js.native
  
  def destroy(): Unit = js.native
  
  def disable(node: js.Any): Tree = js.native
  def disable(node: js.Any, cascade: Boolean): Tree = js.native
  
  def disableAll(): Tree = js.native
  
  def enable(node: js.Any): Tree = js.native
  def enable(node: js.Any, cascade: Boolean): Tree = js.native
  
  def enableAll(): Tree = js.native
  
  def expand(node: js.Any, cascade: Boolean): Tree = js.native
  
  def expandAll(): Tree = js.native
  
  def getAll(): js.Array[_] = js.native
  
  //parents(id: string): Array<string>;
  def getCheckedNodes(): js.Array[String] = js.native
  
  def getChildren(node: js.Any): js.Array[_] = js.native
  def getChildren(node: js.Any, cascade: Boolean): js.Array[_] = js.native
  
  def getDataById(id: String): js.Any = js.native
  
  def getDataByText(text: String): js.Any = js.native
  
  def getNodeById(id: String): js.Any = js.native
  
  def getNodeByText(id: String): js.Any = js.native
  
  def getSelections(): js.Array[String] = js.native
  
  def reload(params: js.Any): js.Any = js.native
  
  def removeNode(node: js.Any): Tree = js.native
  
  def render(response: js.Any): js.Any = js.native
  
  def selectAll(): Tree = js.native
  
  def uncheck(node: js.Any): Tree = js.native
  
  def uncheckAll(): Tree = js.native
  
  //select(node: any) : Tree;
  def unselect(node: js.Any): Tree = js.native
  
  def unselectAll(): Tree = js.native
  
  def updateNode(id: String, record: js.Any): Tree = js.native
}
