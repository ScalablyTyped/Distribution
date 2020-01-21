package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalParameter extends js.Object {
  /**
    * 名称
    */
  var name: String
  /**
    * 类型
    * number string boolean
    */
  var `type`: String
}

object ExternalParameter {
  @scala.inline
  def apply(name: String, `type`: String): ExternalParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalParameter]
  }
}

