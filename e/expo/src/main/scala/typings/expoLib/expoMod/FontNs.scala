package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Font")
@js.native
object FontNs extends js.Object {
  
  trait FontMap
    extends /* name */ ScalablyTyped.runtime.StringDictionary[expoLib.expoMod.RequireSource]
  
  def loadAsync(map: FontMap): stdLib.Promise[scala.Unit] = js.native
  def loadAsync(name: java.lang.String, url: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

