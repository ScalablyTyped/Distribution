package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "chain")
@js.native
object chainNs extends js.Object {
  def flatten[F](chain: fpDashTsLib.es6ChainMod.Chain[F]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Array(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Const(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Const[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Either(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Either[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Free(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Free[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_FreeGroup(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IO(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.IO, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IOEither(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IOEither[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Identity(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IxIO(chain: fpDashTsLib.es6ChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_IxIO[U, L](chain: fpDashTsLib.es6ChainMod.Chain3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      U, 
      L, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Map(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Map[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_NonEmptyArray(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("flatten")
  def flatten_NonEmptyArray2v(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Option(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Pair(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Reader(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Reader[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_ReaderTaskEither(chain: fpDashTsLib.es6ChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_ReaderTaskEither[U, L](chain: fpDashTsLib.es6ChainMod.Chain3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_State(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_State[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Store(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Store[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_StrMap(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Task(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("flatten")
  def flatten_TaskEither(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_TaskEither[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_These(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_These[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Traced(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Traced[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tree(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tuple(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Tuple[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Validation(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Validation[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Writer(chain: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Writer[L](chain: fpDashTsLib.es6ChainMod.Chain2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      L, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("flatten")
  def flatten_Zipper(chain: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* mma */ fpDashTsLib.es6HKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
}

