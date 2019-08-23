package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sound extends js.Object {
  var sound: js.UndefOr[Boolean] = js.undefined
}

object Anon_Sound {
  @scala.inline
  def apply(sound: js.UndefOr[Boolean] = js.undefined): Anon_Sound = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound)
    __obj.asInstanceOf[Anon_Sound]
  }
}

