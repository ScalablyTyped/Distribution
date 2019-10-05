package typings.atGoogleDashCloudPaginator.buildSrcResourceDashStreamMod

import typings.atGoogleDashCloudPaginator.atGoogleDashCloudPaginatorStrings.data
import typings.node.Anon_End
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/paginator/build/src/resource-stream", "ResourceStream")
@js.native
class ResourceStream[T] protected ()
  extends Transform
     with ResourceEvents[T] {
  def this(
    args: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ParsedArguments */ js.Any,
    requestFn: js.Function
  ) = this()
  var _ended: Boolean = js.native
  var _maxApiCalls: Double = js.native
  var _nextQuery: js.Object | Null = js.native
  var _reading: Boolean = js.native
  var _requestFn: js.Function = js.native
  var _requestsMade: Double = js.native
  var _resultsToSend: Double = js.native
  def _read(): Unit = js.native
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("addListener")
  override def addListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /* CompleteClass */
  @JSName("emit")
  override def emit_data(event: data, data: T): Boolean = js.native
  def end(args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("once")
  override def once_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: Anon_End): T = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("prependListener")
  override def prependListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("prependOnceListener")
  override def prependOnceListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("removeListener")
  override def removeListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
}

