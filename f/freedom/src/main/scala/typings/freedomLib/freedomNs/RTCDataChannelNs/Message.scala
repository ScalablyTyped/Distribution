package typings
package freedomLib.freedomNs.RTCDataChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Message extends js.Object {
  var binary: js.UndefOr[stdLib.Blob] = js.undefined
  var buffer: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  // Exactly one of the below must be specified.
  var text: js.UndefOr[java.lang.String] = js.undefined
}

