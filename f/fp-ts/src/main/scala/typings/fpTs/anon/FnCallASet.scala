package typings.fpTs.anon

import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallASet[A] extends StObject {
  
  def apply(a: A): js.Function1[/* set */ ReadonlySet[A], Boolean] = js.native
  def apply(a: A, set: ReadonlySet[A]): Boolean = js.native
}
