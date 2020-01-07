package typings.googleapis.buildSrcApisSecuritycenterV1beta1Mod.securitycenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for grouping by assets.
  */
@js.native
trait Schema$GroupAssetsRequest extends js.Object {
  /**
    * When compare_duration is set, the Asset&#39;s &quot;state&quot; property
    * is updated to indicate whether the asset was added, removed, or remained
    * present during the compare_duration period of time that precedes the
    * read_time. This is the time between (read_time - compare_duration) and
    * read_time.  The state value is derived based on the presence of the asset
    * at the two points in time. Intermediate state changes between the two
    * times don&#39;t affect the result. For example, the results aren&#39;t
    * affected if the asset is removed and re-created again.  Possible
    * &quot;state&quot; values when compare_duration is specified:  *
    * &quot;ADDED&quot;: indicates that the asset was not present before
    * compare_duration, but present at reference_time. * &quot;REMOVED&quot;:
    * indicates that the asset was present at the start of compare_duration,
    * but not present at reference_time. * &quot;ACTIVE&quot;: indicates that
    * the asset was present at both the              start and the end of the
    * time period defined by              compare_duration and reference_time.
    * This field is ignored if `state` is not a field in `group_by`.
    */
  var compareDuration: js.UndefOr[String] = js.native
  /**
    * Expression that defines the filter to apply across assets. The expression
    * is a list of zero or more restrictions combined via logical operators
    * `AND` and `OR`. Parentheses are not supported, and `OR` has higher
    * precedence than `AND`.  Restrictions have the form `&lt;field&gt;
    * &lt;operator&gt; &lt;value&gt;` and may have a `-` character in front of
    * them to indicate negation. The fields map to those defined in the Asset
    * resource. Examples include:  * name *
    * security_center_properties.resource_name * resource_properties.a_property
    * * security_marks.marks.marka  The supported operators are:  * `=` for all
    * value types. * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values. *
    * `:`, meaning substring matching, for strings.  The supported value types
    * are:  * string literals in quotes. * integer literals without quotes. *
    * boolean literals `true` and `false` without quotes.  For example,
    * `resource_properties.size = 100` is a valid filter string.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Expression that defines what assets fields to use for grouping. The
    * string value should follow SQL syntax: comma separated list of fields.
    * For example:
    * &quot;security_center_properties.resource_project,security_center_properties.project&quot;.
    * The following fields are supported when compare_duration is not set:  *
    * security_center_properties.resource_project *
    * security_center_properties.resource_type *
    * security_center_properties.resource_parent  The following fields are
    * supported when compare_duration is set:  *
    * security_center_properties.resource_type
    */
  var groupBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `GroupAssetsResponse`; indicates that this
    * is a continuation of a prior `GroupAssets` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Time used as a reference point when filtering assets. The filter is
    * limited to assets existing at the supplied time and their values are
    * those at that specific time. Absence of this field will default to the
    * API&#39;s version of NOW.
    */
  var readTime: js.UndefOr[String] = js.native
}

object Schema$GroupAssetsRequest {
  @scala.inline
  def apply(
    compareDuration: String = null,
    filter: String = null,
    groupBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    readTime: String = null
  ): Schema$GroupAssetsRequest = {
    val __obj = js.Dynamic.literal()
    if (compareDuration != null) __obj.updateDynamic("compareDuration")(compareDuration.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupAssetsRequest]
  }
}

