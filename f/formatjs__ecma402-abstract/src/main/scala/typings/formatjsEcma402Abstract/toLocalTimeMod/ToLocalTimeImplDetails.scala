package typings.formatjsEcma402Abstract.toLocalTimeMod

import typings.formatjsEcma402Abstract.dateTimeMod.UnpackedZoneData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToLocalTimeImplDetails extends js.Object {
  
  var tzData: Record[String, js.Array[UnpackedZoneData]] = js.native
}
object ToLocalTimeImplDetails {
  
  @scala.inline
  def apply(tzData: Record[String, js.Array[UnpackedZoneData]]): ToLocalTimeImplDetails = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToLocalTimeImplDetails]
  }
  
  @scala.inline
  implicit class ToLocalTimeImplDetailsOps[Self <: ToLocalTimeImplDetails] (val x: Self) extends AnyVal {
    
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
    def setTzData(value: Record[String, js.Array[UnpackedZoneData]]): Self = this.set("tzData", value.asInstanceOf[js.Any])
  }
}
