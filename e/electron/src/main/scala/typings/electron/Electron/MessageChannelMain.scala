package typings.electron.Electron

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageChannelMain extends EventEmitter {
  
  // Docs: https://electronjs.org/docs/api/message-channel-main
  var port1: MessagePortMain = js.native
  
  var port2: MessagePortMain = js.native
}
