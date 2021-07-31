package typings.dirGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(input: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(input: js.Array[String]): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(input: js.Array[String], options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("dir-glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(input: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(input: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def sync(input: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
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
