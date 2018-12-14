package typings
package fpDashTsLib.libSetoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Setoid", JSImport.Namespace)
@js.native
object libSetoidModMembers extends js.Object {
  val setoidBoolean: Setoid[scala.Boolean] = js.native
  val setoidDate: Setoid[stdLib.Date] = js.native
  val setoidNumber: Setoid[scala.Double] = js.native
  val setoidString: Setoid[java.lang.String] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: Setoid[A]): Setoid[B] = js.native
  def getArraySetoid[A](S: Setoid[A]): Setoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getProductSetoid[A, B](SA: Setoid[A], SB: Setoid[B]): Setoid[js.Tuple2[A, B]] = js.native
  def getRecordSetoid[O /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](setoids: fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with O): Setoid[O] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

