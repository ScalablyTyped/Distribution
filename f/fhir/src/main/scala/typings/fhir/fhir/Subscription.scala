package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server push subscription criteria
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Subscription extends DomainResource {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'error'.
    */
  var _error: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'reason'.
    */
  var _reason: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The channel on which to report matches to the criteria
    */
  var channel: SubscriptionChannel = js.native
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.native
  /**
    * Rule for server push criteria
    */
  var criteria: String = js.native
  /**
    * When to automatically delete the subscription
    */
  var end: js.UndefOr[instant] = js.native
  /**
    * Latest error note
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Description of why this subscription was created
    */
  var reason: String = js.native
  /**
    * requested | active | error | off
    */
  var status: code = js.native
  /**
    * A tag to add to matching resources
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.native
}

object Subscription {
  @scala.inline
  def apply(channel: SubscriptionChannel, criteria: String, reason: String, status: code): Subscription = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
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
    def setChannel(value: SubscriptionChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCriteria(value: String): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_criteria(value: Element): Self = this.set("_criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_criteria: Self = this.set("_criteria", js.undefined)
    @scala.inline
    def set_end(value: Element): Self = this.set("_end", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_end: Self = this.set("_end", js.undefined)
    @scala.inline
    def set_error(value: Element): Self = this.set("_error", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_error: Self = this.set("_error", js.undefined)
    @scala.inline
    def set_reason(value: Element): Self = this.set("_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_reason: Self = this.set("_reason", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = this.set("contact", js.Array(value :_*))
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setEnd(value: instant): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setTagVarargs(value: Coding*): Self = this.set("tag", js.Array(value :_*))
    @scala.inline
    def setTag(value: js.Array[Coding]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

