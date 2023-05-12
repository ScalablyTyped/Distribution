package typings.glimmerDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSpecifierMod {
  
  @JSImport("@glimmer/di/dist/types/specifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeSpecifier(specifier: String): Specifier = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeSpecifier")(specifier.asInstanceOf[js.Any]).asInstanceOf[Specifier]
  
  inline def isSpecifierObjectAbsolute(specifier: Specifier): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecifierObjectAbsolute")(specifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSpecifierStringAbsolute(specifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpecifierStringAbsolute")(specifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def serializeSpecifier(specifier: Specifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeSpecifier")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serializeSpecifierPath(specifier: Specifier): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeSpecifierPath")(specifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Specifier extends StObject {
    
    var collection: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var rootName: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Specifier {
    
    inline def apply(): Specifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Specifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Specifier] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
      
      inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
