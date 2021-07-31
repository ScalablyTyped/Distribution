package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCopyMod {
  
  @JSImport("@firebase/util/dist/src/deepCopy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def deepExtend(target: js.Any, source: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepExtend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
