package typings.atEmotionUtils.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isBrowser: Boolean = js.native
  def getRegisteredStyles(registered: RegisteredCache, registeredStyles: js.Array[String], classNames: String): String = js.native
  def insertStyles(cache: EmotionCache, serialized: SerializedStyles, isStringTag: Boolean): String | Unit = js.native
}

