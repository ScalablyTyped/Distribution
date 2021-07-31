package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<T> * / any */ @js.native
trait DurandalActivator[T] extends StObject {
  
  /**
    * Activates the activator, in its current state.
    * @returns {promise}
    */
  def activate(): DurandalPromise[Boolean] = js.native
  
  /**
    * Activates the specified item.
    * @param {object} newItem The item to activate.
    * @param {object} newActivationData Data associated with the activation.
    * @returns {promise}
    */
  def activateItem(newItem: T): DurandalPromise[Boolean] = js.native
  def activateItem(newItem: T, activationData: js.Any): DurandalPromise[Boolean] = js.native
  
  /**
    * Determines whether or not the activator, in its current state, can be activated.
    * @returns {promise}
    */
  def canActivate(): DurandalPromise[Boolean] = js.native
  
  /**
    * Determines whether or not the specified item can be activated.
    * @param {object} item The item to check.
    * @param {object} activationData Data associated with the activation.
    * @returns {promise}
    */
  def canActivateItem(newItem: T): DurandalPromise[Boolean] = js.native
  def canActivateItem(newItem: T, activationData: js.Any): DurandalPromise[Boolean] = js.native
  
  /**
    * Determines whether or not the activator, in its current state, can be deactivated.
    * @returns {promise}
    */
  def canDeactivate(close: Boolean): DurandalPromise[Boolean] = js.native
  
  /**
    * Determines whether or not the specified item can be deactivated.
    * @param {object} item The item to check.
    * @param {boolean} close Whether or not to check if close is possible.
    * @returns {promise}
    */
  def canDeactivateItem(item: T, close: Boolean): DurandalPromise[Boolean] = js.native
  
  /**
    * Deactivates the activator, in its current state.
    * @returns {promise}
    */
  def deactivate(close: Boolean): DurandalPromise[Boolean] = js.native
  
  /**
    * Deactivates the specified item.
    * @param {object} item The item to deactivate.
    * @param {boolean} close Whether or not to close the item.
    * @returns {promise}
    */
  def deactivateItem(item: T, close: Boolean): DurandalPromise[Boolean] = js.native
  
  /**
    * Sets up a collection representing a pool of objects which the activator will activate. See below for details. Activators without an item bool always close their values on deactivate. Activators with an items pool only deactivate, but do not close them.
    */
  def forItems(items: js.Array[js.Any]): DurandalActivator[T] = js.native
  
  /**
    * Adds canActivate, activate, canDeactivate and deactivate functions to the provided model which pass through to the corresponding functions on the activator.
    */
  def includeIn(includeIn: js.Any): Unit = js.native
  
  /**
    * An observable which indicates whether or not the activator is currently in the process of activating an instance.
    * @returns {boolean}
    */
  var isActivating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  
  /**
    * The settings for this activator.
    */
  var settings: DurandalActivatorSettings = js.native
}
