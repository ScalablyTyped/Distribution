package typings.gijgo.TypesNs

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
    val __obj = js.Dynamic.literal(localStorage = localStorage, sessionStorage = sessionStorage)
  
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
}

