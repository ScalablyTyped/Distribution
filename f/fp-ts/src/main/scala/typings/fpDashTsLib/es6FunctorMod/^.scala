package typings
package fpDashTsLib.es6FunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Functor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flap[F](functor: Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.HKT[F, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("flap")
  def flap_Array(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("flap")
  def flap_Const(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Const[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Either(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Either[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Free(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Free[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("flap")
  def flap_FreeGroup(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("flap")
  def flap_IO(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("flap")
  def flap_IOEither(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("flap")
  def flap_IOEither[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Identity(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("flap")
  def flap_IxIO(functor: Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("flap")
  def flap_IxIO[U, L](functor: Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Map(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Map[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("flap")
  def flap_NonEmptyArray(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("flap")
  def flap_NonEmptyArray2v(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("flap")
  def flap_Option(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("flap")
  def flap_Pair(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("flap")
  def flap_Reader(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Reader[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("flap")
  def flap_ReaderTaskEither(functor: Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("flap")
  def flap_ReaderTaskEither[U, L](functor: Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("flap")
  def flap_State(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("flap")
  def flap_State[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Store(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Store[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("flap")
  def flap_StrMap(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("flap")
  def flap_Task(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("flap")
  def flap_TaskEither(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("flap")
  def flap_TaskEither[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("flap")
  def flap_These(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("flap")
  def flap_These[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Traced(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Traced[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Tree(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("flap")
  def flap_Tuple(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Tuple[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Validation(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Validation[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Writer(functor: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("flap")
  def flap_Writer[L](functor: Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("flap")
  def flap_Zipper(functor: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ js.Any, 
    /* ff */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Function1[/* a */ _, _]], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def getFunctorComposition(
    F: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  def getFunctorComposition(
    F: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): FunctorComposition12[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  def getFunctorComposition(
    F: Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FunctorComposition21[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  def getFunctorComposition(
    F: Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  def getFunctorComposition[LG](
    F: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): FunctorComposition12C[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  def getFunctorComposition[LF](
    F: Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LF
    ],
    G: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FunctorComposition2C1[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.Task, LF] = js.native
  def getFunctorComposition[LG](
    F: Functor2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Functor2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither, LG] = js.native
  def getFunctorComposition[UF, LF](
    F: Functor3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      UF, 
      LF
    ],
    G: Functor1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FunctorComposition3C1[fpDashTsLib.fpDashTsLibStrings.IxIO, fpDashTsLib.fpDashTsLibStrings.Task, UF, LF] = js.native
  def getFunctorComposition[F, G](F: Functor[F], G: Functor[G]): FunctorComposition[F, G] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Array(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.Array],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Const(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Const[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Either(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Either[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Free(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Free], G: Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Free[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_FreeGroup(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IO(F: Functor1[fpDashTsLib.fpDashTsLibStrings.IO], G: Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IOEither(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_IOEither[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Identity(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Map(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Map], G: Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Map[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_NonEmptyArray(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): FunctorComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_NonEmptyArray2v(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): FunctorComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Option(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.Option],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Pair(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair], G: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Reader(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Reader[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_State(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.State],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.State]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_State[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.State],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.State, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Store(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Store[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_StrMap(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Task(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Task], G: Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_TaskEither(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): FunctorComposition22[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_TaskEither[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, LG]
  ): FunctorComposition22C[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    LG
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_These(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.These],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.These]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_These[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.These],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.These, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Traced(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Traced[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tree(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree], G: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tuple(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Tuple[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Validation(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): FunctorComposition22[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Validation[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, LG]
  ): FunctorComposition22C[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    LG
  ] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Writer(
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): FunctorComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Writer[LG](
    F: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, LG]
  ): FunctorComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  @JSName("getFunctorComposition")
  def getFunctorComposition_Zipper(
    F: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    G: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): FunctorComposition11[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def lift[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("lift")
  def lift_Array(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_FreeGroup(F: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IO(F: Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Identity(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO(F: Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray2v(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Option(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Pair(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither(F: Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State(F: Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_StrMap(F: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Task(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These(F: Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tree(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Zipper(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
  def voidLeft[F](F: Functor[F]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Array(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Const(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Const[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Either(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Either[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Free(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Free[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_FreeGroup(F: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IO(F: Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IOEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IOEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Identity(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IxIO(F: Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_IxIO[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Map(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Map[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_NonEmptyArray(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_NonEmptyArray2v(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Option(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Pair(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Reader(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Reader[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_ReaderTaskEither(F: Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_ReaderTaskEither[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_State(F: Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_State[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Store(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Store[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_StrMap(F: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Task(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_TaskEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_TaskEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_These(F: Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_These[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Traced(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Traced[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tree(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tuple(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Tuple[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Validation(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Validation[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Writer(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Writer[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("voidLeft")
  def voidLeft_Zipper(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* b */ js.Any, 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def voidRight[F](F: Functor[F]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Array(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Const(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Const[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Either(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Either[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Free(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Free[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_FreeGroup(F: Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IO(F: Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IOEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IOEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Identity(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IxIO(F: Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_IxIO[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Map(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Map[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_NonEmptyArray(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_NonEmptyArray2v(F: Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Option(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Pair(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Reader(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Reader[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_ReaderTaskEither(F: Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_ReaderTaskEither[U, L](F: Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_State(F: Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_State[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Store(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Store[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_StrMap(F: Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Task(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_TaskEither(F: Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_TaskEither[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_These(F: Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_These[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Traced(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Traced[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tree(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tuple(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Tuple[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Validation(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Validation[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Writer(F: Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Writer[L](F: Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("voidRight")
  def voidRight_Zipper(F: Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* a */ js.Any, 
    /* fb */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
}

