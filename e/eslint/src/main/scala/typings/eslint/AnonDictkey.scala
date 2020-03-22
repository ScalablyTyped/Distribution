package typings.eslint

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined,
    globalReturn: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    jsx: js.UndefOr[Boolean] = js.undefined
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(experimentalObjectRestSpread)) __obj.updateDynamic("experimentalObjectRestSpread")(experimentalObjectRestSpread.asInstanceOf[js.Any])
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict.asInstanceOf[js.Any])
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

