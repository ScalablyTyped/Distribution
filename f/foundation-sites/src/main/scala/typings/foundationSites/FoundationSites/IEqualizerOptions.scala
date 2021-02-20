package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEqualizerOptions extends StObject {
  
  var equalizeByRow: js.UndefOr[Boolean] = js.native
  
  var equalizeOn: js.UndefOr[String] = js.native
  
  var equalizeOnStack: js.UndefOr[Boolean] = js.native
}
object IEqualizerOptions {
  
  @scala.inline
  def apply(): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEqualizerOptions]
  }
  
  @scala.inline
  implicit class IEqualizerOptionsMutableBuilder[Self <: IEqualizerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqualizeByRow(value: Boolean): Self = StObject.set(x, "equalizeByRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualizeByRowUndefined: Self = StObject.set(x, "equalizeByRow", js.undefined)
    
    @scala.inline
    def setEqualizeOn(value: String): Self = StObject.set(x, "equalizeOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualizeOnStack(value: Boolean): Self = StObject.set(x, "equalizeOnStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualizeOnStackUndefined: Self = StObject.set(x, "equalizeOnStack", js.undefined)
    
    @scala.inline
    def setEqualizeOnUndefined: Self = StObject.set(x, "equalizeOn", js.undefined)
  }
}
