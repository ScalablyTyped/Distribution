package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declareMod {
  
  object global {
    
    /* was `typeof _Global.Buffer` */
    @JSGlobal("Buffer")
    @js.native
    class Buffer ()
      extends typings.fibjs.globalMod.Buffer
    
    /* was `typeof _Global.GC` */
    @JSGlobal("GC")
    @js.native
    def GC(): Unit = js.native
    
    /* was `typeof _Global.Int64` */
    @JSGlobal("Int64")
    @js.native
    class Int64 ()
      extends typings.fibjs.globalMod.Int64
    
    /* was `typeof _Global.Master` */
    @JSGlobal("Master")
    @js.native
    val Master: ClassWorker = js.native
    
    /* was `typeof _Global.argv` */
    @JSGlobal("argv")
    @js.native
    val argv: js.Array[js.Any] = js.native
    
    /* was `typeof _Global.clearHrInterval` */
    @JSGlobal("clearHrInterval")
    @js.native
    def clearHrInterval(t: js.Any): Unit = js.native
    
    /* was `typeof _Global.__dirname` */
    @JSGlobal("__dirname")
    @js.native
    val dirname: String = js.native
    
    @JSGlobal("exports")
    @js.native
    def exports: GlobalExportsType = js.native
    @scala.inline
    def exports_=(x: GlobalExportsType): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
    
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
    val process: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof processNS */ js.Any = js.native
    
    /* was `typeof _Global.repl` */
    @JSGlobal("repl")
    @js.native
    def repl(): Unit = js.native
    @JSGlobal("repl")
    @js.native
    def repl(cmds: js.Array[_]): Unit = js.native
    /* was `typeof _Global.repl` */
    @JSGlobal("repl")
    @js.native
    def repl(out: ClassStream): Unit = js.native
    @JSGlobal("repl")
    @js.native
    def repl(out: ClassStream, cmds: js.Array[_]): Unit = js.native
    
    /* was `typeof _Global.require` */
    @JSGlobal("require")
    @js.native
    def require(id: String): js.Any = js.native
    
    /* was `typeof _Global.setHrInterval` */
    @JSGlobal("setHrInterval")
    @js.native
    def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): ClassTimer = js.native
  }
  
  type GlobalExportsType = js.Any
  
  @js.native
  trait ModuleType extends StObject {
    
    var exports: GlobalExportsType = js.native
  }
  object ModuleType {
    
    @scala.inline
    def apply(exports: GlobalExportsType): ModuleType = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleType]
    }
    
    @scala.inline
    implicit class ModuleTypeMutableBuilder[Self <: ModuleType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: GlobalExportsType): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
}
