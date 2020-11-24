package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaStreetSegmentList extends js.Object {
  
  var segments: js.UndefOr[js.Array[SchemaStreetSegment]] = js.native
}
object SchemaStreetSegmentList {
  
  @scala.inline
  def apply(): SchemaStreetSegmentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegmentList]
  }
  
  @scala.inline
  implicit class SchemaStreetSegmentListOps[Self <: SchemaStreetSegmentList] (val x: Self) extends AnyVal {
    
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
    def setSegmentsVarargs(value: SchemaStreetSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SchemaStreetSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
  }
}
