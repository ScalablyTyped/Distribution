package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'narrow' | 'short' | 'long', string | undefined> */
@js.native
trait Recordnarrowshortlongstri extends js.Object {
  
  var long: js.UndefOr[String] = js.native
  
  var narrow: js.UndefOr[String] = js.native
  
  var short: js.UndefOr[String] = js.native
}
object Recordnarrowshortlongstri {
  
  @scala.inline
  def apply(): Recordnarrowshortlongstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recordnarrowshortlongstri]
  }
  
  @scala.inline
  implicit class RecordnarrowshortlongstriOps[Self <: Recordnarrowshortlongstri] (val x: Self) extends AnyVal {
    
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
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    
    @scala.inline
    def setNarrow(value: String): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
}
