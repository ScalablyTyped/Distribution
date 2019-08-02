package typings.atFnandoSparkline.atFnandoSparklineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptionsFetch[TEntry] extends SparklineNonNativeOptions[TEntry] {
  /**
    * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
    */
  def fetch(entry: TEntry): Double
}

object SparklineOptionsFetch {
  @scala.inline
  def apply[TEntry](fetch: TEntry => Double): SparklineOptionsFetch[TEntry] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
  
    __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
  }
}

