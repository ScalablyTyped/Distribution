package typings.durandal

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module is based on Backbone's core history support. It abstracts away the low level details of working with browser history and url changes in order to provide a solid foundation for a router.
  * @requires system
  * @requires jquery
  */
@JSImport("plugins/history", JSImport.Namespace)
@js.native
object historyMod extends js.Object {
  
  def activate(options: DurandalHistoryOptions): Boolean = js.native
  
  var active: Boolean = js.native
  
  def checkUrl(): Boolean = js.native
  
  def deactivate(): Unit = js.native
  
  def getFragment(fragment: String, forcePushState: Boolean): String = js.native
  
  def getHash(): String = js.native
  def getHash(window: Window): String = js.native
  
  var interval: Double = js.native
  
  def loadUrl(): Boolean = js.native
  
  def navigate(fragment: String): Boolean = js.native
  def navigate(fragment: String, options: DurandalNavigationOptions): Boolean = js.native
  def navigate(fragment: String, trigger: Boolean): Boolean = js.native
  
  def navigateBack(): Unit = js.native
}
