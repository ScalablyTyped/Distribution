package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a list of words or phrases to search for in the data.
  */
@js.native
trait Schema$GooglePrivacyDlpV2WordList extends js.Object {
  /**
    * Words or phrases defining the dictionary. The dictionary must contain at
    * least one phrase and every phrase must contain at least 2 characters that
    * are letters or digits. [required]
    */
  var words: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GooglePrivacyDlpV2WordList {
  @scala.inline
  def apply(words: js.Array[String] = null): Schema$GooglePrivacyDlpV2WordList = {
    val __obj = js.Dynamic.literal()
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2WordList]
  }
}

