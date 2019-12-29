package typings.emberDashData.emberDashDataMod.DS

import typings.atEmberArray.dashPrivateEnumerableMod.Enumerable
import typings.atEmberObject.atEmberObjectMod.default
import typings.atEmberObject.eventedMod.Evented
import typings.ember.emberMod.default.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds validation errors for a given record, organized by attribute names.
  */
@JSImport("ember-data", "DS.Errors")
@js.native
class Errors ()
  extends default
     with Enumerable[js.Any]
     with Evented {
  var isEmpty: ComputedProperty[Boolean, Boolean] = js.native
  /**
    * Total number of errors.
    */
  var length: ComputedProperty[Double, Double] = js.native
  /**
    * An array containing all of the error messages for this
    * record. This is useful for displaying all errors to the user.
    */
  var messages: ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def add(attribute: String, messages: String): js.Any = js.native
  /**
    * DEPRECATED:
    * Adds error messages to a given attribute and sends
    * `becameInvalid` event to the record.
    */
  def add(attribute: String, messages: js.Array[_]): js.Any = js.native
  /**
    * DEPRECATED:
    * Removes all error messages and sends `becameValid` event
    * to the record.
    */
  def clear(): js.Any = js.native
  /**
    * Returns errors for a given attribute
    */
  def errorsFor(attribute: String): js.Array[_] = js.native
  /**
    * DEPRECATED:
    * Register with target handler
    */
  def registerHandlers(target: js.Object, becameInvalid: js.Function, becameValid: js.Function): js.Any = js.native
  /**
    * DEPRECATED:
    * Removes all error messages from the given attribute and sends
    * `becameValid` event to the record if there no more errors left.
    */
  def remove(attribute: String): js.Any = js.native
}

