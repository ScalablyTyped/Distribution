package typings.getos.mod

import typings.getos.getosStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxOs extends Os {
  var codename: js.UndefOr[String] = js.undefined
  var dist: String
  var os: linux
  var release: String
}

object LinuxOs {
  @scala.inline
  def apply(dist: String, os: linux, release: String, codename: String = null): LinuxOs = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxOs]
  }
}

