package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetricDescriptor extends js.Object {
  /** A detailed description of the metric, which can be used in documentation. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A concise name for the metric, which can be displayed in user interfaces. Use sentence case without an ending period, for example "Request count". This
               * field is optional but it is recommended to be set for any metrics associated with user-visible concepts, such as Quota.
               */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The set of labels that can be used to describe a specific instance of this metric type. For example, the
               * appengine.googleapis.com/http/server/response_latencies metric type has a label for the HTTP response code, response_code, so you can look at latencies
               * for successful responses or just for responses that failed.
               */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  /** Whether the metric records instantaneous values, changes to a value, etc. Some combinations of metric_kind and value_type might not be supported. */
  var metricKind: js.UndefOr[java.lang.String] = js.undefined
  /** The resource name of the metric descriptor. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The metric type, including its DNS name prefix. The type is not URL-encoded. All user-defined custom metric types have the DNS name
               * custom.googleapis.com. Metric types should use a natural hierarchical grouping. For example:
               * "custom.googleapis.com/invoice/paid/amount"
               * "appengine.googleapis.com/http/server/response_latencies"
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The unit in which the metric value is reported. It is only applicable if the value_type is INT64, DOUBLE, or DISTRIBUTION. The supported units are a
               * subset of The Unified Code for Units of Measure (http://unitsofmeasure.org/ucum.html) standard:Basic units (UNIT)
               * bit bit
               * By byte
               * s second
               * min minute
               * h hour
               * d dayPrefixes (PREFIX)
               * k kilo (10&#42;&#42;3)
               * M mega (10&#42;&#42;6)
               * G giga (10&#42;&#42;9)
               * T tera (10&#42;&#42;12)
               * P peta (10&#42;&#42;15)
               * E exa (10&#42;&#42;18)
               * Z zetta (10&#42;&#42;21)
               * Y yotta (10&#42;&#42;24)
               * m milli (10&#42;&#42;-3)
               * u micro (10&#42;&#42;-6)
               * n nano (10&#42;&#42;-9)
               * p pico (10&#42;&#42;-12)
               * f femto (10&#42;&#42;-15)
               * a atto (10&#42;&#42;-18)
               * z zepto (10&#42;&#42;-21)
               * y yocto (10&#42;&#42;-24)
               * Ki kibi (2&#42;&#42;10)
               * Mi mebi (2&#42;&#42;20)
               * Gi gibi (2&#42;&#42;30)
               * Ti tebi (2&#42;&#42;40)GrammarThe grammar includes the dimensionless unit 1, such as 1/s.The grammar also includes these connectors:
               * / division (as an infix operator, e.g. 1/s).
               * . multiplication (as an infix operator, e.g. GBy.d)The grammar for a unit is as follows:
               * Expression = Component { "." Component } { "/" Component } ;
               *
               * Component = [ PREFIX ] UNIT [ Annotation ]
               * | Annotation
               * | "1"
               * ;
               *
               * Annotation = "{" NAME "}" ;
               * Notes:
               * Annotation is just a comment if it follows a UNIT and is  equivalent to 1 if it is used alone. For examples,  {requests}/s == 1/s, By{transmitted}/s ==
               * By/s.
               * NAME is a sequence of non-blank printable ASCII characters not  containing '{' or '}'.
               */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the measurement is an integer, a floating-point number, etc. Some combinations of metric_kind and value_type might not be supported. */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

