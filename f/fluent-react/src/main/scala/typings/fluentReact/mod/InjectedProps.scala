package typings.fluentReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var getString: GetString
}

object InjectedProps {
  @scala.inline
  def apply(getString: (/* id */ String, /* args */ js.UndefOr[js.Object]) => String): InjectedProps = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction2(getString))
    __obj.asInstanceOf[InjectedProps]
  }
}

