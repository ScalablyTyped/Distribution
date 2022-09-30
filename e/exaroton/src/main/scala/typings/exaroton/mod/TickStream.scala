package typings.exaroton.mod

import typings.exaroton.exarotonInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickStream extends Stream {
  
  def onDataMessage(`type`: TickDataType, message: String): Unit = js.native
  
  @JSName("startStatuses")
  var startStatuses_TickStream: js.Array[`1`] = js.native
}
