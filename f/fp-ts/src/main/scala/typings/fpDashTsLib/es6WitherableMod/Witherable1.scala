package typings
package fpDashTsLib.es6WitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Witherable1[T /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6TraversableMod.Traversable1[T]
     with fpDashTsLib.es6FilterableMod.Filterable1[T] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  @JSName("wilt")
  var wilt_Original: Wilt1[T] = js.native
  @JSName("wither")
  var wither_Original: Wither1[T] = js.native
  def wilt[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.HKT[
      F, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO[FU, FL](F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      FU, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        FU, 
        FL, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Traced[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* wa */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.es6CompactableMod.Separated[fpDashTsLib.es6HKTMod.Type[T, _], fpDashTsLib.es6HKTMod.Type[T, _]]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[_]]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO[FU, FL](F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.es6OptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type[T, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        FU, 
        FL, 
        fpDashTsLib.es6OptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.es6HKTMod.Type[T, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_State[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_These[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Traced[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer[FL](F: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
  @JSName("wither")
  def wither_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.Type[T, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6HKTMod.Type[T, _]]
  ] = js.native
}

