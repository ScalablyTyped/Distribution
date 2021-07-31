package typings.expoLinking

import typings.expoLinking.anon.Key
import typings.expoLinking.expoLinkingBooleans.`true`
import typings.expoLinking.linkingTypesMod.ParsedURL
import typings.expoLinking.linkingTypesMod.QueryParams
import typings.expoLinking.linkingTypesMod.URLListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-linking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addEventListener(`type`: String, handler: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def canOpenURL(url: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canOpenURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def getInitialURL(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialURL")().asInstanceOf[js.Promise[String | Null]]
  
  @scala.inline
  def makeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")().asInstanceOf[String]
  @scala.inline
  def makeUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def makeUrl(path: String, queryParams: QueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def makeUrl(path: Unit, queryParams: QueryParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUrl")(path.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def openSettings(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSettings")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def openURL(url: String): js.Promise[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("openURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true`]]
  
  @scala.inline
  def parse(url: String): ParsedURL = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[ParsedURL]
  
  @scala.inline
  def parseInitialURLAsync(): js.Promise[ParsedURL] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInitialURLAsync")().asInstanceOf[js.Promise[ParsedURL]]
  
  @scala.inline
  def removeEventListener(`type`: String, handler: URLListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sendIntent(action: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendIntent")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def sendIntent(action: String, extras: js.Array[Key]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendIntent")(action.asInstanceOf[js.Any], extras.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def useUrl(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useUrl")().asInstanceOf[String | Null]
}
