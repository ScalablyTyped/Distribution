package typings.entriaRelayExperimental.useLoadMoreFunctionMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayNetworkTypesMod.GraphQLResponse
import typings.relayRuntime.relayObservableMod.Observer
import typings.relayRuntime.relayStoreTypesMod.RequestDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseLoadMoreFunctionArgs extends js.Object {
  
  var componentDisplayName: String = js.native
  
  var connectionPathInFragmentData: js.Array[String | Double] = js.native
  
  var direction: Direction = js.native
  
  var fragmentData: js.Any = js.native
  
  var fragmentIdentifier: String = js.native
  
  var fragmentNode: ReaderFragment = js.native
  
  var fragmentOwner: RequestDescriptor | (js.Array[RequestDescriptor | Null]) | Null = js.native
  
  var fragmentRefPathInResponse: js.Array[String | Double] = js.native
  
  var observer: Observer[GraphQLResponse] = js.native
  
  def onReset(): Unit = js.native
  
  var paginationMetadata: ReaderPaginationMetadata = js.native
  
  var paginationRequest: ConcreteRequest = js.native
}
object UseLoadMoreFunctionArgs {
  
  @scala.inline
  def apply(
    componentDisplayName: String,
    connectionPathInFragmentData: js.Array[String | Double],
    direction: Direction,
    fragmentData: js.Any,
    fragmentIdentifier: String,
    fragmentNode: ReaderFragment,
    fragmentRefPathInResponse: js.Array[String | Double],
    observer: Observer[GraphQLResponse],
    onReset: () => Unit,
    paginationMetadata: ReaderPaginationMetadata,
    paginationRequest: ConcreteRequest
  ): UseLoadMoreFunctionArgs = {
    val __obj = js.Dynamic.literal(componentDisplayName = componentDisplayName.asInstanceOf[js.Any], connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], fragmentData = fragmentData.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any], fragmentNode = fragmentNode.asInstanceOf[js.Any], fragmentRefPathInResponse = fragmentRefPathInResponse.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], onReset = js.Any.fromFunction0(onReset), paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseLoadMoreFunctionArgs]
  }
  
  @scala.inline
  implicit class UseLoadMoreFunctionArgsOps[Self <: UseLoadMoreFunctionArgs] (val x: Self) extends AnyVal {
    
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
    def setComponentDisplayName(value: String): Self = this.set("componentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPathInFragmentDataVarargs(value: (String | Double)*): Self = this.set("connectionPathInFragmentData", js.Array(value :_*))
    
    @scala.inline
    def setConnectionPathInFragmentData(value: js.Array[String | Double]): Self = this.set("connectionPathInFragmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentData(value: js.Any): Self = this.set("fragmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentIdentifier(value: String): Self = this.set("fragmentIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentNode(value: ReaderFragment): Self = this.set("fragmentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentRefPathInResponseVarargs(value: (String | Double)*): Self = this.set("fragmentRefPathInResponse", js.Array(value :_*))
    
    @scala.inline
    def setFragmentRefPathInResponse(value: js.Array[String | Double]): Self = this.set("fragmentRefPathInResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserver(value: Observer[GraphQLResponse]): Self = this.set("observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReset(value: () => Unit): Self = this.set("onReset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaginationMetadata(value: ReaderPaginationMetadata): Self = this.set("paginationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationRequest(value: ConcreteRequest): Self = this.set("paginationRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentOwnerVarargs(value: (RequestDescriptor | Null)*): Self = this.set("fragmentOwner", js.Array(value :_*))
    
    @scala.inline
    def setFragmentOwner(value: RequestDescriptor | (js.Array[RequestDescriptor | Null])): Self = this.set("fragmentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentOwnerNull: Self = this.set("fragmentOwner", null)
  }
}
