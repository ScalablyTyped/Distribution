package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTesters extends StObject {
  
  var googleGroups: js.UndefOr[js.Array[String]] = js.native
  
  var googlePlusCommunities: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTesters {
  
  @scala.inline
  def apply(): SchemaTesters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTesters]
  }
  
  @scala.inline
  implicit class SchemaTestersMutableBuilder[Self <: SchemaTesters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleGroups(value: js.Array[String]): Self = StObject.set(x, "googleGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleGroupsUndefined: Self = StObject.set(x, "googleGroups", js.undefined)
    
    @scala.inline
    def setGoogleGroupsVarargs(value: String*): Self = StObject.set(x, "googleGroups", js.Array(value :_*))
    
    @scala.inline
    def setGooglePlusCommunities(value: js.Array[String]): Self = StObject.set(x, "googlePlusCommunities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePlusCommunitiesUndefined: Self = StObject.set(x, "googlePlusCommunities", js.undefined)
    
    @scala.inline
    def setGooglePlusCommunitiesVarargs(value: String*): Self = StObject.set(x, "googlePlusCommunities", js.Array(value :_*))
  }
}
