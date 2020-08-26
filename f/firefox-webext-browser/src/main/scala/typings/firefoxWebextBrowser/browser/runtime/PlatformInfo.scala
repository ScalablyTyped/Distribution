package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the current platform. */
@js.native
trait PlatformInfo extends js.Object {
  /** The machine's processor architecture. */
  var arch: PlatformArch = js.native
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @deprecated Unsupported on Firefox at this time.
    */
  var nacl_arch: js.UndefOr[PlatformNaclArch] = js.native
  /** The operating system the browser is running on. */
  var os: PlatformOs = js.native
}

object PlatformInfo {
  @scala.inline
  def apply(arch: PlatformArch, os: PlatformOs): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  @scala.inline
  implicit class PlatformInfoOps[Self <: PlatformInfo] (val x: Self) extends AnyVal {
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
    def setArch(value: PlatformArch): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: PlatformOs): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setNacl_arch(value: PlatformNaclArch): Self = this.set("nacl_arch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNacl_arch: Self = this.set("nacl_arch", js.undefined)
  }
  
}

