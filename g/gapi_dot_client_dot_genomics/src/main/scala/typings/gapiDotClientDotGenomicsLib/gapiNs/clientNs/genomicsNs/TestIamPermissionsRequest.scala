package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestIamPermissionsRequest extends js.Object {
  /**
               * REQUIRED: The set of permissions to check for the 'resource'.
               * Permissions with wildcards (such as '&#42;' or 'storage.&#42;') are not allowed.
               * Allowed permissions are&#58;
               *
               * &#42; `genomics.datasets.create`
               * &#42; `genomics.datasets.delete`
               * &#42; `genomics.datasets.get`
               * &#42; `genomics.datasets.list`
               * &#42; `genomics.datasets.update`
               * &#42; `genomics.datasets.getIamPolicy`
               * &#42; `genomics.datasets.setIamPolicy`
               */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

