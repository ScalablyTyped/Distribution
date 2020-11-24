package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserActivityResponse extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var sessions: js.UndefOr[js.Array[UserActivitySession]] = js.native
  
  var totalRows: js.UndefOr[Double] = js.native
}
object SearchUserActivityResponse {
  
  @scala.inline
  def apply(): SearchUserActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserActivityResponse]
  }
  
  @scala.inline
  implicit class SearchUserActivityResponseOps[Self <: SearchUserActivityResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: UserActivitySession*): Self = this.set("sessions", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: js.Array[UserActivitySession]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
    
    @scala.inline
    def setTotalRows(value: Double): Self = this.set("totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRows: Self = this.set("totalRows", js.undefined)
  }
}
