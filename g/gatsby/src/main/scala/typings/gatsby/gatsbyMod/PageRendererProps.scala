package typings.gatsby.gatsbyMod

import typings.atReachRouter.atReachRouterMod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRendererProps extends js.Object {
  var location: WindowLocation
}

object PageRendererProps {
  @scala.inline
  def apply(location: WindowLocation): PageRendererProps = {
    val __obj = js.Dynamic.literal(location = location)
  
    __obj.asInstanceOf[PageRendererProps]
  }
}

