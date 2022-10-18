package typings.dirCompare

import typings.dirCompare.buildSrcFileCompareHandlerLinesLineReaderLineBatchMod.LineBatch
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFileCompareHandlerLinesLineReaderReadBufferedLinesMod {
  
  @JSImport("dir-compare/build/src/FileCompareHandler/lines/lineReader/readBufferedLines", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readBufferedLines(buf: Buffer, size: Double, allocatedBufferSize: Double, rest: String, restLines: js.Array[String]): LineBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("readBufferedLines")(buf.asInstanceOf[js.Any], size.asInstanceOf[js.Any], allocatedBufferSize.asInstanceOf[js.Any], rest.asInstanceOf[js.Any], restLines.asInstanceOf[js.Any])).asInstanceOf[LineBatch]
}
