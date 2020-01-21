package typings.fastHtmlParser.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  val attributes: Attributes = js.native
  val childNodes: js.Array[HTMLElement] = js.native
  val classNames: js.Array[String] = js.native
  val firstChild: HTMLElement = js.native
  val id: String = js.native
  val isWhitespace: Boolean = js.native
  val lastChild: HTMLElement = js.native
  val nodeType: NodeType = js.native
  val rawAttributes: Attributes = js.native
  val rawAttrs: String = js.native
  val rawText: String = js.native
  val structure: String = js.native
  val structuredText: String = js.native
  val tagName: String = js.native
  val text: String = js.native
  def appendChild(node: HTMLElement): HTMLElement = js.native
  def querySelector(selector: String): HTMLElement = js.native
  def querySelectorAll(selector: String): js.Array[HTMLElement] = js.native
  def removeWhitespace(): HTMLElement = js.native
  def trimRight(): HTMLElement = js.native
  def trimRight(pattern: RegExp): HTMLElement = js.native
}

