package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /**
    * The promoted items type.
    */
  var `type`: java.lang.String
  /**
    * If the promoted item represents a video, then this value is present and identifies the YouTube ID that YouTube assigned to identify that video. This field is only present if the type propertys value is video.
    */
  var videoId: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, videoId: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Anon_Type]
  }
}

