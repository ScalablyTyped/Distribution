package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptimisticPersistence extends js.Object {
  var localStorage: js.Array[String] = js.native
  var sessionStorage: js.Array[String] = js.native
}

object GridOptimisticPersistence {
  @scala.inline
  def apply(localStorage: js.Array[String], sessionStorage: js.Array[String]): GridOptimisticPersistence = {
    val __obj = js.Dynamic.literal(localStorage = localStorage.asInstanceOf[js.Any], sessionStorage = sessionStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptimisticPersistence]
  }
  @scala.inline
  implicit class GridOptimisticPersistenceOps[Self <: GridOptimisticPersistence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocalStorageVarargs(value: String*): Self = this.set("localStorage", js.Array(value :_*))
    @scala.inline
    def setLocalStorage(value: js.Array[String]): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionStorageVarargs(value: String*): Self = this.set("sessionStorage", js.Array(value :_*))
    @scala.inline
    def setSessionStorage(value: js.Array[String]): Self = this.set("sessionStorage", value.asInstanceOf[js.Any])
  }
  
}

