package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a read operation. */
@js.native
trait IReadOptions extends StObject {
  
  /** The conditional HTTP method ifNoneMatch value. */
  var ifNoneMatch: js.UndefOr[String] = js.native
}
object IReadOptions {
  
  @scala.inline
  def apply(): IReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadOptions]
  }
  
  @scala.inline
  implicit class IReadOptionsMutableBuilder[Self <: IReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
  }
}
