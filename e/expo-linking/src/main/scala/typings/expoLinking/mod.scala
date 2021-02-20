package typings.expoLinking

import typings.expoLinking.anon.Key
import typings.expoLinking.expoLinkingBooleans.`true`
import typings.expoLinking.linkingTypesMod.ParsedURL
import typings.expoLinking.linkingTypesMod.QueryParams
import typings.expoLinking.linkingTypesMod.URLListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-linking", "addEventListener")
  @js.native
  def addEventListener(`type`: String, handler: URLListener): Unit = js.native
  
  @JSImport("expo-linking", "canOpenURL")
  @js.native
  def canOpenURL(url: String): js.Promise[Boolean] = js.native
  
  @JSImport("expo-linking", "getInitialURL")
  @js.native
  def getInitialURL(): js.Promise[String | Null] = js.native
  
  @JSImport("expo-linking", "makeUrl")
  @js.native
  def makeUrl(): String = js.native
  @JSImport("expo-linking", "makeUrl")
  @js.native
  def makeUrl(path: js.UndefOr[scala.Nothing], queryParams: QueryParams): String = js.native
  @JSImport("expo-linking", "makeUrl")
  @js.native
  def makeUrl(path: String): String = js.native
  @JSImport("expo-linking", "makeUrl")
  @js.native
  def makeUrl(path: String, queryParams: QueryParams): String = js.native
  
  @JSImport("expo-linking", "openSettings")
  @js.native
  def openSettings(): js.Promise[Unit] = js.native
  
  @JSImport("expo-linking", "openURL")
  @js.native
  def openURL(url: String): js.Promise[`true`] = js.native
  
  @JSImport("expo-linking", "parse")
  @js.native
  def parse(url: String): ParsedURL = js.native
  
  @JSImport("expo-linking", "parseInitialURLAsync")
  @js.native
  def parseInitialURLAsync(): js.Promise[ParsedURL] = js.native
  
  @JSImport("expo-linking", "removeEventListener")
  @js.native
  def removeEventListener(`type`: String, handler: URLListener): Unit = js.native
  
  @JSImport("expo-linking", "sendIntent")
  @js.native
  def sendIntent(action: String): js.Promise[Unit] = js.native
  @JSImport("expo-linking", "sendIntent")
  @js.native
  def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
  
  @JSImport("expo-linking", "useUrl")
  @js.native
  def useUrl(): String | Null = js.native
}
