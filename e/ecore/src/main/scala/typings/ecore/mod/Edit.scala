package typings.ecore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  def childDescriptors(`object`: EObject): js.Array[EObject]
  def childTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject]
  def choiceOfValues(owner: EObject, feature: EObject): js.Array[EObject]
  def siblingDescriptors(`object`: EObject): js.Array[EObject]
  def siblingTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject]
}

@JSImport("ecore", "Edit")
@js.native
object Edit extends TopLevel[Edit]

