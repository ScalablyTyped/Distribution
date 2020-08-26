package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typings.firefoxWebextBrowser.browser.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpermissions extends js.Object {
  /* permissions events */
  /** Fired when the extension acquires new permissions. */
  val onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
  /** Fired when permissions are removed from the extension. */
  val onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
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
  @scala.inline
  implicit class TypeofpermissionsOps[Self <: Typeofpermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContains(value: AnyPermissions => js.Promise[Boolean]): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAll(value: () => js.Promise[AnyPermissions]): Self = this.set("getAll", js.Any.fromFunction0(value))
    @scala.inline
    def setOnAdded(value: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]): Self = this.set("onAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRemoved(value: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]): Self = this.set("onRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Permissions => js.Promise[Boolean]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRequest(value: Permissions => js.Promise[Boolean]): Self = this.set("request", js.Any.fromFunction1(value))
  }
  
}

