package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends StObject {
  
  var getValue: js.UndefOr[js.Function0[T]] = js.native
  
  var hasValue: js.UndefOr[js.Function0[Boolean]] = js.native
  
  def subscribe(): Subscription = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ Any, Unit],
    complete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Null, error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(next: Null, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Null, error: Null, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Null, error: Unit, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Unit, error: Null, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Subscription = js.native
  def subscribe(observerOrNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(observerOrNext: Observer[T]): Subscription = js.native
}
