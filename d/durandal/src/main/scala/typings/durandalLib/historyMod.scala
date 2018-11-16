package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * This module is based on Backbone's core history support. It abstracts away the low level details of working with browser history and url changes in order to provide a solid foundation for a router.
 * @requires system
 * @requires jquery
 */
@JSImport("plugins/history", JSImport.Namespace)
@js.native
object historyMod extends js.Object {
  var active: scala.Boolean = js.native
  var interval: scala.Double = js.native
  def activate(options: durandalLib.DurandalHistoryOptions): scala.Boolean = js.native
  def checkUrl(): scala.Boolean = js.native
  def deactivate(): scala.Unit = js.native
  def getFragment(fragment: java.lang.String, forcePushState: scala.Boolean): java.lang.String = js.native
  def getHash(): java.lang.String = js.native
  def getHash(window: stdLib.Window): java.lang.String = js.native
  def loadUrl(): scala.Boolean = js.native
  def navigate(fragment: java.lang.String): scala.Boolean = js.native
  def navigate(fragment: java.lang.String, options: durandalLib.DurandalNavigationOptions): scala.Boolean = js.native
  def navigate(fragment: java.lang.String, trigger: scala.Boolean): scala.Boolean = js.native
  def navigateBack(): scala.Unit = js.native
}

