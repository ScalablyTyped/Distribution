package typings
package enzymeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalledByRenderer
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var calledByRenderer: scala.Boolean
}

object Anon_CalledByRenderer {
  @scala.inline
  def apply(
    calledByRenderer: scala.Boolean,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_CalledByRenderer = {
    val __obj = js.Dynamic.literal(calledByRenderer = calledByRenderer)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CalledByRenderer]
  }
}

