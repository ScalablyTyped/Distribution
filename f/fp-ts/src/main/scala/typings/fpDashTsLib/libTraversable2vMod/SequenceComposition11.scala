package typings
package fpDashTsLib.libTraversable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceComposition11[F /* <: fpDashTsLib.libHKTMod.URIS */, G /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def apply(
    H: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply(
    H: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply(
    H: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind[
        G, 
        fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply[H](H: fpDashTsLib.libApplicativeMod.Applicative[H]): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libHKTMod.HKT[H, _]]], 
    fpDashTsLib.libHKTMod.HKT[H, fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]]
  ] = js.native
  def apply[HL](
    H: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      HL
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind[G, fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, HL, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
  def apply[HU, HL](
    H: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      HU, 
      HL
    ]
  ): js.Function1[
    /* fga */ fpDashTsLib.libHKTMod.Kind[
      F, 
      fpDashTsLib.libHKTMod.Kind[
        G, 
        fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, HU, HL, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      HU, 
      HL, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libHKTMod.Kind[G, _]]
    ]
  ] = js.native
}

