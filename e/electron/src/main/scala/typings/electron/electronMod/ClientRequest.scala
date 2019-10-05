package typings.electron.electronMod

import typings.electron.electronStrings.host
import typings.electron.electronStrings.hostname
import typings.electron.electronStrings.method
import typings.electron.electronStrings.partition
import typings.electron.electronStrings.path
import typings.electron.electronStrings.port
import typings.electron.electronStrings.protocol
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.session
import typings.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "ClientRequest")
@js.native
class ClientRequest protected ()
  extends typings.electron.Electron.ClientRequest {
  def this(options: method | url | session | partition | protocol | host | hostname | port | path | redirect) = this()
}

