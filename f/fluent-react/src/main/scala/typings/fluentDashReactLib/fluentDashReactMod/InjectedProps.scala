package typings
package fluentDashReactLib.fluentDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedProps extends js.Object {
  var getString: GetString
}

object InjectedProps {
  @scala.inline
  def apply(getString: GetString): InjectedProps = {
    val __obj = js.Dynamic.literal(getString = getString)
  
    __obj.asInstanceOf[InjectedProps]
  }
}

