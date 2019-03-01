package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videoCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube videos.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_Hl): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoCategoryResource]
  ]
}

object videoCategories {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotYoutubeLib.Anon_Hl, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoCategoryResource]
      ]
    ]
  ): videoCategories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[videoCategories]
  }
}

