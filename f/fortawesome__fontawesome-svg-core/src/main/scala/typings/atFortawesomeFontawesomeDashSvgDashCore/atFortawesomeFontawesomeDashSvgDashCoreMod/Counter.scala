package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.counter
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends FontawesomeObject {
  val `type`: counter
}

object Counter {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: counter
  ): Counter = {
    val __obj = js.Dynamic.literal(html = html, node = node)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Counter]
  }
}

