package typings.ecore.ecoreMod

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

object Edit {
  @scala.inline
  def apply(
    childDescriptors: EObject => js.Array[EObject],
    childTypes: (EObject, js.Any) => js.Array[EObject],
    choiceOfValues: (EObject, EObject) => js.Array[EObject],
    siblingDescriptors: EObject => js.Array[EObject],
    siblingTypes: (EObject, js.Any) => js.Array[EObject]
  ): Edit = {
    val __obj = js.Dynamic.literal(childDescriptors = js.Any.fromFunction1(childDescriptors), childTypes = js.Any.fromFunction2(childTypes), choiceOfValues = js.Any.fromFunction2(choiceOfValues), siblingDescriptors = js.Any.fromFunction1(siblingDescriptors), siblingTypes = js.Any.fromFunction2(siblingTypes))
  
    __obj.asInstanceOf[Edit]
  }
}

