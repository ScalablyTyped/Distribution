package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSettings extends js.Object {
  /** This specify the grid to search for the value in particular columns that is mentioned in the field.
    * @Default {[]}
    */
  var fields: js.UndefOr[js.Any] = js.native
  /** It enables or disables case-sensitivity while searching the search key in grid.
    * @Default {true}
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /** This specifies the grid to search the particular data that is mentioned in the key.
    */
  var key: js.UndefOr[String] = js.native
  /** It specifies the grid to search the records based on operator.
    * @Default {contains}
    */
  var operator: js.UndefOr[String] = js.native
}

object SearchSettings {
  @scala.inline
  def apply(): SearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSettings]
  }
  @scala.inline
  implicit class SearchSettingsOps[Self <: SearchSettings] (val x: Self) extends AnyVal {
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
    def setFields(value: js.Any): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
  
}

