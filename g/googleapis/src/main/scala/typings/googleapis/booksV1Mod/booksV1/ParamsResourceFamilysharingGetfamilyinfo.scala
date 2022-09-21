package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFamilysharingGetfamilyinfo
  extends StObject
     with StandardParameters {
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
}
object ParamsResourceFamilysharingGetfamilyinfo {
  
  inline def apply(): ParamsResourceFamilysharingGetfamilyinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFamilysharingGetfamilyinfo]
  }
  
  extension [Self <: ParamsResourceFamilysharingGetfamilyinfo](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
