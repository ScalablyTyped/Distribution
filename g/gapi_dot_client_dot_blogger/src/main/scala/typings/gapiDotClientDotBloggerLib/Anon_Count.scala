package typings
package gapiDotClientDotBloggerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  /** Count of page views for the given time range */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** Time range the given count applies to */
  var timeRange: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(count: java.lang.String = null, timeRange: java.lang.String = null): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (timeRange != null) __obj.updateDynamic("timeRange")(timeRange)
    __obj.asInstanceOf[Anon_Count]
  }
}

