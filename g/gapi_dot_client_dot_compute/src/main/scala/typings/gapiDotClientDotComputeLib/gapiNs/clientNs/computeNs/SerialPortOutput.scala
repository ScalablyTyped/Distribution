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

