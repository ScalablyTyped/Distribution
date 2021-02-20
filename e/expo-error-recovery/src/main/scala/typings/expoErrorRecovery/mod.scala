package typings.expoErrorRecovery

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-error-recovery", "recoveredProps")
  @js.native
  val recoveredProps: (Record[String, js.Any]) | Null = js.native
  
  @JSImport("expo-error-recovery", "setRecoveryProps")
  @js.native
  def setRecoveryProps(props: ErrorRecoveryProps): Unit = js.native
  
  type ErrorRecoveryProps = Record[String, js.Any]
}
