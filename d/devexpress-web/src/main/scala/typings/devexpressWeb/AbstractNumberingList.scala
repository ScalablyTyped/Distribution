package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract numbering list definition that defines the appearance and behavior of numbered paragraphs in a document.
  */
@js.native
trait AbstractNumberingList extends StObject {
  
  /**
    * Gets or sets a value indicating whether an abstract numbering list is deleted.
    */
  var deleted: Boolean = js.native
}
object AbstractNumberingList {
  
  @scala.inline
  def apply(deleted: Boolean): AbstractNumberingList = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNumberingList]
  }
  
  @scala.inline
  implicit class AbstractNumberingListMutableBuilder[Self <: AbstractNumberingList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
  }
}
