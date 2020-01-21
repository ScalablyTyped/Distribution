package typings.firefoxWebextBrowser.browser.extension

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extension properties */
/**
  * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If no error has
  * occured lastError will be `undefined`.
  */
@JSGlobal("browser.extension.lastError")
@js.native
object lastError
  extends TopLevel[js.UndefOr[AnonMessage]]

