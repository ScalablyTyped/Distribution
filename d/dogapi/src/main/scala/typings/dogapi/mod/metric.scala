package typings.dogapi.mod

import org.scalablytyped.runtime.TopLevel
import typings.dogapi.anon.Host
import typings.dogapi.dogapiStrings.ok
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait metric extends js.Object {
  @JSName("send")
  def send_ok(metric: String, points: js.Array[Double], callback: js.Function2[/* err */ Error | Null, ok, Unit]): Unit = js.native
  @JSName("send")
  def send_ok(
    metric: String,
    points: js.Array[Double],
    extra: Host,
    callback: js.Function2[/* err */ Error | Null, ok, Unit]
  ): Unit = js.native
  @JSName("send")
  def send_ok(metric: String, points: Double, callback: js.Function2[/* err */ Error | Null, ok, Unit]): Unit = js.native
  @JSName("send")
  def send_ok(
    metric: String,
    points: Double,
    extra: Host,
    callback: js.Function2[/* err */ Error | Null, ok, Unit]
  ): Unit = js.native
}

@JSImport("dogapi", "metric")
@js.native
object metric extends TopLevel[metric]

