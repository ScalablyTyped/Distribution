package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetPrivileges
  extends StObject
     with Generic {
  
  var application: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object SecurityGetPrivileges {
  
  inline def apply(): SecurityGetPrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetPrivileges]
  }
  
  extension [Self <: SecurityGetPrivileges](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
