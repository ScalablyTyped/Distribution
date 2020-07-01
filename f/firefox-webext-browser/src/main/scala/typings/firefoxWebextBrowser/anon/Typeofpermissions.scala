package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typings.firefoxWebextBrowser.browser.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  /* permissions events */
  /** Fired when the extension acquires new permissions. */
  val onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]
  /** Fired when permissions are removed from the extension. */
  val onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]
  /** Check if the extension has the given permissions. */
  def contains(permissions: AnyPermissions): js.Promise[Boolean]
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[AnyPermissions]
  /** Relinquish the given permissions. */
  def remove(permissions: Permissions): js.Promise[Boolean]
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
    onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]],
    onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]],
    remove: Permissions => js.Promise[Boolean],
    request: Permissions => js.Promise[Boolean]
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAll = js.Any.fromFunction0(getAll), onAdded = onAdded.asInstanceOf[js.Any], onRemoved = onRemoved.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[Typeofpermissions]
  }
}

