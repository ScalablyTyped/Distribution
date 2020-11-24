package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubeActivityResource
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.anon.Home
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait activities extends js.Object {
  
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubeActivityResource] = js.native
  
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: Home): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]] = js.native
}
object activities {
  
  @scala.inline
  def apply(
    insert: Part => HttpRequest[GoogleApiYouTubeActivityResource],
    list: Home => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[activities]
  }
  
  @scala.inline
  implicit class activitiesOps[Self <: activities] (val x: Self) extends AnyVal {
    
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
    def setInsert(value: Part => HttpRequest[GoogleApiYouTubeActivityResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Home => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
