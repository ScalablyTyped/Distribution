package typings.fileLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * @param url
    * @param resourcePath original absolute path to the asset
    * @param context directory where assets are stored (`rootContext`), or the value of the `context` option if set.
    *
    * @return the path to use for the asset
    */
  type BuildResourcePathFn = js.Function3[
    /* url */ java.lang.String, 
    /* resourcePath */ java.lang.String, 
    /* context */ java.lang.String, 
    java.lang.String
  ]
}
