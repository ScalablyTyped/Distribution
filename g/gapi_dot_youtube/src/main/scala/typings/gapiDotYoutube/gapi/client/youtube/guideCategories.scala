package typings.gapiDotYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotYoutube.Anon_Hl
import typings.gapiDotYoutube.GoogleApiYouTubeGuideCategoryResource
import typings.gapiDotYoutube.GoogleApiYouTubePageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait guideCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube channels.
    */
  def list(`object`: Anon_Hl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]
}

object guideCategories {
  @scala.inline
  def apply(list: Anon_Hl => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeGuideCategoryResource]]): guideCategories = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[guideCategories]
  }
}

