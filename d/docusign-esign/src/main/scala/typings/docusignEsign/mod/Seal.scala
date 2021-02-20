package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seal extends StObject {
  
  /**
    * Electronic seal configuration  properties
    */
  var configuration: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Electronic Seal identifier
    */
  var sealIdentifier: js.UndefOr[String] = js.native
}
object Seal {
  
  @scala.inline
  def apply(): Seal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seal]
  }
  
  @scala.inline
  implicit class SealMutableBuilder[Self <: Seal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: StringDictionary[String]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setSealIdentifier(value: String): Self = StObject.set(x, "sealIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSealIdentifierUndefined: Self = StObject.set(x, "sealIdentifier", js.undefined)
  }
}
