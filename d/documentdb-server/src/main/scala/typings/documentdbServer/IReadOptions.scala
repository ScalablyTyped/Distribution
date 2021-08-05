package typings.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options associated with a read operation. */
trait IReadOptions extends StObject {
  
  /** The conditional HTTP method ifNoneMatch value. */
  var ifNoneMatch: js.UndefOr[String] = js.undefined
}
object IReadOptions {
  
  inline def apply(): IReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadOptions]
  }
  
  extension [Self <: IReadOptions](x: Self) {
    
    inline def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    inline def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
  }
}
