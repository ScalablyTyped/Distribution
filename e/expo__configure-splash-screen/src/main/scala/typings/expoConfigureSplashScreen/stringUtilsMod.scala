package typings.expoConfigureSplashScreen

import typings.expoConfigureSplashScreen.anon.InsertContent
import typings.expoConfigureSplashScreen.anon.ReplaceContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringUtilsMod {
  
  @JSImport("@expo/configure-splash-screen/build/utils/string-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def insert(content: String, hasInsertContentInsertPattern: InsertContent): js.Tuple2[Boolean, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any], hasInsertContentInsertPattern.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, String]]
  @scala.inline
  def insert(content: String, hasInsertContentInsertPattern: InsertContent, insertBeforeLastOccurrence: Boolean): js.Tuple2[Boolean, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(content.asInstanceOf[js.Any], hasInsertContentInsertPattern.asInstanceOf[js.Any], insertBeforeLastOccurrence.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, String]]
  
  @scala.inline
  def replace(content: String, hasReplaceContentReplacePattern: ReplaceContent): js.Tuple2[Boolean, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(content.asInstanceOf[js.Any], hasReplaceContentReplacePattern.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, String]]
}
