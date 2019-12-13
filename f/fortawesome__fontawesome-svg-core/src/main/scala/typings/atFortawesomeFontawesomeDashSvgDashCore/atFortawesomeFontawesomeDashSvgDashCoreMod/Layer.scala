package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends FontawesomeObject {
  val `type`: typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.layer
}

object Layer {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    node: HTMLCollection,
    `type`: typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.layer
  ): Layer = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "layer")
@js.native
object layer extends js.Object {
  def apply(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], Unit], 
      Unit
    ]
  ): Layer = js.native
  def apply(
    assembler: js.Function1[
      /* addLayerCallback */ js.Function1[/* layerToAdd */ IconOrText | js.Array[IconOrText], Unit], 
      Unit
    ],
    params: LayerParams
  ): Layer = js.native
}

