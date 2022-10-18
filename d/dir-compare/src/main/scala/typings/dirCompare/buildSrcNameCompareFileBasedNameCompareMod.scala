package typings.dirCompare

import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcNameCompareStringCompareResultMod.StringCompareResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNameCompareFileBasedNameCompareMod {
  
  @JSImport("dir-compare/build/src/NameCompare/fileBasedNameCompare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileBasedNameCompare(name1: String, name2: String, options: ExtOptions): StringCompareResult = (^.asInstanceOf[js.Dynamic].applyDynamic("fileBasedNameCompare")(name1.asInstanceOf[js.Any], name2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringCompareResult]
}
