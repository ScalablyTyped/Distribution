package typings.fileExists

import org.scalablytyped.runtime.StringDictionary
import typings.fileExists.fileExistsStrings._empty
import typings.node.bufferMod.global.Buffer
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filepath: String, options: Options): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def apply(
    filepath: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* exists */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // Promise APIs
  inline def apply(filepath: FilePathType): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  // Callback APIs
  inline def apply(
    filepath: FilePathType,
    callback: js.Function2[/* err */ js.Error | Null, /* exists */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: FilePathType, options: FalsyRoot): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def apply(
    filepath: FilePathType,
    options: FalsyRoot,
    callback: js.Function2[/* err */ js.Error | Null, /* exists */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("file-exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(filepath: FilePathType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def sync(filepath: FilePathType, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait FalsyRoot
    extends StObject
       with /* otherKey */ StringDictionary[Any] {
    
    var root: js.UndefOr[_empty] = js.undefined
  }
  object FalsyRoot {
    
    inline def apply(): FalsyRoot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FalsyRoot]
    }
    
    extension [Self <: FalsyRoot](x: Self) {
      
      inline def setRoot(value: _empty): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type FilePathType = String | Buffer | URL
  
  trait Options
    extends StObject
       with /* otherKey */ StringDictionary[Any] {
    
    var root: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
