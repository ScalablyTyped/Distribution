package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallKM[K] extends StObject {
  
  def apply(k: K): js.Function1[/* m */ typings.std.Map[K, Any], Boolean] = js.native
  def apply[A](k: K, m: typings.std.Map[K, A]): Boolean = js.native
}
