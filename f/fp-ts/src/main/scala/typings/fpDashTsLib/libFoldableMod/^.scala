package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Foldable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elem[F, A](F: Foldable[F], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libHKTMod.HKT[F, A], scala.Boolean] = js.native
  @JSName("elem")
  def elem_Array[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Const[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Either[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Free[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_FreeGroup[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IO[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IOEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Identity[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_IxIO[A, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Map[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_NonEmptyArray2v[A](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    S: fpDashTsLib.libSetoidMod.Setoid[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Option[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Pair[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Reader[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    S: fpDashTsLib.libSetoidMod.Setoid[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_ReaderTaskEither[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    S: fpDashTsLib.libSetoidMod.Setoid[A]
  ): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_State[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Store[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_StrMap[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Task[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_TaskEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_These[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Traced[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tree[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Tuple[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Validation[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Writer[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    scala.Boolean
  ] = js.native
  @JSName("elem")
  def elem_Zipper[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* a */ A, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    scala.Boolean
  ] = js.native
  def find[F](F: Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Array(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Const(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Const[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Either(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Either[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Free(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Free[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_FreeGroup(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IO(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IOEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IOEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Identity(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IxIO(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_IxIO[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Map(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Map[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_NonEmptyArray(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_NonEmptyArray2v(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Option(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Pair(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Reader(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Reader[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_ReaderTaskEither(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_ReaderTaskEither[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_State(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_State[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Store(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Store[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_StrMap(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Task(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_TaskEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_TaskEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_These(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_These[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Traced(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Traced[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tree(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tuple(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Tuple[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Validation(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Validation[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Writer(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Writer[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  @JSName("find")
  def find_Zipper(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* p */ fpDashTsLib.libFunctionMod.Predicate[_], 
    fpDashTsLib.libOptionMod.Option[_]
  ] = js.native
  def fold[F, M](F: Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, M], M] = js.native
  def foldM(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.libMonadMod.Monad1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  def foldM(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.libMonadMod.Monad2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  def foldM(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.libMonadMod.Monad3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  def foldM[L](
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.libMonadMod.Monad2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  def foldM[U, L](
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    M: fpDashTsLib.libMonadMod.Monad3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  def foldM[F, M](F: Foldable[F], M: fpDashTsLib.libMonadMod.Monad[M]): js.Function3[
    /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Array(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldM")
  def foldM_FreeGroup(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldM")
  def foldM_IO(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Identity(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldM")
  def foldM_NonEmptyArray2v(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Option(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Pair(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldM")
  def foldM_StrMap(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Task(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Tree(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldM")
  def foldM_Zipper(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function3[
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* b */ js.Any, 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def foldMap[F, M](F: Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], /* f */ js.Function1[/* a */ js.Any, M], M] = js.native
  @JSName("foldMap")
  def foldMap_Array[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Const[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Const[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Either[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Either[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Free[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Free[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_FreeGroup[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IO[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IOEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IOEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Identity[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IxIO[M](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_IxIO[M, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Map[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Map[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_NonEmptyArray[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_NonEmptyArray2v[M](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Option[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Pair[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Reader[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Reader[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_ReaderTaskEither[M](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_ReaderTaskEither[M, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_State[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_State[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Store[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Store[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_StrMap[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Task[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_TaskEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_TaskEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_These[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_These[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Traced[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Traced[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tree[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tuple[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Tuple[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Validation[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Validation[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Writer[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Writer[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("foldMap")
  def foldMap_Zipper[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Array[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, M], M] = js.native
  @JSName("fold")
  def fold_Const[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Const[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Either[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Free[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], M] = js.native
  @JSName("fold")
  def fold_Free[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], M] = js.native
  @JSName("fold")
  def fold_FreeGroup[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IO[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, M], M] = js.native
  @JSName("fold")
  def fold_IOEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IOEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Identity[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, M], M] = js.native
  @JSName("fold")
  def fold_IxIO[M](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_IxIO[M, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Map[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], M] = js.native
  @JSName("fold")
  def fold_Map[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], M] = js.native
  @JSName("fold")
  def fold_NonEmptyArray[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v[M](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Option[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, M], M] = js.native
  @JSName("fold")
  def fold_Pair[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, M], M] = js.native
  @JSName("fold")
  def fold_Reader[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Reader[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[M, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_State[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_State[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Store[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_StrMap[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, M], M] = js.native
  @JSName("fold")
  def fold_Task[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, M], M] = js.native
  @JSName("fold")
  def fold_TaskEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_TaskEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_These[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Traced[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tree[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, M], M] = js.native
  @JSName("fold")
  def fold_Tuple[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Tuple[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Validation[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Writer[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
    M
  ] = js.native
  @JSName("fold")
  def fold_Zipper[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, M], M] = js.native
  def foldr[F](F: Foldable[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Array(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Const(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Const[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Either(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Either[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Free(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Free[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_FreeGroup(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IO(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IOEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IOEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Identity(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IxIO(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_IxIO[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Map(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Map[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_NonEmptyArray(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_NonEmptyArray2v(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Option(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Pair(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Reader(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Reader[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_ReaderTaskEither(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_ReaderTaskEither[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_State(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_State[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Store(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Store[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_StrMap(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Task(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_TaskEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_TaskEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_These(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_These[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Traced(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Traced[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tree(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tuple(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Tuple[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Validation(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Validation[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Writer(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Writer[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  @JSName("foldr")
  def foldr_Zipper(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* b */ js.Any, 
    /* f */ js.Function2[/* a */ js.Any, /* b */ js.Any, _], 
    _
  ] = js.native
  def getFoldableComposition(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  def getFoldableComposition(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    G: Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): FoldableComposition12[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  def getFoldableComposition(
    F: Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FoldableComposition21[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  def getFoldableComposition(
    F: Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    G: Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  def getFoldableComposition[LG](
    F: Foldable2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      LG
    ],
    G: Foldable2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  def getFoldableComposition[UF, LF](
    F: Foldable3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      UF, 
      LF
    ],
    G: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): FoldableComposition3C1[
    fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
    fpDashTsLib.fpDashTsLibStrings.StrMap, 
    UF, 
    LF
  ] = js.native
  def getFoldableComposition[F, G](F: Foldable[F], G: Foldable[G]): FoldableComposition[F, G] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Array(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Const[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.fpDashTsLibStrings.Const, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Either[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.fpDashTsLibStrings.Either, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Free[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.fpDashTsLibStrings.Free, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_FreeGroup(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IO(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], G: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_IOEither[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.fpDashTsLibStrings.IOEither, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Identity(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Map[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.fpDashTsLibStrings.Map, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): FoldableComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_NonEmptyArray2v(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): FoldableComposition11[
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
    fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Option(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Pair(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Reader[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.fpDashTsLibStrings.Reader, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.State]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_State[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.State]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.fpDashTsLibStrings.State, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Store[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.fpDashTsLibStrings.Store, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_StrMap(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Task(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): FoldableComposition22[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_TaskEither[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): FoldableComposition22C[
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    fpDashTsLib.fpDashTsLibStrings.TaskEither, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.These]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_These[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.These]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.fpDashTsLibStrings.These, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Traced[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.fpDashTsLibStrings.Traced, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tree(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Tuple[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.fpDashTsLibStrings.Tuple, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): FoldableComposition22[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Validation[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): FoldableComposition22C[
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    fpDashTsLib.fpDashTsLibStrings.Validation, 
    LG
  ] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer(
    F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): FoldableComposition22[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Writer[LG](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, LG],
    G: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): FoldableComposition22C[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.fpDashTsLibStrings.Writer, LG] = js.native
  @JSName("getFoldableComposition")
  def getFoldableComposition_Zipper(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    G: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): FoldableComposition11[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def intercalate[F, M](F: Foldable[F], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[/* sep */ M, js.Function1[/* fm */ fpDashTsLib.libHKTMod.HKT[F, M], M]] = js.native
  @JSName("intercalate")
  def intercalate_Array[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Const[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Either[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Free[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_FreeGroup[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IO[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IOEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Identity[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_IxIO[M, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Map[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_NonEmptyArray2v[M](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Option[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Pair[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Reader[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_ReaderTaskEither[M, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    M: fpDashTsLib.libMonoidMod.Monoid[M]
  ): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_State[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Store[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_StrMap[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Task[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_TaskEither[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_These[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Traced[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tree[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, M], M]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Tuple[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Validation[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Writer[M, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[
      /* fm */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, M], 
      M
    ]
  ] = js.native
  @JSName("intercalate")
  def intercalate_Zipper[M](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* sep */ M, 
    js.Function1[/* fm */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, M], M]
  ] = js.native
  def maximum[F, A](F: Foldable[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("maximum")
  def maximum_Array[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Const[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Const[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Either[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Either[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Free[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Free[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_FreeGroup[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IO[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IOEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IOEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Identity[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IxIO[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_IxIO[A, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Map[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Map[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_NonEmptyArray[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_NonEmptyArray2v[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Option[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Pair[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Reader[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Reader[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_ReaderTaskEither[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_ReaderTaskEither[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    O: fpDashTsLib.libOrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_State[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_State[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Store[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Store[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_StrMap[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Task[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_TaskEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_TaskEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_These[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_These[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Traced[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Traced[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tree[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tuple[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Tuple[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Validation[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Validation[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Writer[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Writer[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("maximum")
  def maximum_Zipper[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def minimum[F, A](F: Foldable[F], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("minimum")
  def minimum_Array[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Const[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Const[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Either[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Either[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Free[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Free[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_FreeGroup[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IO[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IOEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IOEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Identity[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IxIO[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_IxIO[A, U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Map[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Map[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_NonEmptyArray[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_NonEmptyArray2v[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Option[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Pair[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Reader[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Reader[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_ReaderTaskEither[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_ReaderTaskEither[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    O: fpDashTsLib.libOrdMod.Ord[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_State[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_State[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Store[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Store[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_StrMap[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Task[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_TaskEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_TaskEither[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_These[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_These[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Traced[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Traced[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tree[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tuple[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Tuple[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Validation[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Validation[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Writer[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Writer[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  @JSName("minimum")
  def minimum_Zipper[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, A], 
    fpDashTsLib.libOptionMod.Option[A]
  ] = js.native
  def oneOf(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.libPlusMod.Plus1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  def oneOf(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.libPlusMod.Plus2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  def oneOf(
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.libPlusMod.Plus3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  def oneOf[L](
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.libPlusMod.Plus2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  def oneOf[U, L](
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    P: fpDashTsLib.libPlusMod.Plus3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  def oneOf[F, P](F: Foldable[F], P: fpDashTsLib.libPlusMod.Plus[P]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[P, _]], 
    fpDashTsLib.libHKTMod.HKT[P, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Array(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_FreeGroup(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_IO(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Identity(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_NonEmptyArray2v(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Option(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Pair(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_StrMap(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Task(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Tree(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("oneOf")
  def oneOf_Zipper(
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    P: fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def product[F, A](F: Foldable[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  @JSName("product")
  def product_Array[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("product")
  def product_Const[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Const[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Either[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Free[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("product")
  def product_Free[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("product")
  def product_FreeGroup[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IO[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("product")
  def product_IOEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IOEither[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Identity[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("product")
  def product_IxIO[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_IxIO[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Map[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("product")
  def product_Map[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("product")
  def product_NonEmptyArray[A](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("product")
  def product_NonEmptyArray2v[A](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Option[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("product")
  def product_Pair[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("product")
  def product_Reader[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Reader[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_ReaderTaskEither[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_State[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_State[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Store[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_StrMap[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("product")
  def product_Task[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("product")
  def product_TaskEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_TaskEither[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_These[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Traced[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tree[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("product")
  def product_Tuple[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Tuple[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Validation[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Writer[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("product")
  def product_Zipper[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  def sequence_(
    M: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  def sequence_[L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  def sequence_[U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  def sequence_[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: Foldable[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Array(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__FreeGroup(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__IO(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Identity(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__NonEmptyArray2v(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Option(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Pair(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__StrMap(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Task(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Tree(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("sequence_")
  def sequence__Zipper(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  def sum[F, A](F: Foldable[F], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], A] = js.native
  @JSName("sum")
  def sum_Array[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, A], A] = js.native
  @JSName("sum")
  def sum_Const[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Const[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Either[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Free[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, A], A] = js.native
  @JSName("sum")
  def sum_Free[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, A], A] = js.native
  @JSName("sum")
  def sum_FreeGroup[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IO[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, A], A] = js.native
  @JSName("sum")
  def sum_IOEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IOEither[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Identity[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, A], A] = js.native
  @JSName("sum")
  def sum_IxIO[A](F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_IxIO[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Map[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, A], A] = js.native
  @JSName("sum")
  def sum_Map[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, A], A] = js.native
  @JSName("sum")
  def sum_NonEmptyArray[A](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_NonEmptyArray2v[A](
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Option[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, A], A] = js.native
  @JSName("sum")
  def sum_Pair[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, A], A] = js.native
  @JSName("sum")
  def sum_Reader[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Reader[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A](
    F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_ReaderTaskEither[A, U, L](
    F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_State[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_State[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Store[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_StrMap[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, A], A] = js.native
  @JSName("sum")
  def sum_Task[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, A], A] = js.native
  @JSName("sum")
  def sum_TaskEither[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_TaskEither[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_These[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Traced[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tree[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, A], A] = js.native
  @JSName("sum")
  def sum_Tuple[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Tuple[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Validation[A, L](
    F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L],
    S: fpDashTsLib.libSemiringMod.Semiring[A]
  ): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A](F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Writer[A, L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, A], 
    A
  ] = js.native
  @JSName("sum")
  def sum_Zipper[A](F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper], S: fpDashTsLib.libSemiringMod.Semiring[A]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, A], A] = js.native
  def toArray[F](F: Foldable[F]): js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libArrayMod.Global.Array[_]] = js.native
  @JSName("toArray")
  def toArray_Array(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Const[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Either[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Free[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_FreeGroup(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IO(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IOEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Identity(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_IxIO[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Map[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_NonEmptyArray2v(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Option(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Pair(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Reader[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither(F: Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_ReaderTaskEither[U, L](F: Foldable3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_State[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Store[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_StrMap(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Task(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_TaskEither[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_These[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Traced[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tree(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Tuple[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Validation[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer(F: Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Writer[L](F: Foldable2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  @JSName("toArray")
  def toArray_Zipper(F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libArrayMod.Global.Array[_]
  ] = js.native
  def traverse(
    M: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  def traverse(
    M: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  def traverse(
    M: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  def traverse[L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  def traverse[U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  def traverse[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: Foldable[F]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  def traverse_(
    M: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  def traverse_[L](
    M: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  def traverse_[U, L](
    M: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L
    ],
    F: Foldable1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  def traverse_[M, F](M: fpDashTsLib.libApplicativeMod.Applicative[M], F: Foldable[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[M, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Array(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_FreeGroup(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_IO(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Identity(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray2v(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Option(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Pair(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_StrMap(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Task(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Tree(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traverse")
  def traverse_Zipper(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Array(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Array]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__FreeGroup(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__IO(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.IO]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Identity(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Identity]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__NonEmptyArray2v(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Option(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Option]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Pair(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Pair]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__StrMap(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.StrMap]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Task(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Task]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Tree(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Tree]
  ): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traverse_")
  def traverse__Zipper(
    M: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper],
    F: Foldable1[fpDashTsLib.fpDashTsLibStrings.Zipper]
  ): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
}

