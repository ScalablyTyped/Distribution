package typings.expectPuppeteer.mod

import typings.puppeteer.mod.ElementHandle
import typings.puppeteer.mod.Page
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect-puppeteer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(instance: ElementHandle[Element]): ExpectPuppeteer = js.native
  def apply(instance: Page): ExpectPuppeteer = js.native
}

