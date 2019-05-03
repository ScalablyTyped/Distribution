package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "tree")
@js.native
object treeNs extends js.Object {
  @js.native
  class Tree[A] protected ()
    extends fpDashTsLib.libTreeMod.Tree[A] {
    def this(value: A, forest: fpDashTsLib.libTreeMod.Forest[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Tree = js.native
  val tree: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libTreeMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libTreeMod.URI] = js.native
  def drawForest(forest: fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libTreeMod.Tree[java.lang.String]]): java.lang.String = js.native
  def drawTree(tree: fpDashTsLib.libTreeMod.Tree[java.lang.String]): java.lang.String = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ fpDashTsLib.libTreeMod.Tree[A], scala.Boolean] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libTreeMod.Tree[A]] = js.native
  def unfoldForest[A, B](
    bs: fpDashTsLib.libArrayMod.Global.Array[B],
    f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]
  ): fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libTreeMod.Tree[A]] = js.native
  def unfoldForestM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Const[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Either[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Free[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IOEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IxIO(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_IxIO[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Map[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Reader[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_ReaderTaskEither(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libTreeMod.Forest[_]
    ]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_ReaderTaskEither[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libTreeMod.Forest[_]
    ]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_State[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Store[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_TaskEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_These[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Tree, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Tuple[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Validation[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  @JSName("unfoldForestM")
  def unfoldForestM_Writer[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* bs */ fpDashTsLib.libArrayMod.Global.Array[_], 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libTreeMod.Forest[_]]
  ] = js.native
  def unfoldTree[A, B](b: B, f: js.Function1[/* b */ B, js.Tuple2[A, fpDashTsLib.libArrayMod.Global.Array[B]]]): fpDashTsLib.libTreeMod.Tree[A] = js.native
  def unfoldTreeM[M](M: fpDashTsLib.libMonadMod.Monad[M]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]]
    ], 
    fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Const[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Const, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Either[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Either, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Free[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Free, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IOEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.IOEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IxIO(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_IxIO[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.IxIO, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Map[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Map, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Reader[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Reader, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_ReaderTaskEither(M: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_ReaderTaskEither[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_State[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.State, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Store[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Store, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_TaskEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.TaskEither, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_These[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.These, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.Tree, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Tuple[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Tuple, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Validation[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Validation, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        _, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
  @JSName("unfoldTreeM")
  def unfoldTreeM_Writer[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function1[
      /* b */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[
        fpDashTsLib.fpDashTsLibStrings.Writer, 
        L, 
        js.Tuple2[_, fpDashTsLib.libArrayMod.Global.Array[_]]
      ]
    ], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libTreeMod.Tree[_]]
  ] = js.native
}

