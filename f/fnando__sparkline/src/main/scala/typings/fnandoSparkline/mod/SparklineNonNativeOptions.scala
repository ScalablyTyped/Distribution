package typings.fnandoSparkline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fnandoSparkline.mod.SparklineOptions
  - typings.fnandoSparkline.mod.SparklineOptionsFetch[TEntry]
*/
trait SparklineNonNativeOptions[TEntry] extends js.Object
object SparklineNonNativeOptions {
  
  @scala.inline
  def SparklineOptions[TEntry](): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
  
  @scala.inline
  def SparklineOptionsFetch[TEntry](fetch: TEntry => Double): SparklineNonNativeOptions[TEntry] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[SparklineNonNativeOptions[TEntry]]
  }
}
