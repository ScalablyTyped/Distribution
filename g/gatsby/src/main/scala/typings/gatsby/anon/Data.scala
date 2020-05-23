package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[DataType, PageContextType] extends js.Object {
  var data: DataType
  var pageContext: PageContextType
}

object Data {
  @scala.inline
  def apply[DataType, PageContextType](data: DataType, pageContext: PageContextType): Data[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[DataType, PageContextType]]
  }
}

