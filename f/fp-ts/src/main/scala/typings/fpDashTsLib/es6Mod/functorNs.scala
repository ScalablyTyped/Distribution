package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "functor")
@js.native
object functorNs extends js.Object {
  def flap[F](functor: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.HKT[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("flap")
  def flap_Array(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("flap")
  def flap_Const(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Const[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Either(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Either[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Eq(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("flap")
  def flap_Free(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Free[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("flap")
  def flap_FreeGroup(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("flap")
  def flap_IO(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("flap")
  def flap_IOEither(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("flap")
  def flap_IOEither[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Identity(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("flap")
  def flap_IxIO(functor: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("flap")
  def flap_IxIO[U, L](functor: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Map(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Map[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("flap")
  def flap_NonEmptyArray(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("flap")
  def flap_NonEmptyArray2v(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("flap")
  def flap_Option(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("flap")
  def flap_Ord(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("flap")
  def flap_Pair(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("flap")
  def flap_Reader(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Reader[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("flap")
  def flap_ReaderTaskEither(functor: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("flap")
  def flap_ReaderTaskEither[U, L](
    functor: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Record(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("flap")
  def flap_State(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("flap")
  def flap_State[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Store(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Store[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("flap")
  def flap_StrMap(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("flap")
  def flap_Task(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("flap")
  def flap_TaskEither(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("flap")
  def flap_TaskEither[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("flap")
  def flap_These(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("flap")
  def flap_These[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Traced(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Traced[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Tree(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("flap")
  def flap_Tuple(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Tuple[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Validation(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Validation[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Writer(functor: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Writer[L](functor: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Zipper(functor: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def getFunctorComposition(
    F: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  def getFunctorComposition(
    F: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: fpDashTsLib.es6FunctorMod.Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition12[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  def getFunctorComposition(
    F: fpDashTsLib.es6FunctorMod.Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition21[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  def getFunctorComposition(
    F: fpDashTsLib.es6FunctorMod.Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: fpDashTsLib.es6FunctorMod.Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  def getFunctorComposition[LG](
    F: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: fpDashTsLib.es6FunctorMod.Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition12C[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  def getFunctorComposition[LF](
    F: fpDashTsLib.es6FunctorMod.Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LF
    ],
    G: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition2C1[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.Task, LF] = js.native
  def getFunctorComposition[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: fpDashTsLib.es6FunctorMod.Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither, LG] = js.native
  def getFunctorComposition[UF, LF](
    F: fpDashTsLib.es6FunctorMod.Functor3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      UF, 
      LF
    ],
    G: fpDashTsLib.es6FunctorMod.Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition3C1[fpDashTsLib.fpDashTsLibStrings.IxIO, fpDashTsLib.fpDashTsLibStrings.Task, UF, LF] = js.native
  def getFunctorComposition[F, G](F: fpDashTsLib.es6FunctorMod.Functor[F], G: fpDashTsLib.es6FunctorMod.Functor[G]): fpDashTsLib.es6FunctorMod.FunctorComposition[F, G] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Array(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Const(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Const[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Either(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Either[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Eq(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Free(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Free[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_FreeGroup(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IO(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IOEither(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IOEither[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Identity(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Map(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Map[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_NonEmptyArray(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_NonEmptyArray2v(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Option(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Ord(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Pair(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Reader(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Reader[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Record(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_State(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_State[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Store(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Store[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_StrMap(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Task(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_TaskEither(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_TaskEither[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    LG
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_These(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_These[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Traced(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Traced[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tree(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tuple(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tuple[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Validation(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Validation[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    LG
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Writer(
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Writer[LG](
    F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, LG]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Zipper(
    F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    G: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): fpDashTsLib.es6FunctorMod.FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def lift[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("lift")
  def lift_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
  def voidLeft[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Const[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Either[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Free[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IOEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IxIO(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IxIO[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Map[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Reader[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_ReaderTaskEither(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_ReaderTaskEither[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_State[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Store[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_TaskEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_These[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Traced[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tuple[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Validation[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Writer[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def voidRight[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Const[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Either[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Free[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IOEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IxIO(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IxIO[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Map[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Reader[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_ReaderTaskEither(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_ReaderTaskEither[U, L](F: fpDashTsLib.es6FunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_State[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Store[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_TaskEither[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_These[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Traced[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tuple[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Validation[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Writer[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
}

