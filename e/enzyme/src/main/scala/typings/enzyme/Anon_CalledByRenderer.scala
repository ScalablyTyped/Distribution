package typings.enzyme

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CalledByRenderer
  extends /* key */ StringDictionary[js.Any] {
  var calledByRenderer: Boolean
}

object Anon_CalledByRenderer {
  @scala.inline
  def apply(calledByRenderer: Boolean, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_CalledByRenderer = {
    val __obj = js.Dynamic.literal(calledByRenderer = calledByRenderer.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_CalledByRenderer]
  }
}

