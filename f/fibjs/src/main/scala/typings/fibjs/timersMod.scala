package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief timers 模块
  * @detail 
  */
object timersMod {
  
  @JSImport("timers", "call")
  @js.native
  def call(func: js.Function, timeout: Double, args: js.Any*): js.Any = js.native
  
  @JSImport("timers", "clearHrInterval")
  @js.native
  def clearHrInterval(t: js.Any): Unit = js.native
  
  @JSImport("timers", "clearImmediate")
  @js.native
  def clearImmediate(t: js.Any): Unit = js.native
  
  @JSImport("timers", "clearInterval")
  @js.native
  def clearInterval(t: js.Any): Unit = js.native
  
  @JSImport("timers", "clearTimeout")
  @js.native
  def clearTimeout(t: js.Any): Unit = js.native
  
  @JSImport("timers", "setHrInterval")
  @js.native
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  @JSImport("timers", "setImmediate")
  @js.native
  def setImmediate(callback: js.Function, args: js.Any*): ClassTimer = js.native
  
  @JSImport("timers", "setInterval")
  @js.native
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  
  @JSImport("timers", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function, timeout: js.UndefOr[scala.Nothing], args: js.Any*): ClassTimer = js.native
  @JSImport("timers", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
}
