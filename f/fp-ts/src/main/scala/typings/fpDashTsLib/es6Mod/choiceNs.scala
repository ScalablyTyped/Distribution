package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "choice")
@js.native
object choiceNs extends js.Object {
  def fanin[F](F: fpDashTsLib.es6CategoryMod.Category[F] with fpDashTsLib.es6ChoiceMod.Choice[F]): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.HKT2[F, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.HKT2[F, _, _], 
    fpDashTsLib.es6HKTMod.HKT2[F, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Const(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Either(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Free(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_IOEither(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_IxIO(
    F: fpDashTsLib.es6CategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with fpDashTsLib.es6ChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Map(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Reader(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_ReaderTaskEither(
    F: fpDashTsLib.es6CategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with fpDashTsLib.es6ChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      _
    ]
  ] = js.native
  @JSName("fanin")
  def fanin_State(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Store(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_TaskEither(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_These(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Traced(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Tuple(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Validation(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Writer(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pac */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pbc */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.es6EitherMod.Either[_, _], _]
  ] = js.native
  def splitChoice[F](F: fpDashTsLib.es6CategoryMod.Category[F] with fpDashTsLib.es6ChoiceMod.Choice[F]): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.HKT2[F, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.HKT2[F, _, _], 
    fpDashTsLib.es6HKTMod.HKT2[F, fpDashTsLib.es6EitherMod.Either[_, _], fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Const(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Either(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Free(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_IOEither(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_IxIO(
    F: fpDashTsLib.es6CategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with fpDashTsLib.es6ChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Map(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Reader(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_ReaderTaskEither(
    F: fpDashTsLib.es6CategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with fpDashTsLib.es6ChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.es6HKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_State(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Store(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_TaskEither(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_These(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Traced(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Tuple(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Validation(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Writer(
    F: fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pab */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pcd */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      fpDashTsLib.es6EitherMod.Either[_, _], 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
}

