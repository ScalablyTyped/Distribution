package typings.findPackageJson.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nohoist
  extends StObject
     with /* k */ StringDictionary[js.UndefOr[Any]] {
  
  /**
    * Packages to block from hoisting to the workspace root. Currently only supported in Yarn only.
    */
  var nohoist: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Workspace package paths. Glob patterns are supported.
    */
  var packages: js.UndefOr[js.Array[String]] = js.undefined
}
object Nohoist {
  
  inline def apply(): Nohoist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nohoist]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nohoist] (val x: Self) extends AnyVal {
    
    inline def setNohoist(value: js.Array[String]): Self = StObject.set(x, "nohoist", value.asInstanceOf[js.Any])
    
    inline def setNohoistUndefined: Self = StObject.set(x, "nohoist", js.undefined)
    
    inline def setNohoistVarargs(value: String*): Self = StObject.set(x, "nohoist", js.Array(value*))
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
  }
}
