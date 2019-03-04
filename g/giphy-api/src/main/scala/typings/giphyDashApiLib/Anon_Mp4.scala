package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mp4 extends js.Object {
  var mp4: java.lang.String
  var mp4_size: java.lang.String
  var size: java.lang.String
  var webp: java.lang.String
  var webp_size: java.lang.String
}

object Anon_Mp4 {
  @scala.inline
  def apply(
    mp4: java.lang.String,
    mp4_size: java.lang.String,
    size: java.lang.String,
    webp: java.lang.String,
    webp_size: java.lang.String
  ): Anon_Mp4 = {
    val __obj = js.Dynamic.literal(mp4 = mp4, mp4_size = mp4_size, size = size, webp = webp, webp_size = webp_size)
  
    __obj.asInstanceOf[Anon_Mp4]
  }
}

