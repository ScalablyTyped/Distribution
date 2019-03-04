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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExternalParameter]
  }
}

