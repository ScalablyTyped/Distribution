package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * places any/all elements in queryOrListOrNode at a
  * position relative to the first element in this list.
  * Returns a dojo/NodeList of the adopted elements.
  *
  * @param queryOrListOrNode a DOM node or a query string or a query result.Represents the nodes to be adopted relative to thefirst element of this NodeList.
  * @param position               Optionalcan be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
  */
@js.native
trait adopt extends js.Object {
  def apply(queryOrListOrNode: String, position: String): js.Any = js.native
  def apply(queryOrListOrNode: js.Array[_], position: String): js.Any = js.native
  def apply(queryOrListOrNode: HTMLElement, position: String): js.Any = js.native
}

