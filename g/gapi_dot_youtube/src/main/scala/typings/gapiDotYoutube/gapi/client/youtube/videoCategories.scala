package typings.gapiDotYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotYoutube.Anon_Hl
import typings.gapiDotYoutube.GoogleApiYouTubePageInfo
import typings.gapiDotYoutube.GoogleApiYouTubeVideoCategoryResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videoCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube videos.
    */
  def list(`object`: Anon_Hl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]
}

object videoCategories {
  @scala.inline
  def apply(list: Anon_Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]): videoCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[videoCategories]
  }
}

