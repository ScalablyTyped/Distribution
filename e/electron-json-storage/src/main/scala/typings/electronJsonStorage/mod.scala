package typings.electronJsonStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-json-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def clear(options: DataOptions, callback: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(key: String, callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAll(callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getAll(options: DataOptions, callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDataPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataPath")().asInstanceOf[String]
  
  inline def getDefaultDataPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDataPath")().asInstanceOf[String]
  
  inline def getMany(keys: js.Array[String], callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getMany(
    keys: js.Array[String],
    options: DataOptions,
    callback: js.Function2[/* error */ Any, /* data */ js.Object, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getSync(key: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getSync(key: String, options: DataOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def has(key: String, callback: js.Function2[/* error */ Any, /* hasKey */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def has(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ Any, /* hasKey */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def keys(callback: js.Function2[/* error */ Any, /* keys */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def keys(options: DataOptions, callback: js.Function2[/* error */ Any, /* keys */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keys")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove(key: String, callback: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def remove(key: String, options: DataOptions, callback: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def set(key: String, json: js.Object, callback: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], json.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(key: String, json: js.Object, options: DataOptions, callback: js.Function1[/* error */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDataPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataPath")().asInstanceOf[Unit]
  inline def setDataPath(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataPath")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DataOptions extends StObject {
    
    var dataPath: String
  }
  object DataOptions {
    
    inline def apply(dataPath: String): DataOptions = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataOptions]
    }
    
    extension [Self <: DataOptions](x: Self) {
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
    }
  }
}
