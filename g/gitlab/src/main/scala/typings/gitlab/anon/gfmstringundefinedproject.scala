package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  gfm :string | undefined,   project :string | number | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait gfmstringundefinedproject extends StObject {
  
  var gfm: js.UndefOr[String] = js.undefined
  
  var project: js.UndefOr[String | Double] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object gfmstringundefinedproject {
  
  inline def apply(): gfmstringundefinedproject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gfmstringundefinedproject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: gfmstringundefinedproject] (val x: Self) extends AnyVal {
    
    inline def setGfm(value: String): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
    
    inline def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    
    inline def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
