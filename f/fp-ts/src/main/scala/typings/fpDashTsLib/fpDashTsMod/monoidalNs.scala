package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "monoidal")
@js.native
object monoidalNs extends js.Object {
  def fromApplicative[F](applicative: fpDashTsLib.libApplicativeMod.Applicative[F]): fpDashTsLib.libMonoidalMod.Monoidal[F] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Array(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Const(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Either(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Free(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("fromApplicative")
  def fromApplicative_FreeGroup(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("fromApplicative")
  def fromApplicative_IO(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("fromApplicative")
  def fromApplicative_IOEither(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Identity(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("fromApplicative")
  def fromApplicative_IxIO(applicative: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.libMonoidalMod.Monoidal3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Map(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("fromApplicative")
  def fromApplicative_NonEmptyArray(
    applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]
  ): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("fromApplicative")
  def fromApplicative_NonEmptyArray2v(
    applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]
  ): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Option(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Pair(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Reader(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("fromApplicative")
  def fromApplicative_ReaderTaskEither(
    applicative: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): fpDashTsLib.libMonoidalMod.Monoidal3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("fromApplicative")
  def fromApplicative_State(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Store(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("fromApplicative")
  def fromApplicative_StrMap(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Task(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("fromApplicative")
  def fromApplicative_TaskEither(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("fromApplicative")
  def fromApplicative_These(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Tree(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Tuple(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Validation(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Writer(applicative: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("fromApplicative")
  def fromApplicative_Zipper(applicative: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
  def toApplicative[F](monoidal: fpDashTsLib.libMonoidalMod.Monoidal[F]): fpDashTsLib.libApplicativeMod.Applicative[F] = js.native
  @JSName("toApplicative")
  def toApplicative_Array(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Array]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array] = js.native
  @JSName("toApplicative")
  def toApplicative_Const(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Const]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const] = js.native
  @JSName("toApplicative")
  def toApplicative_Either(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Either]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either] = js.native
  @JSName("toApplicative")
  def toApplicative_Free(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Free]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free] = js.native
  @JSName("toApplicative")
  def toApplicative_FreeGroup(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup] = js.native
  @JSName("toApplicative")
  def toApplicative_IO(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.IO]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO] = js.native
  @JSName("toApplicative")
  def toApplicative_IOEither(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.IOEither]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither] = js.native
  @JSName("toApplicative")
  def toApplicative_Identity(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Identity]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity] = js.native
  @JSName("toApplicative")
  def toApplicative_IxIO(monoidal: fpDashTsLib.libMonoidalMod.Monoidal3[fpDashTsLib.fpDashTsLibStrings.IxIO]): fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO] = js.native
  @JSName("toApplicative")
  def toApplicative_Map(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Map]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map] = js.native
  @JSName("toApplicative")
  def toApplicative_NonEmptyArray(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray] = js.native
  @JSName("toApplicative")
  def toApplicative_NonEmptyArray2v(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v] = js.native
  @JSName("toApplicative")
  def toApplicative_Option(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Option]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option] = js.native
  @JSName("toApplicative")
  def toApplicative_Pair(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Pair]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair] = js.native
  @JSName("toApplicative")
  def toApplicative_Reader(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Reader]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader] = js.native
  @JSName("toApplicative")
  def toApplicative_ReaderTaskEither(monoidal: fpDashTsLib.libMonoidalMod.Monoidal3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither] = js.native
  @JSName("toApplicative")
  def toApplicative_State(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.State]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State] = js.native
  @JSName("toApplicative")
  def toApplicative_Store(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Store]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store] = js.native
  @JSName("toApplicative")
  def toApplicative_StrMap(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.StrMap]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap] = js.native
  @JSName("toApplicative")
  def toApplicative_Task(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Task]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task] = js.native
  @JSName("toApplicative")
  def toApplicative_TaskEither(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither] = js.native
  @JSName("toApplicative")
  def toApplicative_These(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.These]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These] = js.native
  @JSName("toApplicative")
  def toApplicative_Tree(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Tree]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree] = js.native
  @JSName("toApplicative")
  def toApplicative_Tuple(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Tuple]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple] = js.native
  @JSName("toApplicative")
  def toApplicative_Validation(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Validation]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation] = js.native
  @JSName("toApplicative")
  def toApplicative_Writer(monoidal: fpDashTsLib.libMonoidalMod.Monoidal2[fpDashTsLib.fpDashTsLibStrings.Writer]): fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer] = js.native
  @JSName("toApplicative")
  def toApplicative_Zipper(monoidal: fpDashTsLib.libMonoidalMod.Monoidal1[fpDashTsLib.fpDashTsLibStrings.Zipper]): fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper] = js.native
}

