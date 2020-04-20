package typings.devcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICaPath
  extends IReturnCaPath[js.Any] {
  var caPath: String
}

object ICaPath {
  @scala.inline
  def apply(caPath: String): ICaPath = {
    val __obj = js.Dynamic.literal(caPath = caPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICaPath]
  }
}

