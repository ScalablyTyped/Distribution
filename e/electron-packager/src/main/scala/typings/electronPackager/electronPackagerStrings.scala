package typings.electronPackager

import typings.electronPackager.mod.OfficialArch
import typings.electronPackager.mod.OfficialPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronPackagerStrings {
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait arm64
    extends StObject
       with OfficialArch
  @scala.inline
  def arm64: arm64 = "arm64".asInstanceOf[arm64]
  
  @js.native
  sealed trait armv7l
    extends StObject
       with OfficialArch
  @scala.inline
  def armv7l: armv7l = "armv7l".asInstanceOf[armv7l]
  
  @js.native
  sealed trait asInvoker extends StObject
  @scala.inline
  def asInvoker: asInvoker = "asInvoker".asInstanceOf[asInvoker]
  
  @js.native
  sealed trait darwin
    extends StObject
       with OfficialPlatform
  @scala.inline
  def darwin: darwin = "darwin".asInstanceOf[darwin]
  
  @js.native
  sealed trait highestAvailable extends StObject
  @scala.inline
  def highestAvailable: highestAvailable = "highestAvailable".asInstanceOf[highestAvailable]
  
  @js.native
  sealed trait ia32
    extends StObject
       with OfficialArch
  @scala.inline
  def ia32: ia32 = "ia32".asInstanceOf[ia32]
  
  @js.native
  sealed trait linux
    extends StObject
       with OfficialPlatform
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait mas
    extends StObject
       with OfficialPlatform
  @scala.inline
  def mas: mas = "mas".asInstanceOf[mas]
  
  @js.native
  sealed trait mips64el
    extends StObject
       with OfficialArch
  @scala.inline
  def mips64el: mips64el = "mips64el".asInstanceOf[mips64el]
  
  @js.native
  sealed trait requireAdministrator extends StObject
  @scala.inline
  def requireAdministrator: requireAdministrator = "requireAdministrator".asInstanceOf[requireAdministrator]
  
  @js.native
  sealed trait win32
    extends StObject
       with OfficialPlatform
  @scala.inline
  def win32: win32 = "win32".asInstanceOf[win32]
  
  @js.native
  sealed trait x64
    extends StObject
       with OfficialArch
  @scala.inline
  def x64: x64 = "x64".asInstanceOf[x64]
}
