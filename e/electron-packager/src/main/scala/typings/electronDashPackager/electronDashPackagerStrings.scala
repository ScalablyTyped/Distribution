package typings.electronDashPackager

import typings.electronDashPackager.electronDashPackagerMod.arch
import typings.electronDashPackager.electronDashPackagerMod.platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object electronDashPackagerStrings {
  @js.native
  sealed trait all
    extends arch
       with platform
  
  @js.native
  sealed trait appBundleId extends js.Object
  
  @js.native
  sealed trait appPath extends js.Object
  
  @js.native
  sealed trait arm64 extends arch
  
  @js.native
  sealed trait armv7l extends arch
  
  @js.native
  sealed trait asInvoker extends js.Object
  
  @js.native
  sealed trait darwin extends platform
  
  @js.native
  sealed trait highestAvailable extends js.Object
  
  @js.native
  sealed trait ia32 extends arch
  
  @js.native
  sealed trait linux extends platform
  
  @js.native
  sealed trait mas extends platform
  
  @js.native
  sealed trait mips64el extends arch
  
  @js.native
  sealed trait requireAdministrator extends js.Object
  
  @js.native
  sealed trait win32 extends platform
  
  @js.native
  sealed trait x64 extends arch
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def appBundleId: appBundleId = "appBundleId".asInstanceOf[appBundleId]
  @scala.inline
  def appPath: appPath = "appPath".asInstanceOf[appPath]
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

