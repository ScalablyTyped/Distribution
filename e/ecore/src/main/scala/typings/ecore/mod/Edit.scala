package typings.ecore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  def childDescriptors(`object`: EObject): js.Array[EObject] = js.native
  def childTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject] = js.native
  def choiceOfValues(owner: EObject, feature: EObject): js.Array[EObject] = js.native
  def siblingDescriptors(`object`: EObject): js.Array[EObject] = js.native
  def siblingTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject] = js.native
}

@JSImport("ecore", "Edit")
@js.native
object Edit extends TopLevel[Edit]

