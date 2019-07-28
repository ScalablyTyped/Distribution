package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpanFn extends js.Object {
  def startSpan(): Span | Null = js.native
  def startSpan(name: String): Span | Null = js.native
  def startSpan(name: String, `type`: String): Span | Null = js.native
  def startSpan(name: String, `type`: String, options: SpanOptions): Span | Null = js.native
}

