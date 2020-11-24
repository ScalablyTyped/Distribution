package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.CurrencyCode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NarrowRecordShortRecord extends js.Object {
  
  var long: Record[CurrencyCode, String] = js.native
  
  var narrow: Record[CurrencyCode, String] = js.native
  
  var short: Record[CurrencyCode, String] = js.native
}
object NarrowRecordShortRecord {
  
  @scala.inline
  def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): NarrowRecordShortRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowRecordShortRecord]
  }
  
  @scala.inline
  implicit class NarrowRecordShortRecordOps[Self <: NarrowRecordShortRecord] (val x: Self) extends AnyVal {
    
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
    def setLong(value: Record[CurrencyCode, String]): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[CurrencyCode, String]): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[CurrencyCode, String]): Self = this.set("short", value.asInstanceOf[js.Any])
  }
}
