package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normandy Study API
  *
  * Permissions: `normandyAddonStudy`
  */
object normandyAddonStudy {
  
  /**
    * Marks the study as ended and then uninstalls the addon.
    * @param reason The reason why the study is ending.
    */
  @JSGlobal("browser.normandyAddonStudy.endStudy")
  @js.native
  def endStudy(reason: String): js.Promise[_] = js.native
  
  /** Returns an object with metadata about the client which may be required for constructing survey URLs. */
  @JSGlobal("browser.normandyAddonStudy.getClientMetadata")
  @js.native
  def getClientMetadata(): js.Promise[_] = js.native
  
  /* normandyAddonStudy functions */
  /** Returns a study object for the current study. */
  @JSGlobal("browser.normandyAddonStudy.getStudy")
  @js.native
  def getStudy(): js.Promise[_] = js.native
  
  /* normandyAddonStudy events */
  /**
    * Fired when a user unenrolls from a study but before the addon is uninstalled.
    * @param reason The reason why the study is ending.
    */
  @JSGlobal("browser.normandyAddonStudy.onUnenroll")
  @js.native
  val onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]] = js.native
}
