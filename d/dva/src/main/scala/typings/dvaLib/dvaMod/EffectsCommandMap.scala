package typings
package dvaLib.dvaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EffectsCommandMap
  extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  var call: js.Function
  var cancel: js.Function
  var select: js.Function
  var take: js.Function
  def put[A /* <: reduxLib.reduxMod.AnyAction */](action: A): js.Any
}

