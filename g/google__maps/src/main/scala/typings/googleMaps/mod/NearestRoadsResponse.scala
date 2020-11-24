package typings.googleMaps.mod

import typings.googleMaps.anon.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestRoadsResponse extends js.Object {
  
  /** An array of snapped points. */
  var snappedPoints: js.Array[Location] = js.native
}
object NearestRoadsResponse {
  
  @scala.inline
  def apply(snappedPoints: js.Array[Location]): NearestRoadsResponse = {
    val __obj = js.Dynamic.literal(snappedPoints = snappedPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestRoadsResponse]
  }
  
  @scala.inline
  implicit class NearestRoadsResponseOps[Self <: NearestRoadsResponse] (val x: Self) extends AnyVal {
    
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
    def setSnappedPointsVarargs(value: Location*): Self = this.set("snappedPoints", js.Array(value :_*))
    
    @scala.inline
    def setSnappedPoints(value: js.Array[Location]): Self = this.set("snappedPoints", value.asInstanceOf[js.Any])
  }
}
