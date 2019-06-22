package typings
package fpDashTsLib.es6WitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wither[W] extends js.Object {
  def apply(
    F: fpDashTsLib.es6ApplicativeMod.Applicative1[
      fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
  def apply(
    F: fpDashTsLib.es6ApplicativeMod.Applicative2[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
  def apply(
    F: fpDashTsLib.es6ApplicativeMod.Applicative3[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
  def apply[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6OptionMod.Option[_]]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
  def apply[FL](
    F: fpDashTsLib.es6ApplicativeMod.Applicative2C[
      fpDashTsLib.fpDashTsLibStrings.Const | fpDashTsLib.fpDashTsLibStrings.Either | fpDashTsLib.fpDashTsLibStrings.Free | fpDashTsLib.fpDashTsLibStrings.IOEither | fpDashTsLib.fpDashTsLibStrings.Map | fpDashTsLib.fpDashTsLibStrings.Reader | fpDashTsLib.fpDashTsLibStrings.State | fpDashTsLib.fpDashTsLibStrings.Store | fpDashTsLib.fpDashTsLibStrings.TaskEither | fpDashTsLib.fpDashTsLibStrings.These | fpDashTsLib.fpDashTsLibStrings.Traced | fpDashTsLib.fpDashTsLibStrings.Tuple | fpDashTsLib.fpDashTsLibStrings.Validation | fpDashTsLib.fpDashTsLibStrings.Writer, 
      FL
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, FL, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
  def apply[FU, FL](
    F: fpDashTsLib.es6ApplicativeMod.Applicative3C[
      fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      FU, 
      FL
    ]
  ): js.Function2[
    /* ta */ fpDashTsLib.es6HKTMod.HKT[W, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6OptionMod.Option[_]]
    ], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, FU, FL, fpDashTsLib.es6HKTMod.HKT[W, _]]
  ] = js.native
}

