package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait legendOptions extends js.Object {
                  //number of pixels or [x margin, y margin]
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
         //null or color
  var backgroundOpacity: js.UndefOr[scala.Double] = js.undefined
    // between 0 and 1
  var container: js.UndefOr[jqueryLib.JQuery[stdLib.HTMLElement]] = js.undefined
   //  null or (fn: string, series object -> string)
  var labelBoxBorderColor: js.UndefOr[js.Any] = js.undefined
  var labelFormatter: js.UndefOr[
    js.Function2[/* label */ java.lang.String, /* series */ js.Any, java.lang.String]
  ] = js.undefined
             //"ne" or "nw" or "se" or "sw"
  var margin: js.UndefOr[js.Any] = js.undefined
     //color
  var noColumns: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
           // null or jQuery object/DOM element/jQuery expression
  var sorted: js.UndefOr[js.Any] = js.undefined
}

