package typings.expo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildErrorsExpoErrorManagerMod {
  
  @JSImport("expo/build/errors/ExpoErrorManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createErrorHandler(originalHandler: Any): js.Function2[/* error */ Any, /* isFatal */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createErrorHandler")(originalHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* error */ Any, /* isFatal */ Any, Unit]]
  
  inline def disableErrorHandling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableErrorHandling")().asInstanceOf[Unit]
}
