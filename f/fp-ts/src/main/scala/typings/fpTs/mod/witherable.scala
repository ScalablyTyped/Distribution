package typings.fpTs.mod

import typings.fpTs.libApplicativeMod.Applicative
import typings.fpTs.libCompactableMod.Compactable
import typings.fpTs.libCompactableMod.Compactable1
import typings.fpTs.libCompactableMod.Compactable2
import typings.fpTs.libCompactableMod.Compactable2C
import typings.fpTs.libTraversableMod.Traversable
import typings.fpTs.libTraversableMod.Traversable1
import typings.fpTs.libTraversableMod.Traversable2
import typings.fpTs.libTraversableMod.Traversable2C
import typings.fpTs.libWitherableMod.FilterE1
import typings.fpTs.libWitherableMod.Wilt
import typings.fpTs.libWitherableMod.Wilt1
import typings.fpTs.libWitherableMod.Wilt2C
import typings.fpTs.libWitherableMod.Wither
import typings.fpTs.libWitherableMod.Wither1
import typings.fpTs.libWitherableMod.Wither2C
import typings.fpTs.libWitherableMod.Witherable
import typings.fpTs.libWitherableMod.Witherable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object witherable {
  
  @JSImport("fp-ts", "witherable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterE[G](W: Witherable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* predicate */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, boolean> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ /* ga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterE")(W.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* predicate */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, boolean> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ /* ga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any
      ]
    ]
  ]]
  inline def filterE[G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](W: Witherable1[G]): FilterE1[G] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterE")(W.asInstanceOf[js.Any]).asInstanceOf[FilterE1[G]]
  
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[W], C: Compactable1[W]): Wilt1[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt1[W]]
  inline def wiltDefault[W](T: Traversable[W], C: Compactable[W]): Wilt[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt[W]]
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2C[W, E], C: Compactable2[W]): Wilt2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt2C[W, E]]
  inline def wiltDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2[W], C: Compactable2C[W, E]): Wilt2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wiltDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wilt2C[W, E]]
  
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[W], C: Compactable1[W]): Wither1[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither1[W]]
  inline def witherDefault[W](T: Traversable[W], C: Compactable[W]): Wither[W] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither[W]]
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2C[W, E], C: Compactable2[W]): Wither2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither2C[W, E]]
  inline def witherDefault[W /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](T: Traversable2[W], C: Compactable2C[W, E]): Wither2C[W, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("witherDefault")(T.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Wither2C[W, E]]
}
