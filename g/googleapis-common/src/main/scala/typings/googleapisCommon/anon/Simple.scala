package typings.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Simple extends js.Object {
  var simple: Path
}

object Simple {
  @scala.inline
  def apply(simple: Path): Simple = {
    val __obj = js.Dynamic.literal(simple = simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Simple]
  }
}

