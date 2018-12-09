package typings
package fpDashTsLib.libReaderTaskEitherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/ReaderTaskEither", JSImport.Namespace)
@js.native
object libReaderTaskEitherModMembers extends js.Object {
  val URI: /* ReaderTaskEither */ java.lang.String = js.native
  val ask: js.Function0[ReaderTaskEither[js.Any, js.Any, js.Any]] = js.native
  val asks: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromEither: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromIO: js.Function1[/* fa */ fpDashTsLib.libIOMod.IO[js.Any], ReaderTaskEither[js.Any, js.Any, js.Any]] = js.native
  val fromIOEither: js.Function1[
    /* fa */ fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromLeft: js.Function1[/* l */ js.Any, ReaderTaskEither[js.Any, js.Any, js.Any]] = js.native
  val fromReader: js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromTaskEither: js.Function1[
    /* fa */ fpDashTsLib.libTaskEitherMod.TaskEither[js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val left: js.Function1[
    /* fa */ fpDashTsLib.libTaskMod.Task[js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val local: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    js.Function1[
      /* fa */ ReaderTaskEither[js.Any, js.Any, js.Any], 
      ReaderTaskEither[js.Any, js.Any, js.Any]
    ]
  ] = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] with fpDashTsLib.libMonadIOMod.MonadIO3[URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[URI] = js.native
  val right: js.Function1[
    /* fa */ fpDashTsLib.libTaskMod.Task[js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val tryCatch: js.Function2[
    /* f */ js.Function1[/* e */ js.Any, js.Promise[js.Any]], 
    /* onrejected */ js.Function2[/* reason */ js.Any, /* e */ js.Any, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  def fromPredicate[E, L, A](predicate: fpDashTsLib.libFunctionMod.Predicate[A], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ELABA[E, L, A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B], whenFalse: js.Function1[/* a */ A, L]): js.Function1[/* a */ A, ReaderTaskEither[E, L, B]] = js.native
}

