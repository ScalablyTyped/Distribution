package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or
  * the user aborted the navigation.
  */
@JSGlobal("browser.webNavigation.onErrorOccurred")
@js.native
object onErrorOccurred
  extends TopLevel[_WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ Anon_Error, Unit]]]

