package typings.googleCloudCommon.utilMod

import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplexifyOptions extends DuplexOptions {
  
  var end: js.UndefOr[Boolean] = js.native
}
object DuplexifyOptions {
  
  @scala.inline
  def apply(): DuplexifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexifyOptions]
  }
  
  @scala.inline
  implicit class DuplexifyOptionsMutableBuilder[Self <: DuplexifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
  }
}
