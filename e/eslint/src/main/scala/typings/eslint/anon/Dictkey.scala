package typings.eslint.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined,
    globalReturn: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(experimentalObjectRestSpread)) __obj.updateDynamic("experimentalObjectRestSpread")(experimentalObjectRestSpread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

