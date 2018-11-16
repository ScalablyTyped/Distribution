package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DescriptionChannelTitle extends js.Object {
  /**
           * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
           */
  var channelId: java.lang.String
  /**
           * The title of the channel that published the resource that the search result identifies.
           */
  var channelTitle: java.lang.String
  /**
           * A description of the search result.
           */
  var description: java.lang.String
  /**
           * The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
           */
  var publishedAt: java.lang.String
  /**
           * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
           */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
           * The title of the search result.
           */
  var title: java.lang.String
}

