package typings.fortawesomeFontawesomeSvgCore.mod

import typings.fortawesomeFontawesomeCommonTypes.mod.IconDefinition
import typings.fortawesomeFontawesomeCommonTypes.mod.IconName
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPathData
import typings.fortawesomeFontawesomeCommonTypes.mod.IconPrefix
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon_
  extends IconDefinition
     with FontawesomeObject
     with IconOrText {
  val `type`: typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.icon
}

object Icon_ {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[String],
    icon: js.Tuple5[Double, Double, js.Array[String], String, IconPathData],
    iconName: IconName,
    node: HTMLCollection,
    prefix: IconPrefix,
    `type`: typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.icon
  ): Icon_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconName = iconName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon_]
  }
}

