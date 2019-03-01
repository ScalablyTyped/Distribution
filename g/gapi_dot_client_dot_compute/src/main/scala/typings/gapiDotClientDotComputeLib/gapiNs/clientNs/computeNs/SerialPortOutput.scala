package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialPortOutput extends js.Object {
  /** [Output Only] The contents of the console output. */
  var contents: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#serialPortOutput for serial port output. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The position of the next byte of content from the serial console output. Use this value in the next request as the start parameter. */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The starting byte position of the output that was returned. This should match the start parameter sent with the request. If the serial console output
    * exceeds the size of the buffer, older output will be overwritten by newer content and the start values will be mismatched.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object SerialPortOutput {
  @scala.inline
  def apply(
    contents: java.lang.String = null,
    kind: java.lang.String = null,
    next: java.lang.String = null,
    selfLink: java.lang.String = null,
    start: java.lang.String = null
  ): SerialPortOutput = {
    val __obj = js.Dynamic.literal()
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (next != null) __obj.updateDynamic("next")(next)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[SerialPortOutput]
  }
}

