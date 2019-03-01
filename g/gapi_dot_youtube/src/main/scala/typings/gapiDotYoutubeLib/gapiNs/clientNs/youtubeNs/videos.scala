package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_AutoLevels): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_Chart): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
  ]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwnerRating): gapiLib.gapiNs.clientNs.HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
    ],
    getRating: js.Function1[
      gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwner, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoGetRatingResponse]
    ],
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_AutoLevels, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
    ],
    list: js.Function1[
      gapiDotYoutubeLib.Anon_Chart, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
      ]
    ],
    rate: js.Function1[
      gapiDotYoutubeLib.Anon_IdOnBehalfOfContentOwnerRating, 
      gapiLib.gapiNs.clientNs.HttpRequest[_]
    ],
    update: js.Function1[
      gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeVideoResource]
    ]
  ): videos = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("getRating")(getRating)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("rate")(rate)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[videos]
  }
}

