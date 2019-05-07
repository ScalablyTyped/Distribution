package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends FontawesomeObject {
  val `type`: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.layer
}

object Layer {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[java.lang.String],
    node: stdLib.HTMLCollection,
    `type`: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.layer
  ): Layer = {
    val __obj = js.Dynamic.literal(html = html, node = node)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Layer]
  }
}

