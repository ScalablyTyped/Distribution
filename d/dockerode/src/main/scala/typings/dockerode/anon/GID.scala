package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GID extends StObject {
  
  var GID: js.UndefOr[String] = js.native
  
  var Mode: js.UndefOr[Double] = js.native
  
  var Name: js.UndefOr[String] = js.native
  
  var UID: js.UndefOr[String] = js.native
}
object GID {
  
  @scala.inline
  def apply(): GID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GID]
  }
  
  @scala.inline
  implicit class GIDMutableBuilder[Self <: GID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGID(value: String): Self = StObject.set(x, "GID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGIDUndefined: Self = StObject.set(x, "GID", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setUID(value: String): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIDUndefined: Self = StObject.set(x, "UID", js.undefined)
  }
}
