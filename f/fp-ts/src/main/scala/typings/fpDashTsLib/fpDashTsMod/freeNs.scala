package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "free")
@js.native
object freeNs extends js.Object {
  @js.native
  class Impure[F, A, X] protected ()
    extends fpDashTsLib.libFreeMod.Impure[F, A, X] {
    def this(fx: fpDashTsLib.libHKTMod.HKT[F, X], f: js.Function1[/* x */ X, fpDashTsLib.libFreeMod.Free[F, A]]) = this()
  }
  
  @js.native
  class Pure[F, A] protected ()
    extends fpDashTsLib.libFreeMod.Pure[F, A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Free = js.native
  def foldFree[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* nt */ js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[_, _], fpDashTsLib.libHKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.libFreeMod.Free[_, _], 
    fpDashTsLib.libHKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libFreeMod.FoldFree2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("foldFree")
  def foldFree_Free[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): fpDashTsLib.libFreeMod.FoldFree2C[fpDashTsLib.fpDashTsLibStrings.Free, L] = js.native
  @JSName("foldFree")
  def foldFree_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IxIO(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.libFreeMod.FoldFree3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("foldFree")
  def foldFree_IxIO[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): fpDashTsLib.libFreeMod.FoldFree3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): fpDashTsLib.libFreeMod.FoldFree3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): fpDashTsLib.libFreeMod.FoldFree3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L] = js.native
  @JSName("foldFree")
  def foldFree_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.libHKTMod.URIS, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.libHKTMod.URIS, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def hoistFree(
    nt: js.Function1[
      (/* fa */ fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (/* fa */ fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ]), 
      (fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ])
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Array(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FG[F, G](nt: js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, _], fpDashTsLib.libHKTMod.HKT[G, _]]): js.Function1[/* fa */ fpDashTsLib.libFreeMod.Free[F, _], fpDashTsLib.libFreeMod.Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_Free(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Free, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Free, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FreeGroup(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Identity(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IxIO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray2v(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Option(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Pair(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_ReaderTaskEither(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_StrMap(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Task(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Tree(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Zipper(
    nt: js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libFreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def liftF[F, A](fa: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libFreeMod.Free[F, A] = js.native
  def of[F, A](a: A): fpDashTsLib.libFreeMod.Free[F, A] = js.native
}

