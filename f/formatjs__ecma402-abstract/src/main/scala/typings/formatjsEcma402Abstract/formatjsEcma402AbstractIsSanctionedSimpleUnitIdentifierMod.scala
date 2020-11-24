package typings.formatjsEcma402Abstract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/IsSanctionedSimpleUnitIdentifier", JSImport.Namespace)
@js.native
object formatjsEcma402AbstractIsSanctionedSimpleUnitIdentifierMod extends js.Object {
  
  def IsSanctionedSimpleUnitIdentifier(unitIdentifier: String): Boolean = js.native
  
  val SANCTIONED_UNITS: js.Array[String] = js.native
  
  val SIMPLE_UNITS: js.Array[String] = js.native
  
  def removeUnitNamespace(unit: String): String = js.native
}
