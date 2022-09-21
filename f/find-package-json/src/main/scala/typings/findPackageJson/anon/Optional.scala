package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optional
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[Any]] {
  
  /**
    * Specifies that this peer dependency is optional and should not be installed automatically.
    */
  var optional: js.UndefOr[Boolean] = js.undefined
}
object Optional {
  
  inline def apply(): Optional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optional]
  }
  
  extension [Self <: Optional](x: Self) {
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
