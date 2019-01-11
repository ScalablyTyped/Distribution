package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/OptionT", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def chain[F](F: fpDashTsLib.libMonadMod.Monad[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libMonadMod.Monad1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libMonadMod.Monad2[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libMonadMod.Monad2C[F, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libMonadMod.Monad3C[F, U, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fold[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* r */ js.Any, 
    /* some */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function3[
    /* r */ js.Any, 
    /* some */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type[F, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function3[
    /* r */ js.Any, 
    /* some */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type2[F, _, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function3[
    /* r */ js.Any, 
    /* some */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type2[F, L, _]
  ] = js.native
  def fold[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function3[
    /* r */ js.Any, 
    /* some */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, _]
  ] = js.native
  def fromOption[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fromOption[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fromOption[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fromOption[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fromOption[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def getOptionT[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libOptionTMod.OptionT[M] = js.native
  def getOptionT[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): fpDashTsLib.libOptionTMod.OptionT1[M] = js.native
  def getOptionT[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): fpDashTsLib.libOptionTMod.OptionT2[M] = js.native
  def getOptionT[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](M: fpDashTsLib.libMonadMod.Monad2C[M, L]): fpDashTsLib.libOptionTMod.OptionT2C[M, L] = js.native
  def getOptionT[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](M: fpDashTsLib.libMonadMod.Monad3C[M, U, L]): fpDashTsLib.libOptionTMod.OptionT3C[M, U, L] = js.native
  def getOrElse[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  def getOrElse[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Type[F, _]
    ]
  ] = js.native
  def getOrElse[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Type2[F, _, _]
    ]
  ] = js.native
  def getOrElse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Type2[F, L, _]
    ]
  ] = js.native
  def getOrElse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, _]
    ]
  ] = js.native
  def liftF[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libFunctorMod.Functor2C[F, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, L, _], 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libFunctorMod.Functor3C[F, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, U, L, _], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def none[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function0[fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[scala.Nothing]]] = js.native
  def none[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function0[fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[scala.Nothing]]] = js.native
  def none[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function0[
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  def none[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function0[
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  def none[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function0[
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  def some[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]] = js.native
  def some[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]] = js.native
  def some[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def some[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def some[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
}

