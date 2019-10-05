package typings.dojo.dojox.dtl.ext_dojo.NodeList

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * appends the content to every node in the NodeList.
  * The content will be cloned if the length of NodeList
  * is greater than 1. Only the DOM nodes are cloned, not
  * any attached event handlers.
  *
  * @param content
  */
@js.native
trait append extends js.Object {
  def apply(content: String): js.Any = js.native
  def apply(content: typings.dojo.dojox.dtl.ext_dojo.NodeList): js.Any = js.native
  def apply(content: HTMLElement): js.Any = js.native
}

