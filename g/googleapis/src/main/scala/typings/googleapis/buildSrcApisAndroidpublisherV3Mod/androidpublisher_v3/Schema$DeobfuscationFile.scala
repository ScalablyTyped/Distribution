package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a deobfuscation file.
  */
@js.native
trait Schema$DeobfuscationFile extends js.Object {
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.native
}

object Schema$DeobfuscationFile {
  @scala.inline
  def apply(symbolType: String = null): Schema$DeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeobfuscationFile]
  }
}

