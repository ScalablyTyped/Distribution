package typings.expoLocation.locationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLastKnownOptions extends js.Object {
  
  /**
    * Maximum age of the location in miliseconds.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  /**
    * Maximum radius of horizontal accuracy in meters.
    */
  var requiredAccuracy: js.UndefOr[Double] = js.native
}
object LocationLastKnownOptions {
  
  @scala.inline
  def apply(): LocationLastKnownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationLastKnownOptions]
  }
  
  @scala.inline
  implicit class LocationLastKnownOptionsOps[Self <: LocationLastKnownOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setRequiredAccuracy(value: Double): Self = this.set("requiredAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredAccuracy: Self = this.set("requiredAccuracy", js.undefined)
  }
}
