package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.full
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.medium
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFormatterOptions extends js.Object {
  
  /**
    * One of the following String values: full, long, medium, or short, eg. { date: "full" }.
    */
  var date: js.UndefOr[full | long | medium | short] = js.native
  
  /**
    * One of the following String values: full, long, medium, or short, eg. { datetime: "full" }
    */
  var datetime: js.UndefOr[full | long | medium | short] = js.native
  
  /**
    * String value indicating a machine raw pattern (anything in the "Sym." column) eg. { raw: "dd/mm" }.
    * Note this is NOT recommended for i18n in general. Use skeleton instead.
    */
  var raw: js.UndefOr[String] = js.native
  
  /**
    * String value indicating a skeleton (see description above), eg. { skeleton: "GyMMMd" }.
    * Skeleton provides a more flexible formatting mechanism than the predefined list full, long, medium, or short represented by date, time, or datetime.
    * Instead, they are an open-ended list of patterns containing only date field information, and in a canonical order.
    */
  var skeleton: js.UndefOr[String] = js.native
  
  /**
    * One of the following String values: full, long, medium, or short, eg. { time: "full" }.
    */
  var time: js.UndefOr[full | long | medium | short] = js.native
  
  /**
    * String based on the time zone names of the IANA time zone database,
    * such as "Asia/Shanghai", "Asia/Kolkata", "America/New_York".
    */
  var timeZone: js.UndefOr[String] = js.native
}
object DateFormatterOptions {
  
  @scala.inline
  def apply(): DateFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormatterOptions]
  }
  
  @scala.inline
  implicit class DateFormatterOptionsOps[Self <: DateFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setDate(value: full | long | medium | short): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDatetime(value: full | long | medium | short): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSkeleton(value: String): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkeleton: Self = this.set("skeleton", js.undefined)
    
    @scala.inline
    def setTime(value: full | long | medium | short): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
