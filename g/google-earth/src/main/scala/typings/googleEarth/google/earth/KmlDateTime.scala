package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlDateTime extends js.Object {
  /**
    * Returns the date and time in XML Schema time format.
    */
  def get(): String = js.native
  /**
    * Set the date.  Accepts only XML Schema time (see XML Schema Part 2: Datatypes Second Edition).
    * The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time,
    * and the time zone is either Z(for UTC) or zzzzzz, which represents +/-hh:mm in relation to UTC.
    * Additionally, the value can be expressed as a date only.
    */
  def set(date: String): Unit = js.native
}

object KmlDateTime {
  @scala.inline
  def apply(get: () => String, set: String => Unit): KmlDateTime = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[KmlDateTime]
  }
  @scala.inline
  implicit class KmlDateTimeOps[Self <: KmlDateTime] (val x: Self) extends AnyVal {
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
    def setGet(value: () => String): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: String => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

