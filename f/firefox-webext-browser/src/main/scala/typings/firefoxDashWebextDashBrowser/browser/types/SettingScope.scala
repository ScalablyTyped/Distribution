package typings.firefoxDashWebextDashBrowser.browser.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* types types */
/**
  * The scope of the Setting. One of
  *
  * *   `regular`: setting for the regular profile (which is inherited by the incognito profile if not overridden
  * elsewhere),
  * *   `regular_only`: setting for the regular profile only (not inherited by the incognito profile),
  * *   `incognito_persistent`: setting for the incognito profile that survives browser restarts (overrides regular
  * preferences),
  * *   `incognito_session_only`: setting for the incognito profile that can only be set during an incognito session
  * and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
  *
  * Only `regular` is supported by Firefox at this time.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.regular
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.regular_only
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.incognito_persistent
  - typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.incognito_session_only
*/
trait SettingScope extends js.Object

object SettingScope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_persistent: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.incognito_persistent = this.cast("incognito_persistent")
  @scala.inline
  def incognito_session_only: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.regular = this.cast("regular")
  @scala.inline
  def regular_only: typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.regular_only = this.cast("regular_only")
}

