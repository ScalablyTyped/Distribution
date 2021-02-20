package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.topSites.GetOptions
import typings.firefoxWebextBrowser.browser.topSites.MostVisitedURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
  *
  * Permissions: `topSites`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object topSites {
  
  /* topSites functions */
  /** Gets a list of top sites. */
  @JSGlobal("browser.topSites.get")
  @js.native
  def get(): js.Promise[js.Array[MostVisitedURL]] = js.native
  @JSGlobal("browser.topSites.get")
  @js.native
  def get(options: GetOptions): js.Promise[js.Array[MostVisitedURL]] = js.native
}
