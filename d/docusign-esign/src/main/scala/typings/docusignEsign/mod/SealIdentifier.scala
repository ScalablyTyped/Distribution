package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SealIdentifier extends StObject {
  
  /**
    * The user-friendly display name for a seal.
    */
  var sealDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a seal.
    */
  var sealName: js.UndefOr[String] = js.undefined
}
object SealIdentifier {
  
  inline def apply(): SealIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SealIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SealIdentifier] (val x: Self) extends AnyVal {
    
    inline def setSealDisplayName(value: String): Self = StObject.set(x, "sealDisplayName", value.asInstanceOf[js.Any])
    
    inline def setSealDisplayNameUndefined: Self = StObject.set(x, "sealDisplayName", js.undefined)
    
    inline def setSealName(value: String): Self = StObject.set(x, "sealName", value.asInstanceOf[js.Any])
    
    inline def setSealNameUndefined: Self = StObject.set(x, "sealName", js.undefined)
  }
}
