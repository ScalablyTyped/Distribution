package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * places elements of this node list relative to the first element matched
  * by queryOrNode. Returns the original NodeList. See: dojo/dom-construct.place
  *
  * @param queryOrNode may be a string representing any valid CSS3 selector or a DOM node.In the selector case, only the first matching element will be usedfor relative positioning.
  * @param position can be one of:"last" (default)"first""before""after""only""replace"or an offset in the childNodes property
  */
@js.native
trait place extends js.Object {
  def apply(queryOrNode: String, position: String): js.Any = js.native
  def apply(queryOrNode: HTMLElement, position: String): js.Any = js.native
}

