package typings.formatjsEcma402Abstract.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long extends js.Object {
  
  var long: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var short: js.UndefOr[js.Tuple2[String, String]] = js.native
}
object Long {
  
  @scala.inline
  def apply(): Long = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
    
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
    def setLong(value: js.Tuple2[String, String]): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    
    @scala.inline
    def setShort(value: js.Tuple2[String, String]): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
}
