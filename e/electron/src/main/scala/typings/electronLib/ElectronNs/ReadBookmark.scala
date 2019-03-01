package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBookmark extends js.Object {
  var title: java.lang.String
  var url: java.lang.String
}

object ReadBookmark {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): ReadBookmark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReadBookmark]
  }
}

