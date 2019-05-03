package typings
package fpDashTsLib.libWitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Witherable2[T /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libTraversableMod.Traversable2[T]
     with fpDashTsLib.libFilterableMod.Filterable2[T] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  @JSName("wilt")
  var wilt_Original: Wilt2[T] = js.native
  @JSName("wither")
  var wither_Original: Wither2[T] = js.native
  def wilt[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO[FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      FU, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        FU, 
        FL, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type2[T, _, _], fpDashTsLib.libHKTMod.Type2[T, _, _]]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO[FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Type2[T, _, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.libOptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Type2[T, _, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, FU, FL]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        FU, 
        FL, 
        fpDashTsLib.libOptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL, 
      fpDashTsLib.libHKTMod.Type2[T, _, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_State[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_These[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer[FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
  @JSName("wither")
  def wither_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[T, _, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libHKTMod.Type2[T, _, _]]
  ] = js.native
}

