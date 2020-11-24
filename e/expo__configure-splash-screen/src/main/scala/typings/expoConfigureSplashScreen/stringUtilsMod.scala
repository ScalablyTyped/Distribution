package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.InsertContent
import typings.expoConfigureSplashScreen.anon.ReplaceContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/utils/string-utils", JSImport.Namespace)
@js.native
object stringUtilsMod extends js.Object {
  
  def insert(content: String, hasInsertContentInsertPattern: InsertContent): js.Tuple2[Boolean, String] = js.native
  def insert(content: String, hasInsertContentInsertPattern: InsertContent, insertBeforeLastOccurrence: Boolean): js.Tuple2[Boolean, String] = js.native
  
  def replace(content: String, hasReplaceContentReplacePattern: ReplaceContent): js.Tuple2[Boolean, String] = js.native
}
