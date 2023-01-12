package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetCompose
  extends StObject
     with BackboneElement {
  
  var _import: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Exclude one or more codes from the value set.
    */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
  
  /**
    * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri.
    */
  var `import`: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Include one or more codes from a code system.
    */
  var include: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
}
object ValueSetCompose {
  
  inline def apply(): ValueSetCompose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetCompose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSetCompose] (val x: Self) extends AnyVal {
    
    inline def setExclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setImport(value: js.Array[String]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setInclude(value: js.Array[ValueSetComposeInclude]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: ValueSetComposeInclude*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def set_import(value: js.Array[Element]): Self = StObject.set(x, "_import", value.asInstanceOf[js.Any])
    
    inline def set_importUndefined: Self = StObject.set(x, "_import", js.undefined)
    
    inline def set_importVarargs(value: Element*): Self = StObject.set(x, "_import", js.Array(value*))
  }
}
