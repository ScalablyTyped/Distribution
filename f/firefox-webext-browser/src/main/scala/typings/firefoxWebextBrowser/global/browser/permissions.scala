package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typings.firefoxWebextBrowser.browser.permissions.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `optional_permissions`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object permissions {
  
  @JSGlobal("browser.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  /** Check if the extension has the given permissions. */
  @scala.inline
  def contains(permissions: AnyPermissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  @scala.inline
  def getAll(): js.Promise[AnyPermissions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[AnyPermissions]]
  
  /* permissions events */
  /** Fired when the extension acquires new permissions. */
  @JSGlobal("browser.permissions.onAdded")
  @js.native
  val onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
  
  /** Fired when permissions are removed from the extension. */
  @JSGlobal("browser.permissions.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
  
  /** Relinquish the given permissions. */
  @scala.inline
  def remove(permissions: Permissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  @scala.inline
  def request(permissions: Permissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
