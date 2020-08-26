package typings.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalOptions[T] extends js.Object {
  /**
    * Initial value for reduction
    */
  var init: js.UndefOr[T] = js.native
  /**
    * Printer to format the total cell
    */
  var printer: js.UndefOr[CellPrinter[T]] = js.native
  /**
    * reduce(acc, val, idx, length) function to compute the total value
    */
  var reduce: js.UndefOr[ReduceFunction[T]] = js.native
}

object TotalOptions {
  @scala.inline
  def apply[T](): TotalOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalOptions[T]]
  }
  @scala.inline
  implicit class TotalOptionsOps[Self <: TotalOptions[_], T] (val x: Self with TotalOptions[T]) extends AnyVal {
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
    def setInit(value: T): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setPrinter(value: (T, /* width */ Double) => String): Self = this.set("printer", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrinter: Self = this.set("printer", js.undefined)
    @scala.inline
    def setReduce(value: (T, T, /* idx */ Double, /* length */ Double) => T): Self = this.set("reduce", js.Any.fromFunction4(value))
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
  }
  
}

