package typings.firebase.mod.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object functions {
  
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    js.Promise[typings.firebase.mod.firebase.functions.HttpsCallableResult]
  ]
}
