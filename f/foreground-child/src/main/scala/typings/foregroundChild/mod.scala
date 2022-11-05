package typings.foregroundChild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(program: String): Unit = ^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(
    program: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [args: ...Array<string>, cb: CloseHandler] is not an array type */ args: /* args */ Array[CloseHandler | String]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(program: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].apply(scala.List(program.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def apply(program: String, args: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(program: String, args: js.Array[String], cb: CloseHandler): Unit = (^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any], args.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(program: String, cb: CloseHandler): Unit = (^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(program: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(program: js.Array[String], cb: CloseHandler): Unit = (^.asInstanceOf[js.Dynamic].apply(program.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("foreground-child", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CloseHandler = js.Function1[/* done */ js.Function0[Unit], Unit | js.Promise[Unit]]
}
