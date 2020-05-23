package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRenderer extends js.Object {
  /* private */ def render(gauge: Gauge): String
}

object TextRenderer {
  @scala.inline
  def apply(render: Gauge => String): TextRenderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[TextRenderer]
  }
}

