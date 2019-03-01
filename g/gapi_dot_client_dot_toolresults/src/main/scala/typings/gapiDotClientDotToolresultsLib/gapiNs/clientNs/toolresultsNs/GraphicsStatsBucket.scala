package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphicsStatsBucket extends js.Object {
  /** Number of frames in the bucket. */
  var frameCount: js.UndefOr[java.lang.String] = js.undefined
  /** Lower bound of render time in milliseconds. */
  var renderMillis: js.UndefOr[java.lang.String] = js.undefined
}

object GraphicsStatsBucket {
  @scala.inline
  def apply(frameCount: java.lang.String = null, renderMillis: java.lang.String = null): GraphicsStatsBucket = {
    val __obj = js.Dynamic.literal()
    if (frameCount != null) __obj.updateDynamic("frameCount")(frameCount)
    if (renderMillis != null) __obj.updateDynamic("renderMillis")(renderMillis)
    __obj.asInstanceOf[GraphicsStatsBucket]
  }
}

