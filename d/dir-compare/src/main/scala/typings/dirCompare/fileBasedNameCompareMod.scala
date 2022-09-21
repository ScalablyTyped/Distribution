package typings.dirCompare

import typings.dirCompare.extOptionsMod.ExtOptions
import typings.dirCompare.stringCompareResultMod.StringCompareResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileBasedNameCompareMod {
  
  @JSImport("dir-compare/build/src/NameCompare/fileBasedNameCompare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileBasedNameCompare(name1: String, name2: String, options: ExtOptions): StringCompareResult = (^.asInstanceOf[js.Dynamic].applyDynamic("fileBasedNameCompare")(name1.asInstanceOf[js.Any], name2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringCompareResult]
}
