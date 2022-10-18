package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreUtilTimeMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/util/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def utcTimestampToDateString(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("utcTimestampToDateString")().asInstanceOf[js.UndefOr[String]]
  inline def utcTimestampToDateString(utcTimestamp: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("utcTimestampToDateString")(utcTimestamp.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def utcTimestampToDateString(utcTimestamp: Double): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("utcTimestampToDateString")(utcTimestamp.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
