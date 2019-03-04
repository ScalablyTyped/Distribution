package typings
package gapiDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait subscriptions extends js.Object {
  /**
    * Deletes a subscription.
    */
  def delete(`object`: gapiDotYoutubeLib.Anon_Id): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
  /**
    * Adds a subscription for the authenticated user's channel.
    */
  def insert(`object`: gapiDotYoutubeLib.Anon_PartRequestBody): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
  /**
    * Returns subscription resources that match the API request criteria.
    */
  def list(`object`: gapiDotYoutubeLib.Anon_ChannelIdForChannelId): gapiLib.gapiNs.clientNs.HttpRequest[
    gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
  ]
}

object subscriptions {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotYoutubeLib.Anon_Id, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
    ],
    insert: js.Function1[
      gapiDotYoutubeLib.Anon_PartRequestBody, 
      gapiLib.gapiNs.clientNs.HttpRequest[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
    ],
    list: js.Function1[
      gapiDotYoutubeLib.Anon_ChannelIdForChannelId, 
      gapiLib.gapiNs.clientNs.HttpRequest[
        gapiDotYoutubeLib.GoogleApiYouTubePaginationInfo[gapiDotYoutubeLib.GoogleApiYouTubeSubscriptionResource]
      ]
    ]
  ): subscriptions = {
    val __obj = js.Dynamic.literal(delete = delete, insert = insert, list = list)
  
    __obj.asInstanceOf[subscriptions]
  }
}

