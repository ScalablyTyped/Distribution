package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SourcesOptions extends js.Object {
  /**
       * The size that the media source thumbnail should be scaled to. Default is 150 x
       * 150.
       */
  var thumbnailSize: js.UndefOr[Size] = js.undefined
  /**
       * An array of Strings that lists the types of desktop sources to be captured,
       * available types are screen and window.
       */
  var types: js.Array[java.lang.String]
}

