package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends StObject {
  
  def subscribe(): Subscription = js.native
  def subscribe(observer: Observer[T]): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(
    onNext: js.Function1[/* value */ T, Unit],
    onError: js.Function1[/* error */ Any, Unit],
    onComplete: js.Function0[Unit]
  ): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: Null, onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: js.Function1[/* value */ T, Unit], onError: Unit, onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Null, onError: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(onNext: Null, onError: js.Function1[/* error */ Any, Unit], onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Null, onError: Null, onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Null, onError: Unit, onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Unit, onError: js.Function1[/* error */ Any, Unit]): Subscription = js.native
  def subscribe(onNext: Unit, onError: js.Function1[/* error */ Any, Unit], onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Unit, onError: Null, onComplete: js.Function0[Unit]): Subscription = js.native
  def subscribe(onNext: Unit, onError: Unit, onComplete: js.Function0[Unit]): Subscription = js.native
}
