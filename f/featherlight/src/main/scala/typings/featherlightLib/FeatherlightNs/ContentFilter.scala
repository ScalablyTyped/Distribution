package typings
package featherlightLib.FeatherlightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentFilter extends js.Object {
  var process: js.UndefOr[
    js.Function1[
      /* data */ featherlightLib.JQuery | java.lang.String, 
      featherlightLib.JQuery | jqueryLib.JQueryPromise[featherlightLib.JQuery]
    ]
  ] = js.undefined
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  var test: js.UndefOr[
    js.Function1[/* data */ featherlightLib.JQuery | java.lang.String, scala.Boolean]
  ] = js.undefined
}

