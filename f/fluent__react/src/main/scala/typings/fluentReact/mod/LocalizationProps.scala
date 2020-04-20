package typings.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProps extends js.Object {
  var getString: GetString
}

object LocalizationProps {
  @scala.inline
  def apply(
    getString: (/* id */ String, /* args */ js.UndefOr[js.Object], /* fallback */ js.UndefOr[String]) => String
  ): LocalizationProps = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction3(getString))
    __obj.asInstanceOf[LocalizationProps]
  }
}

