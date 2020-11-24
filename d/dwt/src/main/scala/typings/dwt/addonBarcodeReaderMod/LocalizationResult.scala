package typings.dwt.addonBarcodeReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalizationResult extends js.Object {
  
  /**
    * The angle of a barcode. Values range from 0 to 360.
    */
  var angle: Double = js.native
  
  var moduleSize: Double = js.native
  
  var pageNumber: Double = js.native
  
  var regionName: Double = js.native
  
  var resultCoordinateType: Double = js.native
  
  var terminatePhase: Double = js.native
  
  /**
    * The X coordinate of the left-most point.
    */
  var x1: Double = js.native
  
  /**
    * The X coordinate of the second point in a clockwise direction.
    */
  var x2: Double = js.native
  
  /**
    * The X coordinate of the third point in a clockwise direction.
    */
  var x3: Double = js.native
  
  /**
    * The X coordinate of the fourth point in a clockwise direction.
    */
  var x4: Double = js.native
  
  /**
    * The Y coordinate of the left-most point.
    */
  var y1: Double = js.native
  
  /**
    * The Y coordinate of the second point in a clockwise direction.
    */
  var y2: Double = js.native
  
  /**
    * The Y coordinate of the third point in a clockwise direction.
    */
  var y3: Double = js.native
  
  /**
    * The Y coordinate of the fourth point in a clockwise direction.
    */
  var y4: Double = js.native
}
object LocalizationResult {
  
  @scala.inline
  def apply(
    angle: Double,
    moduleSize: Double,
    pageNumber: Double,
    regionName: Double,
    resultCoordinateType: Double,
    terminatePhase: Double,
    x1: Double,
    x2: Double,
    x3: Double,
    x4: Double,
    y1: Double,
    y2: Double,
    y3: Double,
    y4: Double
  ): LocalizationResult = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], regionName = regionName.asInstanceOf[js.Any], resultCoordinateType = resultCoordinateType.asInstanceOf[js.Any], terminatePhase = terminatePhase.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], x3 = x3.asInstanceOf[js.Any], x4 = x4.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any], y3 = y3.asInstanceOf[js.Any], y4 = y4.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizationResult]
  }
  
  @scala.inline
  implicit class LocalizationResultOps[Self <: LocalizationResult] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSize(value: Double): Self = this.set("moduleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionName(value: Double): Self = this.set("regionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCoordinateType(value: Double): Self = this.set("resultCoordinateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatePhase(value: Double): Self = this.set("terminatePhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX3(value: Double): Self = this.set("x3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX4(value: Double): Self = this.set("x4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY3(value: Double): Self = this.set("y3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY4(value: Double): Self = this.set("y4", value.asInstanceOf[js.Any])
  }
}
