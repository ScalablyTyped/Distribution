package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  search :string | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait searchstringundefinedSudo extends StObject {
  
  var search: js.UndefOr[String] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object searchstringundefinedSudo {
  
  inline def apply(): searchstringundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[searchstringundefinedSudo]
  }
  
  extension [Self <: searchstringundefinedSudo](x: Self) {
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
