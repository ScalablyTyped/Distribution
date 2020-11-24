package typings.easyTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFormat[T] extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var printer: js.UndefOr[CellPrinter[T]] = js.native
}
object ColumnFormat {
  
  @scala.inline
  def apply[T](): ColumnFormat[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFormat[T]]
  }
  
  @scala.inline
  implicit class ColumnFormatOps[Self <: ColumnFormat[_], T] (val x: Self with ColumnFormat[T]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrinter(value: (T, /* width */ Double) => String): Self = this.set("printer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrinter: Self = this.set("printer", js.undefined)
  }
}
