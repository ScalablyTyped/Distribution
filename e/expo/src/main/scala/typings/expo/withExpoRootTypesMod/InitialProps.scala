package typings.expo.withExpoRootTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialProps
  extends /* key */ StringDictionary[js.Any] {
  var exp: AnonDictkey
  var shell: js.UndefOr[Boolean] = js.undefined
  var shellManifestUrl: js.UndefOr[String] = js.undefined
}

object InitialProps {
  @scala.inline
  def apply(
    exp: AnonDictkey,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    shell: js.UndefOr[Boolean] = js.undefined,
    shellManifestUrl: String = null
  ): InitialProps = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(shell)) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (shellManifestUrl != null) __obj.updateDynamic("shellManifestUrl")(shellManifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
}

