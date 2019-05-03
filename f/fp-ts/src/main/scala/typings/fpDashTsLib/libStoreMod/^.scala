package typings
package fpDashTsLib.libStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Store = js.native
  val store: fpDashTsLib.libComonadMod.Comonad2[URI] = js.native
  def experiment[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[/* sa */ Store[_, _], fpDashTsLib.libHKTMod.HKT[F, _]]
  ] = js.native
  @JSName("experiment")
  def experiment_Array(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Array, _]], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_IO(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.IO, _]], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Identity(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_IxIO(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Option(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Pair(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Pair, _]], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_ReaderTaskEither(F: fpDashTsLib.libFunctorMod.Functor3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_StrMap(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Task(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Task, _]], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Tree(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* s */ js.Any, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Tree, _]], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("experiment")
  def experiment_Zipper(F: fpDashTsLib.libFunctorMod.Functor[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[
      /* s */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ], 
    js.Function1[
      /* sa */ Store[_, _], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
  def peeks[S](f: fpDashTsLib.libFunctionMod.Endomorphism[S]): js.Function1[/* sa */ Store[S, _], js.Function1[/* s */ S, _]] = js.native
  def seeks[S](f: fpDashTsLib.libFunctionMod.Endomorphism[S]): js.Function1[/* sa */ Store[S, _], Store[S, _]] = js.native
}

