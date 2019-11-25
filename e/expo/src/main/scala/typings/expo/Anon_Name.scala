package typings.expo

import typings.expo.buildARMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String | Null
  var size: Size
}

object Anon_Name {
  @scala.inline
  def apply(size: Size, name: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

