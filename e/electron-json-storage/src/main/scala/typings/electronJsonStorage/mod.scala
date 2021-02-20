package typings.electronJsonStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-json-storage", "clear")
  @js.native
  def clear(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "clear")
  @js.native
  def clear(options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  @JSImport("electron-json-storage", "get")
  @js.native
  def get(key: String, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "get")
  @js.native
  def get(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = js.native
  
  @JSImport("electron-json-storage", "getAll")
  @js.native
  def getAll(callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "getAll")
  @js.native
  def getAll(options: DataOptions, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  
  @JSImport("electron-json-storage", "getDataPath")
  @js.native
  def getDataPath(): String = js.native
  
  @JSImport("electron-json-storage", "getDefaultDataPath")
  @js.native
  def getDefaultDataPath(): String = js.native
  
  @JSImport("electron-json-storage", "getMany")
  @js.native
  def getMany(keys: js.Array[String], callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "getMany")
  @js.native
  def getMany(
    keys: js.Array[String],
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = js.native
  
  @JSImport("electron-json-storage", "has")
  @js.native
  def has(key: String, callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "has")
  @js.native
  def has(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]
  ): Unit = js.native
  
  @JSImport("electron-json-storage", "keys")
  @js.native
  def keys(callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]): Unit = js.native
  @JSImport("electron-json-storage", "keys")
  @js.native
  def keys(
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]
  ): Unit = js.native
  
  @JSImport("electron-json-storage", "remove")
  @js.native
  def remove(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "remove")
  @js.native
  def remove(key: String, options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  
  @JSImport("electron-json-storage", "set")
  @js.native
  def set(key: String, json: js.Object, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  @JSImport("electron-json-storage", "set")
  @js.native
  def set(
    key: String,
    json: js.Object,
    options: DataOptions,
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("electron-json-storage", "setDataPath")
  @js.native
  def setDataPath(): Unit = js.native
  @JSImport("electron-json-storage", "setDataPath")
  @js.native
  def setDataPath(directory: String): Unit = js.native
  
  @js.native
  trait DataOptions extends StObject {
    
    var dataPath: String = js.native
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
