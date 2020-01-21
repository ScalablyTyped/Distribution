package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a deobfuscation file.
  */
@js.native
trait SchemaDeobfuscationFile extends js.Object {
  /**
    * The type of the deobfuscation file.
    */
  var symbolType: js.UndefOr[String] = js.native
}

object SchemaDeobfuscationFile {
  @scala.inline
  def apply(symbolType: String = null): SchemaDeobfuscationFile = {
    val __obj = js.Dynamic.literal()
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeobfuscationFile]
  }
}

