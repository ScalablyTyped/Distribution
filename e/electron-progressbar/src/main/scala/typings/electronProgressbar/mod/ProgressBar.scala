package typings.electronProgressbar.mod

import typings.electronProgressbar.electronProgressbarStrings.aborted
import typings.electronProgressbar.electronProgressbarStrings.completed
import typings.electronProgressbar.electronProgressbarStrings.progress
import typings.electronProgressbar.electronProgressbarStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBar extends js.Object {
  
  def close(): Unit = js.native
  
  var detail: String = js.native
  
  def getOptions(): ProgressBarOptions = js.native
  
  def isCompleted(): Boolean = js.native
  
  def isInProgress(): Boolean = js.native
  
  @JSName("on")
  def on_aborted(eventName: aborted, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_completed(eventName: completed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_progress(eventName: progress, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
  
  def setCompleted(): Unit = js.native
  
  var text: String = js.native
  
  var value: Double = js.native
}
