package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Author {
  @scala.inline
  def apply(author: String = null, title: String = null, version: String = null): Anon_Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Author]
  }
}

