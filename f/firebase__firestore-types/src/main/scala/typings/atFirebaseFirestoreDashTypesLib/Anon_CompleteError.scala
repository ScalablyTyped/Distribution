package typings
package atFirebaseFirestoreDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompleteError extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var next: js.UndefOr[
    js.Function1[
      /* snapshot */ atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.DocumentSnapshot, 
      scala.Unit
    ]
  ] = js.undefined
}

