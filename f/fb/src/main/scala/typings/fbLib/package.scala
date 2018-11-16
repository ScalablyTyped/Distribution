package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fbLib {
  type ApiMethod = fbLib.fbLibStrings.get | fbLib.fbLibStrings.post | fbLib.fbLibStrings.delete
  type LoginStatus = fbLib.fbLibStrings.connected | fbLib.fbLibStrings.not_authorized | fbLib.fbLibStrings.unknown
}
