package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  /**
    * The type of operation (sign-in, linking, or re-authentication) that raised the error.
    */
  val operationType: /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.anon.LINK[keyof @firebase/auth.anon.LINK] */ js.Any
}
object `2` {
  
  inline def apply(
    operationType: /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.anon.LINK[keyof @firebase/auth.anon.LINK] */ js.Any
  ): `2` = {
    val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setOperationType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @firebase/auth.anon.LINK[keyof @firebase/auth.anon.LINK] */ js.Any
    ): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
