package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Quota configuration helps to achieve fairness and budgeting in service
  * usage.  The metric based quota configuration works this way: - The service
  * configuration defines a set of metrics. - For API calls, the
  * quota.metric_rules maps methods to metrics with   corresponding costs. -
  * The quota.limits defines limits on the metrics, which will be used for
  * quota checks at runtime.  An example quota configuration in yaml format:
  * quota:      limits:       - name: apiWriteQpsPerProject        metric:
  * library.googleapis.com/write_calls        unit: &quot;1/min/{project}&quot;
  * # rate limit for consumer projects        values:          STANDARD: 10000
  * # The metric rules bind all methods to the read_calls metric,      # except
  * for the UpdateBook and DeleteBook methods. These two methods      # are
  * mapped to the write_calls metric, with the UpdateBook method      #
  * consuming at twice rate as the DeleteBook method.      metric_rules:      -
  * selector: &quot;*&quot;        metric_costs:
  * library.googleapis.com/read_calls: 1      - selector:
  * google.example.library.v1.LibraryService.UpdateBook        metric_costs:
  * library.googleapis.com/write_calls: 2      - selector:
  * google.example.library.v1.LibraryService.DeleteBook        metric_costs:
  * library.googleapis.com/write_calls: 1   Corresponding Metric definition:
  * metrics:      - name: library.googleapis.com/read_calls display_name: Read
  * requests        metric_kind: DELTA        value_type: INT64       - name:
  * library.googleapis.com/write_calls        display_name: Write requests
  * metric_kind: DELTA        value_type: INT64
  */
@js.native
trait Schema$Quota extends js.Object {
  /**
    * List of `QuotaLimit` definitions for the service.
    */
  var limits: js.UndefOr[js.Array[Schema$QuotaLimit]] = js.native
  /**
    * List of `MetricRule` definitions, each one mapping a selected method to
    * one or more metrics.
    */
  var metricRules: js.UndefOr[js.Array[Schema$MetricRule]] = js.native
}

object Schema$Quota {
  @scala.inline
  def apply(limits: js.Array[Schema$QuotaLimit] = null, metricRules: js.Array[Schema$MetricRule] = null): Schema$Quota = {
    val __obj = js.Dynamic.literal()
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (metricRules != null) __obj.updateDynamic("metricRules")(metricRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Quota]
  }
}

