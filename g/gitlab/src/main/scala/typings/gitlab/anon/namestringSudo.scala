package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait namestringSudo extends StObject {
  
  var name: String
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object namestringSudo {
  
  inline def apply(name: String): namestringSudo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[namestringSudo]
  }
  
  extension [Self <: namestringSudo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
