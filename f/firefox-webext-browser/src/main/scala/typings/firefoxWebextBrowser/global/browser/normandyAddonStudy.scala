package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normandy Study API
  *
  * Permissions: `normandyAddonStudy`
  */
object normandyAddonStudy {
  
  @JSGlobal("browser.normandyAddonStudy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Marks the study as ended and then uninstalls the addon.
    * @param reason The reason why the study is ending.
    */
  inline def endStudy(reason: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("endStudy")(reason.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  /** Returns an object with metadata about the client which may be required for constructing survey URLs. */
  inline def getClientMetadata(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientMetadata")().asInstanceOf[js.Promise[js.Any]]
  
  /* normandyAddonStudy functions */
  /** Returns a study object for the current study. */
  inline def getStudy(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStudy")().asInstanceOf[js.Promise[js.Any]]
  
  /* normandyAddonStudy events */
  /**
    * Fired when a user unenrolls from a study but before the addon is uninstalled.
    * @param reason The reason why the study is ending.
    */
  @JSGlobal("browser.normandyAddonStudy.onUnenroll")
  @js.native
  val onUnenroll: WebExtEvent[js.Function1[/* reason */ String, Unit]] = js.native
}
