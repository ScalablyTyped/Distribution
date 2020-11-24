package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentFilter extends js.Object {
  
  var not: js.UndefOr[Boolean] = js.native
  
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
  
  var simpleSegment: js.UndefOr[SimpleSegment] = js.native
}
object SegmentFilter {
  
  @scala.inline
  def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  
  @scala.inline
  implicit class SegmentFilterOps[Self <: SegmentFilter] (val x: Self) extends AnyVal {
    
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
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setSequenceSegment(value: SequenceSegment): Self = this.set("sequenceSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceSegment: Self = this.set("sequenceSegment", js.undefined)
    
    @scala.inline
    def setSimpleSegment(value: SimpleSegment): Self = this.set("simpleSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleSegment: Self = this.set("simpleSegment", js.undefined)
  }
}
