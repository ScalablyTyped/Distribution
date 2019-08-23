package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPackageRegistry extends EObject {
  var Registry: EPackageRegistry = js.native
  def ePackages(): js.Array[EPackage] = js.native
  def elements(`type`: EObject): js.Array[EObject] = js.native
  def getEPackage(nsURI: String): EPackage = js.native
  def register(ePackage: EPackage): Unit = js.native
}

