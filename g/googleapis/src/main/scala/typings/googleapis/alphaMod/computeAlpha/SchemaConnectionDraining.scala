package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message containing connection draining configuration.
  */
trait SchemaConnectionDraining extends StObject {
  
  /**
    * Time for which instance will be drained (not accept new connections, but
    * still work to finish started).
    */
  var drainingTimeoutSec: js.UndefOr[Double] = js.undefined
}
object SchemaConnectionDraining {
  
  @scala.inline
  def apply(): SchemaConnectionDraining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionDraining]
  }
  
  @scala.inline
  implicit class SchemaConnectionDrainingMutableBuilder[Self <: SchemaConnectionDraining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrainingTimeoutSec(value: Double): Self = StObject.set(x, "drainingTimeoutSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrainingTimeoutSecUndefined: Self = StObject.set(x, "drainingTimeoutSec", js.undefined)
  }
}
