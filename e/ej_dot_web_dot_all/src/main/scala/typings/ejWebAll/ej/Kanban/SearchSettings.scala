package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSettings extends js.Object {
  /** To customize the fields the searching operation can be perform.
    * @Default {Array}
    */
  var fields: js.UndefOr[js.Array[_]] = js.native
  /** To customize the ignore case based on searching.
    * @Default {true}
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  /** To customize the searching string.
    */
  var key: js.UndefOr[String] = js.native
  /** To customize the operator based on searching.
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
    def setFieldsVarargs(value: js.Any*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[_]): Self = this.set("fields", value.asInstanceOf[js.Any])
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

