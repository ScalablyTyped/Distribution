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
  
  @scala.inline
  def apply(): gfmstringundefinedproject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[gfmstringundefinedproject]
  }
  
  @scala.inline
  implicit class gfmstringundefinedprojectMutableBuilder[Self <: gfmstringundefinedproject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGfm(value: String): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
    
    @scala.inline
    def setProject(value: String | Double): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
