package typings.dynamodb.modelMod.Model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationResult extends js.Object {
  def get(name: String): js.Any
}

object OperationResult {
  @scala.inline
  def apply(get: String => js.Any): OperationResult = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[OperationResult]
  }
}

