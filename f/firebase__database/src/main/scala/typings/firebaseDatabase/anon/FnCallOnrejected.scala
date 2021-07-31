package typings.firebaseDatabase.anon

import typings.firebaseDatabase.referenceMod.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOnrejected extends StObject {
  
  def apply[TResult](): js.Promise[Reference | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Reference | TResult] = js.native
}
