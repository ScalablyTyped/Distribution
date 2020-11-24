package typings.expoLinking

import typings.expoLinking.anon.Key
import typings.expoLinking.expoLinkingBooleans.`true`
import typings.expoLinking.linkingTypesMod.ParsedURL
import typings.expoLinking.linkingTypesMod.QueryParams
import typings.expoLinking.linkingTypesMod.URLListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-linking", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addEventListener(`type`: String, handler: URLListener): Unit = js.native
  
  def canOpenURL(url: String): js.Promise[Boolean] = js.native
  
  def getInitialURL(): js.Promise[String | Null] = js.native
  
  def makeUrl(): String = js.native
  def makeUrl(path: js.UndefOr[scala.Nothing], queryParams: QueryParams): String = js.native
  def makeUrl(path: String): String = js.native
  def makeUrl(path: String, queryParams: QueryParams): String = js.native
  
  def openSettings(): js.Promise[Unit] = js.native
  
  def openURL(url: String): js.Promise[`true`] = js.native
  
  def parse(url: String): ParsedURL = js.native
  
  def parseInitialURLAsync(): js.Promise[ParsedURL] = js.native
  
  def removeEventListener(`type`: String, handler: URLListener): Unit = js.native
  
  def sendIntent(action: String): js.Promise[Unit] = js.native
  def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = js.native
  
  def useUrl(): String | Null = js.native
}
