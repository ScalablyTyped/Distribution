package typings.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonError
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
  extends TopLevel[WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ AnonError, Unit]]]

