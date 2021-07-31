package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ulimit extends StObject {
  
  var Hard: js.UndefOr[Double] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Soft: js.UndefOr[Double] = js.undefined
}
object Ulimit {
  
  @scala.inline
  def apply(): Ulimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit class UlimitMutableBuilder[Self <: Ulimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHard(value: Double): Self = StObject.set(x, "Hard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardUndefined: Self = StObject.set(x, "Hard", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSoft(value: Double): Self = StObject.set(x, "Soft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftUndefined: Self = StObject.set(x, "Soft", js.undefined)
  }
}
