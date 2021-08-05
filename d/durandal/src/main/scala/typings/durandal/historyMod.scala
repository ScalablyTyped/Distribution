package typings.durandal

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module is based on Backbone's core history support. It abstracts away the low level details of working with browser history and url changes in order to provide a solid foundation for a router.
  * @requires system
  * @requires jquery
  */
object historyMod {
  
  @JSImport("plugins/history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def activate(options: DurandalHistoryOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("plugins/history", "active")
  @js.native
  def active: Boolean = js.native
  inline def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
  
  inline def checkUrl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUrl")().asInstanceOf[Boolean]
  
  inline def deactivate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivate")().asInstanceOf[Unit]
  
  inline def getFragment(fragment: String, forcePushState: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragment")(fragment.asInstanceOf[js.Any], forcePushState.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getHash(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")().asInstanceOf[String]
  inline def getHash(window: Window): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHash")(window.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("plugins/history", "interval")
  @js.native
  def interval: Double = js.native
  inline def interval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
  
  inline def loadUrl(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loadUrl")().asInstanceOf[Boolean]
  
  inline def navigate(fragment: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(fragment.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def navigate(fragment: String, options: DurandalNavigationOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(fragment.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def navigate(fragment: String, trigger: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(fragment.asInstanceOf[js.Any], trigger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def navigateBack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")().asInstanceOf[Unit]
}
