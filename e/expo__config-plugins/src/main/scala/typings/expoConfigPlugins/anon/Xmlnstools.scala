package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xmlnstools extends StObject {
  
  @JSName("xmlns:tools")
  var xmlnsColontools: js.UndefOr[String] = js.undefined
}
object Xmlnstools {
  
  inline def apply(): Xmlnstools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xmlnstools]
  }
  
  extension [Self <: Xmlnstools](x: Self) {
    
    inline def setXmlnsColontools(value: String): Self = StObject.set(x, "xmlns:tools", value.asInstanceOf[js.Any])
    
    inline def setXmlnsColontoolsUndefined: Self = StObject.set(x, "xmlns:tools", js.undefined)
  }
}
