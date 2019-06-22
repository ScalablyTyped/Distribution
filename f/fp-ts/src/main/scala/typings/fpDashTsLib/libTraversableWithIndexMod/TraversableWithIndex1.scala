package typings
package fpDashTsLib.libTraversableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableWithIndex1[T /* <: fpDashTsLib.libHKTMod.URIS */, I]
  extends fpDashTsLib.libTraversable2vMod.Traversable2v1[T]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[T, I]
     with fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[T, I] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  def traverseWithIndex[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO[FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Kind[T, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libHKTMod.Kind[T, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libHKTMod.Kind[T, _]]
  ] = js.native
}

