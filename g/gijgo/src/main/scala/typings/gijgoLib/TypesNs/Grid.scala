package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[Entity, Params]
  extends gijgoLib.JQuery {
  def addRow(record: Entity): Grid[Entity, Params] = js.native
  def cancel(id: java.lang.String): Grid[Entity, Params] = js.native
  def clear(): Grid[Entity, Params] = js.native
  def clear(showNotFoundText: scala.Boolean): Grid[Entity, Params] = js.native
  def collapseAll(): Grid[Entity, Params] = js.native
  def count(): scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def destroy(keepTableTag: scala.Boolean): scala.Unit = js.native
  def destroy(keepTableTag: scala.Boolean, keepWrapperTag: scala.Boolean): scala.Unit = js.native
  def downloadCSV(): Grid[Entity, Params] = js.native
  def downloadCSV(filename: java.lang.String): Grid[Entity, Params] = js.native
  def downloadCSV(filename: java.lang.String, includeAllRecords: scala.Boolean): Grid[Entity, Params] = js.native
  def edit(id: java.lang.String): Grid[Entity, Params] = js.native
  def expandAll(): Grid[Entity, Params] = js.native
  //get(position: number): Entity; //TODO: rename to getByPosition to avoid conflicts with jquery.get
  def getAll(): js.Array[Entity] = js.native
  def getAll(includeAllRecords: scala.Boolean): js.Array[Entity] = js.native
  def getById(id: java.lang.String): Entity = js.native
  def getCSV(): java.lang.String = js.native
  def getCSV(includeAllRecords: scala.Boolean): java.lang.String = js.native
  def getChanges(): js.Array[Entity] = js.native
  def getSelected(): java.lang.String = js.native
  def getSelections(): js.Array[java.lang.String] = js.native
  def hideColumn(field: java.lang.String): Grid[Entity, Params] = js.native
  def makeResponsive(): Grid[Entity, Params] = js.native
  def reload(): Grid[Entity, Params] = js.native
  def reload(params: Params): Grid[Entity, Params] = js.native
  def removeRow(id: java.lang.String): Grid[Entity, Params] = js.native
  def render(response: js.Any): Grid[Entity, Params] = js.native
  def selectAll(): Grid[Entity, Params] = js.native
  def setSelected(id: java.lang.String): Grid[Entity, Params] = js.native
  def setSelected(id: scala.Double): Grid[Entity, Params] = js.native
  def showColumn(field: java.lang.String): Grid[Entity, Params] = js.native
  def title(text: js.Any): js.Any = js.native
  def unSelectAll(): Grid[Entity, Params] = js.native
  def update(id: java.lang.String): Grid[Entity, Params] = js.native
  def updateRow(id: java.lang.String, record: Entity): Grid[Entity, Params] = js.native
}

