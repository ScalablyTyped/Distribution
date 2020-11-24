package typings.expoLocation.locationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationHeadingObject extends js.Object {
  
  var accuracy: Double = js.native
  
  var magHeading: Double = js.native
  
  var trueHeading: Double = js.native
}
object LocationHeadingObject {
  
  @scala.inline
  def apply(accuracy: Double, magHeading: Double, trueHeading: Double): LocationHeadingObject = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], magHeading = magHeading.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationHeadingObject]
  }
  
  @scala.inline
  implicit class LocationHeadingObjectOps[Self <: LocationHeadingObject] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagHeading(value: Double): Self = this.set("magHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeading(value: Double): Self = this.set("trueHeading", value.asInstanceOf[js.Any])
  }
}
