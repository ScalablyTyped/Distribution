package typings.figma.mod._Global_

import typings.figma.figmaStrings.NONE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorPath extends js.Object {
  val data: String
  val windingRule: WindingRule | NONE
}

object VectorPath {
  @scala.inline
  def apply(data: String, windingRule: WindingRule | NONE): VectorPath = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VectorPath]
  }
}

