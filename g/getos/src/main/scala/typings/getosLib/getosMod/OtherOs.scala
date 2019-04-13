package typings
package getosLib.getosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOs extends Os {
  var os: getosLib.getosLibStrings.aix | getosLib.getosLibStrings.android | getosLib.getosLibStrings.darwin | getosLib.getosLibStrings.freebsd | getosLib.getosLibStrings.openbsd | getosLib.getosLibStrings.sunos | getosLib.getosLibStrings.win32 | getosLib.getosLibStrings.cygwin
}

object OtherOs {
  @scala.inline
  def apply(
    os: getosLib.getosLibStrings.aix | getosLib.getosLibStrings.android | getosLib.getosLibStrings.darwin | getosLib.getosLibStrings.freebsd | getosLib.getosLibStrings.openbsd | getosLib.getosLibStrings.sunos | getosLib.getosLibStrings.win32 | getosLib.getosLibStrings.cygwin
  ): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOs]
  }
}

