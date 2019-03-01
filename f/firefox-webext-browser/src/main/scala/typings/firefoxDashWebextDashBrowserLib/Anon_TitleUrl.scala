package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleUrl extends js.Object {
  var title: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TitleUrl {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String = null): Anon_TitleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_TitleUrl]
  }
}

