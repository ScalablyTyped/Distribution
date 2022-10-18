package typings.fpTs.libCompactableMod

import typings.fpTs.libCompactableMod.^
import typings.fpTs.libFunctorMod.Functor
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libFunctorMod.Functor2C
import typings.fpTs.libFunctorMod.Functor3C
import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def compact[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Compactable1[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any]]
inline def compact[F, G](F: Functor[F], G: Compactable[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any]]
inline def compact[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Compactable2C[G, E]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any]]
inline def compact[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Compactable2C[G, E]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compact")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, Option<A>>> */ /* fa */ Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any]]

inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor1[F], G: Compactable2[G] & Functor2[G]): CompactableComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition12[F, G]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Compactable1[G] & Functor1[G]): CompactableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition11[F, G]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F], G: Compactable2[G] & Functor2[G]): CompactableComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition22[F, G]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor2[F], G: Compactable1[G] & Functor1[G]): CompactableComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition21[F, G]]
inline def getCompactableComposition[F, G](F: Functor[F], G: Compactable[G] & Functor[G]): CompactableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition[F, G]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: (Compactable2C[G, E]) & (Functor2C[G, E])): CompactableComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition12[F, G]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](F: Functor2C[F, E], G: Compactable1[G] & Functor1[G]): CompactableComposition2C1[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition2C1[F, G, E]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: (Compactable2C[G, E]) & (Functor2C[G, E])): CompactableComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition22C[F, G, E]]
inline def getCompactableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor2[F], G: (Compactable3C[G, E]) & (Functor3C[G, E])): CompactableComposition23C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompactableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[CompactableComposition23C[F, G, E]]

inline def separate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], C: Compactable1[G], G: Functor1[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(F.asInstanceOf[js.Any], C.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
]]]
inline def separate[F, G](F: Functor[F], C: Compactable[G], G: Functor[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(F.asInstanceOf[js.Any], C.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
]]]
inline def separate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], C: Compactable2C[G, E], G: Functor2[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(F.asInstanceOf[js.Any], C.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
]]]
inline def separate[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], C: Compactable2C[G, E], G: Functor2[G]): js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("separate")(F.asInstanceOf[js.Any], C.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, Either<A, B>>> */ /* fge */ Any, 
Separated_[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ Any, 
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any
]]]
