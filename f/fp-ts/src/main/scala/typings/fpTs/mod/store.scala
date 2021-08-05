package typings.fpTs.mod

import typings.fpTs.comonadMod.Comonad2
import typings.fpTs.functionMod.Endomorphism
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.storeMod.Store_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object store {
  
  @JSImport("fp-ts", "store")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "store.Comonad")
  @js.native
  val Comonad: Comonad2[typings.fpTs.storeMod.URI] = js.native
  
  @JSImport("fp-ts", "store.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.storeMod.URI] = js.native
  
  @JSImport("fp-ts", "store.URI")
  @js.native
  val URI: /* "Store" */ String = js.native
  
  inline def duplicate[E, A](wa: Store_[E, A]): Store_[E, Store_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(wa.asInstanceOf[js.Any]).asInstanceOf[Store_[E, Store_[E, A]]]
  
  inline def experiment[F](F: typings.fpTs.functorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
    ]
  ]]
  inline def experiment[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
    ]
  ]]
  inline def experiment[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ]
  ]]
  inline def experiment[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ]
  ]]
  inline def experiment[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Functor2C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ]
  ]]
  inline def experiment[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Functor3C[F, E]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("experiment")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ js.Any
    ], 
    js.Function1[
      /* wa */ Store_[js.Any, js.Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ]
  ]]
  
  inline def extend[E, A, B](f: js.Function1[/* wa */ Store_[E, A], B]): js.Function1[/* wa */ Store_[E, A], Store_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Store_[E, A], Store_[E, B]]]
  
  inline def extract[E, A](wa: Store_[E, A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(wa.asInstanceOf[js.Any]).asInstanceOf[A]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Store_[js.Any, A], Store_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Store_[js.Any, A], Store_[js.Any, B]]]
  
  inline def peeks[S](f: Endomorphism[S]): js.Function1[/* wa */ Store_[S, js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("peeks")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Store_[S, js.Any], js.Any]]
  
  inline def seek[S](s: S): js.Function1[/* wa */ Store_[S, js.Any], Store_[S, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("seek")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Store_[S, js.Any], Store_[S, js.Any]]]
  
  inline def seeks[S](f: Endomorphism[S]): js.Function1[/* wa */ Store_[S, js.Any], Store_[S, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("seeks")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wa */ Store_[S, js.Any], Store_[S, js.Any]]]
  
  @JSImport("fp-ts", "store.store")
  @js.native
  val store: Comonad2[typings.fpTs.storeMod.URI] = js.native
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
