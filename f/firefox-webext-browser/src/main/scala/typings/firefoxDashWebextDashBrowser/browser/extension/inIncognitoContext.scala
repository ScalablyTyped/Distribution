package typings.firefoxDashWebextDashBrowser.browser.extension

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * True for content scripts running inside incognito tabs, and for extension pages running inside an incognito
  * process. The latter only applies to extensions with 'split' incognito_behavior.
  */
@JSGlobal("browser.extension.inIncognitoContext")
@js.native
object inIncognitoContext
  extends TopLevel[js.UndefOr[Boolean]]

