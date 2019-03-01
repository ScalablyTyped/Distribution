package typings
package fingerprintjs2Lib.fingerprintjs2Mod.Fingerprint2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ERROR: js.UndefOr[java.lang.String] = js.undefined
  var EXCLUDED: js.UndefOr[java.lang.String] = js.undefined
  var NOT_AVAILABLE: js.UndefOr[java.lang.String] = js.undefined
  var audio: js.UndefOr[fingerprintjs2Lib.Anon_ExcludeIOS11] = js.undefined
  var excludes: js.UndefOr[fingerprintjs2Lib.Anon_AdBlock] = js.undefined
  var extraComponents: js.UndefOr[js.Array[fingerprintjs2Lib.Anon_Done]] = js.undefined
  var fonts: js.UndefOr[fingerprintjs2Lib.Anon_ExtendedJsFonts] = js.undefined
  var plugins: js.UndefOr[fingerprintjs2Lib.Anon_ExcludeIE] = js.undefined
  var preprocessor: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  var screen: js.UndefOr[fingerprintjs2Lib.Anon_DetectScreenOrientation] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ERROR: java.lang.String = null,
    EXCLUDED: java.lang.String = null,
    NOT_AVAILABLE: java.lang.String = null,
    audio: fingerprintjs2Lib.Anon_ExcludeIOS11 = null,
    excludes: fingerprintjs2Lib.Anon_AdBlock = null,
    extraComponents: js.Array[fingerprintjs2Lib.Anon_Done] = null,
    fonts: fingerprintjs2Lib.Anon_ExtendedJsFonts = null,
    plugins: fingerprintjs2Lib.Anon_ExcludeIE = null,
    preprocessor: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = null,
    screen: fingerprintjs2Lib.Anon_DetectScreenOrientation = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ERROR != null) __obj.updateDynamic("ERROR")(ERROR)
    if (EXCLUDED != null) __obj.updateDynamic("EXCLUDED")(EXCLUDED)
    if (NOT_AVAILABLE != null) __obj.updateDynamic("NOT_AVAILABLE")(NOT_AVAILABLE)
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (extraComponents != null) __obj.updateDynamic("extraComponents")(extraComponents)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (preprocessor != null) __obj.updateDynamic("preprocessor")(preprocessor)
    if (screen != null) __obj.updateDynamic("screen")(screen)
    __obj.asInstanceOf[Options]
  }
}

