package typings.framesync.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends js.Object {
  
  def cancel(process: Process): Unit = js.native
  
  def process(frame: FrameData): Unit = js.native
  
  def schedule(process: Process): Unit = js.native
  def schedule(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Unit = js.native
  def schedule(process: Process, keepAlive: Boolean): Unit = js.native
  def schedule(process: Process, keepAlive: Boolean, immediate: Boolean): Unit = js.native
}
