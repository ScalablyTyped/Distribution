package typings.gaeaModel

import typings.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeforeName extends js.Object {
  var beforeName: String
  // 重置前的信息
  var beforeProps: ComponentProps
}

object AnonBeforeName {
  @scala.inline
  def apply(beforeName: String, beforeProps: ComponentProps): AnonBeforeName = {
    val __obj = js.Dynamic.literal(beforeName = beforeName.asInstanceOf[js.Any], beforeProps = beforeProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeforeName]
  }
}

