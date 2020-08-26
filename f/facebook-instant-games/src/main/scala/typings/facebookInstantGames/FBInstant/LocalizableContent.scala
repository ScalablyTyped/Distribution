package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a string with localizations and a default value to fall back on.
  */
@js.native
trait LocalizableContent extends js.Object {
  /**
    * The default value of the string to use if the viewer's locale is not a key in the localizations object.
    */
  var default: String = js.native
  /**
    *  Specifies what string to use for viewers in each locale. See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    */
  var localizations: LocalizationsDict = js.native
}

object LocalizableContent {
  @scala.inline
  def apply(default: String, localizations: LocalizationsDict): LocalizableContent = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], localizations = localizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizableContent]
  }
  @scala.inline
  implicit class LocalizableContentOps[Self <: LocalizableContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalizations(value: LocalizationsDict): Self = this.set("localizations", value.asInstanceOf[js.Any])
  }
  
}

