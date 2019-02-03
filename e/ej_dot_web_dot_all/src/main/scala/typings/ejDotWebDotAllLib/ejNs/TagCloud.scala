package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TagCloud")
@js.native
class TagCloud protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.TagCloudNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.TagCloudNs.Model) = this()
  var defaults: ejDotWebDotAllLib.ejNs.TagCloudNs.Model = js.native
  @JSName("model")
  var model_TagCloud: ejDotWebDotAllLib.ejNs.TagCloudNs.Model = js.native
  /** Inserts a new item into the TagCloud
    * @param {string} Insert new item into the TagCloud
    * @returns {void}
    */
  def insert(name: java.lang.String): scala.Unit = js.native
  /** Inserts a new item into the TagCloud at a particular position.
    * @param {string} Inserts a new item into the TagCloud
    * @param {number} Inserts a new item into the TagCloud with the specified position
    * @returns {void}
    */
  def insertAt(name: java.lang.String, position: scala.Double): scala.Unit = js.native
  /** Removes the item from the TagCloud based on the name. It removes all the tags which have the corresponding name
    * @param {string} name of the tag.
    * @returns {void}
    */
  def remove(name: java.lang.String): scala.Unit = js.native
  /** Removes the item from the TagCloud based on the position. It removes the tags from the the corresponding position only.
    * @param {number} position of tag item.
    * @returns {void}
    */
  def removeAt(position: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("ej.TagCloud")
@js.native
object TagCloud extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.TagCloud = js.native
}

