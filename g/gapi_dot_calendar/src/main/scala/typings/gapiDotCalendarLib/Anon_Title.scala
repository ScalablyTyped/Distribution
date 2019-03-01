package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  var title: java.lang.String
  var url: java.lang.String
}

object Anon_Title {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): Anon_Title = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Title]
  }
}

