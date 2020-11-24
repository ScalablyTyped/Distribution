package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGroupSortValueBucket extends js.Object {
  
  var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.native
  
  var valuesIndex: js.UndefOr[Double] = js.native
}
object PivotGroupSortValueBucket {
  
  @scala.inline
  def apply(): PivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupSortValueBucket]
  }
  
  @scala.inline
  implicit class PivotGroupSortValueBucketOps[Self <: PivotGroupSortValueBucket] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: ExtendedValue*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[ExtendedValue]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setValuesIndex(value: Double): Self = this.set("valuesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesIndex: Self = this.set("valuesIndex", js.undefined)
  }
}
