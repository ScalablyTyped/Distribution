package typings.enzyme.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var calledByRenderer: Boolean
}

object Dictkey {
  @scala.inline
  def apply(calledByRenderer: Boolean, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(calledByRenderer = calledByRenderer.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

