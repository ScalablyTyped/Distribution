package typings.atEntriaRelayDashExperimental.libQueryResourceMod

import typings.relayDashRuntime.libStoreRelayStoreTypesMod.FragmentPointer
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.OperationDescriptor
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var cacheKey: String
  var fragmentNode: ReaderFragment
  var fragmentRef: FragmentPointer
  var operation: OperationDescriptor
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
}

