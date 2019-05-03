package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/EitherT", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bimap[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("bimap")
  def bimap_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("bimap")
  def bimap_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def chain[F](F: fpDashTsLib.libMonadMod.Monad[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Array(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Const(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Either(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Free(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_FreeGroup(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_IO(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_IOEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Identity(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Map(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray2v(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Option(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Pair(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Reader(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_State(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Store(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_StrMap(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Task(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_These(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Tree(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Tuple(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Validation(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Writer(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Zipper(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def fold[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  @JSName("fold")
  def fold_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("fold")
  def fold_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("fold")
  def fold_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("fold")
  def fold_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("fold")
  def fold_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("fold")
  def fold_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("fold")
  def fold_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("fold")
  def fold_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("fold")
  def fold_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("fold")
  def fold_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("fold")
  def fold_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("fold")
  def fold_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("fold")
  def fold_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("fold")
  def fold_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def fromEither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("fromEither")
  def fromEither_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libEitherMod.Either[_, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def getEitherT[M](M: fpDashTsLib.libMonadMod.Monad[M]): EitherT[M] = js.native
  def getEitherT2v[M](M: fpDashTsLib.libMonadMod.Monad[M]): EitherT2v[M] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("getEitherT")
  def getEitherT_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getEitherT")
  def getEitherT_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getEitherT")
  def getEitherT_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getEitherT")
  def getEitherT_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getEitherT")
  def getEitherT_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): EitherT1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getEitherT")
  def getEitherT_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): EitherT1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getEitherT")
  def getEitherT_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): EitherT2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getEitherT")
  def getEitherT_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getEitherT")
  def getEitherT_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getEitherT")
  def getEitherT_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): EitherT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getEitherT")
  def getEitherT_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): EitherT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getEitherT")
  def getEitherT_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getEitherT")
  def getEitherT_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getEitherT")
  def getEitherT_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getEitherT")
  def getEitherT_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): EitherT2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getEitherT")
  def getEitherT_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getEitherT")
  def getEitherT_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): EitherT1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getEitherT")
  def getEitherT_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getEitherT")
  def getEitherT_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): EitherT2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getEitherT")
  def getEitherT_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): EitherT2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getEitherT")
  def getEitherT_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getEitherT")
  def getEitherT_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getEitherT")
  def getEitherT_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getEitherT")
  def getEitherT_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getEitherT")
  def getEitherT_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def left[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("left")
  def left_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("left")
  def left_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fl */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  def mapLeft[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ], 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ], 
      fpDashTsLib.libHKTMod.Type[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]], 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
    ]
  ] = js.native
  def right[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("right")
  def right_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libHKTMod.Type[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libEitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("right")
  def right_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libEitherMod.Either[_, _]]
  ] = js.native
}

