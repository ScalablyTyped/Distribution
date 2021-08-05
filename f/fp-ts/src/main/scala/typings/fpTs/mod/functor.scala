package typings.fpTs.mod

import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.functorMod.FunctorComposition
import typings.fpTs.functorMod.FunctorComposition11
import typings.fpTs.functorMod.FunctorComposition12
import typings.fpTs.functorMod.FunctorComposition12C
import typings.fpTs.functorMod.FunctorComposition21
import typings.fpTs.functorMod.FunctorComposition22
import typings.fpTs.functorMod.FunctorComposition22C
import typings.fpTs.functorMod.FunctorComposition23C
import typings.fpTs.functorMod.FunctorComposition2C1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functor {
  
  @JSImport("fp-ts", "functor")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Functor1[F], G: Functor1[G]): FunctorComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition11[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Functor1[F], G: Functor2[G]): FunctorComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition12[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Functor2[F], G: Functor1[G]): FunctorComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition21[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Functor2[F], G: Functor2[G]): FunctorComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition22[F, G]]
  inline def getFunctorComposition[F, G](F: Functor[F], G: Functor[G]): FunctorComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Functor1[F], G: Functor2C[G, E]): FunctorComposition12C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition12C[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](F: Functor2C[F, E], G: Functor1[G]): FunctorComposition2C1[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition2C1[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Functor2[F], G: Functor2C[G, E]): FunctorComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition22C[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Functor2[F], G: Functor3C[G, E]): FunctorComposition23C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition23C[F, G, E]]
}
