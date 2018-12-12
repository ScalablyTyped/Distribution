package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "setoid")
@js.native
object setoidNs extends js.Object {
  val setoidBoolean: fpDashTsLib.libSetoidMod.Setoid[scala.Boolean] = js.native
  val setoidDate: fpDashTsLib.libSetoidMod.Setoid[stdLib.Date] = js.native
  val setoidNumber: fpDashTsLib.libSetoidMod.Setoid[scala.Double] = js.native
  val setoidString: fpDashTsLib.libSetoidMod.Setoid[java.lang.String] = js.native
  def contramap[A, B](f: js.Function1[/* b */ B, A], fa: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[B] = js.native
  def getArraySetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libArrayMod.Global.Array[A]] = js.native
  def getProductSetoid[A, B](SA: fpDashTsLib.libSetoidMod.Setoid[A], SB: fpDashTsLib.libSetoidMod.Setoid[B]): fpDashTsLib.libSetoidMod.Setoid[js.Tuple2[A, B]] = js.native
  def getRecordSetoid[O /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */](setoids: fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with O): fpDashTsLib.libSetoidMod.Setoid[O] = js.native
  def strictEqual[A](a: A, b: A): scala.Boolean = js.native
}

