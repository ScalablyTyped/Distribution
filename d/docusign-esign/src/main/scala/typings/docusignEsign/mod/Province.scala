package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Province extends StObject {
  
  var isoCode: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Province {
  
  @scala.inline
  def apply(): Province = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Province]
  }
  
  @scala.inline
  implicit class ProvinceMutableBuilder[Self <: Province] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsoCode(value: String): Self = StObject.set(x, "isoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoCodeUndefined: Self = StObject.set(x, "isoCode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
