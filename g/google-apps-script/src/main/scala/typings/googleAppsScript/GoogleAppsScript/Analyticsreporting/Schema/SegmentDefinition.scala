package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDefinition extends js.Object {
  
  var segmentFilters: js.UndefOr[js.Array[SegmentFilter]] = js.native
}
object SegmentDefinition {
  
  @scala.inline
  def apply(): SegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDefinition]
  }
  
  @scala.inline
  implicit class SegmentDefinitionOps[Self <: SegmentDefinition] (val x: Self) extends AnyVal {
    
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
    def setSegmentFiltersVarargs(value: SegmentFilter*): Self = this.set("segmentFilters", js.Array(value :_*))
    
    @scala.inline
    def setSegmentFilters(value: js.Array[SegmentFilter]): Self = this.set("segmentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentFilters: Self = this.set("segmentFilters", js.undefined)
  }
}
