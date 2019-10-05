package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Kanban.KanbanEdit
import typings.ejDotWebDotAll.ej.Kanban.KanbanFilter
import typings.ejDotWebDotAll.ej.Kanban.KanbanSelection
import typings.ejDotWebDotAll.ej.Kanban.KanbanSwimlane
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Kanban")
@js.native
class Kanban_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Kanban.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Kanban.Model) = this()
  var KanbanEdit: KanbanEdit = js.native
  var KanbanFilter: KanbanFilter = js.native
  var KanbanSelection: KanbanSelection = js.native
  var KanbanSwimlane: KanbanSwimlane = js.native
  var defaults: typings.ejDotWebDotAll.ej.Kanban.Model = js.native
  @JSName("model")
  var model_Kanban_ : typings.ejDotWebDotAll.ej.Kanban.Model = js.native
  def columns(columndetails: String, keyvalue: String): Unit = js.native
  def columns(columndetails: String, keyvalue: String, action: String): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[_]): Unit = js.native
  def columns(columndetails: String, keyvalue: js.Array[_], action: String): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: String): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: String, action: String): Unit = js.native
  /** Add or remove columns in Kanban columns collections.Default action is add.
    * @param {any[]|string} Pass array of columns or string of headerText to add/remove the column in Kanban
    * @param {any[]|string} Pass array of columns or string of key value to add/remove the column in Kanban
    * @param {string} optional Pass add/remove action to be performed. By default "add" action will perform
    * @returns {void}
    */
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_]): Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_], action: String): Unit = js.native
  /** Refresh the Kanban with new data source.
    * @param {any[]} Pass new data source to the Kanban
    * @returns {void}
    */
  def dataSource(datasource: js.Array[_]): Unit = js.native
  /** Get the column details based on the given header text in Kanban.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {string}
    */
  def getColumnByHeaderText(headerText: String): String = js.native
  /** Get the table details based on the given header table in Kanban.
    * @returns {string}
    */
  def getHeaderTable(): String = js.native
  /** Get the scroller object of Kanban.
    * @returns {ej.Scroller}
    */
  def getScrollObject(): Scroller = js.native
  /** Used for get the names of all the visible column name collections in Kanban.
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[_] = js.native
  def hideColumns(headerText: String): Unit = js.native
  /** Hide columns from the Kanban based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to hide
    * @returns {void}
    */
  def hideColumns(headerText: js.Array[_]): Unit = js.native
  /** Print the Kanban Board
    * @returns {void}
    */
  def print(): Unit = js.native
  /** Refresh the Kanban contents.The template refreshment is based on the argument passed along with this method
    * @param {boolean} optional When templateRefresh is set true, template and Kanban contents both are refreshed in Kanban else only Kanban content is refreshed
    * @returns {void}
    */
  def refresh(): Unit = js.native
  def refresh(templateRefresh: Boolean): Unit = js.native
  /** Refresh the template of the Kanban
    * @returns {void}
    */
  def refreshTemplate(): Unit = js.native
  def showColumns(headerText: String): Unit = js.native
  /** Show columns in the Kanban based on the header text.
    * @param {any[]|string} You can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[_]): Unit = js.native
  /** Expand or collapse the card based on the state of target &quot;div&quot;
    * @param {string|number} Pass the id of card to be toggle
    * @returns {void}
    */
  def toggleCard(key: String): Unit = js.native
  def toggleCard(key: Double): Unit = js.native
  /** toggleColumn based on the headerText in Kanban.
    * @param {any} Pass the header text of the column to get the corresponding column object
    * @returns {void}
    */
  def toggleColumn(headerText: js.Any): Unit = js.native
  /** Update a card in Kanban control based on key and JSON data given.
    * @param {string} Pass the key field Name of the column
    * @param {any[]} Pass the edited JSON data of card need to be update.
    * @returns {void}
    */
  def updateCard(key: String, data: js.Array[_]): Unit = js.native
}

