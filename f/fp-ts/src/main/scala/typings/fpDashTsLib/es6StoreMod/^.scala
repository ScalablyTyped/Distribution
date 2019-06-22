package typings
package fpDashTsLib.es6StoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Store = js.native
  val store: fpDashTsLib.es6ComonadMod.Comonad2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(extend, map) */ def duplicate[L, A](ma: Store[L, A]): Store[L, Store[L, A]] = js.native
  def experiment[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.HKT[F, _]], 
    js.Function1[/* wa */ Store[_, _], fpDashTsLib.es6HKTMod.HKT[F, _]]
  ] = js.native
  @JSName("experiment")
  def experiment_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_IxIO(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_ReaderTaskEither(F: fpDashTsLib.es6FunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Store[L](F: fpDashTsLib.es6FunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    js.Function1[
      /* wa */ Store[_, _], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
  def peeks[S](f: fpDashTsLib.es6FunctionMod.Endomorphism[S]): js.Function1[/* wa */ Store[S, _], _] = js.native
  def seek[S](s: S): js.Function1[/* wa */ Store[S, _], Store[S, _]] = js.native
  def seeks[S](f: fpDashTsLib.es6FunctionMod.Endomorphism[S]): js.Function1[/* sa */ Store[S, _], Store[S, _]] = js.native
}

