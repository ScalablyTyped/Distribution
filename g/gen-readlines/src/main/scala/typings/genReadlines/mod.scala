package typings.genReadlines

import typings.genReadlines.anon.BufferSize
import typings.genReadlines.anon.MaxLineLength
import typings.node.bufferMod.global.Buffer
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gen-readlines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fd: Double, filesize: Double): Generator[Buffer, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any])).asInstanceOf[Generator[Buffer, Any, Any]]
  inline def default(fd: Double, filesize: Double, hasBufferSizePositionMaxLineLength: BufferSize): Generator[Buffer, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fd.asInstanceOf[js.Any], filesize.asInstanceOf[js.Any], hasBufferSizePositionMaxLineLength.asInstanceOf[js.Any])).asInstanceOf[Generator[Buffer, Any, Any]]
  
  inline def fromFile(filename: String): Generator[Buffer, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Generator[Buffer, Unit, Any]]
  inline def fromFile(filename: String, hasBufferSizeMaxLineLength: MaxLineLength): Generator[Buffer, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filename.asInstanceOf[js.Any], hasBufferSizeMaxLineLength.asInstanceOf[js.Any])).asInstanceOf[Generator[Buffer, Unit, Any]]
}
