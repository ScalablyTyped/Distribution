package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SealIdentifier extends StObject {
  
  /**
    * The user-friendly display name for a seal.
    */
  var sealDisplayName: js.UndefOr[String] = js.native
  
  /**
    * The name of a seal.
    */
  var sealName: js.UndefOr[String] = js.native
}
object SealIdentifier {
  
  @scala.inline
  def apply(): SealIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SealIdentifier]
  }
  
  @scala.inline
  implicit class SealIdentifierMutableBuilder[Self <: SealIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSealDisplayName(value: String): Self = StObject.set(x, "sealDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealDisplayNameUndefined: Self = StObject.set(x, "sealDisplayName", js.undefined)
    
    @scala.inline
    def setSealName(value: String): Self = StObject.set(x, "sealName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealNameUndefined: Self = StObject.set(x, "sealName", js.undefined)
  }
}
