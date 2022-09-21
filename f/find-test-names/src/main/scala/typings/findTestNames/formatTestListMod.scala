package typings.findTestNames

import typings.findTestNames.mod.Suite
import typings.findTestNames.mod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTestListMod {
  
  @JSImport("find-test-names/format-test-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTestList(tests: js.Array[Test | Suite]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestList")(tests.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTestList(tests: js.Array[Test | Suite], indent: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestList")(tests.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
}
