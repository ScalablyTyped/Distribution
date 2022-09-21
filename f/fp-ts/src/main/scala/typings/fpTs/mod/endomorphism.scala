package typings.fpTs.mod

import typings.fpTs.endomorphismMod.Endomorphism
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.semigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endomorphism {
  
  @JSImport("fp-ts", "endomorphism")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "endomorphism.URI")
  @js.native
  val URI: /* "Endomorphism" */ String = js.native
  
  inline def getMonoid[A](): Monoid[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Endomorphism[A]]]
  
  inline def getSemigroup[A](): Semigroup[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Endomorphism[A]]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
