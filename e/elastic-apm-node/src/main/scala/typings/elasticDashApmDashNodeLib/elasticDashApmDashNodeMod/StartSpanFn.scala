package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSpanFn extends js.Object {
  def startSpan(): Span | scala.Null = js.native
  def startSpan(name: java.lang.String): Span | scala.Null = js.native
  def startSpan(name: java.lang.String, `type`: java.lang.String): Span | scala.Null = js.native
  def startSpan(name: java.lang.String, `type`: java.lang.String, options: SpanOptions): Span | scala.Null = js.native
}

