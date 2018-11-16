package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleApiYouTubePageInfo[T] extends js.Object {
  /**
       * The ETag of the response.
       */
  var etag: java.lang.String
  /**
       * A list of activities, or events, that match the request criteria.
       */
  var items: js.Array[T]
  /**
       * The type of the API response. For this operation, the value will be youtube#activityListResponse.
       */
  var kind: java.lang.String
}

