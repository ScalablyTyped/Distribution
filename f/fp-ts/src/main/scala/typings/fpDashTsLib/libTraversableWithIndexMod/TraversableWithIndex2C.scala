package typings
package fpDashTsLib.libTraversableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableWithIndex2C[T /* <: fpDashTsLib.libHKTMod.URIS2 */, I, L]
  extends fpDashTsLib.libTraversable2vMod.Traversable2v2C[T, L]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex2C[T, I, L]
     with fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex2C[T, I, L] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  /* InferMemberOverrides */
  override val _L: L = js.native
  def traverseWithIndex[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO[FU](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Type2[T, L, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      L, 
      fpDashTsLib.libHKTMod.Type2[T, L, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither[FU](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, L]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      L, 
      fpDashTsLib.libHKTMod.Type2[T, L, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, L, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libHKTMod.Type2[T, L, _]]
  ] = js.native
}

