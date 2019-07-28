package typings.fb

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FBSDKXFBML extends js.Object {
  /* This function parses and renders XFBML markup in a document on the fly. */
  def parse(): Unit = js.native
  def parse(ParseElement: Element): Unit = js.native
  def parse(ParseElement: HTMLElement): Unit = js.native
}

