package typings.githubReservedNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("github-reserved-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("github-reserved-names", "all")
  @js.native
  def all: js.Array[String] = js.native
  inline def all_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  
  inline def check(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def oddballs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("oddballs")().asInstanceOf[js.Array[String]]
  inline def oddballs(name: String): oddball | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("oddballs")(name.asInstanceOf[js.Any]).asInstanceOf[oddball | js.Array[String]]
  
  trait oddball extends StObject {
    
    var included: Boolean
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var reserved: Boolean
    
    var taken: Boolean
    
    var typical: Boolean
  }
  object oddball {
    
    inline def apply(included: Boolean, reserved: Boolean, taken: Boolean, typical: Boolean): oddball = {
      val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any], taken = taken.asInstanceOf[js.Any], typical = typical.asInstanceOf[js.Any])
      __obj.asInstanceOf[oddball]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: oddball] (val x: Self) extends AnyVal {
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      inline def setTaken(value: Boolean): Self = StObject.set(x, "taken", value.asInstanceOf[js.Any])
      
      inline def setTypical(value: Boolean): Self = StObject.set(x, "typical", value.asInstanceOf[js.Any])
    }
  }
}
