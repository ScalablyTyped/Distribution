package typings.atGoogleDashCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  import typings.atGoogleDashCloudDatastore.entityMod.DatastoreKey
  import typings.std.Error

  type AllocateIdsCallback = js.Function2[/* err */ Error, /* keys */ js.Array[DatastoreKey], Unit]
  type AllocateIdsResult = js.Array[js.Array[DatastoreKey]]
  type CommitCallback = js.Function2[/* err */ Error, /* result */ CommitResponse, Unit]
  type CommitResult = js.Array[CommitResponse]
  type GetCallback[T] = js.Function2[/* err */ Error, /* entity */ T, Unit]
}
