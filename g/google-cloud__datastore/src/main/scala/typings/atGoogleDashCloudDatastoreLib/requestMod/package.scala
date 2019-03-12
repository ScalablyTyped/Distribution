package typings
package atGoogleDashCloudDatastoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestMod {
  type AllocateIdsCallback = js.Function2[
    /* err */ stdLib.Error, 
    /* keys */ js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey], 
    scala.Unit
  ]
  type AllocateIdsResult = js.Array[js.Array[atGoogleDashCloudDatastoreLib.entityMod.DatastoreKey]]
  type CommitCallback = js.Function2[/* err */ stdLib.Error, /* result */ CommitResponse, scala.Unit]
  type CommitResult = js.Array[CommitResponse]
  type GetCallback[T] = js.Function2[/* err */ stdLib.Error, /* entity */ T, scala.Unit]
}
