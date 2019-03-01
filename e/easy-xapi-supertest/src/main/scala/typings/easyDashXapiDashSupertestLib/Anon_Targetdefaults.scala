package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Targetdefaults extends js.Object {
  var target_defaults: Anon_Cflags
  var variables: Anon_Clang
}

object Anon_Targetdefaults {
  @scala.inline
  def apply(target_defaults: Anon_Cflags, variables: Anon_Clang): Anon_Targetdefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target_defaults")(target_defaults)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Targetdefaults]
  }
}

