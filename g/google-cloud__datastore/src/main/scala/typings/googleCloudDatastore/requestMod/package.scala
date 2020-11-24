package typings.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object requestMod {
  
  type AllocateIdsCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* keys */ js.Array[typings.googleCloudDatastore.entityMod.DatastoreKey], 
    scala.Unit
  ]
  
  type AllocateIdsResult = js.Array[js.Array[typings.googleCloudDatastore.entityMod.DatastoreKey]]
  
  type CommitCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* result */ typings.googleCloudDatastore.requestMod.CommitResponse, 
    scala.Unit
  ]
  
  type CommitResult = js.Array[typings.googleCloudDatastore.requestMod.CommitResponse]
  
  type GetCallback[T] = js.Function2[/* err */ typings.std.Error, /* entity */ T, scala.Unit]
}
