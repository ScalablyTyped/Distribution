package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransporterOptions extends js.Object {
  var ascProvider: js.UndefOr[String] = js.undefined
}

object TransporterOptions {
  @scala.inline
  def apply(ascProvider: String = null): TransporterOptions = {
    val __obj = js.Dynamic.literal()
    if (ascProvider != null) __obj.updateDynamic("ascProvider")(ascProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransporterOptions]
  }
}

