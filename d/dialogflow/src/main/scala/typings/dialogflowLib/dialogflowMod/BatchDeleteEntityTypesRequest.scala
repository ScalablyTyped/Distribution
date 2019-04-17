package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteEntityTypesRequest extends js.Object {
  var entityTypeNames: js.Array[java.lang.String]
  var parent: java.lang.String
}

object BatchDeleteEntityTypesRequest {
  @scala.inline
  def apply(entityTypeNames: js.Array[java.lang.String], parent: java.lang.String): BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal(entityTypeNames = entityTypeNames, parent = parent)
  
    __obj.asInstanceOf[BatchDeleteEntityTypesRequest]
  }
}

