package typings.firebaseDatabaseTypes.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var ref: Reference = js.native
  def endAt(): Query = js.native
  def endAt(value: String): Query = js.native
  def endAt(value: String, key: String): Query = js.native
  def endAt(value: Boolean): Query = js.native
  def endAt(value: Boolean, key: String): Query = js.native
  def endAt(value: Double): Query = js.native
  def endAt(value: Double, key: String): Query = js.native
  def endAt(value: Null, key: String): Query = js.native
  def equalTo(): Query = js.native
  def equalTo(value: String): Query = js.native
  def equalTo(value: String, key: String): Query = js.native
  def equalTo(value: Boolean): Query = js.native
  def equalTo(value: Boolean, key: String): Query = js.native
  def equalTo(value: Double): Query = js.native
  def equalTo(value: Double, key: String): Query = js.native
  def equalTo(value: Null, key: String): Query = js.native
  def isEqual(): Boolean = js.native
  def isEqual(other: Query): Boolean = js.native
  def limitToFirst(limit: Double): Query = js.native
  def limitToLast(limit: Double): Query = js.native
  def off(): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    context: js.Object
  ): Unit = js.native
  def off(eventType: EventType): Unit = js.native
  def off(eventType: EventType, callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    context: js.Object
  ): Unit = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Function1[/* a */ Error, _]
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Function1[/* a */ Error, _],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: Null,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def once(eventType: EventType): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def orderByChild(path: String): Query = js.native
  def orderByKey(): Query = js.native
  def orderByPriority(): Query = js.native
  def orderByValue(): Query = js.native
  def startAt(): Query = js.native
  def startAt(value: String): Query = js.native
  def startAt(value: String, key: String): Query = js.native
  def startAt(value: Boolean): Query = js.native
  def startAt(value: Boolean, key: String): Query = js.native
  def startAt(value: Double): Query = js.native
  def startAt(value: Double, key: String): Query = js.native
  def startAt(value: Null, key: String): Query = js.native
  def toJSON(): js.Object = js.native
}

