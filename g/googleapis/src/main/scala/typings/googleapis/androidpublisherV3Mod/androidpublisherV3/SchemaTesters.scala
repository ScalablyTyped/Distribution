package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTesters extends StObject {
  
  var googleGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTesters {
  
  inline def apply(): SchemaTesters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTesters]
  }
  
  extension [Self <: SchemaTesters](x: Self) {
    
    inline def setGoogleGroups(value: js.Array[String]): Self = StObject.set(x, "googleGroups", value.asInstanceOf[js.Any])
    
    inline def setGoogleGroupsUndefined: Self = StObject.set(x, "googleGroups", js.undefined)
    
    inline def setGoogleGroupsVarargs(value: String*): Self = StObject.set(x, "googleGroups", js.Array(value :_*))
    
    inline def setGooglePlusCommunities(value: js.Array[String]): Self = StObject.set(x, "googlePlusCommunities", value.asInstanceOf[js.Any])
    
    inline def setGooglePlusCommunitiesUndefined: Self = StObject.set(x, "googlePlusCommunities", js.undefined)
    
    inline def setGooglePlusCommunitiesVarargs(value: String*): Self = StObject.set(x, "googlePlusCommunities", js.Array(value :_*))
  }
}
