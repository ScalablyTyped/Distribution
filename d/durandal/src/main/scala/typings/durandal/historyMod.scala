package typings.durandal

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("plugins/history", "activate")
  @js.native
  def activate(options: DurandalHistoryOptions): Boolean = js.native
  
  @JSImport("plugins/history", "active")
  @js.native
  def active: Boolean = js.native
  @scala.inline
  def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/history", "checkUrl")
  @js.native
  def checkUrl(): Boolean = js.native
  
  @JSImport("plugins/history", "deactivate")
  @js.native
  def deactivate(): Unit = js.native
  
  @JSImport("plugins/history", "getFragment")
  @js.native
  def getFragment(fragment: String, forcePushState: Boolean): String = js.native
  
  @JSImport("plugins/history", "getHash")
  @js.native
  def getHash(): String = js.native
  @JSImport("plugins/history", "getHash")
  @js.native
  def getHash(window: Window): String = js.native
  
  @JSImport("plugins/history", "interval")
  @js.native
  def interval: Double = js.native
  @scala.inline
  def interval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interval")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/history", "loadUrl")
  @js.native
  def loadUrl(): Boolean = js.native
  
  @JSImport("plugins/history", "navigate")
  @js.native
  def navigate(fragment: String): Boolean = js.native
  @JSImport("plugins/history", "navigate")
  @js.native
  def navigate(fragment: String, options: DurandalNavigationOptions): Boolean = js.native
  @JSImport("plugins/history", "navigate")
  @js.native
  def navigate(fragment: String, trigger: Boolean): Boolean = js.native
  
  @JSImport("plugins/history", "navigateBack")
  @js.native
  def navigateBack(): Unit = js.native
}
