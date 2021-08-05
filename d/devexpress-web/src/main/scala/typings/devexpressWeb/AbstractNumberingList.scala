package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract numbering list definition that defines the appearance and behavior of numbered paragraphs in a document.
  */
trait AbstractNumberingList extends StObject {
  
  /**
    * Gets or sets a value indicating whether an abstract numbering list is deleted.
    */
  var deleted: Boolean
}
object AbstractNumberingList {
  
  inline def apply(deleted: Boolean): AbstractNumberingList = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractNumberingList]
  }
  
  extension [Self <: AbstractNumberingList](x: Self) {
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
  }
}
