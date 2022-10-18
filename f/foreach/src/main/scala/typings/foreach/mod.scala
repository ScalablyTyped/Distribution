package typings.foreach

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Performs the specified action for each own property in an object.
    *
    * @param callbackfn A function that accepts up to three arguments.
    *        `forEach` calls the `callbackfn` function one time for each own property in the object.
    * @param thisArg A value to which the `this` keyword can refer in the `callbackfn` function.
    *        If `thisArg` is omitted, `undefined` is used as the `this` value.
    */
  inline def apply[O /* <: Record[String, Any] */, THIS_ARG](
    target: O,
    callbackfn: js.ThisFunction3[
      /* this */ THIS_ARG, 
      /* import warning: importer.ImportType#apply Failed type conversion: O extends std.Record<string, infer T> ? T : unknown */ /* value */ /* import warning: importer.ImportType#apply Failed type conversion: O extends std.ArrayLike<infer T> ? T : unknown */ js.Any, 
      (/* index */ Double) | (/* property */ String), 
      /* target */ /* array */ O, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[O /* <: Record[String, Any] */, THIS_ARG](
    target: O,
    callbackfn: js.ThisFunction3[
      /* this */ THIS_ARG, 
      /* import warning: importer.ImportType#apply Failed type conversion: O extends std.Record<string, infer T> ? T : unknown */ /* value */ /* import warning: importer.ImportType#apply Failed type conversion: O extends std.ArrayLike<infer T> ? T : unknown */ js.Any, 
      (/* index */ Double) | (/* property */ String), 
      /* target */ /* array */ O, 
      Unit
    ],
    thisArg: THIS_ARG
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("foreach", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
