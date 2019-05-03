package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Trace", JSImport.Namespace)
@js.native
object libTraceMod extends js.Object {
  def spy[A](a: A): A = js.native
  def trace[A](message: js.Any, out: fpDashTsLib.libFunctionMod.Lazy[A]): A = js.native
  @JSName("traceA")
  def traceA_Array(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_FreeGroup(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_IO(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Identity(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_NonEmptyArray(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_NonEmptyArray2v(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Option(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Pair(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_StrMap(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Task(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Tree(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, scala.Unit]
  ] = js.native
  @JSName("traceA")
  def traceA_Zipper(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* message */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, scala.Unit]
  ] = js.native
  @JSName("traceM")
  def traceM_Array(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Array]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Array, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Const(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Const[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Either(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Either[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Free(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Free[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_FreeGroup(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.FreeGroup]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.FreeGroup, _]
  ] = js.native
  @JSName("traceM")
  def traceM_IO(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.IO]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.IO, _]] = js.native
  @JSName("traceM")
  def traceM_IOEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_IOEither[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Identity(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Identity]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Identity, _]
  ] = js.native
  @JSName("traceM")
  def traceM_IxIO(F: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_IxIO[U, L](F: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Map(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Map[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_NonEmptyArray(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray, _]
  ] = js.native
  @JSName("traceM")
  def traceM_NonEmptyArray2v(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.NonEmptyArray2v, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Option(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Option]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Option, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Pair(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Pair]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Pair, _]] = js.native
  @JSName("traceM")
  def traceM_Reader(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Reader[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_ReaderTaskEither(F: fpDashTsLib.libMonadMod.Monad3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_ReaderTaskEither[U, L](F: fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_State(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_State[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Store(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Store[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_StrMap(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.StrMap]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.StrMap, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Task(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Task]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Task, _]] = js.native
  @JSName("traceM")
  def traceM_TaskEither(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_TaskEither[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_These(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_These[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Tree(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Tree]): js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Tree, _]] = js.native
  @JSName("traceM")
  def traceM_Tuple(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Tuple[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Validation(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Validation[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Writer(F: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Writer[L](F: fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
  ] = js.native
  @JSName("traceM")
  def traceM_Zipper(F: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.fpDashTsLibStrings.Zipper]): js.Function1[
    /* a */ js.Any, 
    fpDashTsLib.libHKTMod.Type[fpDashTsLib.fpDashTsLibStrings.Zipper, _]
  ] = js.native
}

