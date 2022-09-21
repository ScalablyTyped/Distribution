package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDictionaryListofflinemetadata
  extends StObject
     with StandardParameters {
  
  /**
    * The device/version ID from which to request the data.
    */
  var cpksver: js.UndefOr[String] = js.undefined
}
object ParamsResourceDictionaryListofflinemetadata {
  
  inline def apply(): ParamsResourceDictionaryListofflinemetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDictionaryListofflinemetadata]
  }
  
  extension [Self <: ParamsResourceDictionaryListofflinemetadata](x: Self) {
    
    inline def setCpksver(value: String): Self = StObject.set(x, "cpksver", value.asInstanceOf[js.Any])
    
    inline def setCpksverUndefined: Self = StObject.set(x, "cpksver", js.undefined)
  }
}
