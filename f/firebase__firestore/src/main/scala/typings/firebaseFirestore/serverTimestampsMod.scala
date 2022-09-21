package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.liteApiTimestampMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverTimestampsMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/server_timestamps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalWriteTime(value: Value): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalWriteTime")(value.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  inline def getPreviousValue(value: Value): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousValue")(value.asInstanceOf[js.Any]).asInstanceOf[Value | Null]
  
  inline def isServerTimestamp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerTimestamp")().asInstanceOf[Boolean]
  inline def isServerTimestamp(value: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isServerTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def serverTimestamp(localWriteTime: Timestamp): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")(localWriteTime.asInstanceOf[js.Any]).asInstanceOf[Value]
  inline def serverTimestamp(localWriteTime: Timestamp, previousValue: Value): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")(localWriteTime.asInstanceOf[js.Any], previousValue.asInstanceOf[js.Any])).asInstanceOf[Value]
}
