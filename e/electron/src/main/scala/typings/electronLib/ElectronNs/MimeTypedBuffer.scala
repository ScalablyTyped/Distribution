package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MimeTypedBuffer extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/mime-typed-buffer
  /**
       * The actual Buffer content
       */
  var data: nodeLib.Buffer
  /**
       * The mimeType of the Buffer that you are sending
       */
  var mimeType: java.lang.String
}

