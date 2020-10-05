package typings.electron.Electron

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageChannelMain extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/message-channel-main
  var port1: MessagePortMain = js.native
  var port2: MessagePortMain = js.native
}

