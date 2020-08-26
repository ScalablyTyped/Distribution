package typings.fnandoSparkline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptionsFetch[TEntry] extends SparklineNonNativeOptions[TEntry] {
  /**
    * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
    */
  def fetch(entry: TEntry): Double = js.native
}

object SparklineOptionsFetch {
  @scala.inline
  def apply[TEntry](fetch: TEntry => Double): SparklineOptionsFetch[TEntry] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
    __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
  }
  @scala.inline
  implicit class SparklineOptionsFetchOps[Self <: SparklineOptionsFetch[_], TEntry] (val x: Self with SparklineOptionsFetch[TEntry]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetch(value: TEntry => Double): Self = this.set("fetch", js.Any.fromFunction1(value))
  }
  
}

