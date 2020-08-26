package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogExclusion extends js.Object {
  /** Optional. A description of this exclusion. */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can use exclusions.patch to change the value of
    * this field.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Required. An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the
    * matching log entries. For example, the following filter matches 99% of low-severity log entries from load balancers:
    * "resource.type=http_load_balancer severity<ERROR sample(insertId, 0.99)"
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Required. A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters,
    * digits, underscores, hyphens, and periods.
    */
  var name: js.UndefOr[String] = js.native
}

object LogExclusion {
  @scala.inline
  def apply(): LogExclusion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogExclusion]
  }
  @scala.inline
  implicit class LogExclusionOps[Self <: LogExclusion] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

