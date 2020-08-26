package typings.firebaseRemoteConfigTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /**
    * Gets the value as a boolean.
    *
    * The following values (case insensitive) are interpreted as true:
    * "1", "true", "t", "yes", "y", "on". Other values are interpreted as false.
    */
  def asBoolean(): Boolean = js.native
  /**
    * Gets the value as a number. Comparable to calling <code>Number(value) || 0</code>.
    */
  def asNumber(): Double = js.native
  /**
    * Gets the value as a string.
    */
  def asString(): String = js.native
  /**
    * Gets the {@link ValueSource} for the given key.
    */
  def getSource(): ValueSource = js.native
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
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsBoolean(value: () => Boolean): Self = this.set("asBoolean", js.Any.fromFunction0(value))
    @scala.inline
    def setAsNumber(value: () => Double): Self = this.set("asNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setAsString(value: () => String): Self = this.set("asString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSource(value: () => ValueSource): Self = this.set("getSource", js.Any.fromFunction0(value))
  }
  
}

