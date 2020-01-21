package typings.firebase.mod.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * Gets the value as a boolean.
    *
    * The following values (case insensitive) are interpreted as true:
    * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
    */
  def asBoolean(): Boolean
  /**
    * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
    */
  def asNumber(): Double
  /**
    * Gets the value as a string.
    */
  def asString(): String
  /**
    * Gets the {@link ValueSource} for the given key.
    */
  def getSource(): ValueSource
}

object Value {
  @scala.inline
  def apply(
    asBoolean: () => Boolean,
    asNumber: () => Double,
    asString: () => String,
    getSource: () => ValueSource
  ): Value = {
    val __obj = js.Dynamic.literal(asBoolean = js.Any.fromFunction0(asBoolean), asNumber = js.Any.fromFunction0(asNumber), asString = js.Any.fromFunction0(asString), getSource = js.Any.fromFunction0(getSource))
  
    __obj.asInstanceOf[Value]
  }
}

