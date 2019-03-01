package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublishListResult extends js.Object {
  // 描述
  var description: java.lang.String
  // 版本
  var version: java.lang.String
}

object GetPublishListResult {
  @scala.inline
  def apply(description: java.lang.String, version: java.lang.String): GetPublishListResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetPublishListResult]
  }
}

