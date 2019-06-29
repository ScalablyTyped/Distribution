package typings
package dineroDotJsLib.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dinero.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var globalExchangeRatesApi: ExchangeRatesApiOptions = js.native
  var globalFormat: java.lang.String = js.native
  var globalLocale: java.lang.String = js.native
  var globalRoundingMode: java.lang.String = js.native
  def apply(): Dinero = js.native
  def apply(options: Options): Dinero = js.native
  def normalizePrecision(objects: js.Array[Dinero]): js.Array[Dinero] = js.native
}

