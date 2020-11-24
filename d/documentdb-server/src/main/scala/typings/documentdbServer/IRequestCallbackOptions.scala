package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information associated with the response to the operation. */
@js.native
trait IRequestCallbackOptions extends js.Object {
  
  /** Comma delimited string containing the collection's current quota metrics (storage, number of stored procedure, triggers and UDFs) after completion of the operation. */
  var currentCollectionSizeInMB: String = js.native
  
  /** Comma delimited string containing the collection's maximum quota metrics (storage, number of stored procedure, triggers and UDFs). */
  var maxCollectionSizeInMB: String = js.native
  
  /** Set to true if the requested resource has not been modified compared to the provided ETag in the ifNoneMatch parameter for a read request. */
  var notModified: Boolean = js.native
}
object IRequestCallbackOptions {
  
  @scala.inline
  def apply(currentCollectionSizeInMB: String, maxCollectionSizeInMB: String, notModified: Boolean): IRequestCallbackOptions = {
    val __obj = js.Dynamic.literal(currentCollectionSizeInMB = currentCollectionSizeInMB.asInstanceOf[js.Any], maxCollectionSizeInMB = maxCollectionSizeInMB.asInstanceOf[js.Any], notModified = notModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestCallbackOptions]
  }
  
  @scala.inline
  implicit class IRequestCallbackOptionsOps[Self <: IRequestCallbackOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrentCollectionSizeInMB(value: String): Self = this.set("currentCollectionSizeInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCollectionSizeInMB(value: String): Self = this.set("maxCollectionSizeInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotModified(value: Boolean): Self = this.set("notModified", value.asInstanceOf[js.Any])
  }
}
