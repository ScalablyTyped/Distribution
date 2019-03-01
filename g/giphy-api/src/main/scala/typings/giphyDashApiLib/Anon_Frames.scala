package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Frames extends js.Object {
  var frames: java.lang.String
  var mp4: java.lang.String
  var mp4_size: java.lang.String
  var size: java.lang.String
  var webp: java.lang.String
  var webp_size: java.lang.String
}

object Anon_Frames {
  @scala.inline
  def apply(
    frames: java.lang.String,
    mp4: java.lang.String,
    mp4_size: java.lang.String,
    size: java.lang.String,
    webp: java.lang.String,
    webp_size: java.lang.String
  ): Anon_Frames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frames")(frames)
    __obj.updateDynamic("mp4")(mp4)
    __obj.updateDynamic("mp4_size")(mp4_size)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("webp")(webp)
    __obj.updateDynamic("webp_size")(webp_size)
    __obj.asInstanceOf[Anon_Frames]
  }
}

