package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelayedRunner extends StObject {
  
  def clear(): Unit = js.native
  
  /* private */ var clearTimeout: Any = js.native
  
  /* protected */ def drained(): Unit = js.native
  
  /* private */ var drainedOption: Any = js.native
  
  /* private */ var isDirty: Any = js.native
  
  def isPaused(): Double = js.native
  
  /* private */ var isRunning: Any = js.native
  
  def pause(): Unit = js.native
  def pause(scope: String): Unit = js.native
  
  /* private */ var pauseDepths: Any = js.native
  
  def request(): Unit = js.native
  def request(delay: Double): Unit = js.native
  
  def resume(): Unit = js.native
  def resume(scope: String): Unit = js.native
  def resume(scope: String, force: Boolean): Unit = js.native
  def resume(scope: Unit, force: Boolean): Unit = js.native
  
  /* private */ var timeoutId: Any = js.native
  
  def tryDrain(): Unit = js.native
}
