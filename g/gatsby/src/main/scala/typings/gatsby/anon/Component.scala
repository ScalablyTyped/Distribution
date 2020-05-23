package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component[DataType, PageContextType] extends js.Object {
  var component: typings.react.mod.Component[js.Object, js.Object, _]
  var json: Data[DataType, PageContextType]
  var page: ComponentChunkName
}

object Component {
  @scala.inline
  def apply[DataType, PageContextType](
    component: typings.react.mod.Component[js.Object, js.Object, _],
    json: Data[DataType, PageContextType],
    page: ComponentChunkName
  ): Component[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component[DataType, PageContextType]]
  }
}

