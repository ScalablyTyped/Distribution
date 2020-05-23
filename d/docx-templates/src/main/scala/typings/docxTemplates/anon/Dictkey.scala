package typings.docxTemplates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sax.mod.QualifiedAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[QualifiedAttribute | String] {
  var Extension: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    Extension: String = null,
    StringDictionary: /* key */ StringDictionary[QualifiedAttribute | String] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (Extension != null) __obj.updateDynamic("Extension")(Extension.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

