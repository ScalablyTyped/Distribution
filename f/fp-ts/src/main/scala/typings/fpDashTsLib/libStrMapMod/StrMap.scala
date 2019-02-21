package typings
package fpDashTsLib.libStrMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/StrMap", "StrMap")
@js.native
class StrMap[A] protected () extends js.Object {
  def this(value: org.scalablytyped.runtime.StringDictionary[A]) = this()
  val _A: A = js.native
  val _URI: URI = js.native
  val value: org.scalablytyped.runtime.StringDictionary[A] = js.native
  /**
    * @since 1.14.0
    */
  def every(predicate: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
  def filter(p: fpDashTsLib.libFunctionMod.Predicate[A]): StrMap[A] = js.native
  /**
    * @since 1.12.0
    */
  def filterMap[B](f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): StrMap[B] = js.native
  /**
    * Use {@link filterMapWithKey} instead
    * @since 1.12.0
    * @deprecated
    */
  def filterMapWithIndex[B](f: js.Function2[/* i */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]): StrMap[B] = js.native
  /**
    * @since 1.14.0
    */
  def filterMapWithKey[B](f: js.Function2[/* i */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]): StrMap[B] = js.native
  /**
    * Use {@link filterWithKey} instead
    * @since 1.12.0
    * @deprecated
    */
  def filterWithIndex(p: js.Function2[/* i */ java.lang.String, /* a */ A, scala.Boolean]): StrMap[A] = js.native
  /**
    * @since 1.14.0
    */
  def filterWithKey(p: js.Function2[/* i */ java.lang.String, /* a */ A, scala.Boolean]): StrMap[A] = js.native
  /**
    * @since 1.4.0
    */
  @JSName("filter")
  def filter_BA[B /* <: A */](p: fpDashTsLib.libFunctionMod.Refinement[A, B]): StrMap[B] = js.native
  /**
    * @since 1.12.0
    */
  def foldr[B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B = js.native
  /**
    * @since 1.12.0
    */
  def foldrWithKey[B](b: B, f: js.Function3[/* k */ java.lang.String, /* a */ A, /* b */ B, B]): B = js.native
  def map[B](f: js.Function1[/* a */ A, B]): StrMap[B] = js.native
  def mapWithKey[B](f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): StrMap[B] = js.native
  /**
    * @since 1.12.0
    */
  def partition(p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[StrMap[A], StrMap[A]] = js.native
  /**
    * @since 1.12.0
    */
  def partitionMap[RL, RR](f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[StrMap[RL], StrMap[RR]] = js.native
  /**
    * Use {@link partitionMapWithKey} instead
    * @since 1.12.0
    * @deprecated
    */
  def partitionMapWithIndex[RL, RR](f: js.Function2[/* i */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[StrMap[RL], StrMap[RR]] = js.native
  /**
    * @since 1.14.0
    */
  def partitionMapWithKey[RL, RR](f: js.Function2[/* i */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[StrMap[RL], StrMap[RR]] = js.native
  /**
    * Use {@link partitionWithKey} instead
    * @since 1.12.0
    * @deprecated
    */
  def partitionWithIndex(p: js.Function2[/* i */ java.lang.String, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[StrMap[A], StrMap[A]] = js.native
  /**
    * @since 1.14.0
    */
  def partitionWithKey(p: js.Function2[/* i */ java.lang.String, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[StrMap[A], StrMap[A]] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
    * @since 1.12.0
    */
  def reduceWithKey[B](b: B, f: js.Function3[/* k */ java.lang.String, /* b */ B, /* a */ A, B]): B = js.native
  /**
    * @since 1.12.0
    */
  def separate[RL, RR](`this`: StrMap[fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[StrMap[RL], StrMap[RR]] = js.native
  /**
    * @since 1.14.0
    */
  def some(predicate: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
}

