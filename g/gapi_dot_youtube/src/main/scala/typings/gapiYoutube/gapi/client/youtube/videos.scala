package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typings.gapiYoutube.GoogleApiYouTubeVideoResource
import typings.gapiYoutube.anon.AutoLevels
import typings.gapiYoutube.anon.Chart
import typings.gapiYoutube.anon.IdOnBehalfOfContentOwner
import typings.gapiYoutube.anon.OnBehalfOfContentOwnerRating
import typings.gapiYoutube.anon.RequestBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait videos extends js.Object {
  
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
  
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: IdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse] = js.native
  
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: AutoLevels): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
  
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: Chart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]] = js.native
  
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: OnBehalfOfContentOwnerRating): HttpRequest[_] = js.native
  
  /**
    * Updates a video's metadata.
    */
  def update(`object`: RequestBody): HttpRequest[GoogleApiYouTubeVideoResource] = js.native
}
object videos {
  
  @scala.inline
  def apply(
    delete: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource],
    getRating: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse],
    insert: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource],
    list: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]],
    rate: OnBehalfOfContentOwnerRating => HttpRequest[_],
    update: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]
  ): videos = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getRating = js.Any.fromFunction1(getRating), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), rate = js.Any.fromFunction1(rate), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[videos]
  }
  
  @scala.inline
  implicit class videosOps[Self <: videos] (val x: Self) extends AnyVal {
    
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
    def setDelete(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoResource]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRating(value: IdOnBehalfOfContentOwner => HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]): Self = this.set("getRating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: AutoLevels => HttpRequest[GoogleApiYouTubeVideoResource]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Chart => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRate(value: OnBehalfOfContentOwnerRating => HttpRequest[_]): Self = this.set("rate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: RequestBody => HttpRequest[GoogleApiYouTubeVideoResource]): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
