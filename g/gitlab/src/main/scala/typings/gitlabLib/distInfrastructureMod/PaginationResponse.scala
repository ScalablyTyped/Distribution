package typings
package gitlabLib.distInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationResponse extends js.Object {
  var data: js.Array[js.Object]
  var pagination: PaginationOptions
}

object PaginationResponse {
  @scala.inline
  def apply(data: js.Array[js.Object], pagination: PaginationOptions): PaginationResponse = {
    val __obj = js.Dynamic.literal(data = data, pagination = pagination)
  
    __obj.asInstanceOf[PaginationResponse]
  }
}

