package typings.expectDashPuppeteer

import typings.expectDashPuppeteer.expectDashPuppeteerMod._ExpectPolling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expectDashPuppeteerStrings {
  @js.native
  sealed trait mutation extends _ExpectPolling
  
  @js.native
  sealed trait raf extends _ExpectPolling
  
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def raf: raf = "raf".asInstanceOf[raf]
}

