package typings.fpTs.mod

import typings.fpTs.categoryMod.Category
import typings.fpTs.categoryMod.Category2
import typings.fpTs.categoryMod.Category3
import typings.fpTs.choiceMod.Choice
import typings.fpTs.choiceMod.Choice2
import typings.fpTs.choiceMod.Choice3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choice {
  
  @JSImport("fp-ts", "choice")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ js.Any
  ]]
  @scala.inline
  def fanin[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ js.Any
  ]]
  @scala.inline
  def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ js.Any
  ]]
  
  @scala.inline
  def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ js.Any
  ]]
  @scala.inline
  def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ js.Any
  ]]
  @scala.inline
  def splitChoice[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ js.Any
  ]]
}
