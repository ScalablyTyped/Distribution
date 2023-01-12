package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberGroupSharedItem extends StObject {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The group sharing the item.
    */
  var group: js.UndefOr[/* This object contains information about a group. */ Group] = js.undefined
  
  /**
    * How the item is shared. One of:
    *
    *
    * - `not_shared`: The item is not shared.
    *
    * - `shared_to`: The item is shared.
    */
  var shared: js.UndefOr[String] = js.undefined
}
object MemberGroupSharedItem {
  
  inline def apply(): MemberGroupSharedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberGroupSharedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberGroupSharedItem] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setGroup(value: /* This object contains information about a group. */ Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setShared(value: String): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
  }
}
