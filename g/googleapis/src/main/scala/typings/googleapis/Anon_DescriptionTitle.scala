package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DescriptionTitle extends js.Object {
  var description: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object Anon_DescriptionTitle {
  @scala.inline
  def apply(description: String = null, title: String = null): Anon_DescriptionTitle = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionTitle]
  }
}

