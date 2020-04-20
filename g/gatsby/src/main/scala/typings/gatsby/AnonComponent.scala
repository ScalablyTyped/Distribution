package typings.gatsby

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent[DataType, PageContextType] extends js.Object {
  var component: Component[js.Object, js.Object, _]
  var json: AnonData[DataType, PageContextType]
  var page: AnonComponentChunkName
}

object AnonComponent {
  @scala.inline
  def apply[DataType, PageContextType](
    component: Component[js.Object, js.Object, _],
    json: AnonData[DataType, PageContextType],
    page: AnonComponentChunkName
  ): AnonComponent[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent[DataType, PageContextType]]
  }
}

