package typings
package gapiDotClientDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Rects extends js.Object {
  /** The placeholder key for this arg, as a string. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. If this is absent
                   * for a SNAPSHOT_RECT argument, it means that that argument refers to the entire snapshot.
                   */
  var rects: js.UndefOr[js.Array[Anon_Top]] = js.undefined
  /** Secondary screen rectangles being referred to, with dimensions measured in CSS pixels. This is only ever used for SNAPSHOT_RECT arguments. */
  var secondary_rects: js.UndefOr[js.Array[Anon_Top]] = js.undefined
  /** Type of argument. One of URL, STRING_LITERAL, INT_LITERAL, BYTES, DURATION, VERBATIM_STRING, PERCENTAGE, HYPERLINK, or SNAPSHOT_RECT. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Argument value, as a localized string. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

