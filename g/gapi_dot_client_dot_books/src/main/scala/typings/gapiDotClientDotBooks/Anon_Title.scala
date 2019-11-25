package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

