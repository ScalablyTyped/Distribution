package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.InsertContent
import typings.expoConfigureSplashScreen.anon.ReplaceContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringUtilsMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/string-utils", "insert")
  @js.native
  def insert(content: String, hasInsertContentInsertPattern: InsertContent): js.Tuple2[Boolean, String] = js.native
  @JSImport("@expo/configure-splash-screen/build/utils/string-utils", "insert")
  @js.native
  def insert(content: String, hasInsertContentInsertPattern: InsertContent, insertBeforeLastOccurrence: Boolean): js.Tuple2[Boolean, String] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/utils/string-utils", "replace")
  @js.native
  def replace(content: String, hasReplaceContentReplacePattern: ReplaceContent): js.Tuple2[Boolean, String] = js.native
}
