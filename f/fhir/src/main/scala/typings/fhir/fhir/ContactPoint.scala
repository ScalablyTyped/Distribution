package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a Technology mediated contact point (phone, fax, email, etc.)
  */
@js.native
trait ContactPoint extends Element {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Time period when the contact point was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Specify preferred order of use (1 = highest)
    */
  var rank: js.UndefOr[positiveInt] = js.native
  /**
    * phone | fax | email | pager | url | sms | other
    */
  var system: js.UndefOr[code] = js.native
  /**
    * home | work | temp | old | mobile - purpose of this contact point
    */
  var use: js.UndefOr[code] = js.native
  /**
    * The actual contact point details
    */
  var value: js.UndefOr[String] = js.native
}

object ContactPoint {
  @scala.inline
  def apply(): ContactPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactPoint]
  }
  @scala.inline
  implicit class ContactPointOps[Self <: ContactPoint] (val x: Self) extends AnyVal {
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
    def set_rank(value: Element): Self = this.set("_rank", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_rank: Self = this.set("_rank", js.undefined)
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def set_use(value: Element): Self = this.set("_use", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_use: Self = this.set("_use", js.undefined)
    @scala.inline
    def set_value(value: Element): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setRank(value: positiveInt): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    @scala.inline
    def setSystem(value: code): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setUse(value: code): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

