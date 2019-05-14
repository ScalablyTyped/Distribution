package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "contravariant")
@js.native
object contravariantNs extends js.Object {
  def lift[F](contravariant: fpDashTsLib.es6ContravariantMod.Contravariant[F]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("lift")
  def lift_Array(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Const[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Const, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Either[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Either, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Free[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Free, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_FreeGroup(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IO(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IOEither[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Identity(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_IxIO[U, L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Map[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Map, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_NonEmptyArray2v(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Option(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Pair(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Reader[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_ReaderTaskEither[U, L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_State[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.State, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Store[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Store, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_StrMap(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Task(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_TaskEither[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_These[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.These, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Traced[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tree(contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Tuple[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Validation[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Writer[L](
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ]
  ] = js.native
  @JSName("lift")
  def lift_Zipper(
    contravariant: fpDashTsLib.es6ContravariantMod.Contravariant1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* f */ js.Function1[/* b */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
}

