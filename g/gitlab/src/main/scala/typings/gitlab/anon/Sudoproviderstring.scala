package typings.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  provider ? :string} */
trait Sudoproviderstring extends js.Object {
  var provider: js.UndefOr[String] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object Sudoproviderstring {
  @scala.inline
  def apply(provider: String = null, sudo: String | Double = null): Sudoproviderstring = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sudoproviderstring]
  }
}

