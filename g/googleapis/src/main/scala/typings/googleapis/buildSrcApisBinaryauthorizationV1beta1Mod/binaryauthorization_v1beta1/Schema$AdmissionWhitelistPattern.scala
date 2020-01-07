package typings.googleapis.buildSrcApisBinaryauthorizationV1beta1Mod.binaryauthorization_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An admission whitelist pattern exempts images from checks by admission
  * rules.
  */
@js.native
trait Schema$AdmissionWhitelistPattern extends js.Object {
  /**
    * An image name pattern to whitelist, in the form `registry/path/to/image`.
    * This supports a trailing `*` as a wildcard, but this is allowed only in
    * text after the `registry/` part.
    */
  var namePattern: js.UndefOr[String] = js.native
}

object Schema$AdmissionWhitelistPattern {
  @scala.inline
  def apply(namePattern: String = null): Schema$AdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    if (namePattern != null) __obj.updateDynamic("namePattern")(namePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AdmissionWhitelistPattern]
  }
}

