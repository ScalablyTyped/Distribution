package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typings.firefoxWebextBrowser.browser.permissions.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `optional_permissions`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object permissions {
  
  /** Check if the extension has the given permissions. */
  @JSGlobal("browser.permissions.contains")
  @js.native
  def contains(permissions: AnyPermissions): js.Promise[Boolean] = js.native
  
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  @JSGlobal("browser.permissions.getAll")
  @js.native
  def getAll(): js.Promise[AnyPermissions] = js.native
  
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
  @JSGlobal("browser.permissions.remove")
  @js.native
  def remove(permissions: Permissions): js.Promise[Boolean] = js.native
  
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  @JSGlobal("browser.permissions.request")
  @js.native
  def request(permissions: Permissions): js.Promise[Boolean] = js.native
}
