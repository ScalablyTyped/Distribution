package typings.entriaRelayExperimental.useRefetchableFragmentNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeNode[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] extends js.Object {
  
  def disableStoreUpdates(): Unit = js.native
  
  def enableStoreUpdates(): Unit = js.native
  
  var fragmentData: js.Any = js.native
  
  var fragmentRef: js.Any = js.native
  
  var refetch: RefetchFnDynamic[TQuery, TKey, TOptions] = js.native
}
object ReturnTypeNode {
  
  @scala.inline
  def apply[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions](
    disableStoreUpdates: () => Unit,
    enableStoreUpdates: () => Unit,
    fragmentData: js.Any,
    fragmentRef: js.Any,
    refetch: RefetchFnDynamic[TQuery, TKey, TOptions]
  ): ReturnTypeNode[TQuery, TKey, TOptions] = {
    val __obj = js.Dynamic.literal(disableStoreUpdates = js.Any.fromFunction0(disableStoreUpdates), enableStoreUpdates = js.Any.fromFunction0(enableStoreUpdates), fragmentData = fragmentData.asInstanceOf[js.Any], fragmentRef = fragmentRef.asInstanceOf[js.Any], refetch = refetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNode[TQuery, TKey, TOptions]]
  }
  
  @scala.inline
  implicit class ReturnTypeNodeOps[Self <: ReturnTypeNode[_, _, _], TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */, TOptions] (val x: Self with (ReturnTypeNode[TQuery, TKey, TOptions])) extends AnyVal {
    
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
    def setDisableStoreUpdates(value: () => Unit): Self = this.set("disableStoreUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableStoreUpdates(value: () => Unit): Self = this.set("enableStoreUpdates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFragmentData(value: js.Any): Self = this.set("fragmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentRef(value: js.Any): Self = this.set("fragmentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefetch(value: RefetchFnDynamic[TQuery, TKey, TOptions]): Self = this.set("refetch", value.asInstanceOf[js.Any])
  }
}
