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
  val fromPredicate: js.Function2[
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    /* whenFalse */ js.Function1[/* a */ js.Any, js.Any], 
    js.Function1[/* a */ js.Any, ReaderTaskEither[js.Any, js.Any, js.Any]]
  ] = js.native
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
  val readerTaskEither: fpDashTsLib.libMonadMod.Monad3[URI] with fpDashTsLib.libBifunctorMod.Bifunctor3[URI] with fpDashTsLib.libAltMod.Alt3[URI] = js.native
  val right: js.Function1[
    /* fa */ fpDashTsLib.libTaskMod.Task[js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
  val tryCatch: js.Function2[
    /* f */ js.Function1[/* e */ js.Any, stdLib.Promise[js.Any]], 
    /* onrejected */ js.Function1[/* reason */ js.Object, js.Any], 
    ReaderTaskEither[js.Any, js.Any, js.Any]
  ] = js.native
}

