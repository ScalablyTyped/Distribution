package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.permissionsNs.AnyPermissions
import typings.firefoxDashWebextDashBrowser.browserNs.permissionsNs.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.undefined
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.undefined
  /** Check if the extension has the given permissions. */
  def contains(permissions: AnyPermissions): js.Promise[Boolean]
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[AnyPermissions]
  /** Relinquish the given permissions. */
  def remove(permissions: Permissions): js.Promise[Unit]
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: Permissions): js.Promise[Boolean]
}

object Typeofpermissions {
  @scala.inline
  def apply(
    contains: AnyPermissions => js.Promise[Boolean],
    getAll: () => js.Promise[AnyPermissions],
    remove: Permissions => js.Promise[Unit],
    request: Permissions => js.Promise[Boolean],
    onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = null,
    onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = null
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAll = js.Any.fromFunction0(getAll), remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request))
    if (onAdded != null) __obj.updateDynamic("onAdded")(onAdded)
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(onRemoved)
    __obj.asInstanceOf[Typeofpermissions]
  }
}

