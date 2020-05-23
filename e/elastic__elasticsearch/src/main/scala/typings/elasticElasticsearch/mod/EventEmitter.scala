package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.elasticElasticsearchStrings.request
import typings.elasticElasticsearch.elasticElasticsearchStrings.response
import typings.elasticElasticsearch.elasticElasticsearchStrings.resurrect
import typings.elasticElasticsearch.elasticElasticsearchStrings.sniff
import typings.elasticElasticsearch.poolMod.ResurrectEvent
import typings.elasticElasticsearch.transportMod.ApiError
import typings.elasticElasticsearch.transportMod.RequestEvent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// We must redeclare the EventEmitter class so we can provide
// better type definitions for our events, otherwise the default
// signature is `(event: string | symbol, listener: (...args: any[]) => void): this;`
@js.native
trait EventEmitter extends js.Object {
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_request(
    event: request,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_response(
    event: response,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_sniff(
    event: sniff,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_request(
    event: request,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_response(
    event: response,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_sniff(
    event: sniff,
    listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], _], Unit]
  ): this.type = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
}

