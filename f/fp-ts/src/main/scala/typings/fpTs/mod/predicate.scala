package typings.fpTs.mod

import typings.fpTs.libContravariantMod.Contravariant1
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicate {
  
  @JSImport("fp-ts", "predicate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "predicate.Contravariant")
  @js.native
  val Contravariant: Contravariant1[typings.fpTs.libPredicateMod.URI] = js.native
  
  @JSImport("fp-ts", "predicate.URI")
  @js.native
  val URI: /* "Predicate" */ String = js.native
  
  inline def and[A](second: Predicate[A]): js.Function1[/* first */ Predicate[A], Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Predicate[A], Predicate[A]]]
  
  inline def contramap[B, A](f: js.Function1[/* b */ B, A]): js.Function1[/* predicate */ Predicate[A], Predicate[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("contramap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* predicate */ Predicate[A], Predicate[B]]]
  
  inline def getMonoidAll[A](): Monoid[Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoidAll")().asInstanceOf[Monoid[Predicate[A]]]
  
  inline def getMonoidAny[A](): Monoid[Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoidAny")().asInstanceOf[Monoid[Predicate[A]]]
  
  inline def getSemigroupAll[A](): Semigroup[Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroupAll")().asInstanceOf[Semigroup[Predicate[A]]]
  
  inline def getSemigroupAny[A](): Semigroup[Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroupAny")().asInstanceOf[Semigroup[Predicate[A]]]
  
  inline def not[A](predicate: Predicate[A]): Predicate[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(predicate.asInstanceOf[js.Any]).asInstanceOf[Predicate[A]]
  
  inline def or[A](second: Predicate[A]): js.Function1[/* first */ Predicate[A], Predicate[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Predicate[A], Predicate[A]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
