package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sha :string} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
trait shastringSudo extends StObject {
  
  var sha: String
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object shastringSudo {
  
  inline def apply(sha: String): shastringSudo = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[shastringSudo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: shastringSudo] (val x: Self) extends AnyVal {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
