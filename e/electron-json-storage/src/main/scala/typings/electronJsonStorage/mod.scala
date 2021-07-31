package typings.electronJsonStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-json-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clear(callback: js.Function1[/* error */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def clear(options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def get(key: String, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def get(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getAll(callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getAll(options: DataOptions, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getDataPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataPath")().asInstanceOf[String]
  
  @scala.inline
  def getDefaultDataPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDataPath")().asInstanceOf[String]
  
  @scala.inline
  def getMany(keys: js.Array[String], callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getMany(
    keys: js.Array[String],
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def has(key: String, callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def has(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def keys(callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def keys(
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("keys")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def remove(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def remove(key: String, options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def set(key: String, json: js.Object, callback: js.Function1[/* error */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], json.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def set(
    key: String,
    json: js.Object,
    options: DataOptions,
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], json.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDataPath(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataPath")().asInstanceOf[Unit]
  @scala.inline
  def setDataPath(directory: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDataPath")(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait DataOptions extends StObject {
    
    var dataPath: String
  }
  object DataOptions {
    
    @scala.inline
    def apply(dataPath: String): DataOptions = {
      val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit class DataOptionsMutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
    }
  }
}
