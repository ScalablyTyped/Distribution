package typings.atExpoVectorDashIcons.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atExpoVectorDashIcons.atExpoVectorDashIconsMod.SimpleLineIconsNs.ToolbarAndroid
import typings.reactDashNativeDashVectorDashIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SimpleLineIconsNsToolbarAndroid
  extends ExternalComponentWithAttributesWithRefType[tag.type, ToolbarAndroid] {
  override val component: String | js.Object = js.constructorOf[typings.atExpoVectorDashIcons.atExpoVectorDashIconsMod.SimpleLineIconsNs.ToolbarAndroid].asInstanceOf[String | js.Object]
  def apply(
    iconColor: String,
    iconSize: Double,
    logoName: String,
    navIconName: String,
    overflowIconName: String
  ): BuildingComponent[tag.type, ToolbarAndroid] = {
    val __obj = js.Dynamic.literal(iconColor = iconColor, iconSize = iconSize, logoName = logoName, navIconName = navIconName, overflowIconName = overflowIconName)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ToolbarAndroidProps
}

