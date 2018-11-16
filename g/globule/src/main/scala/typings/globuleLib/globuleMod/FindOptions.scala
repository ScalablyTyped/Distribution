package typings
package globuleLib.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindOptions
  extends globLib.globMod.GNs.IOptions {
  var filter: js.UndefOr[
    java.lang.String | (js.Function2[
      /* filepath */ js.UndefOr[java.lang.String], 
      /* options */ js.UndefOr[js.Any], 
      scala.Boolean
    ])
  ] = js.undefined
  var prefixBase: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var srcBase: js.UndefOr[java.lang.String] = js.undefined
}

