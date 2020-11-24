package typings.googleCloudPaginator.resourceStreamMod

import typings.googleCloudPaginator.mod.ParsedArguments
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/paginator/build/src/resource-stream", "ResourceStream")
@js.native
class ResourceStream[T] protected ()
  extends Transform
     with ResourceEvents[T] {
  def this(args: ParsedArguments, requestFn: js.Function) = this()
  
  var _ended: Boolean = js.native
  
  var _maxApiCalls: Double = js.native
  
  var _nextQuery: js.Object | Null = js.native
  
  def _read(): Unit = js.native
  
  var _reading: Boolean = js.native
  
  var _requestFn: js.Function = js.native
  
  var _requestsMade: Double = js.native
  
  var _resultsToSend: Double = js.native
  
  def end(args: js.Any*): Unit = js.native
  
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}
