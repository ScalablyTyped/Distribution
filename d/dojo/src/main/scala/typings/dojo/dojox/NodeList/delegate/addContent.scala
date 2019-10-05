package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * add a node, NodeList or some HTML as a string to every item in the
  * list.  Returns the original list.
  * a copy of the HTML content is added to each item in the
  * list, with an optional position argument. If no position
  * argument is provided, the content is appended to the end of
  * each item.
  *
  * @param content the content to be set on the parent element.This can be an html string, a node reference or a NodeList, dojo/NodeList, Array or other enumerable list of nodes
  * @param position               Optionalcan be one of:"last"||"end" (default)"first||"start""before""after""replace" (replaces nodes in this NodeList with new content)"only" (removes other children of the nodes so new content is the only child)or an offset in the childNodes property
  */
@js.native
trait addContent extends js.Object {
  def apply(content: String, position: String): js.Function = js.native
  def apply(content: String, position: Double): js.Function = js.native
  def apply(content: js.Object, position: String): js.Function = js.native
  def apply(content: js.Object, position: Double): js.Function = js.native
  def apply(content: typings.dojo.dojo.NodeList, position: String): js.Function = js.native
  def apply(content: typings.dojo.dojo.NodeList, position: Double): js.Function = js.native
  def apply(content: HTMLElement, position: String): js.Function = js.native
  def apply(content: HTMLElement, position: Double): js.Function = js.native
}

