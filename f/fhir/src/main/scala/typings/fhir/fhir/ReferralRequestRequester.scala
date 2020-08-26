package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who/what is requesting service
  */
@js.native
trait ReferralRequestRequester extends BackboneElement {
  /**
    * Individual making the request
    */
  var agent: Reference = js.native
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.native
}

object ReferralRequestRequester {
  @scala.inline
  def apply(agent: Reference): ReferralRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferralRequestRequester]
  }
  @scala.inline
  implicit class ReferralRequestRequesterOps[Self <: ReferralRequestRequester] (val x: Self) extends AnyVal {
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
    def setAgent(value: Reference): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnBehalfOf(value: Reference): Self = this.set("onBehalfOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBehalfOf: Self = this.set("onBehalfOf", js.undefined)
  }
  
}

