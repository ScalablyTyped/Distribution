package typings.feedme.feedmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: String
  var link: String
  var title: String
  var url: String
  var width: String
}

object Image {
  @scala.inline
  def apply(height: String, link: String, title: String, url: String, width: String): Image = {
    val __obj = js.Dynamic.literal(height = height, link = link, title = title, url = url, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

