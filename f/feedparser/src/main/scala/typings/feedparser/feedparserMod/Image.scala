package typings.feedparser.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var title: String
  var url: String
}

object Image {
  @scala.inline
  def apply(title: String, url: String): Image = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[Image]
  }
}

