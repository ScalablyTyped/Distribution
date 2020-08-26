package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.InsertContent
import typings.expoConfigureSplashScreen.anon.ReplaceContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/configure-splash-screen/build/string-helpers", JSImport.Namespace)
@js.native
object stringHelpersMod extends js.Object {
  def insert(content: String, hasInsertContentInsertPattern: InsertContent): js.Tuple2[Boolean, String] = js.native
  def insert(content: String, hasInsertContentInsertPattern: InsertContent, insertBeforeLastOccurrence: Boolean): js.Tuple2[Boolean, String] = js.native
  def replace(content: String, hasReplaceContentReplacePattern: ReplaceContent): js.Tuple2[Boolean, String] = js.native
}

