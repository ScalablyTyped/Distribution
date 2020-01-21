package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TagCloud")
@js.native
class TagCloud_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.TagCloud.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.TagCloud.Model) = this()
  var defaults: typings.ejWebAll.ej.TagCloud.Model = js.native
  @JSName("model")
  var model_TagCloud_ : typings.ejWebAll.ej.TagCloud.Model = js.native
  /** Inserts a new item into the TagCloud
    * @param {string} Insert new item into the TagCloud
    * @returns {void}
    */
  def insert(name: String): Unit = js.native
  /** Inserts a new item into the TagCloud at a particular position.
    * @param {string} Inserts a new item into the TagCloud
    * @param {number} Inserts a new item into the TagCloud with the specified position
    * @returns {void}
    */
  def insertAt(name: String, position: Double): Unit = js.native
  /** Removes the item from the TagCloud based on the name. It removes all the tags which have the corresponding name
    * @param {string} name of the tag.
    * @returns {void}
    */
  def remove(name: String): Unit = js.native
  /** Removes the item from the TagCloud based on the position. It removes the tags from the the corresponding position only.
    * @param {number} position of tag item.
    * @returns {void}
    */
  def removeAt(position: Double): Unit = js.native
}

