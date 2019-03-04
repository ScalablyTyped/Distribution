package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: gapiDotYoutubeLib.Anon_VideoId): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeThumbnailResource]
  ]
}

object thumbnails {
  @scala.inline
  def apply(
    set: js.Function1[
      gapiDotYoutubeLib.Anon_VideoId, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePageInfo[gapiDotYoutubeLib.GoogleApiYouTubeThumbnailResource]
      ]
    ]
  ): thumbnails = {
    val __obj = js.Dynamic.literal(set = set)
  
    __obj.asInstanceOf[thumbnails]
  }
}

