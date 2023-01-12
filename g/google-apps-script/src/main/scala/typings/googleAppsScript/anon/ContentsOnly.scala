package typings.googleAppsScript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentsOnly extends StObject {
  
  var contentsOnly: js.UndefOr[Boolean] = js.undefined
  
  var formatOnly: js.UndefOr[Boolean] = js.undefined
}
object ContentsOnly {
  
  inline def apply(): ContentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentsOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentsOnly] (val x: Self) extends AnyVal {
    
    inline def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    inline def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    inline def setFormatOnly(value: Boolean): Self = StObject.set(x, "formatOnly", value.asInstanceOf[js.Any])
    
    inline def setFormatOnlyUndefined: Self = StObject.set(x, "formatOnly", js.undefined)
  }
}
