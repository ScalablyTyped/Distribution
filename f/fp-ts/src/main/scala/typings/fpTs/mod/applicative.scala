package typings.fpTs.mod

import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.ApplicativeComposition
import typings.fpTs.applicativeMod.ApplicativeComposition11
import typings.fpTs.applicativeMod.ApplicativeComposition12
import typings.fpTs.applicativeMod.ApplicativeComposition12C
import typings.fpTs.applicativeMod.ApplicativeComposition21
import typings.fpTs.applicativeMod.ApplicativeComposition22
import typings.fpTs.applicativeMod.ApplicativeComposition22C
import typings.fpTs.applicativeMod.ApplicativeCompositionHKT1
import typings.fpTs.applicativeMod.ApplicativeCompositionHKT2
import typings.fpTs.applicativeMod.ApplicativeCompositionHKT2C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicative {
  
  @JSImport("fp-ts", "applicative")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative1[F], G: Applicative1[G]): ApplicativeComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition11[F, G]]
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative1[F], G: Applicative2[G]): ApplicativeComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition12[F, G]]
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative2[F], G: Applicative1[G]): ApplicativeComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition21[F, G]]
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative2[F], G: Applicative2[G]): ApplicativeComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition22[F, G]]
  @scala.inline
  def getApplicativeComposition[F, G](F: Applicative[F], G: Applicative[G]): ApplicativeComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition[F, G]]
  @scala.inline
  def getApplicativeComposition[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Applicative[F], G: Applicative1[G]): ApplicativeCompositionHKT1[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeCompositionHKT1[F, G]]
  @scala.inline
  def getApplicativeComposition[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Applicative[F], G: Applicative2[G]): ApplicativeCompositionHKT2[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeCompositionHKT2[F, G]]
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative1[F], G: Applicative2C[G, E]): ApplicativeComposition12C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition12C[F, G, E]]
  @scala.inline
  def getApplicativeComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative2[F], G: Applicative2C[G, E]): ApplicativeComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeComposition22C[F, G, E]]
  @scala.inline
  def getApplicativeComposition[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Applicative[F], G: Applicative2C[G, E]): ApplicativeCompositionHKT2C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ApplicativeCompositionHKT2C[F, G, E]]
}
