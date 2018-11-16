package typings
package fsDashExtraDashPLib.fsDashExtraDashPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CopyOptions extends js.Object {
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    stdLib.RegExp | (js.Function2[/* file */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Boolean])
  ] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var passStats: js.UndefOr[scala.Boolean] = js.undefined
}

