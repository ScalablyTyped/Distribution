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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherOs extends Os {
  
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin = js.native
}
object OtherOs {
  
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOs]
  }
  
  @scala.inline
  implicit class OtherOsOps[Self <: OtherOs] (val x: Self) extends AnyVal {
    
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
    def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = this.set("os", value.asInstanceOf[js.Any])
  }
}
