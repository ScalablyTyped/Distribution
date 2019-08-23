package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EObject extends js.Object {
  var _id: String = js.native
  var eClass: EClass = js.native
  var eContainer: EObject = js.native
  def create(attributes: js.Any): EObject = js.native
  def eContents(): js.Array[EObject] = js.native
  def eResource(): Resource = js.native
  def eURI(): String = js.native
  def fragment(): String = js.native
  def get(feature: String): js.Any = js.native
  def getEObject(uri: String): EObject = js.native
  def getEStructuralFeature(feature: String): js.Any = js.native
  def getEStructuralFeature(feature: EObject): js.Any = js.native
  def has(name: String): Boolean = js.native
  def isKindOf(`type`: String): js.Any = js.native
  def isKindOf(`type`: EObject): js.Any = js.native
  def isSet(name: String): Boolean = js.native
  def isTypeOf(`type`: String): js.Any = js.native
  def isTypeOf(`type`: EObject): js.Any = js.native
  def set(attrs: js.Any, options: js.Any): EObject = js.native
  def setEClass(eClass: EClass): Unit = js.native
  def unset(attrs: js.Any, options: js.Any): EObject = js.native
}

