package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seal extends StObject {
  
  /**
    * Electronic seal configuration  properties
    */
  var configuration: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Electronic Seal identifier
    */
  var sealIdentifier: js.UndefOr[String] = js.undefined
}
object Seal {
  
  inline def apply(): Seal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Seal] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: StringDictionary[String]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setSealIdentifier(value: String): Self = StObject.set(x, "sealIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSealIdentifierUndefined: Self = StObject.set(x, "sealIdentifier", js.undefined)
  }
}
