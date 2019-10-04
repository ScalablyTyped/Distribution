package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends EObject {
  var rev: String = js.native
  def add(value: EObject): Unit = js.native
  def addAll(values: js.Array[EObject]): EObject = js.native
  def clear(): EList = js.native
  def each(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ EList, Unit]): Unit = js.native
  def each(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ EList, Unit],
    context: js.Any
  ): Unit = js.native
  def load(res: js.Any): Unit = js.native
  def parse(data: EObject): js.Any = js.native
  def parse(data: EObject, loader: js.Function0[Unit]): js.Any = js.native
  def remove(): Unit = js.native
  def save(callback: js.Function0[Unit], options: js.Any): Unit = js.native
  def to(): js.Any = js.native
}

