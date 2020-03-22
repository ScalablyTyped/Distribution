package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[DataType, PageContextType] extends js.Object {
  var data: DataType
  var pageContext: PageContextType
}

object AnonData {
  @scala.inline
  def apply[DataType, PageContextType](data: DataType, pageContext: PageContextType): AnonData[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData[DataType, PageContextType]]
  }
}

