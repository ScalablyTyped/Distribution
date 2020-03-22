package typings.devcert.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICaBuffer
  extends IReturnCa[js.Any] {
  var ca: Buffer
}

object ICaBuffer {
  @scala.inline
  def apply(ca: Buffer): ICaBuffer = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICaBuffer]
  }
}

