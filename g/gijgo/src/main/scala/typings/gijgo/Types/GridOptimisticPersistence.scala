package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptimisticPersistence extends js.Object {
  var localStorage: js.Array[String]
  var sessionStorage: js.Array[String]
}

object GridOptimisticPersistence {
  @scala.inline
  def apply(localStorage: js.Array[String], sessionStorage: js.Array[String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
}

