package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  projectId :string | number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait projectIdstringnumberundeDictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var projectId: js.UndefOr[String | Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object projectIdstringnumberundeDictkey {
  
  inline def apply(): projectIdstringnumberundeDictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[projectIdstringnumberundeDictkey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: projectIdstringnumberundeDictkey] (val x: Self) extends AnyVal {
    
    inline def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
