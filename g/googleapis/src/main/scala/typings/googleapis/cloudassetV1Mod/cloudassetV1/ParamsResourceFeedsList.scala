package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFeedsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent project/folder/organization whose feeds are to be listed. It can only be using project/folder/organization number (such as "folders/12345")", or a project ID (such as "projects/my-project-id").
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceFeedsList {
  
  inline def apply(): ParamsResourceFeedsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFeedsList]
  }
  
  extension [Self <: ParamsResourceFeedsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
