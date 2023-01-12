package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySuggestUserProfilesHint extends StObject {
  
  var labels: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  
  var uids: js.UndefOr[js.Array[SecurityUserProfileId]] = js.undefined
}
object SecuritySuggestUserProfilesHint {
  
  inline def apply(): SecuritySuggestUserProfilesHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuritySuggestUserProfilesHint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySuggestUserProfilesHint] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setUids(value: js.Array[SecurityUserProfileId]): Self = StObject.set(x, "uids", value.asInstanceOf[js.Any])
    
    inline def setUidsUndefined: Self = StObject.set(x, "uids", js.undefined)
    
    inline def setUidsVarargs(value: SecurityUserProfileId*): Self = StObject.set(x, "uids", js.Array(value*))
  }
}
