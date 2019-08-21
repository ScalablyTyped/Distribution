package typings.figma

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Other
trait Image extends js.Object {
  val hash: String
  def getBytesAsync(): js.Promise[Uint8Array]
}

object Image {
  @scala.inline
  def apply(getBytesAsync: () => js.Promise[Uint8Array], hash: String): Image = {
    val __obj = js.Dynamic.literal(getBytesAsync = js.Any.fromFunction0(getBytesAsync), hash = hash)
  
    __obj.asInstanceOf[Image]
  }
}

