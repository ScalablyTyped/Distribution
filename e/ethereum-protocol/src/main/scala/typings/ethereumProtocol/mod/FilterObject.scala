package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterObject extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var fromBlock: js.UndefOr[Double | String] = js.undefined
  
  var toBlock: js.UndefOr[Double | String] = js.undefined
  
  var topics: js.UndefOr[js.Array[LogTopic]] = js.undefined
}
object FilterObject {
  
  @scala.inline
  def apply(): FilterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterObject]
  }
  
  @scala.inline
  implicit class FilterObjectMutableBuilder[Self <: FilterObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setFromBlock(value: Double | String): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
    
    @scala.inline
    def setToBlock(value: Double | String): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
    
    @scala.inline
    def setTopics(value: js.Array[LogTopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: LogTopic*): Self = StObject.set(x, "topics", js.Array(value :_*))
  }
}
