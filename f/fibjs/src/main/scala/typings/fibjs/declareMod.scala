package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declareMod {
  
  object global {
    
    /* was `typeof _Global.Buffer` */
    @JSGlobal("Buffer")
    @js.native
    open class Buffer ()
      extends typings.fibjs.globalMod.Buffer
    
    /* was `typeof _Global.GC` */
    inline def GC(): Unit = js.Dynamic.global.applyDynamic("GC")().asInstanceOf[Unit]
    
    /* was `typeof _Global.Int64` */
    @JSGlobal("Int64")
    @js.native
    open class Int64 ()
      extends typings.fibjs.globalMod.Int64
    
    /* was `typeof _Global.Master` */
    @JSGlobal("Master")
    @js.native
    val Master: ClassWorker = js.native
    
    /* was `typeof _Global.argv` */
    @JSGlobal("argv")
    @js.native
    val argv: js.Array[Any] = js.native
    
    /* was `typeof _Global.clearHrInterval` */
    inline def clearHrInterval(t: Any): Unit = js.Dynamic.global.applyDynamic("clearHrInterval")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* was `typeof _Global.__dirname` */
    @JSGlobal("__dirname")
    @js.native
    val dirname: String = js.native
    
    @JSGlobal("exports")
    @js.native
    def exports: GlobalExportsType = js.native
    inline def exports_=(x: GlobalExportsType): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
    
    /* was `typeof _Global.__filename` */
    @JSGlobal("__filename")
    @js.native
    val filename: String = js.native
    
    /* was `typeof _Global.global` */
    @JSGlobal("global")
    @js.native
    val global: js.Object = js.native
    
    @JSGlobal("module")
    @js.native
    val module: ModuleType = js.native
    
    /* was `typeof _Global.process` */
    @JSGlobal("process")
    @js.native
    val process: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof processNS */ Any = js.native
    
    /* was `typeof _Global.repl` */
    inline def repl(): Unit = js.Dynamic.global.applyDynamic("repl")().asInstanceOf[Unit]
    inline def repl(cmds: js.Array[Any]): Unit = js.Dynamic.global.applyDynamic("repl")(cmds.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* was `typeof _Global.repl` */
    inline def repl(out: ClassStream): Unit = js.Dynamic.global.applyDynamic("repl")(out.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def repl(out: ClassStream, cmds: js.Array[Any]): Unit = (js.Dynamic.global.applyDynamic("repl")(out.asInstanceOf[js.Any], cmds.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* was `typeof _Global.require` */
    inline def require(id: String): Any = js.Dynamic.global.applyDynamic("require")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* was `typeof _Global.setHrInterval` */
    inline def setHrInterval(callback: js.Function, timeout: Double, args: Any*): ClassTimer = (js.Dynamic.global.applyDynamic("setHrInterval")((scala.List(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ClassTimer]
  }
  
  type GlobalExportsType = Any
  
  trait ModuleType extends StObject {
    
    var exports: GlobalExportsType
  }
  object ModuleType {
    
    inline def apply(exports: GlobalExportsType): ModuleType = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleType]
    }
    
    extension [Self <: ModuleType](x: Self) {
      
      inline def setExports(value: GlobalExportsType): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
}
