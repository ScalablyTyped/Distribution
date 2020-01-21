package typings.electron.mod

import typings.electron.electronStrings.host
import typings.electron.electronStrings.hostname
import typings.electron.electronStrings.method
import typings.electron.electronStrings.partition
import typings.electron.electronStrings.path
import typings.electron.electronStrings.port
import typings.electron.electronStrings.redirect
import typings.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "ClientRequest")
@js.native
class ClientRequest protected ()
  extends typings.electron.Electron.ClientRequest {
  def this(options: method | url | typings.electron.electronStrings.session | partition | typings.electron.electronStrings.protocol | host | hostname | port | path | redirect) = this()
}

