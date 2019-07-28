package typings.expectDashPuppeteer.expectDashPuppeteerMod.Global.jestNs

import org.scalablytyped.runtime.StringDictionary
import typings.expectDashPuppeteer.expectDashPuppeteerMod.ExpectTimingActions
import typings.expectDashPuppeteer.expectDashPuppeteerMod.ExpectToClickOptions
import typings.puppeteer.puppeteerMod.Dialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@js.native
trait Matchers[R] extends js.Object {
  // These must all match the ExpectPuppeteer interface above.
  // We can't extend from it directly because some method names conflict in type-incompatible ways.
  def toClick(selector: String): js.Promise[Unit] = js.native
  def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
  def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
  def toFill(selector: String, value: String): js.Promise[Unit] = js.native
  def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  def toFillForm(selector: String, value: StringDictionary[js.Any]): js.Promise[Unit] = js.native
  def toFillForm(selector: String, value: StringDictionary[js.Any], options: ExpectTimingActions): js.Promise[Unit] = js.native
  def toMatch(selector: String): js.Promise[Unit] = js.native
  def toMatch(selector: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  def toMatchElement(selector: String): js.Promise[Unit] = js.native
  def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
  def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
  def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
  def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
}

