package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  /* Value for aria-label on the clear <button> element. */
  var clear: String
  /* Value for aria-label on the down <button> element. */
  var down: String
  /* Value for aria-label on the up <button> element. */
  var up: String
}

object AnonClear {
  @scala.inline
  def apply(clear: String, down: String, up: String): AnonClear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClear]
  }
}

