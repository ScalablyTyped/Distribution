package typings.forkTsCheckerWebpackPlugin.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceBeforeStart
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.cancel
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceStartError
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.waiting
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceStart
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.receive
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceOutOfMemory
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.emit
  - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.done
*/
trait ForkTsCheckerHooks extends js.Object

object ForkTsCheckerHooks {
  @scala.inline
  def cancel: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.cancel = this.cast("cancel")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.done = this.cast("done")
  @scala.inline
  def emit: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.emit = this.cast("emit")
  @scala.inline
  def receive: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.receive = this.cast("receive")
  @scala.inline
  def serviceBeforeStart: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceBeforeStart = this.cast("serviceBeforeStart")
  @scala.inline
  def serviceOutOfMemory: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceOutOfMemory = this.cast("serviceOutOfMemory")
  @scala.inline
  def serviceStart: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceStart = this.cast("serviceStart")
  @scala.inline
  def serviceStartError: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.serviceStartError = this.cast("serviceStartError")
  @scala.inline
  def waiting: typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.waiting = this.cast("waiting")
}

