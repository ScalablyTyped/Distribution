package typings.fgLoadcss.mod

import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fg-loadcss", "loadCSS")
@js.native
object loadCSS extends js.Object {
  
  def apply(href: String): HTMLLinkElement = js.native
  def apply(
    href: String,
    before: js.UndefOr[scala.Nothing],
    media: js.UndefOr[scala.Nothing],
    attributes: Record[String, String]
  ): HTMLLinkElement = js.native
  def apply(href: String, before: js.UndefOr[scala.Nothing], media: String): HTMLLinkElement = js.native
  def apply(href: String, before: js.UndefOr[scala.Nothing], media: String, attributes: Record[String, String]): HTMLLinkElement = js.native
  def apply(href: String, before: HTMLElement): HTMLLinkElement = js.native
  def apply(
    href: String,
    before: HTMLElement,
    media: js.UndefOr[scala.Nothing],
    attributes: Record[String, String]
  ): HTMLLinkElement = js.native
  def apply(href: String, before: HTMLElement, media: String): HTMLLinkElement = js.native
  def apply(href: String, before: HTMLElement, media: String, attributes: Record[String, String]): HTMLLinkElement = js.native
}
