package typings.getos.getosMod

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
    val __obj = js.Dynamic.literal(dist = dist, os = os, release = release)
    if (codename != null) __obj.updateDynamic("codename")(codename)
    __obj.asInstanceOf[LinuxOs]
  }
}

