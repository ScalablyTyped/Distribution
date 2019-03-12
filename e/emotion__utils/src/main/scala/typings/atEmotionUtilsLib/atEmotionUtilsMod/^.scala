package typings
package atEmotionUtilsLib.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isBrowser: scala.Boolean = js.native
  def getRegisteredStyles(
    registered: RegisteredCache,
    registeredStyles: js.Array[java.lang.String],
    classNames: java.lang.String
  ): java.lang.String = js.native
  def insertStyles(cache: EmotionCache, serialized: SerializedStyles, isStringTag: scala.Boolean): java.lang.String | scala.Unit = js.native
}

