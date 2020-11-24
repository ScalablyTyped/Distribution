package typings.devextreme.mod.DevExpress.exporter

import typings.devextreme.devextremeStrings.double
import typings.devextreme.devextremeStrings.doubleAccounting
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.singleAccounting
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelFont extends js.Object {
  
  /**
    * [descr:ExcelFont.bold]
    */
  var bold: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExcelFont.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExcelFont.italic]
    */
  var italic: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExcelFont.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExcelFont.size]
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ExcelFont.underline]
    */
  var underline: js.UndefOr[double | doubleAccounting | none | single_ | singleAccounting] = js.native
}
object ExcelFont {
  
  @scala.inline
  def apply(): ExcelFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelFont]
  }
  
  @scala.inline
  implicit class ExcelFontOps[Self <: ExcelFont] (val x: Self) extends AnyVal {
    
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
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUnderline(value: double | doubleAccounting | none | single_ | singleAccounting): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
