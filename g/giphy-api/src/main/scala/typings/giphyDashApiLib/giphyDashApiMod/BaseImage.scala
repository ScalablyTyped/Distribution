package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseImage extends js.Object {
  var height: java.lang.String
  var url: java.lang.String
  var width: java.lang.String
}

object BaseImage {
  @scala.inline
  def apply(height: java.lang.String, url: java.lang.String, width: java.lang.String): BaseImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BaseImage]
  }
}

