package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The activator module encapsulates all logic related to screen/component activation.
 * An activator is essentially an asynchronous state machine that understands a particular state transition protocol.
 * The protocol ensures that the following series of events always occur: `canDeactivate` (previous state), `canActivate` (new state), `deactivate` (previous state), `activate` (new state).
 * Each of the _can_ callbacks may return a boolean, affirmative value or promise for one of those. If either of the _can_ functions yields a false result, then activation halts.
 * @requires system
 * @requires knockout
 */
@JSImport("durandal/activator", JSImport.Namespace)
@js.native
object activatorMod extends js.Object {
  var defaults: durandalLib.DurandalActivatorSettings = js.native
  def create[T](): durandalLib.DurandalActivator[T] = js.native
  def create[T](initialActiveItem: T): durandalLib.DurandalActivator[T] = js.native
  def create[T](initialActiveItem: T, settings: durandalLib.DurandalActivatorSettings): durandalLib.DurandalActivator[T] = js.native
  def isActivator(`object`: js.Any): scala.Boolean = js.native
}

