package typings
package fpDashTsLib.libTraversableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversableComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFoldableMod.FoldableComposition11[F, G]
     with fpDashTsLib.libFunctorMod.FunctorComposition11[F, G] {
  def traverse[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[H, _]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]]
  ] = js.native
  @JSName("traverse")
  def traverse_Array(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Const(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Const[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Either(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Either[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Eq(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Eq, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Free(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Free[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_FreeGroup(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IO(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Identity(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO(H: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO[HU, HL](H: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, HU, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, HU, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      HU, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Map(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Map[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_NonEmptyArray2v(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Option(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Ord(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Ord, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Pair(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither(H: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither[HU, HL](
    H: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, HU, HL]
  ): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, HU, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      HU, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Record(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_State(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_State[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Store(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Store[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_StrMap(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Task(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_These(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_These[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tree(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer(H: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer[HL](H: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, HL]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, HL, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Zipper(H: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
}

