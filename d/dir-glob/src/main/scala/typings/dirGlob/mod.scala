package typings.dirGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dir-glob", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[js.Array[String]] = js.native
  @JSImport("dir-glob", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[js.Array[String]] = js.native
  @JSImport("dir-glob", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String]): js.Promise[js.Array[String]] = js.native
  @JSImport("dir-glob", JSImport.Namespace)
  @js.native
  def apply(input: js.Array[String], options: Options): js.Promise[js.Array[String]] = js.native
  
  @JSImport("dir-glob", "sync")
  @js.native
  def sync(input: String): js.Array[String] = js.native
  @JSImport("dir-glob", "sync")
  @js.native
  def sync(input: String, options: Options): js.Array[String] = js.native
  @JSImport("dir-glob", "sync")
  @js.native
  def sync(input: js.Array[String]): js.Array[String] = js.native
  @JSImport("dir-glob", "sync")
  @js.native
  def sync(input: js.Array[String], options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var files: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
}
