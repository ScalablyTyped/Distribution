package typings.ethersprojectProviders.baseProviderMod

import typings.ethersprojectAbstractProvider.mod.EventType
import typings.ethersprojectAbstractProvider.mod.Filter
import typings.ethersprojectAbstractProvider.mod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/base-provider", "Event")
@js.native
class Event protected () extends js.Object {
  def this(tag: String, listener: Listener, once: Boolean) = this()
  
  def event: EventType = js.native
  
  def filter: Filter = js.native
  
  def hash: String = js.native
  
  def listener(args: js.Any*): Unit = js.native
  
  val once: Boolean = js.native
  
  def pollable(): Boolean = js.native
  
  val tag: String = js.native
  
  def `type`: String = js.native
}
