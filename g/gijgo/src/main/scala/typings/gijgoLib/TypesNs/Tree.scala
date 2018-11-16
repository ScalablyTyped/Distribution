package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends gijgoLib.JQuery {
  def addNode(data: js.Any, parentNode: js.Any, position: scala.Double): Tree = js.native
  def check(node: js.Any): Tree = js.native
  def checkAll(): Tree = js.native
  def collapse(node: js.Any, cascade: scala.Boolean): Tree = js.native
  def collapseAll(): Tree = js.native
  def destroy(): scala.Unit = js.native
  def disable(node: js.Any): Tree = js.native
  def disable(node: js.Any, cascade: scala.Boolean): Tree = js.native
  def disableAll(): Tree = js.native
  def enable(node: js.Any): Tree = js.native
  def enable(node: js.Any, cascade: scala.Boolean): Tree = js.native
  def enableAll(): Tree = js.native
  def expand(node: js.Any, cascade: scala.Boolean): Tree = js.native
  def expandAll(): Tree = js.native
  def getAll(): js.Array[_] = js.native
  def getCheckedNodes(): js.Array[java.lang.String] = js.native
  def getChildren(node: js.Any): js.Array[_] = js.native
  def getChildren(node: js.Any, cascade: scala.Boolean): js.Array[_] = js.native
  def getDataById(id: java.lang.String): js.Any = js.native
  def getDataByText(text: java.lang.String): js.Any = js.native
  def getNodeById(id: java.lang.String): js.Any = js.native
  def getNodeByText(id: java.lang.String): js.Any = js.native
  def getSelections(): js.Array[java.lang.String] = js.native
  def reload(params: js.Any): js.Any = js.native
  def removeNode(node: js.Any): Tree = js.native
  def render(response: js.Any): js.Any = js.native
  def selectAll(): Tree = js.native
  def uncheck(node: js.Any): Tree = js.native
  def uncheckAll(): Tree = js.native
  //select(node: any) : Tree;
  def unselect(node: js.Any): Tree = js.native
  def unselectAll(): Tree = js.native
  def updateNode(id: java.lang.String, record: js.Any): Tree = js.native
}

