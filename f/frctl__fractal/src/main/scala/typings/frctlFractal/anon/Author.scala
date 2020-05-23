package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Author {
  @scala.inline
  def apply(author: String = null, title: String = null, version: String = null): Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

