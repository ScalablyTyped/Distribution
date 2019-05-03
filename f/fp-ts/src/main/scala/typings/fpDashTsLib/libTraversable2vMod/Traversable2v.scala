package typings
package fpDashTsLib.libTraversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Traversable2v[T]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v[T]
     with fpDashTsLib.libFunctorMod.Functor[T] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  def sequence[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Const[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Either[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Free[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IOEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IxIO[FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, _]], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Map[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Reader[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[
      T, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[
      T, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libHKTMod.HKT[T, _]
    ]
  ] = js.native
  @JSName("sequence")
  def sequence_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_State[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Store[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_TaskEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_These[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Tuple[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Validation[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Writer[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Const[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Either[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Free[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_IOEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_IxIO[FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Map[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Reader[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libHKTMod.HKT[T, _]
    ]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_State[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Store[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_TaskEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_These[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Tuple[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Validation[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Writer[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  /**
    * Runs an action for every element in a data structure and accumulates the results
    */
  @JSName("traverse")
  def traverse_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
}

