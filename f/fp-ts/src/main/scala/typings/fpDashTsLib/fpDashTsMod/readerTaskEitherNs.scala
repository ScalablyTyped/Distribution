package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "readerTaskEither")
@js.native
object readerTaskEitherNs extends js.Object {
  @js.native
  class ReaderTaskEither[E, L, A] protected ()
    extends fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[E, L, A] {
    def this(value: js.Function1[/* e */ E, fpDashTsLib.libTaskEitherMod.TaskEither[L, A]]) = this()
  }
  
  val URI: /* ReaderTaskEither */ java.lang.String = js.native
  val ask: js.Function0[fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]] = js.native
  val asks: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromEither: js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromIO: js.Function1[
    /* fa */ fpDashTsLib.libIOMod.IO[js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromIOEither: js.Function1[
    /* fa */ fpDashTsLib.libIOEitherMod.IOEither[js.Any, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromLeft: js.Function1[
    /* l */ js.Any, 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromPredicate: js.Function2[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    /* whenFalse */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
    ]
  ] = js.native
  val fromReader: js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[js.Any, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val fromTaskEither: js.Function1[
    /* fa */ fpDashTsLib.libTaskEitherMod.TaskEither[js.Any, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val left: js.Function1[
    /* fa */ fpDashTsLib.libTaskMod.Task[js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val local: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    js.Function1[
      /* fa */ fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any], 
      fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
    ]
  ] = js.native
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  val readerTaskEitherSeq: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libAltMod.Alt3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadIOMod.MonadIO3[fpDashTsLib.libReaderTaskEitherMod.URI] with fpDashTsLib.libMonadTaskMod.MonadTask3[fpDashTsLib.libReaderTaskEitherMod.URI] = js.native
  val right: js.Function1[
    /* fa */ fpDashTsLib.libTaskMod.Task[js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val tryCatch: js.Function2[
    /* f */ js.Function1[/* e */ js.Any, stdLib.Promise[js.Any]], 
    /* onrejected */ js.Function1[/* reason */ js.Object, js.Any], 
    fpDashTsLib.libReaderTaskEitherMod.ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
}

