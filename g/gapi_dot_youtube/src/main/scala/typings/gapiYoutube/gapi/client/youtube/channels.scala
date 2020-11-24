package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubeChannelResource
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.anon.ForUsername
import typings.gapiYoutube.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait channels extends js.Object {
  
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: ForUsername): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]] = js.native
  
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeChannelResource] = js.native
}
object channels {
  
  @scala.inline
  def apply(
    list: ForUsername => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]],
    update: RequestBody => HttpRequest[GoogleApiYouTubeChannelResource]
  ): channels = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[channels]
  }
  
  @scala.inline
  implicit class channelsOps[Self <: channels] (val x: Self) extends AnyVal {
    
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
    def setList(value: ForUsername => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: RequestBody => HttpRequest[GoogleApiYouTubeChannelResource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
