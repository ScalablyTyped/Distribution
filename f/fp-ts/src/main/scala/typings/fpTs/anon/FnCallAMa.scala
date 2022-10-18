package typings.fpTs.anon

import typings.fpTs.libEitherMod.Either_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallAMa[A] extends StObject {
  
  def apply(a: A): js.Function1[/* ma */ Either_[Any, A], Boolean] = js.native
  def apply[E](a: A, ma: Either_[E, A]): Boolean = js.native
}
