package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalActivatorSettings extends js.Object {
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[String]
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: Boolean
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: js.Any, close: Boolean, setter: js.Function): Unit
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: js.Any, newItem: js.Any, currentActivationData: js.Any, newActivationData: js.Any): Boolean
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: js.Any): js.Any
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: js.Any): Boolean
}

object DurandalActivatorSettings {
  @scala.inline
  def apply(
    affirmations: js.Array[String],
    afterDeactivate: (js.Any, Boolean, js.Function) => Unit,
    areSameItem: (js.Any, js.Any, js.Any, js.Any) => Boolean,
    beforeActivate: js.Any => js.Any,
    closeOnDeactivate: Boolean,
    interpretResponse: js.Any => Boolean
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations, afterDeactivate = js.Any.fromFunction3(afterDeactivate), areSameItem = js.Any.fromFunction4(areSameItem), beforeActivate = js.Any.fromFunction1(beforeActivate), closeOnDeactivate = closeOnDeactivate, interpretResponse = js.Any.fromFunction1(interpretResponse))
  
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
}

