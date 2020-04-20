package typings.feedme.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

