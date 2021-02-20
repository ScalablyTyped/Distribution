package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
}
object MoveOptions {
  
  @scala.inline
  def apply(): MoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveOptions]
  }
  
  @scala.inline
  implicit class MoveOptionsMutableBuilder[Self <: MoveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
