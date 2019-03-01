package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsAndroid extends js.Object {
  def isAndroid(): scala.Boolean
  def isFlat(): scala.Boolean
  def isIOS(): scala.Boolean
  def isIOS7(): scala.Boolean
  def isWindows(): scala.Boolean
}

object Anon_IsAndroid {
  @scala.inline
  def apply(
    isAndroid: js.Function0[scala.Boolean],
    isFlat: js.Function0[scala.Boolean],
    isIOS: js.Function0[scala.Boolean],
    isIOS7: js.Function0[scala.Boolean],
    isWindows: js.Function0[scala.Boolean]
  ): Anon_IsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAndroid")(isAndroid)
    __obj.updateDynamic("isFlat")(isFlat)
    __obj.updateDynamic("isIOS")(isIOS)
    __obj.updateDynamic("isIOS7")(isIOS7)
    __obj.updateDynamic("isWindows")(isWindows)
    __obj.asInstanceOf[Anon_IsAndroid]
  }
}

