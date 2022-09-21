package typings.findConfig

import typings.findConfig.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String | Null]
  inline def apply(filename: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(filename: String, options: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(filename: Unit, options: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("find-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def obj(): Cwd | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")().asInstanceOf[Cwd | Null]
  inline def obj(filename: String): Cwd | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(filename.asInstanceOf[js.Any]).asInstanceOf[Cwd | Null]
  inline def obj(filename: String, options: Options): Cwd | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cwd | Null]
  inline def obj(filename: Unit, options: Options): Cwd | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cwd | Null]
  
  inline def read(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[String | Null]
  inline def read(filename: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(filename.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def read(filename: String, options: ReadOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def read(filename: Unit, options: ReadOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def require(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")().asInstanceOf[Any]
  inline def require(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def require(filename: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def require(filename: Unit, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var home: js.UndefOr[Boolean] = js.undefined
    
    var module: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setHome(value: Boolean): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  trait ReadOptions
    extends StObject
       with Options {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
}
