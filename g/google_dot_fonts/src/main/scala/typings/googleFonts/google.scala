package typings.googleFonts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object fonts {
    
    trait WebfontFamily extends StObject {
      
      var category: js.UndefOr[String] = js.undefined
      
      var family: String
      
      var files: StringDictionary[String]
      
      var kind: String
      
      var lastModified: String
      
      var subsets: js.Array[String]
      
      var variants: js.Array[String]
      
      var version: String
    }
    object WebfontFamily {
      
      inline def apply(
        family: String,
        files: StringDictionary[String],
        kind: String,
        lastModified: String,
        subsets: js.Array[String],
        variants: js.Array[String],
        version: String
      ): WebfontFamily = {
        val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], subsets = subsets.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebfontFamily]
      }
      
      extension [Self <: WebfontFamily](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFiles(value: StringDictionary[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
        
        inline def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
        
        inline def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value*))
        
        inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
        
        inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait WebfontList extends StObject {
      
      var items: js.Array[WebfontFamily]
      
      var kind: String
    }
    object WebfontList {
      
      inline def apply(items: js.Array[WebfontFamily], kind: String): WebfontList = {
        val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebfontList]
      }
      
      extension [Self <: WebfontList](x: Self) {
        
        inline def setItems(value: js.Array[WebfontFamily]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsVarargs(value: WebfontFamily*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      }
    }
  }
}
