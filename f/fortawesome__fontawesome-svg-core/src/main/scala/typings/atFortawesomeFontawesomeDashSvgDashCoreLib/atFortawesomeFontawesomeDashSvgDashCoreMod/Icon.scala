package typings
package atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon
  extends atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconDefinition
     with FontawesomeObject
     with IconOrText {
  val `type`: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.icon
}

object Icon {
  @scala.inline
  def apply(
    `abstract`: js.Array[AbstractElement],
    html: js.Array[java.lang.String],
    icon: js.Tuple5[
      scala.Double, 
      scala.Double, 
      js.Array[java.lang.String], 
      java.lang.String, 
      java.lang.String
    ],
    iconName: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconName,
    node: stdLib.HTMLCollection,
    prefix: atFortawesomeFontawesomeDashCommonDashTypesLib.atFortawesomeFontawesomeDashCommonDashTypesMod.IconPrefix,
    `type`: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreLibStrings.icon
  ): Icon = {
    val __obj = js.Dynamic.literal(html = html, icon = icon, iconName = iconName, node = node, prefix = prefix)
    __obj.updateDynamic("abstract")(`abstract`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Icon]
  }
}

