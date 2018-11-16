package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  def destroy(): scala.Unit = js.native
  def destroy(callback: DynogelsItemCallback): scala.Unit = js.native
  def destroy(options: DestroyItemOptions): scala.Unit = js.native
  def destroy(options: DestroyItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
  def get(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def get(key: java.lang.String): js.Any = js.native
  def save(): scala.Unit = js.native
  def save(callback: DynogelsItemCallback): scala.Unit = js.native
  def set(params: js.Object): Item = js.native
  def toJSON(): js.Any = js.native
  def toPlainObject(): js.Any = js.native
  def update(): scala.Unit = js.native
  def update(callback: DynogelsItemCallback): scala.Unit = js.native
  def update(options: UpdateItemOptions): scala.Unit = js.native
  def update(options: UpdateItemOptions, callback: DynogelsItemCallback): scala.Unit = js.native
}

