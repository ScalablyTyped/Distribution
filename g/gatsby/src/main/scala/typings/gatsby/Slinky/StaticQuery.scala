package typings.gatsby.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.gatsby.gatsbyMod.StaticQueryProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticQuery
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.gatsby.gatsbyMod.StaticQuery[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.gatsby.gatsbyMod.StaticQuery[js.Any]].asInstanceOf[String | js.Object]
  def apply[T](query: js.Any, render: T => ReactNode = null): BuildingComponent[tag.type, typings.gatsby.gatsbyMod.StaticQuery[js.Any]] = {
    val __obj = js.Dynamic.literal(query = query)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.gatsby.gatsbyMod.StaticQuery[js.Any]]]
  }
  type Props = StaticQueryProps[js.Any]
}

