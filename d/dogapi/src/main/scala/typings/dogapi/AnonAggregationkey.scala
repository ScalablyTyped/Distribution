package typings.dogapi

import typings.dogapi.dogapiStrings.`my apps`
import typings.dogapi.dogapiStrings.bitbucket
import typings.dogapi.dogapiStrings.capistrano
import typings.dogapi.dogapiStrings.chef
import typings.dogapi.dogapiStrings.error
import typings.dogapi.dogapiStrings.fabric
import typings.dogapi.dogapiStrings.feed
import typings.dogapi.dogapiStrings.git
import typings.dogapi.dogapiStrings.hudson
import typings.dogapi.dogapiStrings.info
import typings.dogapi.dogapiStrings.jenkins
import typings.dogapi.dogapiStrings.low
import typings.dogapi.dogapiStrings.nagios
import typings.dogapi.dogapiStrings.normal
import typings.dogapi.dogapiStrings.puppet
import typings.dogapi.dogapiStrings.success
import typings.dogapi.dogapiStrings.user
import typings.dogapi.dogapiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAggregationkey extends js.Object {
  var aggregation_key: js.UndefOr[String] = js.undefined
  var alert_type: js.UndefOr[error | warning | info | success] = js.undefined
  var date_happened: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[normal | low] = js.undefined
  var source_type_name: js.UndefOr[
    nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano
  ] = js.undefined
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAggregationkey {
  @scala.inline
  def apply(
    aggregation_key: String = null,
    alert_type: error | warning | info | success = null,
    date_happened: Int | Double = null,
    host: String = null,
    priority: normal | low = null,
    source_type_name: nagios | hudson | jenkins | user | (`my apps`) | feed | chef | puppet | git | bitbucket | fabric | capistrano = null,
    tags: js.Array[String] = null
  ): AnonAggregationkey = {
    val __obj = js.Dynamic.literal()
    if (aggregation_key != null) __obj.updateDynamic("aggregation_key")(aggregation_key.asInstanceOf[js.Any])
    if (alert_type != null) __obj.updateDynamic("alert_type")(alert_type.asInstanceOf[js.Any])
    if (date_happened != null) __obj.updateDynamic("date_happened")(date_happened.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source_type_name != null) __obj.updateDynamic("source_type_name")(source_type_name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAggregationkey]
  }
}

