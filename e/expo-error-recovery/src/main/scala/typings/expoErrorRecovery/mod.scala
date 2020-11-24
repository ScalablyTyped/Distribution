package typings.expoErrorRecovery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-error-recovery", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val recoveredProps: (Record[String, js.Any]) | Null = js.native
  
  def setRecoveryProps(props: ErrorRecoveryProps): Unit = js.native
  
  type ErrorRecoveryProps = Record[String, js.Any]
}
