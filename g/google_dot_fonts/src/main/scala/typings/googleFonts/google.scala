package typings.googleFonts

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object fonts {
    
    @js.native
    trait WebfontFamily extends StObject {
      
      var category: js.UndefOr[String] = js.native
      
      var family: String = js.native
      
      var files: StringDictionary[String] = js.native
      
      var kind: String = js.native
      
      var lastModified: String = js.native
      
      var subsets: js.Array[String] = js.native
      
      var variants: js.Array[String] = js.native
      
      var version: String = js.native
    }
    object WebfontFamily {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class WebfontFamilyMutableBuilder[Self <: WebfontFamily] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        @scala.inline
        def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFiles(value: StringDictionary[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubsets(value: js.Array[String]): Self = StObject.set(x, "subsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubsetsVarargs(value: String*): Self = StObject.set(x, "subsets", js.Array(value :_*))
        
        @scala.inline
        def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value :_*))
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait WebfontList extends StObject {
      
      var items: js.Array[WebfontFamily] = js.native
      
      var kind: String = js.native
    }
    object WebfontList {
      
      @scala.inline
      def apply(items: js.Array[WebfontFamily], kind: String): WebfontList = {
        val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
        __obj.asInstanceOf[WebfontList]
      }
      
      @scala.inline
      implicit class WebfontListMutableBuilder[Self <: WebfontList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItems(value: js.Array[WebfontFamily]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsVarargs(value: WebfontFamily*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      }
    }
  }
}
