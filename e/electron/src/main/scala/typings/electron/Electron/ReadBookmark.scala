package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBookmark extends js.Object {
  var title: String
  var url: String
}

object ReadBookmark {
  @scala.inline
  def apply(title: String, url: String): ReadBookmark = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadBookmark]
  }
}

