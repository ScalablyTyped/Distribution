package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "optionT")
@js.native
object optionTNs extends js.Object {
  def chain[F](F: fpDashTsLib.libMonadMod.Monad[F]): js.Function2[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Array(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Const(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Const[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Either(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Either[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Eq(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Free(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Free[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_FreeGroup(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_IO(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_IOEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_IOEither[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Identity(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_IxIO[U, L](F: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Map(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Map[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_NonEmptyArray2v(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Option(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Ord(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Pair(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Reader(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Reader[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_ReaderTaskEither[U, L](F: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        fpDashTsLib.libOptionMod.Option[_]
      ]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ]
  ] = js.native
  @JSName("chain")
  def chain_Record(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_State(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_State[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Store(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Store[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_StrMap(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Task(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_TaskEither[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_These(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_These[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Traced(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Traced[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Tree(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Tuple(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Tuple[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Validation(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Validation[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Writer(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Writer[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("chain")
  def chain_Zipper(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function2[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def fold[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.HKT[F, _]
  ] = js.native
  @JSName("fold")
  def fold_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("fold")
  def fold_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Const[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Either[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Eq(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
  ] = js.native
  @JSName("fold")
  def fold_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Free[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("fold")
  def fold_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("fold")
  def fold_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
  ] = js.native
  @JSName("fold")
  def fold_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_IOEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("fold")
  def fold_IxIO[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Map[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("fold")
  def fold_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("fold")
  def fold_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("fold")
  def fold_Ord(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
  ] = js.native
  @JSName("fold")
  def fold_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
  ] = js.native
  @JSName("fold")
  def fold_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Reader[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("fold")
  def fold_ReaderTaskEither[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Record(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
  ] = js.native
  @JSName("fold")
  def fold_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("fold")
  def fold_State[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Store[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("fold")
  def fold_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("fold")
  def fold_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
  ] = js.native
  @JSName("fold")
  def fold_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("fold")
  def fold_TaskEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("fold")
  def fold_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("fold")
  def fold_These[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Traced(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Traced[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
  ] = js.native
  @JSName("fold")
  def fold_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Tuple[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Validation[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("fold")
  def fold_Writer[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("fold")
  def fold_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function3[
    /* onNone */ js.Any, 
    /* onSome */ js.Function1[/* a */ js.Any, _], 
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
  def fromOption[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("fromOption")
  def fromOption_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libOptionMod.Option[_], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def getOptionT[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libOptionTMod.OptionT[M] = js.native
  def getOptionT2v[M](M: fpDashTsLib.libMonadMod.Monad[M]): fpDashTsLib.libOptionTMod.OptionT2v[M] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Const[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Either[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Either, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Eq(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Free[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Free, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_IOEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_IxIO[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): fpDashTsLib.libOptionTMod.OptionT2v3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Map[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Map, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Ord(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Reader[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Reader, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_ReaderTaskEither[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): fpDashTsLib.libOptionTMod.OptionT2v3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Record(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_State[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.State, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Store[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Store, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_TaskEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_These[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Traced(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Traced[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Traced, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Tuple[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Validation[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libOptionTMod.OptionT2v2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Writer[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): fpDashTsLib.libOptionTMod.OptionT2v2C[fpDashTsLib.fpDashTsLibStrings.Writer, L] = js.native
  @JSName("getOptionT2v")
  def getOptionT2v_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libOptionTMod.OptionT2v1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  @JSName("getOptionT")
  def getOptionT_Array(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("getOptionT")
  def getOptionT_Const(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("getOptionT")
  def getOptionT_Const[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Either(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("getOptionT")
  def getOptionT_Either[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Either, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Eq(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Eq]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Eq] = js.native
  @JSName("getOptionT")
  def getOptionT_Free(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("getOptionT")
  def getOptionT_Free[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Free, L] = js.native
  @JSName("getOptionT")
  def getOptionT_FreeGroup(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("getOptionT")
  def getOptionT_IO(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("getOptionT")
  def getOptionT_IOEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("getOptionT")
  def getOptionT_IOEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Identity(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("getOptionT")
  def getOptionT_IxIO[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): fpDashTsLib.libOptionTMod.OptionT3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Map(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("getOptionT")
  def getOptionT_Map[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Map, L] = js.native
  @JSName("getOptionT")
  def getOptionT_NonEmptyArray(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("getOptionT")
  def getOptionT_NonEmptyArray2v(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("getOptionT")
  def getOptionT_Option(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("getOptionT")
  def getOptionT_Ord(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Ord]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Ord] = js.native
  @JSName("getOptionT")
  def getOptionT_Pair(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("getOptionT")
  def getOptionT_Reader(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("getOptionT")
  def getOptionT_Reader[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Reader, L] = js.native
  @JSName("getOptionT")
  def getOptionT_ReaderTaskEither[U, L](M: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): fpDashTsLib.libOptionTMod.OptionT3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Record(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Record]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Record] = js.native
  @JSName("getOptionT")
  def getOptionT_State(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("getOptionT")
  def getOptionT_State[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.State, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Store(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("getOptionT")
  def getOptionT_Store[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Store, L] = js.native
  @JSName("getOptionT")
  def getOptionT_StrMap(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("getOptionT")
  def getOptionT_Task(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("getOptionT")
  def getOptionT_TaskEither(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("getOptionT")
  def getOptionT_TaskEither[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L] = js.native
  @JSName("getOptionT")
  def getOptionT_These(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("getOptionT")
  def getOptionT_These[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Traced(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Traced]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Traced] = js.native
  @JSName("getOptionT")
  def getOptionT_Traced[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Traced, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Tree(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("getOptionT")
  def getOptionT_Tuple(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("getOptionT")
  def getOptionT_Tuple[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Validation(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("getOptionT")
  def getOptionT_Validation[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Validation, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Writer(M: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libOptionTMod.OptionT2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("getOptionT")
  def getOptionT_Writer[L](M: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): fpDashTsLib.libOptionTMod.OptionT2C[fpDashTsLib.fpDashTsLibStrings.Writer, L] = js.native
  @JSName("getOptionT")
  def getOptionT_Zipper(M: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libOptionTMod.OptionT1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def getOrElse[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.HKT[F, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Const[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Either[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Eq(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Free[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_IOEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_IxIO[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Map[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Ord(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Reader[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_ReaderTaskEither[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        fpDashTsLib.libOptionMod.Option[_]
      ], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Record(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_State[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Store[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_TaskEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_These[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Traced(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Traced[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Tuple[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Validation[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Writer[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ]
  ] = js.native
  @JSName("getOrElse")
  def getOrElse_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* a */ js.Any, 
    js.Function1[
      /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
    ]
  ] = js.native
  def liftF[F](F: fpDashTsLib.libFunctorMod.Functor[F]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Array(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Const(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Const[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Either(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Either[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Eq(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Free(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Free[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_FreeGroup(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_IO(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_IOEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_IOEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Identity(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_IxIO[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Map(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Map[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_NonEmptyArray(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_NonEmptyArray2v(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Option(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Ord(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Pair(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Reader(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Reader[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_ReaderTaskEither[U, L](F: fpDashTsLib.libFunctorMod.Functor3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ]
  ] = js.native
  @JSName("liftF")
  def liftF_Record(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_State(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_State[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Store(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Store[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_StrMap(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Task(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_TaskEither(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_TaskEither[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_These(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_These[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Traced(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Traced[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Tree(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Tuple(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Tuple[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Validation(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Validation[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Writer(F: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Writer[L](F: fpDashTsLib.libFunctorMod.Functor2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("liftF")
  def liftF_Zipper(F: fpDashTsLib.libFunctorMod.Functor1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* fa */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  def none[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function0[fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[scala.Nothing]]] = js.native
  @JSName("none")
  def none_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Array, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  @JSName("none")
  def none_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.FreeGroup, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  @JSName("none")
  def none_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Identity, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Option, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[scala.Nothing]]
  ] = js.native
  @JSName("none")
  def none_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Pair, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function0[
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.StrMap, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Task, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Tree, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function0[
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      L, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  @JSName("none")
  def none_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function0[
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Zipper, 
      fpDashTsLib.libOptionMod.Option[scala.Nothing]
    ]
  ] = js.native
  def some[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]] = js.native
  @JSName("some")
  def some_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Array, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Eq(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Eq]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Eq, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.FreeGroup, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.IO, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Identity, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Option, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Ord(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Ord]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Ord, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Pair, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libOptionMod.Option[_]
    ]
  ] = js.native
  @JSName("some")
  def some_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.StrMap, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Task, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Tree, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
  @JSName("some")
  def some_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Zipper, fpDashTsLib.libOptionMod.Option[_]]
  ] = js.native
}

