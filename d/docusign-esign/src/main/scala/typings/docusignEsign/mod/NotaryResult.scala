package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryResult extends StObject {
  
  var jurisdictions: js.UndefOr[js.Array[Jurisdiction]] = js.undefined
  
  var notary: js.UndefOr[Notary] = js.undefined
}
object NotaryResult {
  
  @scala.inline
  def apply(): NotaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryResult]
  }
  
  @scala.inline
  implicit class NotaryResultMutableBuilder[Self <: NotaryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJurisdictions(value: js.Array[Jurisdiction]): Self = StObject.set(x, "jurisdictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionsUndefined: Self = StObject.set(x, "jurisdictions", js.undefined)
    
    @scala.inline
    def setJurisdictionsVarargs(value: Jurisdiction*): Self = StObject.set(x, "jurisdictions", js.Array(value :_*))
    
    @scala.inline
    def setNotary(value: Notary): Self = StObject.set(x, "notary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotaryUndefined: Self = StObject.set(x, "notary", js.undefined)
  }
}
