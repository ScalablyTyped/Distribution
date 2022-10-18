package typings.fpTs

import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEndomorphismMod {
  
  @JSImport("fp-ts/lib/Endomorphism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Endomorphism", "URI")
  @js.native
  val URI: /* "Endomorphism" */ String = js.native
  type URI = /* "Endomorphism" */ String
  
  inline def getMonoid[A](): Monoid[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Endomorphism[A]]]
  
  inline def getSemigroup[A](): Semigroup[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Endomorphism[A]]]
  
  type Endomorphism[A] = js.Function1[/* a */ A, A]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
