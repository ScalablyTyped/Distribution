package typings.ecore.ecoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPackageRegistry extends EObject {
  def ePackages(): js.Array[EPackage] = js.native
  def register(ePackage: EPackage): Unit = js.native
}

