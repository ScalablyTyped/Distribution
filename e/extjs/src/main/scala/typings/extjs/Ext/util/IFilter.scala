package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilter extends IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var operator: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
  /** [Method] Changes the filtering function which this Filter uses to choose items to include
    * @param filterFn Function A function which returns true or false to either include or exclude the passed object.
    */
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Changes the value that this filter tests its configured  link cfg property with
    * @param value Mixed The new value to compare the property with.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[js.Any] = js.native
}

object IFilter {
  @scala.inline
  def apply(): IFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilter]
  }
  @scala.inline
  implicit class IFilterOps[Self <: IFilter] (val x: Self) extends AnyVal {
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
    def setAnyMatch(value: Boolean): Self = this.set("anyMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyMatch: Self = this.set("anyMatch", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExactMatch(value: Boolean): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    @scala.inline
    def setFilterFn(value: js.Any): Self = this.set("filterFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFn: Self = this.set("filterFn", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSetFilterFn(value: /* filterFn */ js.UndefOr[js.Any] => Unit): Self = this.set("setFilterFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilterFn: Self = this.set("setFilterFn", js.undefined)
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

