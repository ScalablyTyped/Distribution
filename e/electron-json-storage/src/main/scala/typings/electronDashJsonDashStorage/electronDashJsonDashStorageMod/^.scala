package typings.electronDashJsonDashStorage.electronDashJsonDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-json-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def clear(options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def get(key: String, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  def get(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = js.native
  def getAll(callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  def getAll(options: DataOptions, callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  def getDataPath(): String = js.native
  def getDefaultDataPath(): String = js.native
  def getMany(keys: js.Array[String], callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]): Unit = js.native
  def getMany(
    keys: js.Array[String],
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, Unit]
  ): Unit = js.native
  def has(key: String, callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]): Unit = js.native
  def has(
    key: String,
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ Boolean, Unit]
  ): Unit = js.native
  def keys(callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]): Unit = js.native
  def keys(
    options: DataOptions,
    callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[String], Unit]
  ): Unit = js.native
  def remove(key: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def remove(key: String, options: DataOptions, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def set(key: String, json: js.Object, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def set(
    key: String,
    json: js.Object,
    options: DataOptions,
    callback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def setDataPath(): Unit = js.native
  def setDataPath(directory: String): Unit = js.native
}

