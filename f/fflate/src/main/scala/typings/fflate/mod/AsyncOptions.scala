package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncOptions extends StObject {
  
  /**
    * Whether or not to "consume" the source data. This will make the typed array/buffer you pass in
    * unusable but will increase performance and reduce memory usage.
    */
  var consume: js.UndefOr[Boolean] = js.native
}
object AsyncOptions {
  
  @scala.inline
  def apply(): AsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncOptions]
  }
  
  @scala.inline
  implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
  }
}
