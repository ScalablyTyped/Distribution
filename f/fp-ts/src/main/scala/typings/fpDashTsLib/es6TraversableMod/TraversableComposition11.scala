package typings
package fpDashTsLib.es6TraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableComposition11[F /* <: fpDashTsLib.es6HKTMod.URIS */, G /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6FoldableMod.FoldableComposition11[F, G]
     with fpDashTsLib.es6FunctorMod.FunctorComposition11[F, G] {
  def traverse[H](H: fpDashTsLib.es6ApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[H, _]], 
    fpDashTsLib.es6HKTMod.HKT[H, fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]]
  ] = js.native
  @JSName("traverse")
  def traverse_Array(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Const(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Const[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Either(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Either[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Free(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Free[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_FreeGroup(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IO(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Identity(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO(H: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO[HU, HL](H: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, HU, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, HU, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      HU, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Map(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Map[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray2v(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Option(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Pair(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither(H: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither[HU, HL](
    H: fpDashTsLib.es6ApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, HU, HL]
  ): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, HU, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      HU, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_State(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_State[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Store(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Store[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_StrMap(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Task(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_These(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_These[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tree(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer(H: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer[HL](H: fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, HL]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, HL, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      HL, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Zipper(H: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fga */ fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.es6HKTMod.Type[F, fpDashTsLib.es6HKTMod.Type[G, _]]
    ]
  ] = js.native
}

