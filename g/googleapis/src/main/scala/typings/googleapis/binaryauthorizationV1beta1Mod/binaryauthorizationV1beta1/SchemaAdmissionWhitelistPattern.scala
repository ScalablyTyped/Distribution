package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An admission whitelist pattern exempts images from checks by admission
  * rules.
  */
@js.native
trait SchemaAdmissionWhitelistPattern extends js.Object {
  /**
    * An image name pattern to whitelist, in the form `registry/path/to/image`.
    * This supports a trailing `*` as a wildcard, but this is allowed only in
    * text after the `registry/` part.
    */
  var namePattern: js.UndefOr[String] = js.native
}

object SchemaAdmissionWhitelistPattern {
  @scala.inline
  def apply(): SchemaAdmissionWhitelistPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdmissionWhitelistPattern]
  }
  @scala.inline
  implicit class SchemaAdmissionWhitelistPatternOps[Self <: SchemaAdmissionWhitelistPattern] (val x: Self) extends AnyVal {
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
    def setNamePattern(value: String): Self = this.set("namePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePattern: Self = this.set("namePattern", js.undefined)
  }
  
}

