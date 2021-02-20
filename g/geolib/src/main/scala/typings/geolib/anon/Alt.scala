package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alt extends GeolibInputAltitude {
  
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.native
}
object Alt {
  
  @scala.inline
  def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  
  @scala.inline
  implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: GeolibAltitudeInputValue): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
  }
}
