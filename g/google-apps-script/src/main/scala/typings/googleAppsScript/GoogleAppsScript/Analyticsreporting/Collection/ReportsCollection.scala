package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsCollection extends js.Object {
  
  // Returns the Analytics data.
  def batchGet(resource: GetReportsRequest): GetReportsResponse = js.native
}
object ReportsCollection {
  
  @scala.inline
  def apply(batchGet: GetReportsRequest => GetReportsResponse): ReportsCollection = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet))
    __obj.asInstanceOf[ReportsCollection]
  }
  
  @scala.inline
  implicit class ReportsCollectionOps[Self <: ReportsCollection] (val x: Self) extends AnyVal {
    
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
    def setBatchGet(value: GetReportsRequest => GetReportsResponse): Self = this.set("batchGet", js.Any.fromFunction1(value))
  }
}
