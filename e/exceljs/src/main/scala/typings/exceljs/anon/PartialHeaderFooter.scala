package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.HeaderFooter> */
@js.native
trait PartialHeaderFooter extends js.Object {
  
  var differentFirst: js.UndefOr[Boolean] = js.native
  
  var differentOddEven: js.UndefOr[Boolean] = js.native
  
  var evenFooter: js.UndefOr[String] = js.native
  
  var evenHeader: js.UndefOr[String] = js.native
  
  var firstFooter: js.UndefOr[String] = js.native
  
  var firstHeader: js.UndefOr[String] = js.native
  
  var oddFooter: js.UndefOr[String] = js.native
  
  var oddHeader: js.UndefOr[String] = js.native
}
object PartialHeaderFooter {
  
  @scala.inline
  def apply(): PartialHeaderFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaderFooter]
  }
  
  @scala.inline
  implicit class PartialHeaderFooterOps[Self <: PartialHeaderFooter] (val x: Self) extends AnyVal {
    
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
    def setDifferentFirst(value: Boolean): Self = this.set("differentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDifferentFirst: Self = this.set("differentFirst", js.undefined)
    
    @scala.inline
    def setDifferentOddEven(value: Boolean): Self = this.set("differentOddEven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDifferentOddEven: Self = this.set("differentOddEven", js.undefined)
    
    @scala.inline
    def setEvenFooter(value: String): Self = this.set("evenFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenFooter: Self = this.set("evenFooter", js.undefined)
    
    @scala.inline
    def setEvenHeader(value: String): Self = this.set("evenHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvenHeader: Self = this.set("evenHeader", js.undefined)
    
    @scala.inline
    def setFirstFooter(value: String): Self = this.set("firstFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFooter: Self = this.set("firstFooter", js.undefined)
    
    @scala.inline
    def setFirstHeader(value: String): Self = this.set("firstHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstHeader: Self = this.set("firstHeader", js.undefined)
    
    @scala.inline
    def setOddFooter(value: String): Self = this.set("oddFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOddFooter: Self = this.set("oddFooter", js.undefined)
    
    @scala.inline
    def setOddHeader(value: String): Self = this.set("oddHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOddHeader: Self = this.set("oddHeader", js.undefined)
  }
}
