package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Span
  extends StObject
     with GenericSpan {
  
  def end(): Unit = js.native
  def end(endTime: Double): Unit = js.native
  
  var name: String = js.native
  
  // The following properties and methods are currently not documented as their API isn't considered official:
  // customStackTrace(), setDbContext()
  var transaction: Transaction = js.native
}
