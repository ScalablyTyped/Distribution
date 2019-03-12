package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderT", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ap[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* fab */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Function1[/* a */ _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* fab */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type[F, js.Function1[/* a */ _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* fab */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, js.Function1[/* a */ _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def ap[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* fab */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, js.Function1[/* a */ _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def ask[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function0[js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]] = js.native
  def ask[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function0[js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]] = js.native
  def ask[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function0[js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]] = js.native
  def ask[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function0[js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]] = js.native
  def asks[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def asks[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def asks[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def asks[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def chain[F](F: fpDashTsLib.libChainMod.Chain[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libChainMod.Chain1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libChainMod.Chain2[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def chain[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libChainMod.Chain3[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def fromReader[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def fromReader[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def fromReader[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def fromReader[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def getReaderT[M](M: fpDashTsLib.libMonadMod.Monad[M]): ReaderT[M] = js.native
  def getReaderT[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): ReaderT1[M] = js.native
  def getReaderT[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): ReaderT2[M] = js.native
  def getReaderT[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): ReaderT3[M] = js.native
  def getReaderT2v[M](M: fpDashTsLib.libMonadMod.Monad[M]): ReaderT2v[M] = js.native
  def getReaderT2v[M /* <: fpDashTsLib.libHKTMod.URIS */](M: fpDashTsLib.libMonadMod.Monad1[M]): ReaderT2v1[M] = js.native
  def getReaderT2v[M /* <: fpDashTsLib.libHKTMod.URIS2 */](M: fpDashTsLib.libMonadMod.Monad2[M]): ReaderT2v2[M] = js.native
  def getReaderT2v[M /* <: fpDashTsLib.libHKTMod.URIS3 */](M: fpDashTsLib.libMonadMod.Monad3[M]): ReaderT2v3[M] = js.native
  def map[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFunctorMod.Functor1[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFunctorMod.Functor2[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]
  ] = js.native
  def map[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFunctorMod.Functor3[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]
  ] = js.native
  def of[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.HKT[F, _]]] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type[F, _]]] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type2[F, _, _]]] = js.native
  def of[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.libHKTMod.Type3[F, _, _, _]]] = js.native
}

