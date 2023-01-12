package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageName extends StObject {
  
  val displayName: String
  
  val packageName: String
}
object PackageName {
  
  inline def apply(displayName: String, packageName: String): PackageName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageName] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
  }
}
