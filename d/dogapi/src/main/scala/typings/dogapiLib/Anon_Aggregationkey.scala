package typings
package dogapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aggregationkey extends js.Object {
  var aggregation_key: js.UndefOr[java.lang.String] = js.undefined
  var alert_type: js.UndefOr[
    dogapiLib.dogapiLibStrings.error | dogapiLib.dogapiLibStrings.warning | dogapiLib.dogapiLibStrings.info | dogapiLib.dogapiLibStrings.success
  ] = js.undefined
  var date_happened: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[dogapiLib.dogapiLibStrings.normal | dogapiLib.dogapiLibStrings.low] = js.undefined
  var source_type_name: js.UndefOr[
    dogapiLib.dogapiLibStrings.nagios | dogapiLib.dogapiLibStrings.hudson | dogapiLib.dogapiLibStrings.jenkins | dogapiLib.dogapiLibStrings.user | (dogapiLib.dogapiLibStrings.`my apps`) | dogapiLib.dogapiLibStrings.feed | dogapiLib.dogapiLibStrings.chef | dogapiLib.dogapiLibStrings.puppet | dogapiLib.dogapiLibStrings.git | dogapiLib.dogapiLibStrings.bitbucket | dogapiLib.dogapiLibStrings.fabric | dogapiLib.dogapiLibStrings.capistrano
  ] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Aggregationkey {
  @scala.inline
  def apply(
    aggregation_key: java.lang.String = null,
    alert_type: dogapiLib.dogapiLibStrings.error | dogapiLib.dogapiLibStrings.warning | dogapiLib.dogapiLibStrings.info | dogapiLib.dogapiLibStrings.success = null,
    date_happened: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    priority: dogapiLib.dogapiLibStrings.normal | dogapiLib.dogapiLibStrings.low = null,
    source_type_name: dogapiLib.dogapiLibStrings.nagios | dogapiLib.dogapiLibStrings.hudson | dogapiLib.dogapiLibStrings.jenkins | dogapiLib.dogapiLibStrings.user | (dogapiLib.dogapiLibStrings.`my apps`) | dogapiLib.dogapiLibStrings.feed | dogapiLib.dogapiLibStrings.chef | dogapiLib.dogapiLibStrings.puppet | dogapiLib.dogapiLibStrings.git | dogapiLib.dogapiLibStrings.bitbucket | dogapiLib.dogapiLibStrings.fabric | dogapiLib.dogapiLibStrings.capistrano = null,
    tags: js.Array[java.lang.String] = null
  ): Anon_Aggregationkey = {
    val __obj = js.Dynamic.literal()
    if (aggregation_key != null) __obj.updateDynamic("aggregation_key")(aggregation_key)
    if (alert_type != null) __obj.updateDynamic("alert_type")(alert_type.asInstanceOf[js.Any])
    if (date_happened != null) __obj.updateDynamic("date_happened")(date_happened.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (source_type_name != null) __obj.updateDynamic("source_type_name")(source_type_name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Anon_Aggregationkey]
  }
}

