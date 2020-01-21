package typings.dmgBuilder.licenseButtonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseButtonsFile extends js.Object {
  var file: String
  var lang: String
  var langName: String
  var langWithRegion: String
}

object LicenseButtonsFile {
  @scala.inline
  def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseButtonsFile = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LicenseButtonsFile]
  }
}

