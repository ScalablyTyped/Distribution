package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalParameter extends js.Object {
  /**
    * 名称
    */
  var name: java.lang.String
  /**
    * 类型
    * number string boolean
    */
  var `type`: java.lang.String
}

object ExternalParameter {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): ExternalParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ExternalParameter]
  }
}

