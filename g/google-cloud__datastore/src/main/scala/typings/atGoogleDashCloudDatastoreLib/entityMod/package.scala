package typings
package atGoogleDashCloudDatastoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object entityMod {
  /**
    * DatastoreKeyPath is structured as [kind, identifier, kind, identifier, ...]
    * `kind` must be a string, `identifier` is a PathElement
    */
  type DatastoreKeyPath = js.Array[PathElement]
  type KEY_SYMBOL = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Datastore.KEY */ js.Any
  /**
    * NB: TS does not support computed symbol keys (yet: https://github.com/Microsoft/TypeScript/pull/15473)
    * If using a raw T object, it MUST have a {@link Datastore_#KEY} symbol property of type {@link DatastoreKey}.
    */
  type ObjOrPayload[T] = T | DatastorePayload[T]
  type OneOrMany[T] = ObjOrPayload[T] | js.Array[ObjOrPayload[T]]
  type PathElement = java.lang.String | scala.Double | DatastoreInt
}
