package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Solution-specific parameter available fo the add-on's use. This parameter is persisted with the
  * conference data and, if an update or delete is needed, is passed to the add-on. Example usage:
  *
  *     var conferenceParameter = ConferenceDataService.newConferenceParameter()
  *         .setKey('meetingId')
  *         .setValue('123456');
  */
@js.native
trait ConferenceParameter extends js.Object {
  /**
    * Sets the key of this ConferenceParameter. The maximum length for this field is 50
    * characters. Required.
    * https://developers.google.com/apps-script/reference/conference-data/conference-parameter#setKey(String)
    * @param key The key to set.
    */
  def setKey(key: String): ConferenceParameter = js.native
  /**
    * Sets the value of this ConferenceParameter. The maximum length for this field is 1024
    * characters. Required.
    * https://developers.google.com/apps-script/reference/conference-data/conference-parameter#setValue(String)
    * @param value The value to set.
    */
  def setValue(value: String): ConferenceParameter = js.native
}

object ConferenceParameter {
  @scala.inline
  def apply(setKey: String => ConferenceParameter, setValue: String => ConferenceParameter): ConferenceParameter = {
    val __obj = js.Dynamic.literal(setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ConferenceParameter]
  }
  @scala.inline
  implicit class ConferenceParameterOps[Self <: ConferenceParameter] (val x: Self) extends AnyVal {
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
    def setSetKey(value: String => ConferenceParameter): Self = this.set("setKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSetValue(value: String => ConferenceParameter): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
  
}

