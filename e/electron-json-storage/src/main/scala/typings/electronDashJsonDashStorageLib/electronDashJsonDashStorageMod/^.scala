package typings
package electronDashJsonDashStorageLib.electronDashJsonDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-json-storage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clear(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def clear(
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(
    key: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def get(
    key: java.lang.String,
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getAll(callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]): scala.Unit = js.native
  def getAll(
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getDataPath(): java.lang.String = js.native
  def getDefaultDataPath(): java.lang.String = js.native
  def getMany(
    keys: js.Array[java.lang.String],
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def getMany(
    keys: js.Array[java.lang.String],
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function2[/* error */ js.Any, /* data */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def has(
    key: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def has(
    key: java.lang.String,
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function2[/* error */ js.Any, /* hasKey */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def keys(callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def keys(
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function2[/* error */ js.Any, /* keys */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def remove(key: java.lang.String, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def remove(
    key: java.lang.String,
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def set(key: java.lang.String, json: js.Object, callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  def set(
    key: java.lang.String,
    json: js.Object,
    options: electronDashJsonDashStorageLib.electronDashJsonDashStorageMod.DataOptions,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def setDataPath(): scala.Unit = js.native
  def setDataPath(directory: java.lang.String): scala.Unit = js.native
}

