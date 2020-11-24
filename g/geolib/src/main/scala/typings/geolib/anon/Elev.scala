package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elev extends GeolibInputAltitude {
  
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.native
}
object Elev {
  
  @scala.inline
  def apply(): Elev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Elev]
  }
  
  @scala.inline
  implicit class ElevOps[Self <: Elev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElev(value: GeolibAltitudeInputValue): Self = this.set("elev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElev: Self = this.set("elev", js.undefined)
  }
}
