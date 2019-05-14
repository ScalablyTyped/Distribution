package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "free")
@js.native
object freeNs extends js.Object {
  @js.native
  class Impure[F, A, X] protected ()
    extends fpDashTsLib.es6FreeMod.Impure[F, A, X] {
    def this(fx: fpDashTsLib.es6HKTMod.HKT[F, X], f: js.Function1[/* x */ X, fpDashTsLib.es6FreeMod.Free[F, A]]) = this()
  }
  
  @js.native
  class Pure[F, A] protected ()
    extends fpDashTsLib.es6FreeMod.Pure[F, A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Free = js.native
  def foldFree[M](M: fpDashTsLib.es6MonadMod.Monad[M]): js.Function2[
    /* nt */ js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[_, _], fpDashTsLib.es6HKTMod.HKT[M, _]], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[_, _], 
    fpDashTsLib.es6HKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.es6FreeMod.FoldFree2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("foldFree")
  def foldFree_Free[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): fpDashTsLib.es6FreeMod.FoldFree2C[fpDashTsLib.fpDashTsLibStrings.Free, L] = js.native
  @JSName("foldFree")
  def foldFree_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.es6FreeMod.FoldFree3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("foldFree")
  def foldFree_IxIO[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): fpDashTsLib.es6FreeMod.FoldFree3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): fpDashTsLib.es6FreeMod.FoldFree3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): fpDashTsLib.es6FreeMod.FoldFree3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L] = js.native
  @JSName("foldFree")
  def foldFree_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def hoistFree(
    nt: js.Function1[
      (/* fa */ fpDashTsLib.es6HKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (/* fa */ fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ]), 
      (fpDashTsLib.es6HKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (fpDashTsLib.es6HKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ])
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Array(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FG[F, G](nt: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[G, _]]): js.Function1[/* fa */ fpDashTsLib.es6FreeMod.Free[F, _], fpDashTsLib.es6FreeMod.Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_Free(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.es6HKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Free, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Free, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FreeGroup(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Identity(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IxIO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray2v(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Option(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Pair(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_ReaderTaskEither(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.es6HKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_StrMap(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Task(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Tree(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Zipper(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ): js.Function1[
    /* fa */ fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6FreeMod.Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def liftF[F, A](fa: fpDashTsLib.es6HKTMod.HKT[F, A]): fpDashTsLib.es6FreeMod.Free[F, A] = js.native
  def of[F, A](a: A): fpDashTsLib.es6FreeMod.Free[F, A] = js.native
}

