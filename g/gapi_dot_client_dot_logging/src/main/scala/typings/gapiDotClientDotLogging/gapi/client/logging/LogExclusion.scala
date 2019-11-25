package typings.gapiDotClientDotLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogExclusion extends js.Object {
  /** Optional. A description of this exclusion. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can use exclusions.patch to change the value of
    * this field.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Required. An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the
    * matching log entries. For example, the following filter matches 99% of low-severity log entries from load balancers:
    * "resource.type=http_load_balancer severity<ERROR sample(insertId, 0.99)"
    */
  var filter: js.UndefOr[String] = js.undefined
  /**
    * Required. A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters,
    * digits, underscores, hyphens, and periods.
    */
  var name: js.UndefOr[String] = js.undefined
}

object LogExclusion {
  @scala.inline
  def apply(
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: String = null,
    name: String = null
  ): LogExclusion = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogExclusion]
  }
}

