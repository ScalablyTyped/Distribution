package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CcrGetAutoFollowPatternRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: js.UndefOr[Name] = js.undefined
}
object CcrGetAutoFollowPatternRequest {
  
  inline def apply(): CcrGetAutoFollowPatternRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CcrGetAutoFollowPatternRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CcrGetAutoFollowPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
