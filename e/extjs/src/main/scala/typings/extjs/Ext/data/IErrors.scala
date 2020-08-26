package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IErrors extends IMixedCollection {
  /** [Method] Returns all of the errors for the given field
    * @param fieldName String The field to get errors for
    * @returns Object[] All errors for the given field
    */
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[String], Array]] = js.native
  /** [Method] Returns true if there are no errors in the collection
    * @returns Boolean
    */
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IErrors {
  @scala.inline
  def apply(): IErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrors]
  }
  @scala.inline
  implicit class IErrorsOps[Self <: IErrors] (val x: Self) extends AnyVal {
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
    def setGetByField(value: /* fieldName */ js.UndefOr[String] => Array): Self = this.set("getByField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetByField: Self = this.set("getByField", js.undefined)
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
  }
  
}

