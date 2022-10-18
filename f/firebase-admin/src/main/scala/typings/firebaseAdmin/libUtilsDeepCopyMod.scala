package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDeepCopyMod {
  
  @JSImport("firebase-admin/lib/utils/deep-copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def deepExtend(target: Any, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
}
