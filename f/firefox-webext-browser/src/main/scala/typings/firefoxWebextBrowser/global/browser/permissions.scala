package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typings.firefoxWebextBrowser.browser.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manifest keys: `optional_permissions`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.permissions")
@js.native
object permissions extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.native
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.native
  /** Check if the extension has the given permissions. */
  def contains(permissions: AnyPermissions): js.Promise[Boolean] = js.native
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[AnyPermissions] = js.native
  /** Relinquish the given permissions. */
  def remove(permissions: Permissions): js.Promise[Boolean] = js.native
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: Permissions): js.Promise[Boolean] = js.native
}

