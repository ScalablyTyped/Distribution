package typings.googleGax

import typings.googleGax.buildSrcApitypesMod.RequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcBundlingCallsBundlingUtilsMod {
  
  @JSImport("google-gax/build/src/bundlingCalls/bundlingUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeBundleId(obj: RequestType, discriminatorFields: js.Array[String]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBundleId")(obj.asInstanceOf[js.Any], discriminatorFields.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
