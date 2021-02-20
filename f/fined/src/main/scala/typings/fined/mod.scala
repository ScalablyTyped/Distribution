package typings.fined

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fined", JSImport.Namespace)
  @js.native
  def apply(path: String): Result | Null = js.native
  @JSImport("fined", JSImport.Namespace)
  @js.native
  def apply(path: String, opts: PathSpec): Result | Null = js.native
  @JSImport("fined", JSImport.Namespace)
  @js.native
  def apply(path: PathSpec): Result | Null = js.native
  @JSImport("fined", JSImport.Namespace)
  @js.native
  def apply(path: PathSpec, opts: PathSpec): Result | Null = js.native
  
  @js.native
  trait PathSpec extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var extensions: js.UndefOr[String | js.Array[String] | (StringDictionary[String | Null])] = js.native
    
    var findUp: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object PathSpec {
    
    @scala.inline
    def apply(): PathSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathSpec]
    }
    
    @scala.inline
    implicit class PathSpecMutableBuilder[Self <: PathSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExtensions(value: String | js.Array[String] | (StringDictionary[String | Null])): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFindUp(value: Boolean): Self = StObject.set(x, "findUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindUpUndefined: Self = StObject.set(x, "findUp", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var extension: String | StringDictionary[String] = js.native
    
    var path: String = js.native
  }
  object Result {
    
    @scala.inline
    def apply(extension: String | StringDictionary[String], path: String): Result = {
      val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String | StringDictionary[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
