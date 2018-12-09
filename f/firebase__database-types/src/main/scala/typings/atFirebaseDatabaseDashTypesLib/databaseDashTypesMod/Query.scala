package typings
package atFirebaseDatabaseDashTypesLib.databaseDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  var ref: Reference = js.native
  def endAt(): Query = js.native
  def endAt(value: java.lang.String): Query = js.native
  def endAt(value: java.lang.String, key: java.lang.String): Query = js.native
  def endAt(value: scala.Boolean): Query = js.native
  def endAt(value: scala.Boolean, key: java.lang.String): Query = js.native
  def endAt(value: scala.Double): Query = js.native
  def endAt(value: scala.Double, key: java.lang.String): Query = js.native
  def endAt(value: scala.Null, key: java.lang.String): Query = js.native
  def equalTo(): Query = js.native
  def equalTo(value: java.lang.String): Query = js.native
  def equalTo(value: java.lang.String, key: java.lang.String): Query = js.native
  def equalTo(value: scala.Boolean): Query = js.native
  def equalTo(value: scala.Boolean, key: java.lang.String): Query = js.native
  def equalTo(value: scala.Double): Query = js.native
  def equalTo(value: scala.Double, key: java.lang.String): Query = js.native
  def equalTo(value: scala.Null, key: java.lang.String): Query = js.native
  def isEqual(): scala.Boolean = js.native
  def isEqual(other: Query): scala.Boolean = js.native
  def limitToFirst(limit: scala.Double): Query = js.native
  def limitToLast(limit: scala.Double): Query = js.native
  def off(): js.Any = js.native
  def off(eventType: atFirebaseDatabaseDashTypesLib.EventType): js.Any = js.native
  def off(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String | scala.Null], _]
  ): js.Any = js.native
  def off(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String | scala.Null], _],
    context: js.Object
  ): js.Any = js.native
  def on(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _]
  ): js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _] = js.native
  def on(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _],
    cancelCallbackOrContext: js.Object
  ): js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _] = js.native
  def on(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _],
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _] = js.native
  def on(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    callback: js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _],
    cancelCallbackOrContext: scala.Null,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | scala.Null, /* b */ js.UndefOr[java.lang.String], _] = js.native
  def once(eventType: atFirebaseDatabaseDashTypesLib.EventType): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String], _]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String], _],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String], _],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: atFirebaseDatabaseDashTypesLib.EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[java.lang.String], _],
    failureCallbackOrContext: scala.Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def orderByChild(path: java.lang.String): Query = js.native
  def orderByKey(): Query = js.native
  def orderByPriority(): Query = js.native
  def orderByValue(): Query = js.native
  def startAt(): Query = js.native
  def startAt(value: java.lang.String): Query = js.native
  def startAt(value: java.lang.String, key: java.lang.String): Query = js.native
  def startAt(value: scala.Boolean): Query = js.native
  def startAt(value: scala.Boolean, key: java.lang.String): Query = js.native
  def startAt(value: scala.Double): Query = js.native
  def startAt(value: scala.Double, key: java.lang.String): Query = js.native
  def startAt(value: scala.Null, key: java.lang.String): Query = js.native
  def toJSON(): js.Object = js.native
}

