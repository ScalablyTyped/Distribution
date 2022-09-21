package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublicDelegatedPrefixesScopedList extends StObject {
  
  /**
    * [Output Only] A list of PublicDelegatedPrefixes contained in this scope.
    */
  var publicDelegatedPrefixes: js.UndefOr[js.Array[SchemaPublicDelegatedPrefix]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of public delegated prefixes when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaPublicDelegatedPrefixesScopedList {
  
  inline def apply(): SchemaPublicDelegatedPrefixesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublicDelegatedPrefixesScopedList]
  }
  
  extension [Self <: SchemaPublicDelegatedPrefixesScopedList](x: Self) {
    
    inline def setPublicDelegatedPrefixes(value: js.Array[SchemaPublicDelegatedPrefix]): Self = StObject.set(x, "publicDelegatedPrefixes", value.asInstanceOf[js.Any])
    
    inline def setPublicDelegatedPrefixesUndefined: Self = StObject.set(x, "publicDelegatedPrefixes", js.undefined)
    
    inline def setPublicDelegatedPrefixesVarargs(value: SchemaPublicDelegatedPrefix*): Self = StObject.set(x, "publicDelegatedPrefixes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
