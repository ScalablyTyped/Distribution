package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptimisticPersistence extends js.Object {
  var localStorage: js.Array[java.lang.String]
  var sessionStorage: js.Array[java.lang.String]
}

object GridOptimisticPersistence {
  @scala.inline
  def apply(localStorage: js.Array[java.lang.String], sessionStorage: js.Array[java.lang.String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage, sessionStorage = sessionStorage)
  
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
}

