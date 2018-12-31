package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalActivator[T]
  extends knockoutLib.KnockoutComputed[T] {
  /**
    * An observable which indicates whether or not the activator is currently in the process of activating an instance.
    * @returns {boolean}
    */
  @JSName("isActivating")
  var isActivating_Original: knockoutLib.KnockoutObservable[scala.Boolean] = js.native
  /**
    * The settings for this activator.
    */
  var settings: DurandalActivatorSettings = js.native
  /**
    * Activates the activator, in its current state.
    * @returns {promise}
    */
  def activate(): DurandalPromise[scala.Boolean] = js.native
  /**
    * Activates the specified item.
    * @param {object} newItem The item to activate.
    * @param {object} newActivationData Data associated with the activation.
    * @returns {promise}
    */
  def activateItem(newItem: T): DurandalPromise[scala.Boolean] = js.native
  def activateItem(newItem: T, activationData: js.Any): DurandalPromise[scala.Boolean] = js.native
  /**
    * Determines whether or not the activator, in its current state, can be activated.
    * @returns {promise}
    */
  def canActivate(): DurandalPromise[scala.Boolean] = js.native
  /**
    * Determines whether or not the specified item can be activated.
    * @param {object} item The item to check.
    * @param {object} activationData Data associated with the activation.
    * @returns {promise}
    */
  def canActivateItem(newItem: T): DurandalPromise[scala.Boolean] = js.native
  def canActivateItem(newItem: T, activationData: js.Any): DurandalPromise[scala.Boolean] = js.native
  /**
    * Determines whether or not the activator, in its current state, can be deactivated.
    * @returns {promise}
    */
  def canDeactivate(close: scala.Boolean): DurandalPromise[scala.Boolean] = js.native
  /**
    * Determines whether or not the specified item can be deactivated.
    * @param {object} item The item to check.
    * @param {boolean} close Whether or not to check if close is possible.
    * @returns {promise}
    */
  def canDeactivateItem(item: T, close: scala.Boolean): DurandalPromise[scala.Boolean] = js.native
  /**
    * Deactivates the activator, in its current state.
    * @returns {promise}
    */
  def deactivate(close: scala.Boolean): DurandalPromise[scala.Boolean] = js.native
  /**
    * Deactivates the specified item.
    * @param {object} item The item to deactivate.
    * @param {boolean} close Whether or not to close the item.
    * @returns {promise}
    */
  def deactivateItem(item: T, close: scala.Boolean): DurandalPromise[scala.Boolean] = js.native
  /**
    * Sets up a collection representing a pool of objects which the activator will activate. See below for details. Activators without an item bool always close their values on deactivate. Activators with an items pool only deactivate, but do not close them.
    */
  def forItems(items: js.Array[_]): DurandalActivator[T] = js.native
  /**
    * Adds canActivate, activate, canDeactivate and deactivate functions to the provided model which pass through to the corresponding functions on the activator.
    */
  def includeIn(includeIn: js.Any): scala.Unit = js.native
  /**
    * An observable which indicates whether or not the activator is currently in the process of activating an instance.
    * @returns {boolean}
    */
  def isActivating(): scala.Boolean = js.native
  /**
    * An observable which indicates whether or not the activator is currently in the process of activating an instance.
    * @returns {boolean}
    */
  def isActivating(value: scala.Boolean): scala.Unit = js.native
}

