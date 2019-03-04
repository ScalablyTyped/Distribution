package typings
package feedmeLib.feedmeMod.FeedMeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: java.lang.String
  var link: java.lang.String
  var title: java.lang.String
  var url: java.lang.String
  var width: java.lang.String
}

object Image {
  @scala.inline
  def apply(
    height: java.lang.String,
    link: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    width: java.lang.String
  ): Image = {
    val __obj = js.Dynamic.literal(height = height, link = link, title = title, url = url, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

