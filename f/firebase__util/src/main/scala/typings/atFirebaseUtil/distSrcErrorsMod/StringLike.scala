package typings.atFirebaseUtil.distSrcErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLike extends js.Object

object StringLike {
  @scala.inline
  def apply(toString: () => String): StringLike = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[StringLike]
  }
}

