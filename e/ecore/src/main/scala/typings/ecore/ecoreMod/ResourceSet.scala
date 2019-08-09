package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSet extends EObject {
  def elements(): js.Array[EObject] = js.native
  def elements(`type`: String): js.Array[EObject] = js.native
  def elements(`type`: EClass): js.Array[EObject] = js.native
  def parse(data: EObject): Unit = js.native
  def toJSON(): js.Any = js.native
}

