package typings.exit

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A replacement for process.exit that ensures stdio are fully drained before exiting.
    */
  @JSImport("exit", JSImport.Namespace)
  @js.native
  def apply(code: Double): Unit = js.native
  @JSImport("exit", JSImport.Namespace)
  @js.native
  def apply(code: Double, streams: js.Tuple2[WritableStream, WritableStream]): Unit = js.native
}
