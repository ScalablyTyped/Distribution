package typings.gijgo.Types

import typings.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[Entity, Params] extends JQuery {
  def addRow(record: Entity): Grid[Entity, Params] = js.native
  def cancel(id: String): Grid[Entity, Params] = js.native
  def clear(): Grid[Entity, Params] = js.native
  def clear(showNotFoundText: Boolean): Grid[Entity, Params] = js.native
  def collapseAll(): Grid[Entity, Params] = js.native
  def count(): Double = js.native
  def destroy(): Unit = js.native
  def destroy(keepTableTag: Boolean): Unit = js.native
  def destroy(keepTableTag: Boolean, keepWrapperTag: Boolean): Unit = js.native
  def downloadCSV(): Grid[Entity, Params] = js.native
  def downloadCSV(filename: String): Grid[Entity, Params] = js.native
  def downloadCSV(filename: String, includeAllRecords: Boolean): Grid[Entity, Params] = js.native
  def edit(id: String): Grid[Entity, Params] = js.native
  def expandAll(): Grid[Entity, Params] = js.native
  //get(position: number): Entity; //TODO: rename to getByPosition to avoid conflicts with jquery.get
  def getAll(): js.Array[Entity] = js.native
  def getAll(includeAllRecords: Boolean): js.Array[Entity] = js.native
  def getById(id: String): Entity = js.native
  def getCSV(): String = js.native
  def getCSV(includeAllRecords: Boolean): String = js.native
  def getChanges(): js.Array[Entity] = js.native
  def getSelected(): String = js.native
  def getSelections(): js.Array[String] = js.native
  def hideColumn(field: String): Grid[Entity, Params] = js.native
  def makeResponsive(): Grid[Entity, Params] = js.native
  def reload(): Grid[Entity, Params] = js.native
  def reload(params: Params): Grid[Entity, Params] = js.native
  def removeRow(id: String): Grid[Entity, Params] = js.native
  def render(response: js.Any): Grid[Entity, Params] = js.native
  def selectAll(): Grid[Entity, Params] = js.native
  def setSelected(id: String): Grid[Entity, Params] = js.native
  def setSelected(id: Double): Grid[Entity, Params] = js.native
  def showColumn(field: String): Grid[Entity, Params] = js.native
  def title(text: js.Any): js.Any = js.native
  def unSelectAll(): Grid[Entity, Params] = js.native
  def update(id: String): Grid[Entity, Params] = js.native
  def updateRow(id: String, record: Entity): Grid[Entity, Params] = js.native
}

