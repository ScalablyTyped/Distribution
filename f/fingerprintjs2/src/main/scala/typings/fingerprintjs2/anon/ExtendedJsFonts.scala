package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedJsFonts extends js.Object {
  var extendedJsFonts: Boolean = js.native
  var swfContainerId: String = js.native
  var swfPath: String = js.native
  var userDefinedFonts: js.Array[String] = js.native
}

object ExtendedJsFonts {
  @scala.inline
  def apply(
    extendedJsFonts: Boolean,
    swfContainerId: String,
    swfPath: String,
    userDefinedFonts: js.Array[String]
  ): ExtendedJsFonts = {
    val __obj = js.Dynamic.literal(extendedJsFonts = extendedJsFonts.asInstanceOf[js.Any], swfContainerId = swfContainerId.asInstanceOf[js.Any], swfPath = swfPath.asInstanceOf[js.Any], userDefinedFonts = userDefinedFonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedJsFonts]
  }
  @scala.inline
  implicit class ExtendedJsFontsOps[Self <: ExtendedJsFonts] (val x: Self) extends AnyVal {
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
    def setExtendedJsFonts(value: Boolean): Self = this.set("extendedJsFonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwfContainerId(value: String): Self = this.set("swfContainerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwfPath(value: String): Self = this.set("swfPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDefinedFontsVarargs(value: String*): Self = this.set("userDefinedFonts", js.Array(value :_*))
    @scala.inline
    def setUserDefinedFonts(value: js.Array[String]): Self = this.set("userDefinedFonts", value.asInstanceOf[js.Any])
  }
  
}

