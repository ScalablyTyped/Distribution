package typings.fileDashLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileDashLoaderMod {
  /**
    * @param url
    * @param resourcePath original absolute path to the asset
    * @param context directory where assets are stored (`rootContext`), or the value of the `context` option if set.
    *
    * @return the path to use for the asset
    */
  type BuildResourcePathFn = js.Function3[/* url */ String, /* resourcePath */ String, /* context */ String, String]
}
