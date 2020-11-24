package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThreadsResponse extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var resultSizeEstimate: js.UndefOr[Double] = js.native
  
  var threads: js.UndefOr[js.Array[Thread]] = js.native
}
object ListThreadsResponse {
  
  @scala.inline
  def apply(): ListThreadsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThreadsResponse]
  }
  
  @scala.inline
  implicit class ListThreadsResponseOps[Self <: ListThreadsResponse] (val x: Self) extends AnyVal {
    
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
    def setResultSizeEstimate(value: Double): Self = this.set("resultSizeEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSizeEstimate: Self = this.set("resultSizeEstimate", js.undefined)
    
    @scala.inline
    def setThreadsVarargs(value: Thread*): Self = this.set("threads", js.Array(value :_*))
    
    @scala.inline
    def setThreads(value: js.Array[Thread]): Self = this.set("threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
  }
}
