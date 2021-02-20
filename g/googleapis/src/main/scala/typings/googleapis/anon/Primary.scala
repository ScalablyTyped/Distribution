package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Primary extends StObject {
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Primary {
  
  @scala.inline
  def apply(): Primary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Primary]
  }
  
  @scala.inline
  implicit class PrimaryMutableBuilder[Self <: Primary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
