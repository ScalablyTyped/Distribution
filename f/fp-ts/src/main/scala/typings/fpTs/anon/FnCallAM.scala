package typings.fpTs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallAM[A] extends StObject {
  
  def apply(a: A): js.Function1[/* m */ typings.std.Map[Any, A], Boolean] = js.native
  def apply[K](a: A, m: typings.std.Map[K, A]): Boolean = js.native
}
