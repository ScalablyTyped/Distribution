package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.inspectedWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.inspectedWindow types */
/** A resource within the inspected page, such as a document, a script, or an image. */
trait Resource extends js.Object {
  /**
    * Gets the content of the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var getContent: js.UndefOr[js.Function0[js.Promise[js.Object]]] = js.undefined
  /**
    * Sets the content of the resource.
    * @param content New content of the resource. Only resources with the text type are currently supported.
    * @param commit True if the user has finished editing the resource, and the new content of the resource should
    *     be persisted; false if this is a minor change sent in progress of the user editing the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var setContent: js.UndefOr[
    js.Function2[/* content */ java.lang.String, /* commit */ scala.Boolean, js.Promise[_]]
  ] = js.undefined
  /** The URL of the resource. */
  var url: java.lang.String
}

