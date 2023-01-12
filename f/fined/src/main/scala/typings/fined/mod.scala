package typings.fined

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Result | Null = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  inline def apply(path: String, opts: PathSpec): Result | Null = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Result | Null]
  inline def apply(path: PathSpec): Result | Null = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Result | Null]
  inline def apply(path: PathSpec, opts: PathSpec): Result | Null = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Result | Null]
  
  @JSImport("fined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PathSpec extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[String | js.Array[String] | (StringDictionary[String | Null])] = js.undefined
    
    var findUp: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object PathSpec {
    
    inline def apply(): PathSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathSpec] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExtensions(value: String | js.Array[String] | (StringDictionary[String | Null])): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFindUp(value: Boolean): Self = StObject.set(x, "findUp", value.asInstanceOf[js.Any])
      
      inline def setFindUpUndefined: Self = StObject.set(x, "findUp", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var `extension`: String | StringDictionary[String]
    
    var path: String
  }
  object Result {
    
    inline def apply(`extension`: String | StringDictionary[String], path: String): Result = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String | StringDictionary[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
