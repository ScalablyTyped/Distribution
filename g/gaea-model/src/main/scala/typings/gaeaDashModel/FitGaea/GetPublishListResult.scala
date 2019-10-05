package typings.gaeaDashModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublishListResult extends js.Object {
  // 描述
  var description: String
  // 版本
  var version: String
}

object GetPublishListResult {
  @scala.inline
  def apply(description: String, version: String): GetPublishListResult = {
    val __obj = js.Dynamic.literal(description = description, version = version)
  
    __obj.asInstanceOf[GetPublishListResult]
  }
}

