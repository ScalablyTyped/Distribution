package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueCreativeSize extends js.Object {
  /** For video size type, the list of companion sizes. */
  var companionSizes: js.UndefOr[js.Array[TargetingValueSize]] = js.undefined
  /** The Creative size type. */
  var creativeSizeType: js.UndefOr[java.lang.String] = js.undefined
  /** The native template for native ad. */
  var nativeTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** For regular or video creative size type, specifies the size of the creative. */
  var size: js.UndefOr[TargetingValueSize] = js.undefined
  /** The skippable ad type for video size. */
  var skippableAdType: js.UndefOr[java.lang.String] = js.undefined
}

