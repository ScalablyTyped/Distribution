package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncInflateOptions extends AsyncOptions {
  
  /**
    * The original size of the data. Currently, the asynchronous API disallows
    * writing into a buffer you provide; the best you can do is provide the
    * size in bytes and be given back a new typed array.
    */
  var size: js.UndefOr[Double] = js.native
}
object AsyncInflateOptions {
  
  @scala.inline
  def apply(): AsyncInflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInflateOptions]
  }
  
  @scala.inline
  implicit class AsyncInflateOptionsMutableBuilder[Self <: AsyncInflateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
