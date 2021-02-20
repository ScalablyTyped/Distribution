package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatedBefore extends StObject {
  
  var age: js.UndefOr[Double] = js.native
  
  var createdBefore: js.UndefOr[String] = js.native
  
  var isLive: js.UndefOr[Boolean] = js.native
  
  var numNewerVersions: js.UndefOr[Double] = js.native
}
object CreatedBefore {
  
  @scala.inline
  def apply(): CreatedBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatedBefore]
  }
  
  @scala.inline
  implicit class CreatedBeforeMutableBuilder[Self <: CreatedBefore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    @scala.inline
    def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLiveUndefined: Self = StObject.set(x, "isLive", js.undefined)
    
    @scala.inline
    def setNumNewerVersions(value: Double): Self = StObject.set(x, "numNewerVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNewerVersionsUndefined: Self = StObject.set(x, "numNewerVersions", js.undefined)
  }
}
