package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "foldable")
@js.native
object foldableNs extends js.Object {
  def elem[F, A](F: fpDashTsLib.es6FoldableMod.Foldable[F], E: fpDashTsLib.es6EqMod.Eq[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], scala.Boolean] = js.native
  @JSName("elem")
  def elem_Array[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Eq[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_FreeGroup[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Identity[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray2v[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Option[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Ord[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Pair[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Record[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_StrMap[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Task[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tree[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Zipper[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    E: fpDashTsLib.es6EqMod.Eq[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    scala.Boolean
  ] = js.native
  def find[F](F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Array(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Const(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Const[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Either(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Either[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Eq(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Free(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Free[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_FreeGroup(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IO(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IOEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IOEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Identity(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IxIO(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IxIO[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Map(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Map[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_NonEmptyArray(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_NonEmptyArray2v(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Option(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Ord(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Pair(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Reader(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Reader[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_ReaderTaskEither(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_ReaderTaskEither[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Record(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_State(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_State[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Store(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Store[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_StrMap(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Task(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_TaskEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_TaskEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_These(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_These[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Traced(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Traced[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tree(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tuple(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tuple[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Validation(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Validation[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Writer(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Writer[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Zipper(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* p */ fpDashTsLib.es6FunctionMod.Predicate[_], 
    fpDashTsLib.es6OptionMod.Option[_]
  ] = js.native
  def fold[F, M](F: fpDashTsLib.es6FoldableMod.Foldable[F], M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, M], M] = js.native
  def foldM(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.es6MonadMod.Monad1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  def foldM(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.es6MonadMod.Monad2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  def foldM(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.es6MonadMod.Monad3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  def foldM[L](
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.es6MonadMod.Monad2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  def foldM[U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.es6MonadMod.Monad3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  def foldM[F, M](F: fpDashTsLib.es6FoldableMod.Foldable[F], M: fpDashTsLib.es6MonadMod.Monad[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[M, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Array(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Eq(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("foldM")
  def foldM_FreeGroup(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldM")
  def foldM_IO(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Identity(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray2v(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Option(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Ord(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Pair(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Record(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("foldM")
  def foldM_StrMap(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Task(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Tree(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Zipper(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def foldMap[F, M](F: fpDashTsLib.es6FoldableMod.Foldable[F], M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function2[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], /* f */ js.Function1[/* a */ js.Any, M], M] = js.native
  @JSName("foldMap")
  def foldMap_Array[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Const[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Const[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Either[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Either[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Eq[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Free[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Free[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_FreeGroup[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IOEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IOEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Identity[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IxIO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IxIO[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Map[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Map[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_NonEmptyArray[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_NonEmptyArray2v[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Option[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Ord[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Pair[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Reader[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Reader[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_ReaderTaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_ReaderTaskEither[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Record[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_State[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_State[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Store[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Store[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_StrMap[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Task[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_TaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_TaskEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_These[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_These[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Traced[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Traced[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tree[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tuple[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tuple[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Validation[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Validation[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Writer[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Writer[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Zipper[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Array[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, M], M] = js.native
  @JSName("fold")
  def fold_Const[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Const[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Eq[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, M], M] = js.native
  @JSName("fold")
  def fold_Free[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], M] = js.native
  @JSName("fold")
  def fold_Free[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], M] = js.native
  @JSName("fold")
  def fold_FreeGroup[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, M], M] = js.native
  @JSName("fold")
  def fold_IOEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IOEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Identity[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, M], M] = js.native
  @JSName("fold")
  def fold_IxIO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IxIO[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Map[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], M] = js.native
  @JSName("fold")
  def fold_Map[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], M] = js.native
  @JSName("fold")
  def fold_NonEmptyArray[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Option[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, M], M] = js.native
  @JSName("fold")
  def fold_Ord[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, M], M] = js.native
  @JSName("fold")
  def fold_Pair[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, M], M] = js.native
  @JSName("fold")
  def fold_Reader[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Reader[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Record[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, M], M] = js.native
  @JSName("fold")
  def fold_State[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_State[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_StrMap[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, M], M] = js.native
  @JSName("fold")
  def fold_Task[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, M], M] = js.native
  @JSName("fold")
  def fold_TaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_TaskEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tree[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, M], M] = js.native
  @JSName("fold")
  def fold_Tuple[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tuple[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Zipper[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, M], M] = js.native
  def foldr[F](F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Array(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Const(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Const[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Either(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Either[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Eq(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Free(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Free[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_FreeGroup(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IO(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IOEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IOEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Identity(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IxIO(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IxIO[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Map(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Map[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_NonEmptyArray(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_NonEmptyArray2v(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Option(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Ord(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Pair(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Reader(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Reader[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_ReaderTaskEither(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_ReaderTaskEither[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Record(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_State(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_State[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Store(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Store[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_StrMap(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Task(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_TaskEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_TaskEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_These(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_These[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Traced(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Traced[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tree(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tuple(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tuple[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Validation(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Validation[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Writer(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Writer[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Zipper(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def getFoldableComposition(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  def getFoldableComposition(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition12[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  def getFoldableComposition(
    F: fpDashTsLib.es6FoldableMod.Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition21[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  def getFoldableComposition(
    F: fpDashTsLib.es6FoldableMod.Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  def getFoldableComposition[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.TaskEither, LG] = js.native
  def getFoldableComposition[UF, LF](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      UF, 
      LF
    ],
    G: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition3C1[fpDashTsLib.fpDashTsLibStrings.IxIO, fpDashTsLib.fpDashTsLibStrings.Task, UF, LF] = js.native
  def getFoldableComposition[F, G](F: fpDashTsLib.es6FoldableMod.Foldable[F], G: fpDashTsLib.es6FoldableMod.Foldable[G]): fpDashTsLib.es6FoldableMod.FoldableComposition[F, G] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Array(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Eq(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_FreeGroup(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IO(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Identity(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray2v(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Option(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Ord(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Pair(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Record(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_StrMap(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Task(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tree(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer(
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer[LG](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, LG],
    G: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Zipper(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    G: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): fpDashTsLib.es6FoldableMod.FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def intercalate[F, M](F: fpDashTsLib.es6FoldableMod.Foldable[F], M: fpDashTsLib.es6MonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.es6HKTMod.HKT[F, M], M]] = js.native
  @JSName("intercalate")
  def intercalate_Array[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Eq[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_FreeGroup[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Identity[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray2v[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Option[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Ord[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Pair[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Record[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_StrMap[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Task[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tree[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Zipper[M](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    M: fpDashTsLib.es6MonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, M], M]
  ] = js.native
  def maximum[F, A](F: fpDashTsLib.es6FoldableMod.Foldable[F], O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6OptionMod.Option[A]] = js.native
  @JSName("maximum")
  def maximum_Array[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Const[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Const[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Either[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Either[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Eq[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Free[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Free[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_FreeGroup[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IOEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IOEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Identity[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IxIO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IxIO[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Map[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Map[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_NonEmptyArray[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_NonEmptyArray2v[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Option[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Ord[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Pair[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Reader[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Reader[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_ReaderTaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_ReaderTaskEither[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Record[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_State[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_State[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Store[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Store[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_StrMap[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Task[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_TaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_TaskEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_These[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_These[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Traced[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Traced[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tree[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tuple[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tuple[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Validation[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Validation[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Writer[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Writer[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Zipper[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  def minimum[F, A](F: fpDashTsLib.es6FoldableMod.Foldable[F], O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], fpDashTsLib.es6OptionMod.Option[A]] = js.native
  @JSName("minimum")
  def minimum_Array[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Const[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Const[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Either[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Either[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Eq[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Free[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Free[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_FreeGroup[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IOEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IOEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Identity[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IxIO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IxIO[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Map[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Map[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_NonEmptyArray[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_NonEmptyArray2v[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Option[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Ord[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Pair[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Reader[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Reader[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_ReaderTaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_ReaderTaskEither[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Record[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_State[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_State[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Store[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Store[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_StrMap[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Task[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_TaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_TaskEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_These[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_These[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Traced[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Traced[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tree[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tuple[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tuple[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Validation[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Validation[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Writer[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Writer[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Zipper[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    O: fpDashTsLib.es6OrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.es6OptionMod.Option[A]
  ] = js.native
  def oneOf(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.es6PlusMod.Plus1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  def oneOf(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.es6PlusMod.Plus2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  def oneOf(
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.es6PlusMod.Plus3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  def oneOf[L](
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.es6PlusMod.Plus2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  def oneOf[U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.es6PlusMod.Plus3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  def oneOf[F, P](F: fpDashTsLib.es6FoldableMod.Foldable[F], P: fpDashTsLib.es6PlusMod.Plus[P]): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[P, _]], 
    fpDashTsLib.es6HKTMod.HKT[P, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Array(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Eq(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Eq, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_FreeGroup(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_IO(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Identity(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray2v(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Option(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Ord(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Ord, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Pair(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Record(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_StrMap(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Task(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Tree(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Zipper(
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    P: fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fga */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def product[F, A](F: fpDashTsLib.es6FoldableMod.Foldable[F], S: fpDashTsLib.es6SemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], A] = js.native
  @JSName("product")
  def product_Array[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("product")
  def product_Const[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Const[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Eq[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], A] = js.native
  @JSName("product")
  def product_Free[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("product")
  def product_Free[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("product")
  def product_FreeGroup[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("product")
  def product_IOEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IOEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Identity[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("product")
  def product_IxIO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IxIO[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Map[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("product")
  def product_Map[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("product")
  def product_NonEmptyArray[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("product")
  def product_NonEmptyArray2v[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Option[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("product")
  def product_Ord[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], A] = js.native
  @JSName("product")
  def product_Pair[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("product")
  def product_Reader[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Reader[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Record[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], A] = js.native
  @JSName("product")
  def product_State[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_State[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_StrMap[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("product")
  def product_Task[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("product")
  def product_TaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_TaskEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tree[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("product")
  def product_Tuple[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tuple[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Zipper[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def sequence_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, scala.Unit]
  ] = js.native
  def sequence_[L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, scala.Unit]
  ] = js.native
  def sequence_[U, L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, scala.Unit]
  ] = js.native
  def sequence_[M, F](M: fpDashTsLib.es6ApplicativeMod.Applicative[M], F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[M, _]], 
    fpDashTsLib.es6HKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Array(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Eq(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Eq, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__FreeGroup(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__IO(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Identity(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray2v(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Option(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Ord(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Ord, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Pair(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Record(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__StrMap(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Task(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Tree(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Zipper(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  def sum[F, A](F: fpDashTsLib.es6FoldableMod.Foldable[F], S: fpDashTsLib.es6SemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, A], A] = js.native
  @JSName("sum")
  def sum_Array[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("sum")
  def sum_Const[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Const[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Eq[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, A], A] = js.native
  @JSName("sum")
  def sum_Free[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("sum")
  def sum_Free[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("sum")
  def sum_FreeGroup[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("sum")
  def sum_IOEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IOEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Identity[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("sum")
  def sum_IxIO[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IxIO[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Map[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("sum")
  def sum_Map[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("sum")
  def sum_NonEmptyArray[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_NonEmptyArray2v[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Option[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("sum")
  def sum_Ord[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, A], A] = js.native
  @JSName("sum")
  def sum_Pair[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("sum")
  def sum_Reader[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Reader[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A, U, L](
    F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Record[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, A], A] = js.native
  @JSName("sum")
  def sum_State[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_State[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_StrMap[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("sum")
  def sum_Task[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("sum")
  def sum_TaskEither[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_TaskEither[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tree[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("sum")
  def sum_Tuple[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tuple[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A](
    F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A, L](
    F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Zipper[A](
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    S: fpDashTsLib.es6SemiringMod.Semiring[A]
  ): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def toArray[F](F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  @JSName("toArray")
  def toArray_Array(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Eq(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_FreeGroup(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IO(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Identity(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray2v(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Option(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Ord(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Pair(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither(F: fpDashTsLib.es6FoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither[U, L](F: fpDashTsLib.es6FoldableMod.Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Record(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_StrMap(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Task(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tree(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer(F: fpDashTsLib.es6FoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer[L](F: fpDashTsLib.es6FoldableMod.Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Zipper(F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def traverse(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  def traverse(
    M: fpDashTsLib.es6ApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, scala.Unit]
  ] = js.native
  def traverse(
    M: fpDashTsLib.es6ApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, scala.Unit]
  ] = js.native
  def traverse[L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, scala.Unit]
  ] = js.native
  def traverse[U, L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, scala.Unit]
  ] = js.native
  def traverse[M, F](M: fpDashTsLib.es6ApplicativeMod.Applicative[M], F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[M, _]], 
    fpDashTsLib.es6HKTMod.HKT[M, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.es6ApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, scala.Unit]
  ] = js.native
  def traverse_[L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, scala.Unit]
  ] = js.native
  def traverse_[U, L](
    M: fpDashTsLib.es6ApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: fpDashTsLib.es6FoldableMod.Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, scala.Unit]
  ] = js.native
  def traverse_[M, F](M: fpDashTsLib.es6ApplicativeMod.Applicative[M], F: fpDashTsLib.es6FoldableMod.Foldable[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Array(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Eq(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_FreeGroup(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_IO(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Identity(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray2v(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Option(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Ord(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Pair(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Record(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_StrMap(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Task(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Tree(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Zipper(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Array(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Eq(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Eq]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__FreeGroup(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__IO(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Identity(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray2v(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Option(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Ord(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Ord]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Pair(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Record(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__StrMap(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Task(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Tree(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Zipper(
    M: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: fpDashTsLib.es6FoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
}

