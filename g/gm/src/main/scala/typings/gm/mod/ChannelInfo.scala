package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelInfo[T] extends js.Object {
  var Blue: T
  var Green: T
  var Red: T
}

object ChannelInfo {
  @scala.inline
  def apply[T](Blue: T, Green: T, Red: T): ChannelInfo[T] = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo[T]]
  }
}

