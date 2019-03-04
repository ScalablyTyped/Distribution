package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait guideCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube channels.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_Hl): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeGuideCategoryResource]
  ]
}

object guideCategories {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotYoutubeLib.Anon_Hl, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeGuideCategoryResource]
      ]
    ]
  ): guideCategories = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[guideCategories]
  }
}

