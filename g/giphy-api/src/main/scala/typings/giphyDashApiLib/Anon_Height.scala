package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: java.lang.String
  var mp4: java.lang.String
  var mp4_size: java.lang.String
  var width: java.lang.String
}

object Anon_Height {
  @scala.inline
  def apply(
    height: java.lang.String,
    mp4: java.lang.String,
    mp4_size: java.lang.String,
    width: java.lang.String
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("mp4")(mp4)
    __obj.updateDynamic("mp4_size")(mp4_size)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

