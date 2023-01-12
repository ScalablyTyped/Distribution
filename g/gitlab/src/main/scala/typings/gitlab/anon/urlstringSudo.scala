package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  url :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait urlstringSudo extends StObject {
  
  var sudo: js.UndefOr[String | Double] = js.undefined
  
  var url: String
}
object urlstringSudo {
  
  inline def apply(url: String): urlstringSudo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringSudo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: urlstringSudo] (val x: Self) extends AnyVal {
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
