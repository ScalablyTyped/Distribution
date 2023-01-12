package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseContext extends StObject {
  
  val databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any
  
  val ignoreUndefinedProperties: Boolean
}
object ParseContext {
  
  inline def apply(
    databaseId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any,
    ignoreUndefinedProperties: Boolean
  ): ParseContext = {
    val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], ignoreUndefinedProperties = ignoreUndefinedProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseContext] (val x: Self) extends AnyVal {
    
    inline def setDatabaseId(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DatabaseId */ Any
    ): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
  }
}
