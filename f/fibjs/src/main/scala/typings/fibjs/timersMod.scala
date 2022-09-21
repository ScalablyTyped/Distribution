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
  
  inline def call(func: js.Function, timeout: Double, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("call")((List(func.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def clearHrInterval(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearHrInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearImmediate(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearImmediate")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearInterval(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setHrInterval(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setHrInterval")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  
  inline def setImmediate(callback: js.Function, args: Any*): ClassTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("setImmediate")(List(callback.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClassTimer]
  
  inline def setInterval(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  
  inline def setTimeout(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  inline def setTimeout(callback: js.Function, timeout: Unit, args: Any*): ClassTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")((List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
}
