package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/StateT", JSImport.Namespace)
@js.native
object libStateTModMembers extends js.Object {
  def ap[F](F: fpDashTsLib.libChainMod.Chain[F]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libChainMod.Chain1[F]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libChainMod.Chain2[F]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libChainMod.Chain3[F]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def chain[F](F: fpDashTsLib.libChainMod.Chain[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libChainMod.Chain1[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libChainMod.Chain2[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libChainMod.Chain3[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def fromState[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def fromState[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def fromState[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def fromState[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def get[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function0[js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]] = js.native
  def get[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function0[js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]] = js.native
  def get[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function0[js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]] = js.native
  def get[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function0[js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]] = js.native
  def getStateT[M](M: fpDashTsLib.libMonadMod.Monad[M]): StateT[M] = js.native
  def getStateT[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): StateT1[M] = js.native
  def getStateT[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): StateT2[M] = js.native
  def getStateT[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): StateT3[M] = js.native
  def gets[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def gets[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def gets[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def gets[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def liftF[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[F, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def liftF[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[F, _, _, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def map[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def modify[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def modify[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def modify[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def modify[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def of[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type[F, js.Tuple2[_, _]]]
  ] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[_, _]]]
  ] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[_, _]]]
  ] = js.native
  def put[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* s */ js.Any, 
    js.Function0[fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def put[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* s */ js.Any, 
    js.Function0[fpDashTsLib.libHKTMod.Type[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def put[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* s */ js.Any, 
    js.Function0[fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  def put[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* s */ js.Any, 
    js.Function0[fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[scala.Unit, _]]]
  ] = js.native
}

