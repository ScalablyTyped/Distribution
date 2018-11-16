package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyRange extends js.Object {
  /**
               * If the end is closed, then the range includes all rows whose
               * first `len(end_closed)` key columns exactly match `end_closed`.
               */
  var endClosed: js.UndefOr[js.Array[_]] = js.undefined
  /**
               * If the end is open, then the range excludes rows whose first
               * `len(end_open)` key columns exactly match `end_open`.
               */
  var endOpen: js.UndefOr[js.Array[_]] = js.undefined
  /**
               * If the start is closed, then the range includes all rows whose
               * first `len(start_closed)` key columns exactly match `start_closed`.
               */
  var startClosed: js.UndefOr[js.Array[_]] = js.undefined
  /**
               * If the start is open, then the range excludes rows whose first
               * `len(start_open)` key columns exactly match `start_open`.
               */
  var startOpen: js.UndefOr[js.Array[_]] = js.undefined
}

