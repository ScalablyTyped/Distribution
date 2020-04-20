package typings.getos.mod

import typings.getos.getosStrings.aix
import typings.getos.getosStrings.android
import typings.getos.getosStrings.cygwin
import typings.getos.getosStrings.darwin
import typings.getos.getosStrings.freebsd
import typings.getos.getosStrings.openbsd
import typings.getos.getosStrings.sunos
import typings.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOs extends Os {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin
}

object OtherOs {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOs]
  }
}

