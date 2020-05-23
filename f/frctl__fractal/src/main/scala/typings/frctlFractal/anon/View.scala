package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var handle: String
  var view: String
}

object View {
  @scala.inline
  def apply(handle: String, view: String): View = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
}

