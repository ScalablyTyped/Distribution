package typings.fpTs.mod

import typings.fpTs.eitherMod.Either_
import typings.fpTs.optionMod.Option_
import typings.fpTs.refinementMod.Refinement
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinement {
  
  @JSImport("fp-ts", "refinement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def and[A, C /* <: A */](second: Refinement[A, C]): js.Function1[/* first */ Refinement[A, A], Refinement[A, A & C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Refinement[A, A], Refinement[A, A & C]]]
  
  inline def compose[A, B /* <: A */, C /* <: B */](bc: Refinement[B, C]): js.Function1[/* ab */ Refinement[A, B], Refinement[A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(bc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ab */ Refinement[A, B], Refinement[A, C]]]
  
  inline def fromEitherK[A, B /* <: A */](getEither: js.Function1[/* a */ A, Either_[Any, B]]): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(getEither.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, B]]
  
  inline def fromOptionK[A, B /* <: A */](getOption: js.Function1[/* a */ A, Option_[B]]): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(getOption.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, B]]
  
  inline def id[A](): Refinement[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Refinement[A, A]]
  
  inline def not[A, B /* <: A */](refinement: Refinement[A, B]): Refinement[A, Exclude[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(refinement.asInstanceOf[js.Any]).asInstanceOf[Refinement[A, Exclude[A, B]]]
  
  inline def or[A, C /* <: A */](second: Refinement[A, C]): js.Function1[/* first */ Refinement[A, A], Refinement[A, C | A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Refinement[A, A], Refinement[A, C | A]]]
  
  inline def zero[A, B /* <: A */](): Refinement[A, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Refinement[A, B]]
}
