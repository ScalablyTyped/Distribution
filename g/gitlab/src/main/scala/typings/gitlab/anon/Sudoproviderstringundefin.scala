package typings.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined gitlab.gitlab/dist/types/core/infrastructure.Sudo & {  provider :string | undefined} */
trait Sudoproviderstringundefin extends StObject {
  
  var provider: js.UndefOr[String] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object Sudoproviderstringundefin {
  
  inline def apply(): Sudoproviderstringundefin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sudoproviderstringundefin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sudoproviderstringundefin] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
