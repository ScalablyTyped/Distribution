package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_DescriptionGroupId extends js.Object {
  /**
           * The ID that YouTube uses to uniquely identify the channel associated with the activity.
           */
  var channelId: java.lang.String
  /**
           * Channel title for the channel responsible for this activity
           */
  var channelTitle: java.lang.String
  /**
           * The description of the resource primarily associated with the activity.
           */
  var description: java.lang.String
  /**
           * The group ID associated with the activity.
           */
  var groupId: java.lang.String
  /**
           * The date and time that the activity occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
           */
  var publishedAt: java.lang.String
  /**
           * A map of thumbnail images associated with the resource that is primarily associated with the activity.
           */
  var thumbnails: GoogleApiYouTubeThumbnailResource
  /**
           * The title of the resource primarily associated with the activity.
           */
  var title: java.lang.String
  /**
           * The type of activity that the resource describes.
           */
  var `type`: java.lang.String
}

