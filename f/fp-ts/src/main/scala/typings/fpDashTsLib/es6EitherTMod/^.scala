package typings
package fpDashTsLib.es6EitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/EitherT", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bimap[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("bimap")
  def bimap_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("bimap")
  def bimap_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("bimap")
  def bimap_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]], 
    /* f */ js.Function1[/* l */ js.Any, _], 
    /* g */ js.Function1[/* a */ js.Any, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  def chain[F](F: fpDashTsLib.es6MonadMod.Monad[F]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Array(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Const(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Either(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Eq(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Free(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_FreeGroup(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_IO(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_IOEither(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Identity(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Map(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray2v(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Option(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Ord(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Pair(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Reader(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Record(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_State(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Store(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_StrMap(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Task(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_These(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Traced(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Tree(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Tuple(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Validation(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Writer(F: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("chain")
  def chain_Zipper(F: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
    ], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  def fold[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.HKT[F, _]
  ] = js.native
  @JSName("fold")
  def fold_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("fold")
  def fold_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("fold")
  def fold_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("fold")
  def fold_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("fold")
  def fold_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("fold")
  def fold_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("fold")
  def fold_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("fold")
  def fold_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("fold")
  def fold_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("fold")
  def fold_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("fold")
  def fold_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("fold")
  def fold_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("fold")
  def fold_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("fold")
  def fold_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("fold")
  def fold_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("fold")
  def fold_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* left */ js.Function1[/* l */ js.Any, _], 
    /* right */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def fromEither[F](F: fpDashTsLib.es6ApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Array(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Const(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Either(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Eq(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Free(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_FreeGroup(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_IO(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_IOEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Identity(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Map(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_NonEmptyArray(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("fromEither")
  def fromEither_NonEmptyArray2v(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Option(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Ord(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Pair(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Reader(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Record(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_State(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Store(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_StrMap(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Task(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_TaskEither(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_These(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Traced(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Tree(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Tuple(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Validation(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Writer(F: fpDashTsLib.es6ApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("fromEither")
  def fromEither_Zipper(F: fpDashTsLib.es6ApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.es6EitherMod.Either[_, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  def getEitherT[M](M: fpDashTsLib.es6MonadMod.Monad[M]): EitherT[M] = js.native
  def getEitherT2v[M](M: fpDashTsLib.es6MonadMod.Monad[M]): EitherT2v[M] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Eq(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Ord(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Record(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): EitherT2v2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getEitherT2v")
  def getEitherT2v_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): EitherT2v1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("getEitherT")
  def getEitherT_Array(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getEitherT")
  def getEitherT_Const(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getEitherT")
  def getEitherT_Either(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getEitherT")
  def getEitherT_Eq(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getEitherT")
  def getEitherT_Free(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getEitherT")
  def getEitherT_FreeGroup(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): EitherT1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getEitherT")
  def getEitherT_IO(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): EitherT1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getEitherT")
  def getEitherT_IOEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): EitherT2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getEitherT")
  def getEitherT_Identity(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getEitherT")
  def getEitherT_Map(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getEitherT")
  def getEitherT_NonEmptyArray(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): EitherT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getEitherT")
  def getEitherT_NonEmptyArray2v(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): EitherT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getEitherT")
  def getEitherT_Option(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getEitherT")
  def getEitherT_Ord(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getEitherT")
  def getEitherT_Pair(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getEitherT")
  def getEitherT_Reader(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getEitherT")
  def getEitherT_Record(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getEitherT")
  def getEitherT_State(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): EitherT2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getEitherT")
  def getEitherT_Store(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getEitherT")
  def getEitherT_StrMap(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): EitherT1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getEitherT")
  def getEitherT_Task(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getEitherT")
  def getEitherT_TaskEither(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): EitherT2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getEitherT")
  def getEitherT_These(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): EitherT2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getEitherT")
  def getEitherT_Traced(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getEitherT")
  def getEitherT_Tree(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getEitherT")
  def getEitherT_Tuple(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getEitherT")
  def getEitherT_Validation(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getEitherT")
  def getEitherT_Writer(M: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): EitherT2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getEitherT")
  def getEitherT_Zipper(M: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): EitherT1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def left[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("left")
  def left_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("left")
  def left_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("left")
  def left_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fl */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  def mapLeft[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ], 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ], 
      fpDashTsLib.es6HKTMod.Kind[
        fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
        fpDashTsLib.es6EitherMod.Either[_, _]
      ]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  @JSName("mapLeft")
  def mapLeft_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* f */ js.Function1[/* l */ js.Any, _], 
    js.Function1[
      /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]], 
      fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
    ]
  ] = js.native
  def right[F](F: fpDashTsLib.es6FunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.HKT[F, _], 
    fpDashTsLib.es6HKTMod.HKT[F, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Array(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Const(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Either(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Eq(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Free(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_FreeGroup(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_IO(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_IOEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Identity(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Map(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_NonEmptyArray(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("right")
  def right_NonEmptyArray2v(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.es6HKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.es6EitherMod.Either[_, _]
    ]
  ] = js.native
  @JSName("right")
  def right_Option(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Ord(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Pair(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Reader(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Record(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_State(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Store(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_StrMap(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Task(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_TaskEither(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_These(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Traced(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Tree(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Tuple(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Validation(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Writer(F: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.es6HKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
  @JSName("right")
  def right_Zipper(F: fpDashTsLib.es6FunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.es6HKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.es6EitherMod.Either[_, _]]
  ] = js.native
}

