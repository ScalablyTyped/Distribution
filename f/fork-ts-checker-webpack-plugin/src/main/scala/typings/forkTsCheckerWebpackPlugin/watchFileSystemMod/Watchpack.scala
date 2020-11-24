package typings.forkTsCheckerWebpackPlugin.watchFileSystemMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watchpack extends EventEmitter {
  
  def _onChange(item: String, mtime: Double, file: String): Unit = js.native
  def _onChange(item: String, mtime: Double, file: String, `type`: String): Unit = js.native
  
  def _onRemove(item: String, file: String): Unit = js.native
  def _onRemove(item: String, file: String, `type`: String): Unit = js.native
}
