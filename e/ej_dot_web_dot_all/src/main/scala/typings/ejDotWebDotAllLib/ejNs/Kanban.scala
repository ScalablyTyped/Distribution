package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Kanban")
@js.native
class Kanban protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.KanbanNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.KanbanNs.Model) = this()
  var KanbanEdit: ejDotWebDotAllLib.ejNs.KanbanNs.KanbanEdit = js.native
  var KanbanFilter: ejDotWebDotAllLib.ejNs.KanbanNs.KanbanFilter = js.native
  var KanbanSelection: ejDotWebDotAllLib.ejNs.KanbanNs.KanbanSelection = js.native
  var KanbanSwimlane: ejDotWebDotAllLib.ejNs.KanbanNs.KanbanSwimlane = js.native
  var defaults: ejDotWebDotAllLib.ejNs.KanbanNs.Model = js.native
  @JSName("model")
  var model_Kanban: ejDotWebDotAllLib.ejNs.KanbanNs.Model = js.native
  def columns(columndetails: java.lang.String, keyvalue: java.lang.String): scala.Unit = js.native
  def columns(columndetails: java.lang.String, keyvalue: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def columns(columndetails: java.lang.String, keyvalue: js.Array[_]): scala.Unit = js.native
  def columns(columndetails: java.lang.String, keyvalue: js.Array[_], action: java.lang.String): scala.Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: java.lang.String): scala.Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: java.lang.String, action: java.lang.String): scala.Unit = js.native
  /** Add or remove columns in Kanban columns collections.Default action is add.
    * @param {any[]|string} Pass array of columns or string of headerText to add/remove the column in Kanban
    * @param {any[]|string} Pass array of columns or string of key value to add/remove the column in Kanban
    * @param {string} optional Pass add/remove action to be performed. By default "add" action will perform
    * @returns {void}
    */
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_]): scala.Unit = js.native
  def columns(columndetails: js.Array[_], keyvalue: js.Array[_], action: java.lang.String): scala.Unit = js.native
  /** Refresh the Kanban with new data source.
    * @param {any[]} Pass new data source to the Kanban
    * @returns {void}
    */
  def dataSource(datasource: js.Array[_]): scala.Unit = js.native
  /** Get the column details based on the given header text in Kanban.
    * @param {string} Pass the header text of the column to get the corresponding column object
    * @returns {string}
    */
  def getColumnByHeaderText(headerText: java.lang.String): java.lang.String = js.native
  /** Get the table details based on the given header table in Kanban.
    * @returns {string}
    */
  def getHeaderTable(): java.lang.String = js.native
  /** Get the scroller object of Kanban.
    * @returns {ej.Scroller}
    */
  def getScrollObject(): Scroller = js.native
  /** Used for get the names of all the visible column name collections in Kanban.
    * @returns {any[]}
    */
  def getVisibleColumnNames(): js.Array[_] = js.native
  def hideColumns(headerText: java.lang.String): scala.Unit = js.native
  /** Hide columns from the Kanban based on the header text
    * @param {any[]|string} you can pass either array of header text of various columns or a header text of a column to hide
    * @returns {void}
    */
  def hideColumns(headerText: js.Array[_]): scala.Unit = js.native
  /** Print the Kanban Board
    * @returns {void}
    */
  def print(): scala.Unit = js.native
  /** Refresh the Kanban contents.The template refreshment is based on the argument passed along with this method
    * @param {boolean} optional When templateRefresh is set true, template and Kanban contents both are refreshed in Kanban else only Kanban content is refreshed
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  def refresh(templateRefresh: scala.Boolean): scala.Unit = js.native
  /** Refresh the template of the Kanban
    * @returns {void}
    */
  def refreshTemplate(): scala.Unit = js.native
  def showColumns(headerText: java.lang.String): scala.Unit = js.native
  /** Show columns in the Kanban based on the header text.
    * @param {any[]|string} You can pass either array of header text of various columns or a header text of a column to show
    * @returns {void}
    */
  def showColumns(headerText: js.Array[_]): scala.Unit = js.native
  /** Expand or collapse the card based on the state of target &quot;div&quot;
    * @param {string|number} Pass the id of card to be toggle
    * @returns {void}
    */
  def toggleCard(key: java.lang.String): scala.Unit = js.native
  def toggleCard(key: scala.Double): scala.Unit = js.native
  /** toggleColumn based on the headerText in Kanban.
    * @param {any} Pass the header text of the column to get the corresponding column object
    * @returns {void}
    */
  def toggleColumn(headerText: js.Any): scala.Unit = js.native
  /** Update a card in Kanban control based on key and JSON data given.
    * @param {string} Pass the key field Name of the column
    * @param {any[]} Pass the edited JSON data of card need to be update.
    * @returns {void}
    */
  def updateCard(key: java.lang.String, data: js.Array[_]): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.Kanban")
@js.native
object Kanban extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Kanban = js.native
}

