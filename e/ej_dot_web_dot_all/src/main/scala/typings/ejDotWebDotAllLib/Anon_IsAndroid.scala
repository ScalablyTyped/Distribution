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
    val __obj = js.Dynamic.literal(isAndroid = isAndroid, isFlat = isFlat, isIOS = isIOS, isIOS7 = isIOS7, isWindows = isWindows)
  
    __obj.asInstanceOf[Anon_IsAndroid]
  }
}

