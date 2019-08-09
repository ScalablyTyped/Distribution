package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EList extends EObject {
  def add(eObject: EObject): EList = js.native
  def addAll(args: js.Array[EObject]): EList = js.native
  def addAll(args: EObject): EList = js.native
  def array(): js.Array[EObject] = js.native
  def at(position: Double): EObject = js.native
  def contains(eObject: EObject): Boolean = js.native
  def each(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Unit]): Unit = js.native
  def each(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Unit],
    context: js.Any
  ): Unit = js.native
  def filter(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
  def filter(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
    context: js.Any
  ): js.Array[EObject] = js.native
  def find(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
  def find(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
    context: js.Any
  ): js.Array[EObject] = js.native
  def first(): EObject = js.native
  def indexOf(eObject: EObject): Double = js.native
  def last(): EObject = js.native
  def map(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, _]): js.Array[_] = js.native
  def map(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, _],
    context: js.Any
  ): js.Array[_] = js.native
  def reject(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
  def reject(
    iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
    context: js.Any
  ): js.Array[EObject] = js.native
  def remove(eObject: EObject): EList = js.native
  def rest(position: Double): js.Array[EObject] = js.native
  def size(): Double = js.native
}

