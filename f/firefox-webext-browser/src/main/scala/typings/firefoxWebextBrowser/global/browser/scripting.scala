package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.browser.scripting.CSSInjection
import typings.firefoxWebextBrowser.browser.scripting.ContentScriptFilter
import typings.firefoxWebextBrowser.browser.scripting.InjectionResult
import typings.firefoxWebextBrowser.browser.scripting.RegisteredContentScript
import typings.firefoxWebextBrowser.browser.scripting.ScriptInjection
import typings.firefoxWebextBrowser.browser.scripting.UpdateContentScriptsScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the scripting API to execute script in different contexts.
  *
  * Permissions: `scripting`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object scripting {
  
  @JSGlobal("browser.scripting")
  @js.native
  val ^ : js.Any = js.native
  
  /* scripting functions */
  /**
    * Injects a script into a target context. The script will be run at `document_idle`.
    * @param injection The details of the script which to inject.
    */
  inline def executeScript(injection: ScriptInjection): js.Promise[js.Array[InjectionResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[InjectionResult]]]
  
  /**
    * Returns all dynamically registered content scripts for this extension that match the given filter.
    * @param [filter] An object to filter the extension's dynamically registered scripts.
    */
  inline def getRegisteredContentScripts(): js.Promise[js.Array[RegisteredContentScript]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")().asInstanceOf[js.Promise[js.Array[RegisteredContentScript]]]
  inline def getRegisteredContentScripts(filter: ContentScriptFilter): js.Promise[js.Array[RegisteredContentScript]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RegisteredContentScript]]]
  
  /**
    * Inserts a CSS stylesheet into a target context. If multiple frames are specified, unsuccessful injections are ignored.
    * @param injection The details of the styles to insert.
    */
  inline def insertCSS(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Registers one or more content scripts for this extension.
    * @param scripts Contains a list of scripts to be registered. If there are errors during script parsing/file validation, or if the IDs specified already exist, then no scripts are registered.
    */
  inline def registerContentScripts(scripts: js.Array[RegisteredContentScript]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerContentScripts")(scripts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Removes a CSS stylesheet that was previously inserted by this extension from a target context.
    * @param injection The details of the styles to remove. Note that the `css`, `files`, and `origin` properties must exactly match the stylesheet inserted through `insertCSS`. Attempting to remove a non-existent stylesheet is a no-op.
    */
  inline def removeCSS(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Unregisters one or more content scripts for this extension.
    * @param [filter] If specified, only unregisters dynamic content scripts which match the filter. Otherwise, all of the extension's dynamic content scripts are unregistered.
    */
  inline def unregisterContentScripts(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")().asInstanceOf[js.Promise[Unit]]
  inline def unregisterContentScripts(filter: ContentScriptFilter): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Updates one or more content scripts for this extension.
    * @param scripts Contains a list of scripts to be updated. If there are errors during script parsing/file validation, or if the IDs specified do not already exist, then no scripts are updated.
    */
  inline def updateContentScripts(scripts: js.Array[UpdateContentScriptsScripts]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateContentScripts")(scripts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
