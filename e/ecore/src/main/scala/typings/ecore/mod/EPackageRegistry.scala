package typings.ecore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EPackageRegistry extends EObject {
  
  var Registry: EPackageRegistry = js.native
  
  def ePackages(): js.Array[EPackage] = js.native
  
  def elements(`type`: EObject): js.Array[EObject] = js.native
  
  def getEPackage(nsURI: String): EPackage = js.native
  
  def register(ePackage: EPackage): Unit = js.native
}
@JSImport("ecore", "EPackageRegistry")
@js.native
object EPackageRegistry extends TopLevel[EPackageRegistry]
