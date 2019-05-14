package typings
package fpDashTsLib.es6ReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/ReaderT", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ap[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function2[
    /* fab */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, js.Function1[/* a */ _, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("ap")
  def ap_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("ap")
  def ap_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("ap")
  def ap_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("ap")
  def ap_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("ap")
  def ap_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("ap")
  def ap_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("ap")
  def ap_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("ap")
  def ap_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("ap")
  def ap_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("ap")
  def ap_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("ap")
  def ap_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("ap")
  def ap_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* fab */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, js.Function1[/* a */ _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def ask[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function0[js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]] = js.native
  @JSName("ask")
  def ask_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("ask")
  def ask_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("ask")
  def ask_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("ask")
  def ask_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("ask")
  def ask_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("ask")
  def ask_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("ask")
  def ask_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("ask")
  def ask_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("ask")
  def ask_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("ask")
  def ask_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("ask")
  def ask_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function0[
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("ask")
  def ask_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function0[
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def asks[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("asks")
  def asks_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("asks")
  def asks_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("asks")
  def asks_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("asks")
  def asks_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("asks")
  def asks_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("asks")
  def asks_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("asks")
  def asks_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("asks")
  def asks_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("asks")
  def asks_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("asks")
  def asks_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("asks")
  def asks_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("asks")
  def asks_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* e */ js.Any, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def chain[F](F: fpDashTsLib.es6ChainMod.Chain[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("chain")
  def chain_Array(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("chain")
  def chain_Const(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_Either(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Free(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_FreeGroup(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("chain")
  def chain_IO(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("chain")
  def chain_IOEither(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Identity(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("chain")
  def chain_IxIO(F: fpDashTsLib.es6ChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Map(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray2v(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Option(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("chain")
  def chain_Pair(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("chain")
  def chain_Reader(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_ReaderTaskEither(F: fpDashTsLib.es6ChainMod.Chain3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_State(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_Store(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_StrMap(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("chain")
  def chain_Task(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_These(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_Traced(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Tree(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
    ], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("chain")
  def chain_Tuple(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("chain")
  def chain_Validation(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Writer(F: fpDashTsLib.es6ChainMod.Chain2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[
        /* e */ _, 
        fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
      ]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Zipper(F: fpDashTsLib.es6ChainMod.Chain1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
    ], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def fromReader[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("fromReader")
  def fromReader_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[_, _], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def getReaderT[M](M: fpDashTsLib.es6MonadMod.Monad[M]): ReaderT[M] = js.native
  def getReaderT2v[M](M: fpDashTsLib.es6MonadMod.Monad[M]): ReaderT2v[M] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): ReaderT2v3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): ReaderT2v3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): ReaderT2v2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getReaderT2v")
  def getReaderT2v_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): ReaderT2v1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("getReaderT")
  def getReaderT_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getReaderT")
  def getReaderT_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getReaderT")
  def getReaderT_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getReaderT")
  def getReaderT_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getReaderT")
  def getReaderT_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getReaderT")
  def getReaderT_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getReaderT")
  def getReaderT_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getReaderT")
  def getReaderT_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getReaderT")
  def getReaderT_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): ReaderT3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("getReaderT")
  def getReaderT_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getReaderT")
  def getReaderT_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getReaderT")
  def getReaderT_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getReaderT")
  def getReaderT_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getReaderT")
  def getReaderT_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getReaderT")
  def getReaderT_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getReaderT")
  def getReaderT_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): ReaderT3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("getReaderT")
  def getReaderT_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getReaderT")
  def getReaderT_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getReaderT")
  def getReaderT_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getReaderT")
  def getReaderT_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getReaderT")
  def getReaderT_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getReaderT")
  def getReaderT_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getReaderT")
  def getReaderT_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getReaderT")
  def getReaderT_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getReaderT")
  def getReaderT_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getReaderT")
  def getReaderT_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getReaderT")
  def getReaderT_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): ReaderT2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getReaderT")
  def getReaderT_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): ReaderT1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def map[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("map")
  def map_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("map")
  def map_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("map")
  def map_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("map")
  def map_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("map")
  def map_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("map")
  def map_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("map")
  def map_IxIO(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("map")
  def map_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("map")
  def map_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("map")
  def map_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("map")
  def map_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_ReaderTaskEither(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("map")
  def map_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("map")
  def map_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("map")
  def map_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("map")
  def map_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("map")
  def map_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[/* e */ js.Any, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("map")
  def map_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("map")
  def map_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("map")
  def map_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, _], 
    /* fa */ js.Function1[
      /* e */ js.Any, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
  def of[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function1[/* a */ js.Any, js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.HKT[F, _]]] = js.native
  @JSName("of")
  def of_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]]
  ] = js.native
  @JSName("of")
  def of_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]]
  ] = js.native
  @JSName("of")
  def of_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]]
  ] = js.native
  @JSName("of")
  def of_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]]
  ] = js.native
  @JSName("of")
  def of_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]]
  ] = js.native
  @JSName("of")
  def of_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]]
  ] = js.native
  @JSName("of")
  def of_IxIO(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]]
  ] = js.native
  @JSName("of")
  def of_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("of")
  def of_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]]
  ] = js.native
  @JSName("of")
  def of_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]]
  ] = js.native
  @JSName("of")
  def of_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_ReaderTaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]]
  ] = js.native
  @JSName("of")
  def of_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]]
  ] = js.native
  @JSName("of")
  def of_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]]
  ] = js.native
  @JSName("of")
  def of_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]]
  ] = js.native
  @JSName("of")
  def of_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]]
  ] = js.native
  @JSName("of")
  def of_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]]
  ] = js.native
  @JSName("of")
  def of_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]]
  ] = js.native
  @JSName("of")
  def of_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* e */ _, 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("of")
  def of_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* a */ js.Any, 
    js.Function1[/* e */ _, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]]
  ] = js.native
}

