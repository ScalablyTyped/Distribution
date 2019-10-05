package typings.ecore.ecoreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EPackage extends EObject {
  var Registry: EPackageRegistry = js.native
}

@JSImport("ecore", "EPackage")
@js.native
object EPackage extends TopLevel[EPackage]

