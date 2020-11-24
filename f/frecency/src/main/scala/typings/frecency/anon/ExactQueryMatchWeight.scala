package typings.frecency.anon

import typings.frecency.mod.idAttrFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExactQueryMatchWeight extends js.Object {
  
  var exactQueryMatchWeight: js.UndefOr[Double] = js.native
  
  var idAttribute: js.UndefOr[String | idAttrFn] = js.native
  
  var key: String = js.native
  
  var recentSelectionsLimit: js.UndefOr[Double] = js.native
  
  var recentSelectionsMatchWeight: js.UndefOr[Double] = js.native
  
  var storageProvider: js.UndefOr[js.Object] = js.native
  
  var subQueryMatchWeight: js.UndefOr[Double] = js.native
  
  var timeStampsLimit: js.UndefOr[Double] = js.native
}
object ExactQueryMatchWeight {
  
  @scala.inline
  def apply(key: String): ExactQueryMatchWeight = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExactQueryMatchWeight]
  }
  
  @scala.inline
  implicit class ExactQueryMatchWeightOps[Self <: ExactQueryMatchWeight] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactQueryMatchWeight(value: Double): Self = this.set("exactQueryMatchWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactQueryMatchWeight: Self = this.set("exactQueryMatchWeight", js.undefined)
    
    @scala.inline
    def setIdAttributeFunction1(value: /* result */ String => String): Self = this.set("idAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdAttribute(value: String | idAttrFn): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    
    @scala.inline
    def setRecentSelectionsLimit(value: Double): Self = this.set("recentSelectionsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentSelectionsLimit: Self = this.set("recentSelectionsLimit", js.undefined)
    
    @scala.inline
    def setRecentSelectionsMatchWeight(value: Double): Self = this.set("recentSelectionsMatchWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentSelectionsMatchWeight: Self = this.set("recentSelectionsMatchWeight", js.undefined)
    
    @scala.inline
    def setStorageProvider(value: js.Object): Self = this.set("storageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageProvider: Self = this.set("storageProvider", js.undefined)
    
    @scala.inline
    def setSubQueryMatchWeight(value: Double): Self = this.set("subQueryMatchWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubQueryMatchWeight: Self = this.set("subQueryMatchWeight", js.undefined)
    
    @scala.inline
    def setTimeStampsLimit(value: Double): Self = this.set("timeStampsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStampsLimit: Self = this.set("timeStampsLimit", js.undefined)
  }
}
