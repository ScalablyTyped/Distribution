package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data extracted for a specific group based on certain filter criteria, such
  * as a given time period and/or service filter.
  */
@js.native
trait Schema$ErrorGroupStats extends js.Object {
  /**
    * Service contexts with a non-zero error count for the given filter
    * criteria. This list can be truncated if multiple services are affected.
    * Refer to `num_affected_services` for the total count.
    */
  var affectedServices: js.UndefOr[js.Array[Schema$ServiceContext]] = js.native
  /**
    * Approximate number of affected users in the given group that match the
    * filter criteria. Users are distinguished by data in the `ErrorContext` of
    * the individual error events, such as their login name or their remote IP
    * address in case of HTTP requests. The number of affected users can be
    * zero even if the number of errors is non-zero if no data was provided
    * from which the affected user could be deduced. Users are counted based on
    * data in the request context that was provided in the error report. If
    * more users are implicitly affected, such as due to a crash of the whole
    * service, this is not reflected here.
    */
  var affectedUsersCount: js.UndefOr[String] = js.native
  /**
    * Approximate total number of events in the given group that match the
    * filter criteria.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Approximate first occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var firstSeenTime: js.UndefOr[String] = js.native
  /**
    * Group data that is independent of the filter criteria.
    */
  var group: js.UndefOr[Schema$ErrorGroup] = js.native
  /**
    * Approximate last occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var lastSeenTime: js.UndefOr[String] = js.native
  /**
    * The total number of services with a non-zero error count for the given
    * filter criteria.
    */
  var numAffectedServices: js.UndefOr[Double] = js.native
  /**
    * An arbitrary event that is chosen as representative for the whole group.
    * The representative event is intended to be used as a quick preview for
    * the whole group. Events in the group are usually sufficiently similar to
    * each other such that showing an arbitrary representative provides insight
    * into the characteristics of the group as a whole.
    */
  var representative: js.UndefOr[Schema$ErrorEvent] = js.native
  /**
    * Approximate number of occurrences over time. Timed counts returned by
    * ListGroups are guaranteed to be:  - Inside the requested time interval -
    * Non-overlapping, and - Ordered by ascending time.
    */
  var timedCounts: js.UndefOr[js.Array[Schema$TimedCount]] = js.native
}

object Schema$ErrorGroupStats {
  @scala.inline
  def apply(
    affectedServices: js.Array[Schema$ServiceContext] = null,
    affectedUsersCount: String = null,
    count: String = null,
    firstSeenTime: String = null,
    group: Schema$ErrorGroup = null,
    lastSeenTime: String = null,
    numAffectedServices: Int | Double = null,
    representative: Schema$ErrorEvent = null,
    timedCounts: js.Array[Schema$TimedCount] = null
  ): Schema$ErrorGroupStats = {
    val __obj = js.Dynamic.literal()
    if (affectedServices != null) __obj.updateDynamic("affectedServices")(affectedServices.asInstanceOf[js.Any])
    if (affectedUsersCount != null) __obj.updateDynamic("affectedUsersCount")(affectedUsersCount.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (firstSeenTime != null) __obj.updateDynamic("firstSeenTime")(firstSeenTime.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (lastSeenTime != null) __obj.updateDynamic("lastSeenTime")(lastSeenTime.asInstanceOf[js.Any])
    if (numAffectedServices != null) __obj.updateDynamic("numAffectedServices")(numAffectedServices.asInstanceOf[js.Any])
    if (representative != null) __obj.updateDynamic("representative")(representative.asInstanceOf[js.Any])
    if (timedCounts != null) __obj.updateDynamic("timedCounts")(timedCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ErrorGroupStats]
  }
}

