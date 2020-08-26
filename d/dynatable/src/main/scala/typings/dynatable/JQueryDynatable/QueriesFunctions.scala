package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueriesFunctions extends js.Object {
  /**
    * Search in all of the properties of the provided single record
    *
    * @param record A data object with all the properties of the current line
    * @param queryValue The researched value
    * @return A boolean indicating if a match was found
    */
  def search(record: js.Any, queryValue: String): Boolean = js.native
}

object QueriesFunctions {
  @scala.inline
  def apply(search: (js.Any, String) => Boolean): QueriesFunctions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[QueriesFunctions]
  }
  @scala.inline
  implicit class QueriesFunctionsOps[Self <: QueriesFunctions] (val x: Self) extends AnyVal {
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
    def setSearch(value: (js.Any, String) => Boolean): Self = this.set("search", js.Any.fromFunction2(value))
  }
  
}

