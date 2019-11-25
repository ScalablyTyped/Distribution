package typings.formol

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_K
  extends /* k */ StringDictionary[js.Any] {
  var no: ReactNode
  var yes: ReactNode
}

object Anon_K {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    no: ReactNode = null,
    yes: ReactNode = null
  ): Anon_K = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_K]
  }
}

