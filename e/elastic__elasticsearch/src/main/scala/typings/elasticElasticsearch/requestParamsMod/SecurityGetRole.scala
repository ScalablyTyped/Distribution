package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetRole
  extends StObject
     with Generic {
  
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SecurityGetRole {
  
  @scala.inline
  def apply(): SecurityGetRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetRole]
  }
  
  @scala.inline
  implicit class SecurityGetRoleMutableBuilder[Self <: SecurityGetRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
