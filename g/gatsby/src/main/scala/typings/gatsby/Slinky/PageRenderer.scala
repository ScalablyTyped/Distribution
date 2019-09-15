package typings.gatsby.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.WindowLocation
import typings.gatsby.gatsbyMod.PageRendererProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageRenderer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.gatsby.gatsbyMod.PageRenderer] {
  override val component: String | js.Object = js.constructorOf[typings.gatsby.gatsbyMod.PageRenderer].asInstanceOf[String | js.Object]
  def apply(location: WindowLocation): BuildingComponent[tag.type, typings.gatsby.gatsbyMod.PageRenderer] = {
    val __obj = js.Dynamic.literal(location = location)
  
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PageRendererProps
}

