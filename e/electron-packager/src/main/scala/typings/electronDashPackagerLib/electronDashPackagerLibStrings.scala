package typings
package electronDashPackagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object electronDashPackagerLibStrings {
  @js.native
  sealed trait all
    extends electronDashPackagerLib.electronDashPackagerMod.arch
       with electronDashPackagerLib.electronDashPackagerMod.platform
  
  @js.native
  sealed trait arm64
    extends electronDashPackagerLib.electronDashPackagerMod.arch
  
  @js.native
  sealed trait armv7l
    extends electronDashPackagerLib.electronDashPackagerMod.arch
  
  @js.native
  sealed trait asInvoker extends js.Object
  
  @js.native
  sealed trait darwin
    extends electronDashPackagerLib.electronDashPackagerMod.platform
  
  @js.native
  sealed trait highestAvailable extends js.Object
  
  @js.native
  sealed trait ia32
    extends electronDashPackagerLib.electronDashPackagerMod.arch
  
  @js.native
  sealed trait linux
    extends electronDashPackagerLib.electronDashPackagerMod.platform
  
  @js.native
  sealed trait mas
    extends electronDashPackagerLib.electronDashPackagerMod.platform
  
  @js.native
  sealed trait mips64el
    extends electronDashPackagerLib.electronDashPackagerMod.arch
  
  @js.native
  sealed trait requireAdministrator extends js.Object
  
  @js.native
  sealed trait win32
    extends electronDashPackagerLib.electronDashPackagerMod.platform
  
  @js.native
  sealed trait x64
    extends electronDashPackagerLib.electronDashPackagerMod.arch
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def arm64: arm64 = "arm64".asInstanceOf[arm64]
  @scala.inline
  def armv7l: armv7l = "armv7l".asInstanceOf[armv7l]
  @scala.inline
  def asInvoker: asInvoker = "asInvoker".asInstanceOf[asInvoker]
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  @scala.inline
  def highestAvailable: highestAvailable = "highestAvailable".asInstanceOf[highestAvailable]
  @scala.inline
  def ia32: ia32 = "ia32".asInstanceOf[ia32]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def mas: mas = "mas".asInstanceOf[mas]
  @scala.inline
  def mips64el: mips64el = "mips64el".asInstanceOf[mips64el]
  @scala.inline
  def requireAdministrator: requireAdministrator = "requireAdministrator".asInstanceOf[requireAdministrator]
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
}

