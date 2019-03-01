package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaLimit extends js.Object {
  /**
    * Default number of tokens that can be consumed during the specified
    * duration. This is the number of tokens assigned when a client
    * application developer activates the service for his/her project.
    *
    * Specifying a value of 0 will block all requests. This can be used if you
    * are provisioning quota to selected consumers and blocking others.
    * Similarly, a value of -1 will indicate an unlimited quota. No other
    * negative values are allowed.
    *
    * Used by group-based quotas only.
    */
  var defaultLimit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. User-visible, extended description for this quota limit.
    * Should be used only when more context is needed to understand this limit
    * than provided by the limit's display name (see: `display_name`).
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User-visible display name for this limit.
    * Optional. If not set, the UI will provide a default display name based on
    * the quota configuration. This field can be used to override the default
    * display name generated from the configuration.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Duration of this limit in textual notation. Example: "100s", "24h", "1d".
    * For duration longer than a day, only multiple of days is supported. We
    * support only "100s" and "1d" for now. Additional support will be added in
    * the future. "0" indicates indefinite duration.
    *
    * Used by group-based quotas only.
    */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Free tier value displayed in the Developers Console for this limit.
    * The free tier is the number of tokens that will be subtracted from the
    * billed amount when billing is enabled.
    * This field can only be set on a limit with duration "1d", in a billable
    * group; it is invalid on any other limit. If this field is not set, it
    * defaults to 0, indicating that there is no free tier for this service.
    *
    * Used by group-based quotas only.
    */
  var freeTier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum number of tokens that can be consumed during the specified
    * duration. Client application developers can override the default limit up
    * to this maximum. If specified, this value cannot be set to a value less
    * than the default limit. If not specified, it is set to the default limit.
    *
    * To allow clients to apply overrides with no upper bound, set this to -1,
    * indicating unlimited maximum quota.
    *
    * Used by group-based quotas only.
    */
  var maxLimit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the metric this quota limit applies to. The quota limits with
    * the same metric will be checked together during runtime. The metric must be
    * defined within the service config.
    *
    * Used by metric-based quotas only.
    */
  var metric: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the quota limit. The name is used to refer to the limit when
    * overriding the default limit on per-consumer basis.
    *
    * For metric-based quota limits, the name must be provided, and it must be
    * unique within the service. The name can only include alphanumeric
    * characters as well as '-'.
    *
    * The maximum length of the limit name is 64 characters.
    *
    * The name of a limit is used as a unique identifier for this limit.
    * Therefore, once a limit has been put into use, its name should be
    * immutable. You can use the display_name field to provide a user-friendly
    * name for the limit. The display name can be evolved over time without
    * affecting the identity of the limit.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the unit of the quota limit. It uses the same syntax as
    * Metric.unit. The supported unit kinds are determined by the quota
    * backend system.
    *
    * The [Google Service Control](https://cloud.google.com/service-control)
    * supports the following unit components:
    * &#42; One of the time intevals:
    * &#42; "/min"  for quota every minute.
    * &#42; "/d"  for quota every 24 hours, starting 00:00 US Pacific Time.
    * &#42; Otherwise the quota won't be reset by time, such as storage limit.
    * &#42; One and only one of the granted containers:
    * &#42; "/{project}" quota for a project
    *
    * Here are some examples:
    * &#42; "1/min/{project}" for quota per minute per project.
    *
    * Note: the order of unit components is insignificant.
    * The "1" at the beginning is required to follow the metric unit syntax.
    *
    * Used by metric-based quotas only.
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** Tiered limit values, currently only STANDARD is supported. */
  var values: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object QuotaLimit {
  @scala.inline
  def apply(
    defaultLimit: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    duration: java.lang.String = null,
    freeTier: java.lang.String = null,
    maxLimit: java.lang.String = null,
    metric: java.lang.String = null,
    name: java.lang.String = null,
    unit: java.lang.String = null,
    values: stdLib.Record[java.lang.String, java.lang.String] = null
  ): QuotaLimit = {
    val __obj = js.Dynamic.literal()
    if (defaultLimit != null) __obj.updateDynamic("defaultLimit")(defaultLimit)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (freeTier != null) __obj.updateDynamic("freeTier")(freeTier)
    if (maxLimit != null) __obj.updateDynamic("maxLimit")(maxLimit)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    if (name != null) __obj.updateDynamic("name")(name)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QuotaLimit]
  }
}

