package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief timers 模块
  * @detail 
  */
object timersMod {
  
  @JSImport("timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def call(func: js.Function, timeout: Double, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clearHrInterval(t: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHrInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearImmediate(t: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearInterval(t: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearTimeout(t: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setHrInterval")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassTimer]
  
  @scala.inline
  def setImmediate(callback: js.Function, args: js.Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassTimer]
  
  @scala.inline
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassTimer]
  
  @scala.inline
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassTimer]
  @scala.inline
  def setTimeout(callback: js.Function, timeout: Unit, args: js.Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ClassTimer]
}
