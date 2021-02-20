package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  search :string | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait searchstringundefinedSudo extends StObject {
  
  var search: js.UndefOr[String] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object searchstringundefinedSudo {
  
  @scala.inline
  def apply(): searchstringundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[searchstringundefinedSudo]
  }
  
  @scala.inline
  implicit class searchstringundefinedSudoMutableBuilder[Self <: searchstringundefinedSudo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
