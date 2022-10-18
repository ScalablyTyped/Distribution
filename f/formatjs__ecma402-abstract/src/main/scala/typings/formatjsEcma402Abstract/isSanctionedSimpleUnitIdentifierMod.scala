package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSanctionedSimpleUnitIdentifierMod {
  
  @JSImport("@formatjs/ecma402-abstract/IsSanctionedSimpleUnitIdentifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def IsSanctionedSimpleUnitIdentifier(unitIdentifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSanctionedSimpleUnitIdentifier")(unitIdentifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@formatjs/ecma402-abstract/IsSanctionedSimpleUnitIdentifier", "SANCTIONED_UNITS")
  @js.native
  val SANCTIONED_UNITS: js.Array[String] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/IsSanctionedSimpleUnitIdentifier", "SIMPLE_UNITS")
  @js.native
  val SIMPLE_UNITS: js.Array[String] = js.native
  
  inline def removeUnitNamespace(unit: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUnitNamespace")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
}
