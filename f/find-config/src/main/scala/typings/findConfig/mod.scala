package typings.findConfig

import typings.findConfig.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-config", JSImport.Namespace)
  @js.native
  def apply(): String | Null = js.native
  @JSImport("find-config", JSImport.Namespace)
  @js.native
  def apply(filename: js.UndefOr[scala.Nothing], options: Options): String | Null = js.native
  @JSImport("find-config", JSImport.Namespace)
  @js.native
  def apply(filename: String): String | Null = js.native
  @JSImport("find-config", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: Options): String | Null = js.native
  
  @JSImport("find-config", "obj")
  @js.native
  def obj(): Cwd | Null = js.native
  @JSImport("find-config", "obj")
  @js.native
  def obj(filename: js.UndefOr[scala.Nothing], options: Options): Cwd | Null = js.native
  @JSImport("find-config", "obj")
  @js.native
  def obj(filename: String): Cwd | Null = js.native
  @JSImport("find-config", "obj")
  @js.native
  def obj(filename: String, options: Options): Cwd | Null = js.native
  
  @JSImport("find-config", "read")
  @js.native
  def read(): String | Null = js.native
  @JSImport("find-config", "read")
  @js.native
  def read(filename: js.UndefOr[scala.Nothing], options: ReadOptions): String | Null = js.native
  @JSImport("find-config", "read")
  @js.native
  def read(filename: String): String | Null = js.native
  @JSImport("find-config", "read")
  @js.native
  def read(filename: String, options: ReadOptions): String | Null = js.native
  
  @JSImport("find-config", "require")
  @js.native
  def require(): js.Any = js.native
  @JSImport("find-config", "require")
  @js.native
  def require(filename: js.UndefOr[scala.Nothing], options: Options): js.Any = js.native
  @JSImport("find-config", "require")
  @js.native
  def require(filename: String): js.Any = js.native
  @JSImport("find-config", "require")
  @js.native
  def require(filename: String, options: Options): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var dot: js.UndefOr[Boolean] = js.native
    
    var home: js.UndefOr[Boolean] = js.native
    
    var module: js.UndefOr[Boolean] = js.native
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
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setHome(value: Boolean): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  @js.native
  trait ReadOptions extends Options {
    
    var encoding: js.UndefOr[String] = js.native
    
    var flag: js.UndefOr[String] = js.native
  }
  object ReadOptions {
    
    @scala.inline
    def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
}
