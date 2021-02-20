package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectFailureFilter extends StObject {
  
  var envelopeIds: js.UndefOr[js.Array[String]] = js.native
  
  var synchronous: js.UndefOr[String] = js.native
}
object ConnectFailureFilter {
  
  @scala.inline
  def apply(): ConnectFailureFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureFilter]
  }
  
  @scala.inline
  implicit class ConnectFailureFilterMutableBuilder[Self <: ConnectFailureFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeIds(value: js.Array[String]): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    @scala.inline
    def setEnvelopeIdsVarargs(value: String*): Self = StObject.set(x, "envelopeIds", js.Array(value :_*))
    
    @scala.inline
    def setSynchronous(value: String): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
