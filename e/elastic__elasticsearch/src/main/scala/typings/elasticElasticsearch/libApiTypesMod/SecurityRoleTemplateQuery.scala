package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityRoleTemplateQuery
  extends StObject
     with _SecurityIndicesPrivilegesQuery {
  
  var template: js.UndefOr[SecurityRoleTemplateScript] = js.undefined
}
object SecurityRoleTemplateQuery {
  
  inline def apply(): SecurityRoleTemplateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityRoleTemplateQuery]
  }
  
  extension [Self <: SecurityRoleTemplateQuery](x: Self) {
    
    inline def setTemplate(value: SecurityRoleTemplateScript): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
