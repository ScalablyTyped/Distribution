package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "choice")
@js.native
object choiceNs extends js.Object {
  def fanin[F](F: fpDashTsLib.libCategoryMod.Category[F] with fpDashTsLib.libChoiceMod.Choice[F]): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Const(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Either(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Free(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_IOEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_IxIO(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with fpDashTsLib.libChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Map(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Reader(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_ReaderTaskEither(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with fpDashTsLib.libChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      _
    ]
  ] = js.native
  @JSName("fanin")
  def fanin_State(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Store(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_TaskEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_These(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Traced(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Tuple(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Validation(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  @JSName("fanin")
  def fanin_Writer(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pbc */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, fpDashTsLib.libEitherMod.Either[_, _], _]
  ] = js.native
  def splitChoice[F](F: fpDashTsLib.libCategoryMod.Category[F] with fpDashTsLib.libChoiceMod.Choice[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, fpDashTsLib.libEitherMod.Either[_, _], fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Const(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Either(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Free(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_IOEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_IxIO(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with fpDashTsLib.libChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Map(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Reader(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_ReaderTaskEither(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with fpDashTsLib.libChoiceMod.Choice3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_State(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Store(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_TaskEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_These(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Traced(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Tuple(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Validation(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("splitChoice")
  def splitChoice_Writer(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      fpDashTsLib.libEitherMod.Either[_, _], 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
}

