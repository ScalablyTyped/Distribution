package typings.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  @JSName("$ref")
  var $ref: String
}

object Ref {
  @scala.inline
  def apply($ref: String): Ref = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

