package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: java.lang.String = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Title]
  }
}

