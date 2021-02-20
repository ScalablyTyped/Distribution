package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PulsarProps extends StObject {
  
  var paused: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object PulsarProps {
  
  @scala.inline
  def apply(): PulsarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsarProps]
  }
  
  @scala.inline
  implicit class PulsarPropsMutableBuilder[Self <: PulsarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
