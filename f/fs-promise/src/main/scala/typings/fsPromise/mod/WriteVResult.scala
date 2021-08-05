package typings.fsPromise.mod

import typings.node.NodeJS.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteVResult
  extends StObject
     with typings.node.fsMod.WriteVResult
object WriteVResult {
  
  inline def apply(buffers: js.Array[ArrayBufferView], bytesWritten: Double): WriteVResult = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteVResult]
  }
}
