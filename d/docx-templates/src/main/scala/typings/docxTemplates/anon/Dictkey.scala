package typings.docxTemplates.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sax.mod.QualifiedAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[QualifiedAttribute | String] {
  var ContentType: js.UndefOr[String] = js.undefined
  var Extension: js.UndefOr[String] = js.undefined
  var PartName: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    ContentType: String = null,
    Extension: String = null,
    PartName: String = null,
    StringDictionary: /* key */ StringDictionary[QualifiedAttribute | String] = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (Extension != null) __obj.updateDynamic("Extension")(Extension.asInstanceOf[js.Any])
    if (PartName != null) __obj.updateDynamic("PartName")(PartName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

