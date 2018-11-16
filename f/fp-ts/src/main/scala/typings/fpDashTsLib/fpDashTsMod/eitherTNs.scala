package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "eitherT")
@js.native
object eitherTNs extends js.Object {
  def bimap[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def bimap[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def bimap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def chain[F](F: fpDashTsLib.libMonadMod.Monad[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libMonadMod.Monad1[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libMonadMod.Monad2[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def fold[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def fromEither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def fromEither[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def fromEither[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def getEitherT[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libEitherTMod.EitherT[M] = js.native
  def getEitherT[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): fpDashTsLib.libEitherTMod.EitherT1[M] = js.native
  def getEitherT[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): fpDashTsLib.libEitherTMod.EitherT2[M] = js.native
  def left[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def left[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def left[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def mapLeft[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  def mapLeft[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  def mapLeft[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  def right[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def right[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def right[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
}

