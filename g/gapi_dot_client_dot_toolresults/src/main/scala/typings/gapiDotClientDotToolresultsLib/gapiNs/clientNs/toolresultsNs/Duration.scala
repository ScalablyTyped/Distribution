package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Duration extends js.Object {
  /**
               * Signed fractions of a second at nanosecond resolution of the span of time. Durations less than one second are represented with a 0 `seconds` field and
               * a positive or negative `nanos` field. For durations of one second or more, a non-zero value for the `nanos` field must be of the same sign as the
               * `seconds` field. Must be from -999,999,999 to +999,999,999 inclusive.
               */
  var nanos: js.UndefOr[scala.Double] = js.undefined
  /**
               * Signed seconds of the span of time. Must be from -315,576,000,000 to +315,576,000,000 inclusive. Note: these bounds are computed from: 60 sec/min &#42; 60
               * min/hr &#42; 24 hr/day &#42; 365.25 days/year &#42; 10000 years
               */
  var seconds: js.UndefOr[java.lang.String] = js.undefined
}

