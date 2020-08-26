package typings.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintColumnOptions[T] extends js.Object {
  /**
    * Printer to format column names
    */
  var namePrinter: js.UndefOr[CellPrinter[T]] = js.native
  /**
    * Column separation string
    */
  var separator: js.UndefOr[String] = js.native
}

object PrintColumnOptions {
  @scala.inline
  def apply[T](): PrintColumnOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintColumnOptions[T]]
  }
  @scala.inline
  implicit class PrintColumnOptionsOps[Self <: PrintColumnOptions[_], T] (val x: Self with PrintColumnOptions[T]) extends AnyVal {
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
    def setNamePrinter(value: (T, /* width */ Double) => String): Self = this.set("namePrinter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNamePrinter: Self = this.set("namePrinter", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
  
}

