package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Architectures that have been supported by the official Electron prebuilt binaries, past
  * and present.
  */
/* Rewritten from type alias, can be one of: 
  - typings.electronPackager.electronPackagerStrings.ia32
  - typings.electronPackager.electronPackagerStrings.x64
  - typings.electronPackager.electronPackagerStrings.armv7l
  - typings.electronPackager.electronPackagerStrings.arm64
  - typings.electronPackager.electronPackagerStrings.mips64el
*/
trait OfficialArch extends js.Object
object OfficialArch {
  
  @scala.inline
  def arm64: typings.electronPackager.electronPackagerStrings.arm64 = "arm64".asInstanceOf[typings.electronPackager.electronPackagerStrings.arm64]
  
  @scala.inline
  def armv7l: typings.electronPackager.electronPackagerStrings.armv7l = "armv7l".asInstanceOf[typings.electronPackager.electronPackagerStrings.armv7l]
  
  @scala.inline
  def ia32: typings.electronPackager.electronPackagerStrings.ia32 = "ia32".asInstanceOf[typings.electronPackager.electronPackagerStrings.ia32]
  
  @scala.inline
  def mips64el: typings.electronPackager.electronPackagerStrings.mips64el = "mips64el".asInstanceOf[typings.electronPackager.electronPackagerStrings.mips64el]
  
  @scala.inline
  def x64: typings.electronPackager.electronPackagerStrings.x64 = "x64".asInstanceOf[typings.electronPackager.electronPackagerStrings.x64]
}
