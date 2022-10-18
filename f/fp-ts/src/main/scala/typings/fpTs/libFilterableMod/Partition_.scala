package typings.fpTs.libFilterableMod

import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Partition_[F] extends StObject {
  
  def apply[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
  ] = js.native
}
