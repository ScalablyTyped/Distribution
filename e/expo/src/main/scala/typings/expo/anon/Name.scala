package typings.expo.anon

import typings.expo.aRMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String | Null
  var size: Size
}

object Name {
  @scala.inline
  def apply(size: Size, name: String = null): Name = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

