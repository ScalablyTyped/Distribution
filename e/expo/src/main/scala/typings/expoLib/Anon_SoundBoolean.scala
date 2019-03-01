package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SoundBoolean extends js.Object {
  var sound: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_SoundBoolean {
  @scala.inline
  def apply(sound: js.UndefOr[scala.Boolean] = js.undefined): Anon_SoundBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[Anon_SoundBoolean]
  }
}

