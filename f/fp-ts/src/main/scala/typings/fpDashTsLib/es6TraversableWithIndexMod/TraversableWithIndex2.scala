package typings
package fpDashTsLib.es6TraversableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableWithIndex2[T /* <: fpDashTsLib.es6HKTMod.URIS2 */, I]
  extends fpDashTsLib.es6Traversable2vMod.Traversable2v2[T]
     with fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex2[T, I]
     with fpDashTsLib.es6FoldableWithIndexMod.FoldableWithIndex2[T, I] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  def traverseWithIndex[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO[FU, FL](F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6HKTMod.Type2[T, _, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[T, _, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.es6HKTMod.Type2[T, FL, _]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, FL, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.es6HKTMod.Type2[T, FL, _]]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type2[T, _, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6HKTMod.Type2[T, _, _]]
  ] = js.native
}

