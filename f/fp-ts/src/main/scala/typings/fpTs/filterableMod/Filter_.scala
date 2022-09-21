package typings.fpTs.filterableMod

import typings.fpTs.predicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter_[F] extends StObject {
  
  def apply[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    predicate: Predicate[A]
  ): Any = js.native
}
