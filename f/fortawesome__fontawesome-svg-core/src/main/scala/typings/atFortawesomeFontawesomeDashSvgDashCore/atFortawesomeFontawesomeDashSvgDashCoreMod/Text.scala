package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreStrings.text
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends FontawesomeObject
     with IconOrText {
  val `type`: text
}

object Text {
  @scala.inline
  def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection, `type`: text): Text = {
    val __obj = js.Dynamic.literal(html = html, node = node)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Text]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "text")
@js.native
object text extends js.Object {
  def apply(content: String): Text = js.native
  def apply(content: String, params: TextParams): Text = js.native
}

