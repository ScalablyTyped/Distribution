package typings.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DryRun extends StObject {
  
  var dryRun: js.UndefOr[Boolean] = js.native
}
object DryRun {
  
  @scala.inline
  def apply(): DryRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DryRun]
  }
  
  @scala.inline
  implicit class DryRunMutableBuilder[Self <: DryRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
  }
}
