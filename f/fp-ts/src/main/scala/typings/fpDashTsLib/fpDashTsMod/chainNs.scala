package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "chain")
@js.native
object chainNs extends js.Object {
  def flatten[F](chain: fpDashTsLib.libChainMod.Chain[F]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Array(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Const(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Const[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Either(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Either[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Free(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Free[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_FreeGroup(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IO(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IOEither(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IOEither[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Identity(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IxIO(chain: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IxIO[U, L](chain: fpDashTsLib.libChainMod.Chain3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      U, 
      L, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Map(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Map[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_NonEmptyArray(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("flatten")
  def flatten_NonEmptyArray2v(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Option(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Pair(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Reader(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Reader[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_ReaderTaskEither(chain: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_ReaderTaskEither[U, L](chain: fpDashTsLib.libChainMod.Chain3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_State(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_State[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Store(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Store[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_StrMap(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Task(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("flatten")
  def flatten_TaskEither(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_TaskEither[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_These(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_These[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Traced(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Traced[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tree(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tuple(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tuple[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Validation(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Validation[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Writer(chain: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Writer[L](chain: fpDashTsLib.libChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      L, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Zipper(chain: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* mma */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
}

