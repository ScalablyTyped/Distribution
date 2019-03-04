package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channels extends js.Object {
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_CategoryId): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeChannelResource]
  ]
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeChannelResource]
}

object channels {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotYoutubeLib.Anon_CategoryId, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeChannelResource]
      ]
    ],
    update: js.Function1[
      gapiDotYoutubeLib.Anon_OnBehalfOfContentOwnerPart, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeChannelResource]
    ]
  ): channels = {
    val __obj = js.Dynamic.literal(list = list, update = update)
  
    __obj.asInstanceOf[channels]
  }
}

