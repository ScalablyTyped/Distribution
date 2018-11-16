package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleApiYouTubeSubscriptionResource extends js.Object {
  /**
       *
       */
  var contentDetails: Anon_TotalItemCount
  /**
       * The ETag of the subscription resource.
       */
  var etag: java.lang.String
  /**
       * The ID that YouTube uses to uniquely identify the subscription.
       */
  var id: java.lang.String
  /**
       * The type of the API resource. For subscription resources, the value will be youtube#subscription.
       */
  var kind: java.lang.String
  /**
       * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
       */
  var snippet: Anon_ResourceIdDescription
  /**
       *
       */
  var subscriberSnippet: Anon_DescriptionThumbnails
}

