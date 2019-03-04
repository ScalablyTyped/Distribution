package typings
package getosLib.getosMod.getosNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxOs extends Os {
  var codename: js.UndefOr[java.lang.String] = js.undefined
  var dist: java.lang.String
  var os: getosLib.getosLibStrings.linux
  var release: java.lang.String
}

object LinuxOs {
  @scala.inline
  def apply(
    dist: java.lang.String,
    os: getosLib.getosLibStrings.linux,
    release: java.lang.String,
    codename: java.lang.String = null
  ): LinuxOs = {
    val __obj = js.Dynamic.literal(dist = dist, os = os, release = release)
    if (codename != null) __obj.updateDynamic("codename")(codename)
    __obj.asInstanceOf[LinuxOs]
  }
}

