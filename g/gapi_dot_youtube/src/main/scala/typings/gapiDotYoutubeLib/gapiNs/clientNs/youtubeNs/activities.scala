package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_Part): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_ChannelId): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeActivityResource]
  ]
}

object activities {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_Part, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeActivityResource]
    ],
    list: js.Function1[
      gapiDotYoutubeLib.Anon_ChannelId, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeActivityResource]
      ]
    ]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = insert, list = list)
  
    __obj.asInstanceOf[activities]
  }
}

