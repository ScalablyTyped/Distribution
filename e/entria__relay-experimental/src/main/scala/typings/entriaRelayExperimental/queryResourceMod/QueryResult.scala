package typings.entriaRelayExperimental.queryResourceMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayStoreTypesMod.FragmentPointer
import typings.relayRuntime.relayStoreTypesMod.OperationDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  var cacheKey: String = js.native
  var fragmentNode: ReaderFragment = js.native
  var fragmentRef: FragmentPointer = js.native
  var operation: OperationDescriptor = js.native
}

object QueryResult {
  @scala.inline
  def apply(
    cacheKey: String,
    fragmentNode: ReaderFragment,
    fragmentRef: FragmentPointer,
    operation: OperationDescriptor
  ): QueryResult = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
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
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentNode(value: ReaderFragment): Self = this.set("fragmentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentRef(value: FragmentPointer): Self = this.set("fragmentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
  
}

