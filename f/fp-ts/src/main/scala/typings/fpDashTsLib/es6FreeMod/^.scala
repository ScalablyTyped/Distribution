package typings
package fpDashTsLib.es6FreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Free", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Free = js.native
  def foldFree[M](M: fpDashTsLib.es6MonadMod.Monad[M]): js.Function2[
    /* nt */ js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[_, _], fpDashTsLib.es6HKTMod.HKT[M, _]], 
    /* fa */ Free[_, _], 
    fpDashTsLib.es6HKTMod.HKT[M, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Eq(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): FoldFree2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("foldFree")
  def foldFree_Free[L](M: fpDashTsLib.es6MonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): FoldFree2C[fpDashTsLib.fpDashTsLibStrings.Free, L] = js.native
  @JSName("foldFree")
  def foldFree_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_IxIO(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): FoldFree3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("foldFree")
  def foldFree_IxIO[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): FoldFree3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Ord(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither(M: fpDashTsLib.es6MonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): FoldFree3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("foldFree")
  def foldFree_ReaderTaskEither[U, L](M: fpDashTsLib.es6MonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): FoldFree3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L] = js.native
  @JSName("foldFree")
  def foldFree_Record(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("foldFree")
  def foldFree_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* nt */ js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.es6HKTMod.URIS, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    /* fa */ Free[fpDashTsLib.es6HKTMod.URIS, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def hoistFree(
    nt: js.Function1[
      (/* fa */ fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (/* fa */ fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ]), 
      (fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.Array | fpDashTsLib.fpDashTsLibStrings.Eq | fpDashTsLib.fpDashTsLibStrings.FreeGroup | fpDashTsLib.fpDashTsLibStrings.IO | fpDashTsLib.fpDashTsLibStrings.Identity | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray | fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v | fpDashTsLib.fpDashTsLibStrings.Option | fpDashTsLib.fpDashTsLibStrings.Ord | fpDashTsLib.fpDashTsLibStrings.Pair | fpDashTsLib.fpDashTsLibStrings.Record | fpDashTsLib.fpDashTsLibStrings.StrMap | fpDashTsLib.fpDashTsLibStrings.Task | fpDashTsLib.fpDashTsLibStrings.Tree | fpDashTsLib.fpDashTsLibStrings.Zipper, 
        _
      ]) | (fpDashTsLib.es6HKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.IxIO | fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        _
      ])
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Array(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Eq(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FG[F, G](nt: js.Function1[/* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], fpDashTsLib.es6HKTMod.HKT[G, _]]): js.Function1[/* fa */ Free[F, _], Free[G, _]] = js.native
  @JSName("hoistFree")
  def hoistFree_Free(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Free, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Free, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_FreeGroup(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Identity(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_IxIO(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.IxIO, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_NonEmptyArray2v(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Option(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Ord(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Pair(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_ReaderTaskEither(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Record(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_StrMap(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Task(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Tree(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("hoistFree")
  def hoistFree_Zipper(
    nt: js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ): js.Function1[
    /* fa */ Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    Free[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def liftF[F, A](fa: fpDashTsLib.es6HKTMod.HKT[F, A]): Free[F, A] = js.native
  def of[F, A](a: A): Free[F, A] = js.native
}

