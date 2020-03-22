package typings.expoFont.fontTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontResource extends js.Object {
  var uri: String | Double
}

object FontResource {
  @scala.inline
  def apply(uri: String | Double): FontResource = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontResource]
  }
}

