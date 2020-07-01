package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Platforms that have been supported by the official Electron prebuilt binaries, past and present.
  */
/* Rewritten from type alias, can be one of: 
  - typings.electronPackager.electronPackagerStrings.linux
  - typings.electronPackager.electronPackagerStrings.win32
  - typings.electronPackager.electronPackagerStrings.darwin
  - typings.electronPackager.electronPackagerStrings.mas
*/
trait OfficialPlatform extends js.Object

object OfficialPlatform {
  @scala.inline
  def darwin: typings.electronPackager.electronPackagerStrings.darwin = "darwin".asInstanceOf[typings.electronPackager.electronPackagerStrings.darwin]
  @scala.inline
  def linux: typings.electronPackager.electronPackagerStrings.linux = "linux".asInstanceOf[typings.electronPackager.electronPackagerStrings.linux]
  @scala.inline
  def mas: typings.electronPackager.electronPackagerStrings.mas = "mas".asInstanceOf[typings.electronPackager.electronPackagerStrings.mas]
  @scala.inline
  def win32: typings.electronPackager.electronPackagerStrings.win32 = "win32".asInstanceOf[typings.electronPackager.electronPackagerStrings.win32]
}

