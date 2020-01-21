package typings.fluentSequence

import typings.fluentBundle.mod.FluentBundle
import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/sequence", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MapBundleAsync_ extends js.Object {
    def apply(bundles: AsyncIterable[FluentBundle], id: String): js.Promise[FluentBundle | Null] = js.native
    def apply(bundles: AsyncIterable[FluentBundle], id: js.Array[String]): js.Promise[js.Array[FluentBundle | Null]] = js.native
  }
  
  @js.native
  trait MapBundleSync_ extends js.Object {
    def apply(bundles: Iterable[FluentBundle], id: String): FluentBundle | Null = js.native
    def apply(bundles: Iterable[FluentBundle], id: js.Array[String]): js.Array[FluentBundle | Null] = js.native
  }
  
  val mapBundleAsync: MapBundleAsync_ = js.native
  val mapBundleSync: MapBundleSync_ = js.native
}

