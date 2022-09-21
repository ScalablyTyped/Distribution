package typings.fullcalendarCommon.mod

import typings.std.Parameters
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "Emitter")
@js.native
open class Emitter[HandlerFuncs /* <: HandlerFuncTypeHash */] () extends StObject {
  
  /* private */ var handlers: Any = js.native
  
  def hasHandlers(`type`: /* keyof HandlerFuncs */ String): Boolean = js.native
  
  def off[Prop /* <: /* keyof HandlerFuncs */ String */](`type`: Prop): Unit = js.native
  def off[Prop /* <: /* keyof HandlerFuncs */ String */](
    `type`: Prop,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: HandlerFuncs[Prop] */ js.Any
  ): Unit = js.native
  
  def on[Prop /* <: /* keyof HandlerFuncs */ String */](
    `type`: Prop,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: HandlerFuncs[Prop] */ js.Any
  ): Unit = js.native
  
  /* private */ var options: Any = js.native
  
  def setOptions(options: Partial[HandlerFuncs]): Unit = js.native
  
  def setThisContext(thisContext: Any): Unit = js.native
  
  /* private */ var thisContext: Any = js.native
  
  def trigger[Prop /* <: /* keyof HandlerFuncs */ String */](
    `type`: Prop,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<HandlerFuncs[Prop]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: HandlerFuncs[Prop] */ js.Any
    ]
  ): Unit = js.native
}
