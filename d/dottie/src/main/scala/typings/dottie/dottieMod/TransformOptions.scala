package typings.dottie.dottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  /**
    * Use a custom delimiter for path
    */
  var delimiter: js.UndefOr[String] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(delimiter: String = null): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[TransformOptions]
  }
}

