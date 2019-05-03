package typings
package fpDashTsLib.libTraversableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraverseWithIndex[T, I] extends js.Object {
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def apply(
    F: fpDashTsLib.libApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def apply[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def apply[FL](
    F: fpDashTsLib.libApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, FL, fpDashTsLib.libHKTMod.HKT[T, _]]
  ] = js.native
  def apply[FU, FL](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[T, _], 
    /* f */ js.Function2[
      /* i */ I, 
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
}

