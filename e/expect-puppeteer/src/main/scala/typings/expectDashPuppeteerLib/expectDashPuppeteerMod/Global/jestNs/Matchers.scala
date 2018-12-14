package typings
package expectDashPuppeteerLib.expectDashPuppeteerMod.Global.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-empty-interface
@js.native
trait Matchers[R] extends js.Object {
  // These must all match the ExpectPuppeteer interface above.
  // We can't extend from it directly because some method names conflict in type-incompatible ways.
  def toClick(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  // These must all match the ExpectPuppeteer interface above.
  // We can't extend from it directly because some method names conflict in type-incompatible ways.
  def toClick(
    selector: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectToClickOptions
  ): js.Promise[scala.Unit] = js.native
  def toDisplayDialog(block: js.Function0[js.Promise[scala.Unit]]): js.Promise[puppeteerLib.puppeteerMod.Dialog] = js.native
  def toFill(selector: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def toFill(
    selector: java.lang.String,
    value: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectTimingActions
  ): js.Promise[scala.Unit] = js.native
  def toFillForm(selector: java.lang.String, value: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[scala.Unit] = js.native
  def toFillForm(
    selector: java.lang.String,
    value: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectTimingActions
  ): js.Promise[scala.Unit] = js.native
  def toMatch(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  def toMatch(
    selector: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectTimingActions
  ): js.Promise[scala.Unit] = js.native
  def toMatchElement(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  def toMatchElement(
    selector: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectToClickOptions
  ): js.Promise[scala.Unit] = js.native
  def toSelect(selector: java.lang.String, valueOrText: java.lang.String): js.Promise[scala.Unit] = js.native
  def toSelect(
    selector: java.lang.String,
    valueOrText: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectTimingActions
  ): js.Promise[scala.Unit] = js.native
  def toUploadFile(selector: java.lang.String, filePath: java.lang.String): js.Promise[scala.Unit] = js.native
  def toUploadFile(
    selector: java.lang.String,
    filePath: java.lang.String,
    options: expectDashPuppeteerLib.expectDashPuppeteerMod.ExpectTimingActions
  ): js.Promise[scala.Unit] = js.native
}

