package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KanbanEdit extends js.Object {
  /** Add a new card in Kanban control when allowAdding is set as true. If parameters are not given default dialog will be open.
    * @param {string} Pass the primary key field Name of the column
    * @param {any[]} Pass the edited JSON data of card need to be add.
    * @returns {void}
    */
  def addCard(primaryKey: java.lang.String, card: js.Array[_]): scala.Unit = js.native
  /** Send a cancel request of add/edit card in Kanban when allowEditing/allowAdding is set as true.
    * @returns {void}
    */
  def cancelEdit(): scala.Unit = js.native
  /** Delete a card in Kanban control when allowAdding/allowEditing is set as true.
    * @param {string|number} Pass the key of card to be delete
    * @returns {void}
    */
  def deleteCard(Key: java.lang.String): scala.Unit = js.native
  def deleteCard(Key: scala.Double): scala.Unit = js.native
  /** Send a save request in Kanban when any card is in edit/new add card state and allowEditing/allowAdding is set as true.
    * @returns {void}
    */
  def endEdit(): scala.Unit = js.native
  /** Method used for set validation to a field during editing.
    * @param {string} Specify the name of the column to set validation rules
    * @param {any} Specify the validation rules for the field
    * @returns {void}
    */
  def setValidationToField(name: java.lang.String, rules: js.Any): scala.Unit = js.native
  /** Send an edit card request in Kanban when allowEditing is set as true. Parameter will be HTML element or primary key
    * @param {any} Pass the div selected row element to be edited in Kanban
    * @returns {void}
    */
  def startEdit($div: js.Any): scala.Unit = js.native
}

