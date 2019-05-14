package typings
package fpDashTsLib.libStrongMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Strong", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fanout[F /* <: fpDashTsLib.libHKTMod.URIS4 */](F: fpDashTsLib.libCategoryMod.Category4[F] with Strong4[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type4[F, _, _, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type4[F, _, _, _, _], 
    fpDashTsLib.libHKTMod.Type4[F, _, _, _, js.Tuple2[_, _]]
  ] = js.native
  def fanout[F](F: fpDashTsLib.libCategoryMod.Category[F] with Strong[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Const(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with Strong2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Either(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with Strong2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Free(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with Strong2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_IOEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with Strong2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_IxIO(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with Strong3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Map(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with Strong2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Reader(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with Strong2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_ReaderTaskEither(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with Strong3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_State(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with Strong2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Store(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with Strong2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_TaskEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with Strong2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_These(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with Strong2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Traced(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with Strong2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Tuple(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with Strong2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Validation(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with Strong2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("fanout")
  def fanout_Writer(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with Strong2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pac */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
  ] = js.native
  def splitStrong[F](F: fpDashTsLib.libCategoryMod.Category[F] with Strong[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.HKT2[F, _, _], 
    fpDashTsLib.libHKTMod.HKT2[F, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  def splitStrong[F /* <: fpDashTsLib.libHKTMod.URIS4 */](F: fpDashTsLib.libCategoryMod.Category4[F] with Strong4[F]): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type4[F, _, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type4[F, _, _, _, _], 
    fpDashTsLib.libHKTMod.Type4[F, _, _, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Const(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Const] with Strong2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Either(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Either] with Strong2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Free(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Free] with Strong2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_IOEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.IOEither] with Strong2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_IxIO(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.IxIO] with Strong3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Map(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Map] with Strong2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Reader(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Reader] with Strong2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_ReaderTaskEither(
    F: fpDashTsLib.libCategoryMod.Category3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] with Strong3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_State(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.State] with Strong2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Store(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Store] with Strong2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_TaskEither(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.TaskEither] with Strong2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_These(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.These] with Strong2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Traced(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Traced] with Strong2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Tuple(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Tuple] with Strong2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Validation(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Validation] with Strong2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
  @JSName("splitStrong")
  def splitStrong_Writer(
    F: fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.fpDashTsLibStrings.Writer] with Strong2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* pab */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* pcd */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, js.Tuple2[_, _], js.Tuple2[_, _]]
  ] = js.native
}

