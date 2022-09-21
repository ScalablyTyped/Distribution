package typings.exit

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A replacement for process.exit that ensures stdio are fully drained before exiting.
    */
  inline def apply(code: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(code: Double, streams: js.Tuple2[WritableStream[Any], WritableStream[Any]]): Unit = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], streams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("exit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
