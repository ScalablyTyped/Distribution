package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "stateT")
@js.native
object stateTNs extends js.Object {
  def ap[F](F: fpDashTsLib.libChainMod.Chain[F]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("ap")
  def ap_Array(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Const(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Either(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Eq(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Free(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_FreeGroup(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_IO(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_IOEither(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Identity(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_IxIO(F: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Map(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_NonEmptyArray(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        js.Tuple2[js.Function1[/* a */ _, _], _]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_NonEmptyArray2v(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        js.Tuple2[js.Function1[/* a */ _, _], _]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Option(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Ord(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Pair(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Reader(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_ReaderTaskEither(F: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        js.Tuple2[js.Function1[/* a */ _, _], _]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Record(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_State(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Store(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_StrMap(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Task(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_TaskEither(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        _, 
        js.Tuple2[js.Function1[/* a */ _, _], _]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_These(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Traced(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Tree(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Tuple(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Validation(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        _, 
        js.Tuple2[js.Function1[/* a */ _, _], _]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Writer(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Zipper(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fab */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[js.Function1[/* a */ _, _], _]]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def chain[F](F: fpDashTsLib.libChainMod.Chain[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
    ], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("chain")
  def chain_Array(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Const(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Either(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Eq(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Free(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_FreeGroup(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_IO(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_IOEither(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Identity(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_IxIO(F: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Map(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray2v(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Option(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Ord(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Pair(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Reader(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_ReaderTaskEither(F: fpDashTsLib.libChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Record(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_State(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Store(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_StrMap(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Task(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_These(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Traced(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Tree(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Tuple(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Validation(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Writer(F: fpDashTsLib.libChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Zipper(F: fpDashTsLib.libChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* s */ _, 
        fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
      ]
    ], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def fromState[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("fromState")
  def fromState_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("fromState")
  def fromState_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libStateMod.State[_, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def get[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function0[js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]] = js.native
  def get2v[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]] = js.native
  @JSName("get2v")
  def get2v_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
  ] = js.native
  @JSName("get2v")
  def get2v_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* s */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
  ] = js.native
  def getStateT[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libStateTMod.StateT[M] = js.native
  def getStateT2v[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libStateTMod.StateT2v[M] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Eq(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getStateT2v")
  def getStateT2v_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getStateT2v")
  def getStateT2v_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getStateT2v")
  def getStateT2v_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getStateT2v")
  def getStateT2v_IxIO(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.libStateTMod.StateT2v3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getStateT2v")
  def getStateT2v_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getStateT2v")
  def getStateT2v_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Ord(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getStateT2v")
  def getStateT2v_ReaderTaskEither(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): fpDashTsLib.libStateTMod.StateT2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Record(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getStateT2v")
  def getStateT2v_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getStateT2v")
  def getStateT2v_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getStateT2v")
  def getStateT2v_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getStateT2v")
  def getStateT2v_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Traced(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libStateTMod.StateT2v2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getStateT2v")
  def getStateT2v_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libStateTMod.StateT2v1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("getStateT")
  def getStateT_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getStateT")
  def getStateT_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getStateT")
  def getStateT_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getStateT")
  def getStateT_Eq(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getStateT")
  def getStateT_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getStateT")
  def getStateT_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getStateT")
  def getStateT_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getStateT")
  def getStateT_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getStateT")
  def getStateT_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getStateT")
  def getStateT_IxIO(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.libStateTMod.StateT3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("getStateT")
  def getStateT_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getStateT")
  def getStateT_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getStateT")
  def getStateT_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getStateT")
  def getStateT_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getStateT")
  def getStateT_Ord(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getStateT")
  def getStateT_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getStateT")
  def getStateT_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getStateT")
  def getStateT_ReaderTaskEither(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): fpDashTsLib.libStateTMod.StateT3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("getStateT")
  def getStateT_Record(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getStateT")
  def getStateT_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getStateT")
  def getStateT_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getStateT")
  def getStateT_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getStateT")
  def getStateT_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getStateT")
  def getStateT_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getStateT")
  def getStateT_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getStateT")
  def getStateT_Traced(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getStateT")
  def getStateT_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getStateT")
  def getStateT_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getStateT")
  def getStateT_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getStateT")
  def getStateT_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libStateTMod.StateT2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getStateT")
  def getStateT_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libStateTMod.StateT1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("get")
  def get_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("get")
  def get_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function0[
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def gets[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("gets")
  def gets_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("gets")
  def gets_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def liftF[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("liftF")
  def liftF_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Eq(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_IxIO(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Ord(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_ReaderTaskEither(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Record(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Traced(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def map[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("map")
  def map_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Eq(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_IxIO(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Ord(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_ReaderTaskEither(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Record(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Traced(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("map")
  def map_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def modify[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  @JSName("modify")
  def modify_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("modify")
  def modify_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ fpDashTsLib.libFunctionMod.Endomorphism[_], 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  def of[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* s */ _, fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[_, _]]]
  ] = js.native
  @JSName("of")
  def of_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[_, _]]
    ]
  ] = js.native
  @JSName("of")
  def of_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* s */ _, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[_, _]]
    ]
  ] = js.native
  def put[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* s */ js.Any, 
    js.Function0[fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[scala.Unit, _]]]
  ] = js.native
  @JSName("put")
  def put_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
  @JSName("put")
  def put_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* s */ js.Any, 
    js.Function0[
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Tuple2[scala.Unit, _]]
    ]
  ] = js.native
}

